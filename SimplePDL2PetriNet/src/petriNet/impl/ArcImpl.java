/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petriNet.Arc;
import petriNet.ArcDirection;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.ArcImpl#getJetonsTransferes <em>Jetons Transferes</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends PetriElementImpl implements Arc {
	/**
	 * The default value of the '{@link #getJetonsTransferes() <em>Jetons Transferes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetonsTransferes()
	 * @generated
	 * @ordered
	 */
	protected static final int JETONS_TRANSFERES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJetonsTransferes() <em>Jetons Transferes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJetonsTransferes()
	 * @generated
	 * @ordered
	 */
	protected int jetonsTransferes = JETONS_TRANSFERES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ArcDirection DIRECTION_EDEFAULT = ArcDirection.P2T;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ArcDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJetonsTransferes() {
		return jetonsTransferes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJetonsTransferes(int newJetonsTransferes) {
		int oldJetonsTransferes = jetonsTransferes;
		jetonsTransferes = newJetonsTransferes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__JETONS_TRANSFERES,
					oldJetonsTransferes, jetonsTransferes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject) transition;
			transition = (Transition) eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__TRANSITION,
							oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__TRANSITION, oldTransition,
					transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject) place;
			place = (Place) eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__PLACE, oldPlace,
							place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE, oldPlace, place));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ArcDirection newDirection) {
		ArcDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriNetPackage.ARC__JETONS_TRANSFERES:
			return getJetonsTransferes();
		case PetriNetPackage.ARC__TRANSITION:
			if (resolve)
				return getTransition();
			return basicGetTransition();
		case PetriNetPackage.ARC__PLACE:
			if (resolve)
				return getPlace();
			return basicGetPlace();
		case PetriNetPackage.ARC__DIRECTION:
			return getDirection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetriNetPackage.ARC__JETONS_TRANSFERES:
			setJetonsTransferes((Integer) newValue);
			return;
		case PetriNetPackage.ARC__TRANSITION:
			setTransition((Transition) newValue);
			return;
		case PetriNetPackage.ARC__PLACE:
			setPlace((Place) newValue);
			return;
		case PetriNetPackage.ARC__DIRECTION:
			setDirection((ArcDirection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PetriNetPackage.ARC__JETONS_TRANSFERES:
			setJetonsTransferes(JETONS_TRANSFERES_EDEFAULT);
			return;
		case PetriNetPackage.ARC__TRANSITION:
			setTransition((Transition) null);
			return;
		case PetriNetPackage.ARC__PLACE:
			setPlace((Place) null);
			return;
		case PetriNetPackage.ARC__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PetriNetPackage.ARC__JETONS_TRANSFERES:
			return jetonsTransferes != JETONS_TRANSFERES_EDEFAULT;
		case PetriNetPackage.ARC__TRANSITION:
			return transition != null;
		case PetriNetPackage.ARC__PLACE:
			return place != null;
		case PetriNetPackage.ARC__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (jetonsTransferes: ");
		result.append(jetonsTransferes);
		result.append(", Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
