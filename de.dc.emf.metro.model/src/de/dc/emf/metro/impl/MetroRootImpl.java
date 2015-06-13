/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroPanel;
import de.dc.emf.metro.MetroRoot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroRootImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroRootImpl#getMetroPages <em>Metro Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroRootImpl extends MinimalEObjectImpl.Container implements MetroRoot {
	/**
	 * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationName()
	 * @generated
	 * @ordered
	 */
	protected String applicationName = APPLICATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetroPages() <em>Metro Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroPages()
	 * @generated
	 * @ordered
	 */
	protected EList<MetroPanel> metroPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationName(String newApplicationName) {
		String oldApplicationName = applicationName;
		applicationName = newApplicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_ROOT__APPLICATION_NAME, oldApplicationName, applicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetroPanel> getMetroPages() {
		if (metroPages == null) {
			metroPages = new EObjectContainmentEList<MetroPanel>(MetroPanel.class, this, MetroPackage.METRO_ROOT__METRO_PAGES);
		}
		return metroPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetroPackage.METRO_ROOT__METRO_PAGES:
				return ((InternalEList<?>)getMetroPages()).basicRemove(otherEnd, msgs);
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
			case MetroPackage.METRO_ROOT__APPLICATION_NAME:
				return getApplicationName();
			case MetroPackage.METRO_ROOT__METRO_PAGES:
				return getMetroPages();
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
			case MetroPackage.METRO_ROOT__APPLICATION_NAME:
				setApplicationName((String)newValue);
				return;
			case MetroPackage.METRO_ROOT__METRO_PAGES:
				getMetroPages().clear();
				getMetroPages().addAll((Collection<? extends MetroPanel>)newValue);
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
			case MetroPackage.METRO_ROOT__APPLICATION_NAME:
				setApplicationName(APPLICATION_NAME_EDEFAULT);
				return;
			case MetroPackage.METRO_ROOT__METRO_PAGES:
				getMetroPages().clear();
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
			case MetroPackage.METRO_ROOT__APPLICATION_NAME:
				return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
			case MetroPackage.METRO_ROOT__METRO_PAGES:
				return metroPages != null && !metroPages.isEmpty();
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
		result.append(" (applicationName: ");
		result.append(applicationName);
		result.append(')');
		return result.toString();
	}

} //MetroRootImpl
