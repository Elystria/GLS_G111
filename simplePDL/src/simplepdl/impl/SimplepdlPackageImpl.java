/**
 */
package simplepdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplepdl.Guidance;
import simplepdl.GuidanceLink;
import simplepdl.ProcessElement;
import simplepdl.RequeteDeRessource;
import simplepdl.Resources;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

import simplepdl.util.SimplepdlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplepdlPackageImpl extends EPackageImpl implements SimplepdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requeteDeRessourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guidanceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workSequenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplepdl.SimplepdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplepdlPackageImpl() {
		super(eNS_URI, SimplepdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimplepdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplepdlPackage init() {
		if (isInited) return (SimplepdlPackage)EPackage.Registry.INSTANCE.getEPackage(SimplepdlPackage.eNS_URI);

		// Obtain or create and register package
		SimplepdlPackageImpl theSimplepdlPackage = (SimplepdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplepdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplepdlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimplepdlPackage.createPackageContents();

		// Initialize created meta-data
		theSimplepdlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimplepdlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimplepdlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimplepdlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplepdlPackage.eNS_URI, theSimplepdlPackage);
		return theSimplepdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_Name() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_ProcessElements() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkDefinition() {
		return workDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_LinksToPredecessors() {
		return (EReference)workDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_LinksToSuccessors() {
		return (EReference)workDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkDefinition_Name() {
		return (EAttribute)workDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkDefinition_Linktoresource() {
		return (EReference)workDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkSequence() {
		return workSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkSequence_LinkType() {
		return (EAttribute)workSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Predecessor() {
		return (EReference)workSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkSequence_Successor() {
		return (EReference)workSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessElement() {
		return processElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidance() {
		return guidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidance_Elements() {
		return (EReference)guidanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuidance_Text() {
		return (EAttribute)guidanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Quantite() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Linktoresource() {
		return (EReference)resourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Name() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequeteDeRessource() {
		return requeteDeRessourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequeteDeRessource_Quantite() {
		return (EAttribute)requeteDeRessourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequeteDeRessource_Resources() {
		return (EReference)requeteDeRessourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequeteDeRessource_Workdefinition() {
		return (EReference)requeteDeRessourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuidanceLink() {
		return guidanceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceLink_Guidance() {
		return (EReference)guidanceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuidanceLink_Workdefinition() {
		return (EReference)guidanceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkSequenceType() {
		return workSequenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepdlFactory getSimplepdlFactory() {
		return (SimplepdlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);

		workDefinitionEClass = createEClass(WORK_DEFINITION);
		createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_PREDECESSORS);
		createEReference(workDefinitionEClass, WORK_DEFINITION__LINKS_TO_SUCCESSORS);
		createEAttribute(workDefinitionEClass, WORK_DEFINITION__NAME);
		createEReference(workDefinitionEClass, WORK_DEFINITION__LINKTORESOURCE);

		workSequenceEClass = createEClass(WORK_SEQUENCE);
		createEAttribute(workSequenceEClass, WORK_SEQUENCE__LINK_TYPE);
		createEReference(workSequenceEClass, WORK_SEQUENCE__PREDECESSOR);
		createEReference(workSequenceEClass, WORK_SEQUENCE__SUCCESSOR);

		processElementEClass = createEClass(PROCESS_ELEMENT);

		guidanceEClass = createEClass(GUIDANCE);
		createEReference(guidanceEClass, GUIDANCE__ELEMENTS);
		createEAttribute(guidanceEClass, GUIDANCE__TEXT);

		resourcesEClass = createEClass(RESOURCES);
		createEAttribute(resourcesEClass, RESOURCES__QUANTITE);
		createEReference(resourcesEClass, RESOURCES__LINKTORESOURCE);
		createEAttribute(resourcesEClass, RESOURCES__NAME);

		requeteDeRessourceEClass = createEClass(REQUETE_DE_RESSOURCE);
		createEAttribute(requeteDeRessourceEClass, REQUETE_DE_RESSOURCE__QUANTITE);
		createEReference(requeteDeRessourceEClass, REQUETE_DE_RESSOURCE__RESOURCES);
		createEReference(requeteDeRessourceEClass, REQUETE_DE_RESSOURCE__WORKDEFINITION);

		guidanceLinkEClass = createEClass(GUIDANCE_LINK);
		createEReference(guidanceLinkEClass, GUIDANCE_LINK__GUIDANCE);
		createEReference(guidanceLinkEClass, GUIDANCE_LINK__WORKDEFINITION);

		// Create enums
		workSequenceTypeEEnum = createEEnum(WORK_SEQUENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		workDefinitionEClass.getESuperTypes().add(this.getProcessElement());
		workSequenceEClass.getESuperTypes().add(this.getProcessElement());
		guidanceEClass.getESuperTypes().add(this.getProcessElement());
		resourcesEClass.getESuperTypes().add(this.getProcessElement());
		requeteDeRessourceEClass.getESuperTypes().add(this.getProcessElement());
		guidanceLinkEClass.getESuperTypes().add(this.getProcessElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, simplepdl.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 1, 1, simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ProcessElements(), this.getProcessElement(), null, "processElements", null, 0, -1, simplepdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkDefinition_LinksToPredecessors(), this.getWorkSequence(), this.getWorkSequence_Successor(), "linksToPredecessors", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_LinksToSuccessors(), this.getWorkSequence(), this.getWorkSequence_Predecessor(), "linksToSuccessors", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkDefinition_Linktoresource(), this.getRequeteDeRessource(), this.getRequeteDeRessource_Workdefinition(), "linktoresource", null, 0, -1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workSequenceEClass, WorkSequence.class, "WorkSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkSequence_LinkType(), this.getWorkSequenceType(), "linkType", null, 1, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkSequence_Predecessor(), this.getWorkDefinition(), this.getWorkDefinition_LinksToSuccessors(), "predecessor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkSequence_Successor(), this.getWorkDefinition(), this.getWorkDefinition_LinksToPredecessors(), "successor", null, 1, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processElementEClass, ProcessElement.class, "ProcessElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guidanceEClass, Guidance.class, "Guidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuidance_Elements(), this.getProcessElement(), null, "elements", null, 0, -1, Guidance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuidance_Text(), ecorePackage.getEString(), "text", null, 1, 1, Guidance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResources_Quantite(), ecorePackage.getEInt(), "quantite", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResources_Linktoresource(), this.getRequeteDeRessource(), this.getRequeteDeRessource_Resources(), "linktoresource", null, 0, -1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requeteDeRessourceEClass, RequeteDeRessource.class, "RequeteDeRessource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequeteDeRessource_Quantite(), ecorePackage.getEInt(), "quantite", null, 1, 1, RequeteDeRessource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequeteDeRessource_Resources(), this.getResources(), this.getResources_Linktoresource(), "resources", null, 1, 1, RequeteDeRessource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequeteDeRessource_Workdefinition(), this.getWorkDefinition(), this.getWorkDefinition_Linktoresource(), "workdefinition", null, 1, 1, RequeteDeRessource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guidanceLinkEClass, GuidanceLink.class, "GuidanceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuidanceLink_Guidance(), this.getGuidance(), null, "guidance", null, 1, 1, GuidanceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuidanceLink_Workdefinition(), this.getWorkDefinition(), null, "workdefinition", null, 1, 1, GuidanceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(workSequenceTypeEEnum, WorkSequenceType.class, "WorkSequenceType");
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START_TO_START);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH_TO_START);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START_TO_FINISH);
		addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH_TO_FINISH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "constraints", "noEmptyName nomDifferents"
		   });	
		addAnnotation
		  (workDefinitionEClass, 
		   source, 
		   new String[] {
			 "constraints", "nomUnique auMoins1Caractere"
		   });	
		addAnnotation
		  (workSequenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "nonReflexif nonBlocage"
		   });	
		addAnnotation
		  (resourcesEClass, 
		   source, 
		   new String[] {
			 "constraints", "presenceDeRessources"
		   });	
		addAnnotation
		  (requeteDeRessourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "demandeNonVide"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (processEClass, 
		   source, 
		   new String[] {
			 "noEmptyName", "name.size() > 0",
			 "nomDifferents", "processElements->\n\t\t\tselect(oclIsKindOf(WorkDefinition))->\n\t\t\tcollect(oclAsType(WorkDefinition))->\n\t\t\tforAll(wd1, wd2 | wd1 <> wd2 implies wd1.name <> wd2.name)"
		   });	
		addAnnotation
		  (workDefinitionEClass, 
		   source, 
		   new String[] {
			 "nomUnique", "WorkDefinition.allInstances()->\n\t\tforAll(wd | wd <> self implies wd.name <> name)",
			 "auMoins1Caractere", "name.size() >= 1"
		   });	
		addAnnotation
		  (workSequenceEClass, 
		   source, 
		   new String[] {
			 "nonReflexif", "WorkSequence.allInstances()->\n\t\tforAll(ws | ws = self implies (ws.predecessor <> ws.successor))",
			 "nonBlocage", "WorkSequence.allInstances()->\n\t\tforAll(ws1, ws2 | (ws1 <> ws2 and ws1.predecessor = ws2.successor and ws1.successor = ws2.predecessor) \n\t\t\timplies (ws1.linkType <> ws2.linkType))"
		   });	
		addAnnotation
		  (resourcesEClass, 
		   source, 
		   new String[] {
			 "presenceDeRessources", "quantite >= 0"
		   });	
		addAnnotation
		  (requeteDeRessourceEClass, 
		   source, 
		   new String[] {
			 "demandeNonVide", "quantite > 0"
		   });
	}

} //SimplepdlPackageImpl
