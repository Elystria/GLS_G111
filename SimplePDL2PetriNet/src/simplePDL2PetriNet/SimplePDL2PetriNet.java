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
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;


public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		
		/****Charger et lire le métamodèle SIMPLEpdl****/
		//Chargement du package SimplePDL
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant etre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modèle)
		URI modelURI = URI.createURI("models/SimplePDL2PetriNetProcess1.xmi");
		Resource resource = resSet.getResource(modelURI, true);		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		/****Charger le métamodèle de Petri et créer le modèle de Petri****/
		//Chargement du package PetriNet
		PetriNetPackage packageInstanceP = PetriNetPackage.eINSTANCE;
		
		//Créer un PetriNetwork vide
		PetriNetFactory myPetriFactory = PetriNetFactory.eINSTANCE;
		
		//Créer un élément PetriNetwork
		PetriNetwork petrinetwork = myPetriFactory.createPetriNetwork();
		petrinetwork.setName(process.getName());
		EList<PetriElement> pe = petrinetwork.getPetrielement();
		
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
				arc.setName("a_r2s");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransférés(1);
				pe.add(arc);

				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				///////////////////////////////// TOFINISH !!!
				arc = myPetriFactory.createArc();
				arc.setName("a_r2r");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransférés(1);
				pe.add(arc);
				
				arc = myPetriFactory.createArc();
				arc.setName("a_r2s");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransférés(1);
				pe.add(arc);				

				arc = myPetriFactory.createArc();
				arc.setName("a_r2s");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransférés(1);
				pe.add(arc);				

				arc = myPetriFactory.createArc();
				arc.setName("a_r2s");
				arc.setPlace(p_running);
				arc.setTransition(t_starts);
				arc.setDirection(ArcDirection.P2T);
				arc.setJetonsTransférés(1);
				pe.add(arc);				

			}
		}
		// Pour chaque Work Sequence
			// créer le petri net corresondant
		
		
		// Accéder aux informations du processus chargé
	    System.out.println("Processus : " + process.getName());
	    // Naviguer dans les références
	    Integer nbPE = process.getProcessElements().size();
	    System.out.println("Nombre de ProcessElement dans " + process.getName() + " : " + nbPE);

		// Afficher les sous-activités
		System.out.println("Les sous-activités sont :");
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				System.out.println("  - " + wd.getName());
			}
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				System.out.println(" - " + ws.getPredecessor().getName() + " -> " + ws.getSuccessor().getName() + " " + ws.getLinkType());
			}
		//On peut ajouter les resources et guidances...
		}


		
		
	}
	
}
