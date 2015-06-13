/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroPage;
import de.dc.emf.metro.MetroPanel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroPanelImpl#getMetroPages <em>Metro Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroPanelImpl extends CustomizableElementImpl implements MetroPanel {
	/**
	 * The cached value of the '{@link #getMetroPages() <em>Metro Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroPages()
	 * @generated
	 * @ordered
	 */
	protected EList<MetroPage> metroPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroPanelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_PANEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetroPage> getMetroPages() {
		if (metroPages == null) {
			metroPages = new EObjectContainmentEList<MetroPage>(MetroPage.class, this, MetroPackage.METRO_PANEL__METRO_PAGES);
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
			case MetroPackage.METRO_PANEL__METRO_PAGES:
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
			case MetroPackage.METRO_PANEL__METRO_PAGES:
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
			case MetroPackage.METRO_PANEL__METRO_PAGES:
				getMetroPages().clear();
				getMetroPages().addAll((Collection<? extends MetroPage>)newValue);
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
			case MetroPackage.METRO_PANEL__METRO_PAGES:
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
			case MetroPackage.METRO_PANEL__METRO_PAGES:
				return metroPages != null && !metroPages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetroPanelImpl
