/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Resources#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link simplepdl.Resources#getLinktoresource <em>Linktoresource</em>}</li>
 *   <li>{@link simplepdl.Resources#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResources()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='presenceDeRessources'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot presenceDeRessources='quantite &gt;= 0'"
 * @generated
 */
public interface Resources extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #setQuantite(int)
	 * @see simplepdl.SimplepdlPackage#getResources_Quantite()
	 * @model required="true"
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link simplepdl.Resources#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

	/**
	 * Returns the value of the '<em><b>Linktoresource</b></em>' reference list.
	 * The list contents are of type {@link simplepdl.RequeteDeRessource}.
	 * It is bidirectional and its opposite is '{@link simplepdl.RequeteDeRessource#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linktoresource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linktoresource</em>' reference list.
	 * @see simplepdl.SimplepdlPackage#getResources_Linktoresource()
	 * @see simplepdl.RequeteDeRessource#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<RequeteDeRessource> getLinktoresource();

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
	 * @see simplepdl.SimplepdlPackage#getResources_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Resources#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Resources
