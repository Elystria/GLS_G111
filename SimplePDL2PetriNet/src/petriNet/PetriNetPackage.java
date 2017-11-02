/**
 */
package petriNet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petriNet.PetriNetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/petriNet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetPackage eINSTANCE = petriNet.impl.PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petriNet.impl.PetriElementImpl <em>Petri Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PetriElementImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPetriElement()
	 * @generated
	 */
	int PETRI_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Petri Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.TransitionImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PETRI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ARC_SORTANTS = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arc Entrants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ARC_ENTRANTS = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>New Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___NEW_OPERATION1 = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PlaceImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PETRI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nb Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NB_JETONS = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arc Entrants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ARC_ENTRANTS = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ARC_SORTANTS = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.ArcImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = PETRI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jetons Transferes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__JETONS_TRANSFERES = PETRI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TRANSITION = PETRI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PLACE = PETRI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__DIRECTION = PETRI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PETRI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = PETRI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.PetriNetworkImpl <em>Petri Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PetriNetworkImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPetriNetwork()
	 * @generated
	 */
	int PETRI_NETWORK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Petrielement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK__PETRIELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Petri Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petri Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.ArcDirection <em>Arc Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.ArcDirection
	 * @see petriNet.impl.PetriNetPackageImpl#getArcDirection()
	 * @generated
	 */
	int ARC_DIRECTION = 5;

	/**
	 * Returns the meta object for class '{@link petriNet.PetriElement <em>Petri Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Element</em>'.
	 * @see petriNet.PetriElement
	 * @generated
	 */
	EClass getPetriElement();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.PetriElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.PetriElement#getName()
	 * @see #getPetriElement()
	 * @generated
	 */
	EAttribute getPetriElement_Name();

	/**
	 * Returns the meta object for class '{@link petriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Transition#getArcSortants <em>Arc Sortants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc Sortants</em>'.
	 * @see petriNet.Transition#getArcSortants()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ArcSortants();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Transition#getArcEntrants <em>Arc Entrants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc Entrants</em>'.
	 * @see petriNet.Transition#getArcEntrants()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_ArcEntrants();

	/**
	 * Returns the meta object for the '{@link petriNet.Transition#newOperation1() <em>New Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Operation1</em>' operation.
	 * @see petriNet.Transition#newOperation1()
	 * @generated
	 */
	EOperation getTransition__NewOperation1();

	/**
	 * Returns the meta object for class '{@link petriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Place#getNbJetons <em>Nb Jetons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Jetons</em>'.
	 * @see petriNet.Place#getNbJetons()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_NbJetons();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Place#getArcEntrants <em>Arc Entrants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc Entrants</em>'.
	 * @see petriNet.Place#getArcEntrants()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_ArcEntrants();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Place#getArcSortants <em>Arc Sortants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arc Sortants</em>'.
	 * @see petriNet.Place#getArcSortants()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_ArcSortants();

	/**
	 * Returns the meta object for class '{@link petriNet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see petriNet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getJetonsTransferes <em>Jetons Transferes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jetons Transferes</em>'.
	 * @see petriNet.Arc#getJetonsTransferes()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_JetonsTransferes();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see petriNet.Arc#getTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Transition();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see petriNet.Arc#getPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Place();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see petriNet.Arc#getDirection()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Direction();

	/**
	 * Returns the meta object for class '{@link petriNet.PetriNetwork <em>Petri Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Network</em>'.
	 * @see petriNet.PetriNetwork
	 * @generated
	 */
	EClass getPetriNetwork();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.PetriNetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.PetriNetwork#getName()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EAttribute getPetriNetwork_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link petriNet.PetriNetwork#getPetrielement <em>Petrielement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrielement</em>'.
	 * @see petriNet.PetriNetwork#getPetrielement()
	 * @see #getPetriNetwork()
	 * @generated
	 */
	EReference getPetriNetwork_Petrielement();

	/**
	 * Returns the meta object for enum '{@link petriNet.ArcDirection <em>Arc Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Direction</em>'.
	 * @see petriNet.ArcDirection
	 * @generated
	 */
	EEnum getArcDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetFactory getPetriNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petriNet.impl.PetriElementImpl <em>Petri Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PetriElementImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPetriElement()
		 * @generated
		 */
		EClass PETRI_ELEMENT = eINSTANCE.getPetriElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_ELEMENT__NAME = eINSTANCE.getPetriElement_Name();

		/**
		 * The meta object literal for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.TransitionImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Arc Sortants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ARC_SORTANTS = eINSTANCE.getTransition_ArcSortants();

		/**
		 * The meta object literal for the '<em><b>Arc Entrants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ARC_ENTRANTS = eINSTANCE.getTransition_ArcEntrants();

		/**
		 * The meta object literal for the '<em><b>New Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___NEW_OPERATION1 = eINSTANCE.getTransition__NewOperation1();

		/**
		 * The meta object literal for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PlaceImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Nb Jetons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NB_JETONS = eINSTANCE.getPlace_NbJetons();

		/**
		 * The meta object literal for the '<em><b>Arc Entrants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ARC_ENTRANTS = eINSTANCE.getPlace_ArcEntrants();

		/**
		 * The meta object literal for the '<em><b>Arc Sortants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ARC_SORTANTS = eINSTANCE.getPlace_ArcSortants();

		/**
		 * The meta object literal for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.ArcImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Jetons Transferes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__JETONS_TRANSFERES = eINSTANCE.getArc_JetonsTransferes();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__TRANSITION = eINSTANCE.getArc_Transition();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PLACE = eINSTANCE.getArc_Place();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__DIRECTION = eINSTANCE.getArc_Direction();

		/**
		 * The meta object literal for the '{@link petriNet.impl.PetriNetworkImpl <em>Petri Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PetriNetworkImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPetriNetwork()
		 * @generated
		 */
		EClass PETRI_NETWORK = eINSTANCE.getPetriNetwork();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NETWORK__NAME = eINSTANCE.getPetriNetwork_Name();

		/**
		 * The meta object literal for the '<em><b>Petrielement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NETWORK__PETRIELEMENT = eINSTANCE.getPetriNetwork_Petrielement();

		/**
		 * The meta object literal for the '{@link petriNet.ArcDirection <em>Arc Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.ArcDirection
		 * @see petriNet.impl.PetriNetPackageImpl#getArcDirection()
		 * @generated
		 */
		EEnum ARC_DIRECTION = eINSTANCE.getArcDirection();

	}

} //PetriNetPackage
