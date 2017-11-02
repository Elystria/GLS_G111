/**
 */
package petriNet.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.TransitionImpl#getArcSortants <em>Arc Sortants</em>}</li>
 *   <li>{@link petriNet.impl.TransitionImpl#getArcEntrants <em>Arc Entrants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends PetriElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getArcSortants() <em>Arc Sortants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcSortants()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcSortants;

	/**
	 * The cached value of the '{@link #getArcEntrants() <em>Arc Entrants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcEntrants()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcEntrants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcSortants() {
		if (arcSortants == null) {
			arcSortants = new EObjectResolvingEList<Arc>(Arc.class, this, PetriNetPackage.TRANSITION__ARC_SORTANTS);
		}
		return arcSortants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcEntrants() {
		if (arcEntrants == null) {
			arcEntrants = new EObjectResolvingEList<Arc>(Arc.class, this, PetriNetPackage.TRANSITION__ARC_ENTRANTS);
		}
		return arcEntrants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void newOperation1() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriNetPackage.TRANSITION__ARC_SORTANTS:
			return getArcSortants();
		case PetriNetPackage.TRANSITION__ARC_ENTRANTS:
			return getArcEntrants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetriNetPackage.TRANSITION__ARC_SORTANTS:
			getArcSortants().clear();
			getArcSortants().addAll((Collection<? extends Arc>) newValue);
			return;
		case PetriNetPackage.TRANSITION__ARC_ENTRANTS:
			getArcEntrants().clear();
			getArcEntrants().addAll((Collection<? extends Arc>) newValue);
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
		case PetriNetPackage.TRANSITION__ARC_SORTANTS:
			getArcSortants().clear();
			return;
		case PetriNetPackage.TRANSITION__ARC_ENTRANTS:
			getArcEntrants().clear();
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
		case PetriNetPackage.TRANSITION__ARC_SORTANTS:
			return arcSortants != null && !arcSortants.isEmpty();
		case PetriNetPackage.TRANSITION__ARC_ENTRANTS:
			return arcEntrants != null && !arcEntrants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PetriNetPackage.TRANSITION___NEW_OPERATION1:
			newOperation1();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransitionImpl
