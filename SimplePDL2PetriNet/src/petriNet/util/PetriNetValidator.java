/**
 */
package petriNet.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import petriNet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see petriNet.PetriNetPackage
 * @generated
 */
public class PetriNetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PetriNetValidator INSTANCE = new PetriNetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "petriNet";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return PetriNetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case PetriNetPackage.PETRI_ELEMENT:
			return validatePetriElement((PetriElement) value, diagnostics, context);
		case PetriNetPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case PetriNetPackage.PLACE:
			return validatePlace((Place) value, diagnostics, context);
		case PetriNetPackage.ARC:
			return validateArc((Arc) value, diagnostics, context);
		case PetriNetPackage.PETRI_NETWORK:
			return validatePetriNetwork((PetriNetwork) value, diagnostics, context);
		case PetriNetPackage.ARC_DIRECTION:
			return validateArcDirection((ArcDirection) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriElement(PetriElement petriElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petriElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_nomUnique(petriElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_auMoins1Caractere(petriElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nomUnique constraint of '<em>Petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_ELEMENT__NOM_UNIQUE__EEXPRESSION = "PetriElement.allInstances()->\n"
			+ "\t\t\tforAll(pe | pe <> self implies pe.name <> name)";

	/**
	 * Validates the nomUnique constraint of '<em>Petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriElement_nomUnique(PetriElement petriElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PetriNetPackage.Literals.PETRI_ELEMENT, petriElement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nomUnique", PETRI_ELEMENT__NOM_UNIQUE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the auMoins1Caractere constraint of '<em>Petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_ELEMENT__AU_MOINS1_CARACTERE__EEXPRESSION = "name.size() >= 1";

	/**
	 * Validates the auMoins1Caractere constraint of '<em>Petri Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriElement_auMoins1Caractere(PetriElement petriElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PetriNetPackage.Literals.PETRI_ELEMENT, petriElement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "auMoins1Caractere",
				PETRI_ELEMENT__AU_MOINS1_CARACTERE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_nomUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_auMoins1Caractere(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_nomUnique(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_auMoins1Caractere(place, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlace_presenceDeJetons(place, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the presenceDeJetons constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLACE__PRESENCE_DE_JETONS__EEXPRESSION = "nbJetons >= 0";

	/**
	 * Validates the presenceDeJetons constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace_presenceDeJetons(Place place, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PetriNetPackage.Literals.PLACE, place, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "presenceDeJetons",
				PLACE__PRESENCE_DE_JETONS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arc, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_nomUnique(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriElement_auMoins1Caractere(arc, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArc_presenceDeJetonsTransferes(arc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the presenceDeJetonsTransferes constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__PRESENCE_DE_JETONS_TRANSFERES__EEXPRESSION = "jetonsTransferes >= 0";

	/**
	 * Validates the presenceDeJetonsTransferes constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_presenceDeJetonsTransferes(Arc arc, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PetriNetPackage.Literals.ARC, arc, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "presenceDeJetonsTransferes",
				ARC__PRESENCE_DE_JETONS_TRANSFERES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNetwork(PetriNetwork petriNetwork, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petriNetwork, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(petriNetwork, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePetriNetwork_nameNetworkExists(petriNetwork, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameNetworkExists constraint of '<em>Petri Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NETWORK__NAME_NETWORK_EXISTS__EEXPRESSION = "name.size() >= 1";

	/**
	 * Validates the nameNetworkExists constraint of '<em>Petri Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNetwork_nameNetworkExists(PetriNetwork petriNetwork, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(PetriNetPackage.Literals.PETRI_NETWORK, petriNetwork, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameNetworkExists",
				PETRI_NETWORK__NAME_NETWORK_EXISTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcDirection(ArcDirection arcDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PetriNetValidator
