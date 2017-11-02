package simplePDL2PetriNet;


import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petriNet.Arc;
import petriNet.ArcDirection;
import petriNet.PetriElement;
import petriNet.PetriNetFactory;
import petriNet.PetriNetPackage;
import petriNet.PetriNetwork;
import petriNet.Place;
import petriNet.Transition;
import petriNet.impl.PlaceImpl;
import simplepdl.Process;
import simplepdl.RequeteDeRessource;
import simplepdl.Resources;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;


public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		
		//Chargement des packages simplePDL et PetriNet
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		PetriNetPackage packageInstanceP = PetriNetPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant etre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		ResourceSet resSet = new ResourceSetImpl();
		ResourceSet resSetPetri = new ResourceSetImpl();

		// Charger la ressource (notre modèle)
		URI modelURI = URI.createURI("models/SimplePDL2PetriNetProcess1.xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		URI modelURIPetri = URI.createURI("models/SimplePDL2PetriNetResul1.xmi");
		Resource resourcePetri = resSetPetri.createResource(modelURIPetri);

		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);

		//Créer un une fabrique de réseau de Pétri
		PetriNetFactory myPetriFactory = PetriNetFactory.eINSTANCE;
			
		//Créer un élément PetriNetwork
		PetriNetwork petrinetwork = myPetriFactory.createPetriNetwork();
		petrinetwork.setName(process.getName());
		EList<PetriElement> pe = petrinetwork.getPetrielement();
		resourcePetri.getContents().add(petrinetwork);
		
		// Pour chaque Work Définition
		for(Object o : process.getProcessElements()) {
			
			if(o instanceof WorkDefinition) {

				WorkDefinition wd = (WorkDefinition) o;
				// créer les 4 places
				Place p_ready = myPetriFactory.createPlace();
				p_ready.setName(wd.getName() + "_ready");
				p_ready.setNbJetons(1);
				pe.add(p_ready);

				
				Place p_running = myPetriFactory.createPlace();
				p_running.setName(wd.getName() + "_running");
				p_running.setNbJetons(0);
				pe.add(p_running);
				
				Place p_started= myPetriFactory.createPlace();
				p_started.setName(wd.getName() + "_started");
				p_started.setNbJetons(0);
				pe.add(p_started);
				
				Place p_finished = myPetriFactory.createPlace();
				p_finished.setName(wd.getName() + "_finished");
				p_finished.setNbJetons(0);
				pe.add(p_finished);
				
				// créer les 2 transitions
				Transition t_starts = myPetriFactory.createTransition();
				t_starts.setName(wd.getName() + "_starts");
				pe.add(t_starts);
				
				Transition t_finishes = myPetriFactory.createTransition();
				t_finishes.setName(wd.getName() + "_finishes");
				pe.add(t_finishes);
				
				// créer les 5 arcs
				Arc arc = myPetriFactory.createArc();
				arc.setName(wd.getName() + "_ready2starts");
				arc.setPlace(p_ready);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransferes(1);
				pe.add(arc);

				arc = myPetriFactory.createArc();
				arc.setName(wd.getName() + "_starts2started");
				arc.setPlace(p_started);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.T2P);
				arc.setJetonsTransferes(1);
				pe.add(arc);
				
				arc = myPetriFactory.createArc();
				arc.setName(wd.getName() + "_starts2running");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.T2P);
				arc.setJetonsTransferes(1);
				pe.add(arc);				

				arc = myPetriFactory.createArc();
				arc.setName(wd.getName() + "_running2finishes");
				arc.setPlace(p_running);
				arc.setTransition(t_finishes);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransferes(1);
				pe.add(arc);				

				arc = myPetriFactory.createArc();
				arc.setName(wd.getName() + "_finishes2finished");
				arc.setPlace(p_finished);
				arc.setTransition(t_finishes);
				arc.setDirection(ArcDirection.T2P);
				arc.setJetonsTransferes(1);
				pe.add(arc);				

			}
		}
		
		// Puis pour chaque WorkSequence
		for(Object o : process.getProcessElements()) {
			
			if(o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				
				// On crée 2 arc pour simuler un ReadArc
				Arc arc = myPetriFactory.createArc();
				
				if(ws.getLinkType() == WorkSequenceType.START_TO_START) {
					Place p_started = getPlaceReadArc(pe, ws, "_started");
					Transition t_starts = getTransitionReadArc(pe, ws, "_starts");

					arc.setName(ws.getPredecessor().getName() + "--s2s->" + ws.getSuccessor().getName());
					arc.setPlace(p_started);
					arc.setTransition(t_starts);
					arc.setDirection(ArcDirection.P2T);
					arc.setJetonsTransferes(1);
					pe.add(arc);

					arc = myPetriFactory.createArc();
					arc.setName(ws.getPredecessor().getName() + "--s2sBack->" + ws.getSuccessor().getName());
					arc.setPlace(p_started);
					arc.setTransition(t_starts);
					arc.setDirection(ArcDirection.T2P);
					arc.setJetonsTransferes(1);
					pe.add(arc);

				} else if(ws.getLinkType() == WorkSequenceType.START_TO_FINISH) {
					Place p_started = getPlaceReadArc(pe, ws, "_started");
					Transition t_finishes = getTransitionReadArc(pe, ws, "_finishes");

					arc.setName(ws.getPredecessor().getName() + "--s2f->" + ws.getSuccessor().getName());
					arc.setPlace(p_started);
					arc.setTransition(t_finishes);
					arc.setDirection(ArcDirection.P2T);
					arc.setJetonsTransferes(1);
					pe.add(arc);

					arc = myPetriFactory.createArc();
					arc.setName(ws.getPredecessor().getName() + "--s2fBack->" + ws.getSuccessor().getName());
					arc.setPlace(p_started);
					arc.setTransition(t_finishes);
					arc.setDirection(ArcDirection.T2P);
					arc.setJetonsTransferes(1);
					pe.add(arc);

				} else if(ws.getLinkType() == WorkSequenceType.FINISH_TO_START) {
					Place p_finished = getPlaceReadArc(pe, ws, "_finished");
					Transition t_starts = getTransitionReadArc(pe, ws, "_starts");

					arc.setName(ws.getPredecessor().getName() + "--f2s->" + ws.getSuccessor().getName());
					arc.setPlace(p_finished);
					arc.setTransition(t_starts);
					arc.setDirection(ArcDirection.P2T);
					arc.setJetonsTransferes(1);
					pe.add(arc);

					arc = myPetriFactory.createArc();
					arc.setName(ws.getPredecessor().getName() + "--f2sBack->" + ws.getSuccessor().getName());
					arc.setPlace(p_finished);
					arc.setTransition(t_starts);
					arc.setDirection(ArcDirection.T2P);
					arc.setJetonsTransferes(1);
					pe.add(arc);
					
				} else if(ws.getLinkType() == WorkSequenceType.FINISH_TO_FINISH) {
					Place p_finished = getPlaceReadArc(pe, ws, "_finished");
					Transition t_finishes = getTransitionReadArc(pe, ws, "_finishes");

					arc.setName(ws.getPredecessor().getName() + "--f2f->" + ws.getSuccessor().getName());
					arc.setPlace(p_finished);
					arc.setTransition(t_finishes);
					arc.setDirection(ArcDirection.P2T);
					arc.setJetonsTransferes(1);
					pe.add(arc);

					arc = myPetriFactory.createArc();
					arc.setName(ws.getPredecessor().getName() + "--f2fBack->" + ws.getSuccessor().getName());
					arc.setPlace(p_finished);
					arc.setTransition(t_finishes);
					arc.setDirection(ArcDirection.T2P);
					arc.setJetonsTransferes(1);
					pe.add(arc);
					
				}
			}

		}
		
		// Puis pour chaque Ressource
		for(Object o : process.getProcessElements()) {
			
			if(o instanceof Resources) {
				Resources rsc = (Resources) o;
				Place place_rsc = myPetriFactory.createPlace();
				place_rsc.setName(rsc.getName() + "_stock");
				place_rsc.setNbJetons(rsc.getQuantite());
				pe.add(place_rsc);
			}
		}
		
		// Et enfin pour chaque linkToRessources
		for(Object o : process.getProcessElements()) {
			Arc arc = myPetriFactory.createArc();
			if(o instanceof RequeteDeRessource) {
				RequeteDeRessource req = (RequeteDeRessource) o;
				
				Transition wd_starts = null;
				Transition wd_finishes = null;
				Place rsc_petri = null;
				for(PetriElement e : pe) {
					if(e instanceof Transition) {
						if(e.getName().compareTo(req.getWorkdefinition().getName() + "_starts") == 0) {
							wd_starts = (Transition) e;
						}
						if(e.getName().compareTo(req.getWorkdefinition().getName() + "_finishes") == 0) {
							wd_finishes = (Transition) e;
						}
					}
					if(e instanceof Place) {
						if(e.getName().compareTo(req.getResources().getName() + "_stock") == 0) {
							rsc_petri = (Place) e;
						}
					}
				}

				arc.setName(req.getWorkdefinition().getName() + "--demande->" + req.getResources().getName());
				arc.setPlace(rsc_petri);
				arc.setTransition(wd_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransferes(req.getQuantite());
				pe.add(arc);

				arc = myPetriFactory.createArc();
				arc.setName(req.getWorkdefinition().getName() + "--rend->" + req.getResources().getName());
				arc.setPlace(rsc_petri);
				arc.setTransition(wd_finishes);
				arc.setDirection(ArcDirection.T2P);
				arc.setJetonsTransferes(req.getQuantite());
				pe.add(arc);

			}
		}
		
		// Sauver la ressource
		try {
			resourcePetri.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}


		
	}
	
	private static Place getPlaceReadArc(EList<PetriElement> pe, WorkSequence ws, String placeSuffixe) {
		Place p = null;
		for(PetriElement e : pe) {
			if(e instanceof Place) {
				if(e.getName().compareTo(ws.getPredecessor().getName() + placeSuffixe) == 0) {
					p = (Place) e;
				}
			}
		}
		return p;
	}
	
	private static Transition getTransitionReadArc(EList<PetriElement> pe, WorkSequence ws, String transitionSuffixe) {
		Transition t = null;
		for(PetriElement e : pe) {
			if(e instanceof Transition) {
				if(e.getName().compareTo(ws.getSuccessor().getName() + transitionSuffixe) == 0) {
					t = (Transition) e;
				}
			}
		}
		return t;
	}

	
}
