/**
 */
package simplepdl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import simplepdl.Guidance;
import simplepdl.GuidanceLink;
import simplepdl.ProcessElement;
import simplepdl.RequeteDeRessource;
import simplepdl.Resources;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see simplepdl.SimplepdlPackage
 * @generated
 */
public class SimplepdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplepdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplepdlSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplepdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimplepdlPackage.PROCESS: {
				simplepdl.Process process = (simplepdl.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.WORK_DEFINITION: {
				WorkDefinition workDefinition = (WorkDefinition)theEObject;
				T result = caseWorkDefinition(workDefinition);
				if (result == null) result = caseProcessElement(workDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.WORK_SEQUENCE: {
				WorkSequence workSequence = (WorkSequence)theEObject;
				T result = caseWorkSequence(workSequence);
				if (result == null) result = caseProcessElement(workSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.PROCESS_ELEMENT: {
				ProcessElement processElement = (ProcessElement)theEObject;
				T result = caseProcessElement(processElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.GUIDANCE: {
				Guidance guidance = (Guidance)theEObject;
				T result = caseGuidance(guidance);
				if (result == null) result = caseProcessElement(guidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.RESOURCES: {
				Resources resources = (Resources)theEObject;
				T result = caseResources(resources);
				if (result == null) result = caseProcessElement(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.REQUETE_DE_RESSOURCE: {
				RequeteDeRessource requeteDeRessource = (RequeteDeRessource)theEObject;
				T result = caseRequeteDeRessource(requeteDeRessource);
				if (result == null) result = caseProcessElement(requeteDeRessource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplepdlPackage.GUIDANCE_LINK: {
				GuidanceLink guidanceLink = (GuidanceLink)theEObject;
				T result = caseGuidanceLink(guidanceLink);
				if (result == null) result = caseProcessElement(guidanceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(simplepdl.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkDefinition(WorkDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkSequence(WorkSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElement(ProcessElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidance(Guidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requete De Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requete De Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequeteDeRessource(RequeteDeRessource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guidance Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guidance Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuidanceLink(GuidanceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplepdlSwitch
