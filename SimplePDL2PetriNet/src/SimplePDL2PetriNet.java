


// TODOOOOOO !!!



import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		
		//Charger et lire le modèle SIMPLEpdl
		//Chargement du package SimplePDL
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant etre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		
		//Créer le modèle PetriNet
		
		
		
		/***********************************************************************/
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modÃ¨le)
		URI modelURI = URI.createURI("models/SimplePDLCreator_Created_Process.xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		Process process = (Process) resource.getContents().get(0);
		
		/**
		 * Manipulation de notre instance
		 */
		// AccÃ©der aux informations du processus chargÃ©
	    System.out.println("Processus : " + process.getName());
	    // Naviguer dans les rÃ©fÃ©rences
	    Integer nbPE = process.getProcessElements().size();
	    System.out.println("Nombre de ProcessElement dans " + process.getName() + " : " + nbPE);

		// Afficher les sous-activitÃ©s
		System.out.println("Les sous-activitÃ©s sont :");
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				System.out.println("  - " + wd.getName());
			}
		}
		
		/**********************************************************************************/
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (le modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();

		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURI = URI.createURI("models/SimplePDLCreator_Created_Process2.xmi");
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de SimplePDL
	    SimplepdlFactory myFactory = SimplepdlFactory.eINSTANCE;

		// CrÃ©er un Ã©lÃ©ment Process
		Process process = myFactory.createProcess();
		process.setName("Mon premier processus");
		
		// Ajouter le Process dans le modÃ¨le
		resource.getContents().add(process);

		// Ajouter deux WorkDefinitions
	    WorkDefinition wd1 = myFactory.createWorkDefinition();
	    wd1.setName("Ma premiÃ¨re WorkDefinition, quelle Ã©motion");
	    
	    WorkDefinition wd2 = myFactory.createWorkDefinition();
	    wd2.setName("Ma deuxiÃ¨me WorkDefinition, toujours autant d'Ã©motion");
	    
	    process.getProcessElements().add(wd1);
	    process.getProcessElements().add(wd2);
	    
		// Ajouter une WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq = myFactory.createWorkSequence();
	    seq.setPredecessor(wd1);
	    seq.setSuccessor(wd2);
	    seq.setLinkType(WorkSequenceType.FINISH_TO_FINISH);
	    
	    process.getProcessElements().add(seq);
	    
		// Ajouter une deuxiÃ¨me WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq2 = myFactory.createWorkSequence();
	    seq2.setPredecessor(wd1);
	    seq2.setSuccessor(wd2);
	    seq2.setLinkType(WorkSequenceType.START_TO_START);
	    
	    process.getProcessElements().add(seq2);
	    
		
		// Sauver la ressource
	    try {
	    	resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	}

}
