/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Transition#getArcSortants <em>Arc Sortants</em>}</li>
 *   <li>{@link petriNet.Transition#getArcEntrants <em>Arc Entrants</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Arc Sortants</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc Sortants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Sortants</em>' reference list.
	 * @see petriNet.PetriNetPackage#getTransition_ArcSortants()
	 * @model required="true"
	 * @generated
	 */
	EList<Arc> getArcSortants();

	/**
	 * Returns the value of the '<em><b>Arc Entrants</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc Entrants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Entrants</em>' reference list.
	 * @see petriNet.PetriNetPackage#getTransition_ArcEntrants()
	 * @model required="true"
	 * @generated
	 */
	EList<Arc> getArcEntrants();

} // Transition
