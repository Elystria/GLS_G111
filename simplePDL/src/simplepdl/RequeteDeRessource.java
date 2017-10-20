/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requete De Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.RequeteDeRessource#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link simplepdl.RequeteDeRessource#getResources <em>Resources</em>}</li>
 *   <li>{@link simplepdl.RequeteDeRessource#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getRequeteDeRessource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='demandeNonVide'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot demandeNonVide='quantite &gt; 0'"
 * @generated
 */
public interface RequeteDeRessource extends ProcessElement {
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
	 * @see simplepdl.SimplepdlPackage#getRequeteDeRessource_Quantite()
	 * @model required="true"
	 * @generated
	 */
	int getQuantite();

	/**
	 * Sets the value of the '{@link simplepdl.RequeteDeRessource#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(int value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Resources#getLinktoresource <em>Linktoresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference.
	 * @see #setResources(Resources)
	 * @see simplepdl.SimplepdlPackage#getRequeteDeRessource_Resources()
	 * @see simplepdl.Resources#getLinktoresource
	 * @model opposite="linktoresource" required="true"
	 * @generated
	 */
	Resources getResources();

	/**
	 * Sets the value of the '{@link simplepdl.RequeteDeRessource#getResources <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(Resources value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getLinktoresource <em>Linktoresource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workdefinition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getRequeteDeRessource_Workdefinition()
	 * @see simplepdl.WorkDefinition#getLinktoresource
	 * @model opposite="linktoresource" required="true"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.RequeteDeRessource#getWorkdefinition <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

} // RequeteDeRessource
