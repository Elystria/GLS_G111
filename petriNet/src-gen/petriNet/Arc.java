/**
 */
package petriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getJetonsTransférés <em>Jetons Transférés</em>}</li>
 *   <li>{@link petriNet.Arc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.Arc#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Jetons Transférés</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jetons Transférés</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jetons Transférés</em>' attribute.
	 * @see #setJetonsTransférés(int)
	 * @see petriNet.PetriNetPackage#getArc_JetonsTransférés()
	 * @model required="true"
	 * @generated
	 */
	int getJetonsTransférés();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getJetonsTransférés <em>Jetons Transférés</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jetons Transférés</em>' attribute.
	 * @see #getJetonsTransférés()
	 * @generated
	 */
	void setJetonsTransférés(int value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petriNet.PetriNetPackage#getArc_Transition()
	 * @model required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see petriNet.PetriNetPackage#getArc_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.ArcDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see petriNet.ArcDirection
	 * @see #setDirection(ArcDirection)
	 * @see petriNet.PetriNetPackage#getArc_Direction()
	 * @model required="true"
	 * @generated
	 */
	ArcDirection getDirection();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see petriNet.ArcDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ArcDirection value);

} // Arc
