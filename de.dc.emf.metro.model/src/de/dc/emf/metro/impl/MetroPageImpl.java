/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.MetroControl;
import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroPage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroPageImpl#isShowButton <em>Show Button</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroPageImpl#getMetroControls <em>Metro Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroPageImpl extends CustomizableElementImpl implements MetroPage {
	/**
	 * The default value of the '{@link #isShowButton() <em>Show Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowButton()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_BUTTON_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowButton() <em>Show Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowButton()
	 * @generated
	 * @ordered
	 */
	protected boolean showButton = SHOW_BUTTON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetroControls() <em>Metro Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroControls()
	 * @generated
	 * @ordered
	 */
	protected EList<MetroControl> metroControls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowButton() {
		return showButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowButton(boolean newShowButton) {
		boolean oldShowButton = showButton;
		showButton = newShowButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_PAGE__SHOW_BUTTON, oldShowButton, showButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetroControl> getMetroControls() {
		if (metroControls == null) {
			metroControls = new EObjectContainmentEList<MetroControl>(MetroControl.class, this, MetroPackage.METRO_PAGE__METRO_CONTROLS);
		}
		return metroControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				return ((InternalEList<?>)getMetroControls()).basicRemove(otherEnd, msgs);
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
			case MetroPackage.METRO_PAGE__SHOW_BUTTON:
				return isShowButton();
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				return getMetroControls();
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
			case MetroPackage.METRO_PAGE__SHOW_BUTTON:
				setShowButton((Boolean)newValue);
				return;
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				getMetroControls().clear();
				getMetroControls().addAll((Collection<? extends MetroControl>)newValue);
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
			case MetroPackage.METRO_PAGE__SHOW_BUTTON:
				setShowButton(SHOW_BUTTON_EDEFAULT);
				return;
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				getMetroControls().clear();
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
			case MetroPackage.METRO_PAGE__SHOW_BUTTON:
				return showButton != SHOW_BUTTON_EDEFAULT;
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				return metroControls != null && !metroControls.isEmpty();
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
		result.append(" (showButton: ");
		result.append(showButton);
		result.append(')');
		return result.toString();
	}

} //MetroPageImpl
