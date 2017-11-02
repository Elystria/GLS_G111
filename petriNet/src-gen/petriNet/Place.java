/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Place#getNbJetons <em>Nb Jetons</em>}</li>
 *   <li>{@link petriNet.Place#getArcEntrants <em>Arc Entrants</em>}</li>
 *   <li>{@link petriNet.Place#getArcSortants <em>Arc Sortants</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPlace()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='presenceDeJetons'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot presenceDeJetons='nbJetons &gt;= 0'"
 * @generated
 */
public interface Place extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Nb Jetons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Jetons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Jetons</em>' attribute.
	 * @see #setNbJetons(int)
	 * @see petriNet.PetriNetPackage#getPlace_NbJetons()
	 * @model required="true"
	 * @generated
	 */
	int getNbJetons();

	/**
	 * Sets the value of the '{@link petriNet.Place#getNbJetons <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Jetons</em>' attribute.
	 * @see #getNbJetons()
	 * @generated
	 */
	void setNbJetons(int value);

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
	 * @see petriNet.PetriNetPackage#getPlace_ArcEntrants()
	 * @model
	 * @generated
	 */
	EList<Arc> getArcEntrants();

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
	 * @see petriNet.PetriNetPackage#getPlace_ArcSortants()
	 * @model
	 * @generated
	 */
	EList<Arc> getArcSortants();

} // Place
