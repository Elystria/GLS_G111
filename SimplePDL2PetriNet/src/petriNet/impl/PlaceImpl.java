/**
 */
package petriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.PlaceImpl#getNbJetons <em>Nb Jetons</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getArcEntrants <em>Arc Entrants</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getArcSortants <em>Arc Sortants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends PetriElementImpl implements Place {
	/**
	 * The default value of the '{@link #getNbJetons() <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJetons()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_JETONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbJetons() <em>Nb Jetons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbJetons()
	 * @generated
	 * @ordered
	 */
	protected int nbJetons = NB_JETONS_EDEFAULT;

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
	 * The cached value of the '{@link #getArcSortants() <em>Arc Sortants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcSortants()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcSortants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbJetons() {
		return nbJetons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbJetons(int newNbJetons) {
		int oldNbJetons = nbJetons;
		nbJetons = newNbJetons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__NB_JETONS, oldNbJetons,
					nbJetons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcEntrants() {
		if (arcEntrants == null) {
			arcEntrants = new EObjectResolvingEList<Arc>(Arc.class, this, PetriNetPackage.PLACE__ARC_ENTRANTS);
		}
		return arcEntrants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcSortants() {
		if (arcSortants == null) {
			arcSortants = new EObjectResolvingEList<Arc>(Arc.class, this, PetriNetPackage.PLACE__ARC_SORTANTS);
		}
		return arcSortants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriNetPackage.PLACE__NB_JETONS:
			return getNbJetons();
		case PetriNetPackage.PLACE__ARC_ENTRANTS:
			return getArcEntrants();
		case PetriNetPackage.PLACE__ARC_SORTANTS:
			return getArcSortants();
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
		case PetriNetPackage.PLACE__NB_JETONS:
			setNbJetons((Integer) newValue);
			return;
		case PetriNetPackage.PLACE__ARC_ENTRANTS:
			getArcEntrants().clear();
			getArcEntrants().addAll((Collection<? extends Arc>) newValue);
			return;
		case PetriNetPackage.PLACE__ARC_SORTANTS:
			getArcSortants().clear();
			getArcSortants().addAll((Collection<? extends Arc>) newValue);
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
		case PetriNetPackage.PLACE__NB_JETONS:
			setNbJetons(NB_JETONS_EDEFAULT);
			return;
		case PetriNetPackage.PLACE__ARC_ENTRANTS:
			getArcEntrants().clear();
			return;
		case PetriNetPackage.PLACE__ARC_SORTANTS:
			getArcSortants().clear();
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
		case PetriNetPackage.PLACE__NB_JETONS:
			return nbJetons != NB_JETONS_EDEFAULT;
		case PetriNetPackage.PLACE__ARC_ENTRANTS:
			return arcEntrants != null && !arcEntrants.isEmpty();
		case PetriNetPackage.PLACE__ARC_SORTANTS:
			return arcSortants != null && !arcSortants.isEmpty();
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
		result.append(" (nbJetons: ");
		result.append(nbJetons);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
