/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guidance Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.GuidanceLink#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link simplepdl.GuidanceLink#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getGuidanceLink()
 * @model
 * @generated
 */
public interface GuidanceLink extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Guidance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guidance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guidance</em>' reference.
	 * @see #setGuidance(Guidance)
	 * @see simplepdl.SimplepdlPackage#getGuidanceLink_Guidance()
	 * @model required="true"
	 * @generated
	 */
	Guidance getGuidance();

	/**
	 * Sets the value of the '{@link simplepdl.GuidanceLink#getGuidance <em>Guidance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guidance</em>' reference.
	 * @see #getGuidance()
	 * @generated
	 */
	void setGuidance(Guidance value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workdefinition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getGuidanceLink_Workdefinition()
	 * @model required="true"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.GuidanceLink#getWorkdefinition <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

} // GuidanceLink
