/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNetwork#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.PetriNetwork#getPetrielement <em>Petrielement</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNetwork()
 * @model
 * @generated
 */
public interface PetriNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPetriNetwork_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.PetriNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petrielement</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.PetriElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrielement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrielement</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNetwork_Petrielement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PetriElement> getPetrielement();

} // PetriNetwork
