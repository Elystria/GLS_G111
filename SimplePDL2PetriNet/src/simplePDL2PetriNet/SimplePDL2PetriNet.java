package simplePDL2PetriNet;


import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petriNet.PetriNetFactory;
import petriNet.PetriNetwork;
import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;


public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		
		//Chargement du modèle à convertir
		Resource resource = chargerModeleSimplePDL(args[0]);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
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

		/****Créer le modèle PetriNet****/
		//Créer un PetriNetwork vide
		PetriNetFactory myPetriFactory = PetriNetFactory.eINSTANCE;
		
		//Créer un élément PetriNetwork
		PetriNetwork petrinetwork = myPetriFactory.createPetriNetwork();
		petrinetwork.setName(process.getName());
		
		
	}
	
	public static Resource chargerModeleSimplePDL(String s) {
		
		/****Charger et lire le modèle SIMPLEpdl****/
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
		URI modelURI = URI.createURI("models/SimplePDL2PetriNetProcess" + s + ".xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		return resource;
	}
}
