/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplepdl.RequeteDeRessource;
import simplepdl.Resources;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requete De Ressource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.RequeteDeRessourceImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link simplepdl.impl.RequeteDeRessourceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link simplepdl.impl.RequeteDeRessourceImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequeteDeRessourceImpl extends ProcessElementImpl implements RequeteDeRessource {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected int quantite = QUANTITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected Resources resources;

	/**
	 * The cached value of the '{@link #getWorkdefinition() <em>Workdefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkdefinition()
	 * @generated
	 * @ordered
	 */
	protected WorkDefinition workdefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequeteDeRessourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.REQUETE_DE_RESSOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(int newQuantite) {
		int oldQuantite = quantite;
		quantite = newQuantite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.REQUETE_DE_RESSOURCE__QUANTITE, oldQuantite, quantite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources getResources() {
		if (resources != null && resources.eIsProxy()) {
			InternalEObject oldResources = (InternalEObject)resources;
			resources = (Resources)eResolveProxy(oldResources);
			if (resources != oldResources) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES, oldResources, resources));
			}
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources basicGetResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs) {
		Resources oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(Resources newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, SimplepdlPackage.RESOURCES__LINKTORESOURCE, Resources.class, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, SimplepdlPackage.RESOURCES__LINKTORESOURCE, Resources.class, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWorkdefinition() {
		if (workdefinition != null && workdefinition.eIsProxy()) {
			InternalEObject oldWorkdefinition = (InternalEObject)workdefinition;
			workdefinition = (WorkDefinition)eResolveProxy(oldWorkdefinition);
			if (workdefinition != oldWorkdefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION, oldWorkdefinition, workdefinition));
			}
		}
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition basicGetWorkdefinition() {
		return workdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkdefinition(WorkDefinition newWorkdefinition, NotificationChain msgs) {
		WorkDefinition oldWorkdefinition = workdefinition;
		workdefinition = newWorkdefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION, oldWorkdefinition, newWorkdefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		if (newWorkdefinition != workdefinition) {
			NotificationChain msgs = null;
			if (workdefinition != null)
				msgs = ((InternalEObject)workdefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__LINKTORESOURCE, WorkDefinition.class, msgs);
			if (newWorkdefinition != null)
				msgs = ((InternalEObject)newWorkdefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__LINKTORESOURCE, WorkDefinition.class, msgs);
			msgs = basicSetWorkdefinition(newWorkdefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION, newWorkdefinition, newWorkdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				if (resources != null)
					msgs = ((InternalEObject)resources).eInverseRemove(this, SimplepdlPackage.RESOURCES__LINKTORESOURCE, Resources.class, msgs);
				return basicSetResources((Resources)otherEnd, msgs);
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				if (workdefinition != null)
					msgs = ((InternalEObject)workdefinition).eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__LINKTORESOURCE, WorkDefinition.class, msgs);
				return basicSetWorkdefinition((WorkDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				return basicSetResources(null, msgs);
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				return basicSetWorkdefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__QUANTITE:
				return getQuantite();
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				if (resolve) return getResources();
				return basicGetResources();
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				if (resolve) return getWorkdefinition();
				return basicGetWorkdefinition();
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
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__QUANTITE:
				setQuantite((Integer)newValue);
				return;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				setResources((Resources)newValue);
				return;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__QUANTITE:
				setQuantite(QUANTITE_EDEFAULT);
				return;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				setResources((Resources)null);
				return;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
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
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__QUANTITE:
				return quantite != QUANTITE_EDEFAULT;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__RESOURCES:
				return resources != null;
			case SimplepdlPackage.REQUETE_DE_RESSOURCE__WORKDEFINITION:
				return workdefinition != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (quantite: ");
		result.append(quantite);
		result.append(')');
		return result.toString();
	}

} //RequeteDeRessourceImpl
