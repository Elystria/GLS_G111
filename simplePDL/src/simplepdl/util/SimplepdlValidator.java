/**
 */
package simplepdl.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.ocl.xtext.oclinecore.validation.OCLinEcoreEObjectValidator;

import simplepdl.Guidance;
import simplepdl.ProcessElement;
import simplepdl.RequeteDeRessource;
import simplepdl.Resources;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see simplepdl.SimplepdlPackage
 * @generated NOT
 */
public class SimplepdlValidator extends OCLinEcoreEObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplepdlValidator INSTANCE = new SimplepdlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "simplepdl";

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
	public SimplepdlValidator() {
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
	  return SimplepdlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimplepdlPackage.PROCESS:
				return validateProcess((simplepdl.Process)value, diagnostics, context);
			case SimplepdlPackage.WORK_DEFINITION:
				return validateWorkDefinition((WorkDefinition)value, diagnostics, context);
			case SimplepdlPackage.WORK_SEQUENCE:
				return validateWorkSequence((WorkSequence)value, diagnostics, context);
			case SimplepdlPackage.PROCESS_ELEMENT:
				return validateProcessElement((ProcessElement)value, diagnostics, context);
			case SimplepdlPackage.GUIDANCE:
				return validateGuidance((Guidance)value, diagnostics, context);
			case SimplepdlPackage.RESOURCES:
				return validateResources((Resources)value, diagnostics, context);
			case SimplepdlPackage.REQUETE_DE_RESSOURCE:
				return validateRequeteDeRessource((RequeteDeRessource)value, diagnostics, context);
			case SimplepdlPackage.WORK_SEQUENCE_TYPE:
				return validateWorkSequenceType((WorkSequenceType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(simplepdl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_noEmptyName(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcess_nomDifferents(process, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_noEmptyName(simplepdl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 PROCESS__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nomDifferents constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESS__NOM_DIFFERENTS__EEXPRESSION = "processElements->\n" +
		"\t\t\tselect(oclIsKindOf(WorkDefinition))->\n" +
		"\t\t\tcollect(oclAsType(WorkDefinition))->\n" +
		"\t\t\tforAll(wd1, wd2 | wd1 <> wd2 implies wd1.name <> wd2.name)";

	/**
	 * Validates the nomDifferents constraint of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess_nomDifferents(simplepdl.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.PROCESS,
				 process,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nomDifferents",
				 PROCESS__NOM_DIFFERENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkDefinition_nomUnique(workDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkDefinition_auMoins1Caractere(workDefinition, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nomUnique constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_DEFINITION__NOM_UNIQUE__EEXPRESSION = "WorkDefinition.allInstances()->\n" +
		"\t\tforAll(wd | wd <> self implies wd.name <> name)";

	/**
	 * Validates the nomUnique constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_nomUnique(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_DEFINITION,
				 workDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nomUnique",
				 WORK_DEFINITION__NOM_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the auMoins1Caractere constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_DEFINITION__AU_MOINS1_CARACTERE__EEXPRESSION = "name.size() >= 1";

	/**
	 * Validates the auMoins1Caractere constraint of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkDefinition_auMoins1Caractere(WorkDefinition workDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_DEFINITION,
				 workDefinition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "auMoins1Caractere",
				 WORK_DEFINITION__AU_MOINS1_CARACTERE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workSequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workSequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkSequence_sensUnique(workSequence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sensUnique constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORK_SEQUENCE__SENS_UNIQUE__EEXPRESSION = "WorkSequence.allInstances()->\n" +
		"\t\tforAll(ws | ws <> self implies (ws.successor <> predecessor) or  (ws.predecessor <> successor))";

	/**
	 * Validates the sensUnique constraint of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequence_sensUnique(WorkSequence workSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.WORK_SEQUENCE,
				 workSequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sensUnique",
				 WORK_SEQUENCE__SENS_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessElement(ProcessElement processElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(processElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuidance(Guidance guidance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guidance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResources(Resources resources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resources, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validateResources_presenceDeRessources(resources, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the presenceDeRessources constraint of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCES__PRESENCE_DE_RESSOURCES__EEXPRESSION = "quantite >= 0";

	/**
	 * Validates the presenceDeRessources constraint of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResources_presenceDeRessources(Resources resources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.RESOURCES,
				 resources,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "presenceDeRessources",
				 RESOURCES__PRESENCE_DE_RESSOURCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequeteDeRessource(RequeteDeRessource requeteDeRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requeteDeRessource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requeteDeRessource, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequeteDeRessource_demandeNonVide(requeteDeRessource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the demandeNonVide constraint of '<em>Requete De Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUETE_DE_RESSOURCE__DEMANDE_NON_VIDE__EEXPRESSION = "quantite > 0";

	/**
	 * Validates the demandeNonVide constraint of '<em>Requete De Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequeteDeRessource_demandeNonVide(RequeteDeRessource requeteDeRessource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SimplepdlPackage.Literals.REQUETE_DE_RESSOURCE,
				 requeteDeRessource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "demandeNonVide",
				 REQUETE_DE_RESSOURCE__DEMANDE_NON_VIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkSequenceType(WorkSequenceType workSequenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //SimplepdlValidator
