/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.BaseItem;
import de.dc.emf.metro.MetroPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.BaseItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.BaseItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.BaseItemImpl#isIsSelected <em>Is Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseItemImpl extends MinimalEObjectImpl.Container implements BaseItem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean isSelected = IS_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.BASE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.BASE_ITEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.BASE_ITEM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSelected() {
		return isSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelected(boolean newIsSelected) {
		boolean oldIsSelected = isSelected;
		isSelected = newIsSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.BASE_ITEM__IS_SELECTED, oldIsSelected, isSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetroPackage.BASE_ITEM__NAME:
				return getName();
			case MetroPackage.BASE_ITEM__VALUE:
				return getValue();
			case MetroPackage.BASE_ITEM__IS_SELECTED:
				return isIsSelected();
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
			case MetroPackage.BASE_ITEM__NAME:
				setName((String)newValue);
				return;
			case MetroPackage.BASE_ITEM__VALUE:
				setValue((String)newValue);
				return;
			case MetroPackage.BASE_ITEM__IS_SELECTED:
				setIsSelected((Boolean)newValue);
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
			case MetroPackage.BASE_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetroPackage.BASE_ITEM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MetroPackage.BASE_ITEM__IS_SELECTED:
				setIsSelected(IS_SELECTED_EDEFAULT);
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
			case MetroPackage.BASE_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetroPackage.BASE_ITEM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MetroPackage.BASE_ITEM__IS_SELECTED:
				return isSelected != IS_SELECTED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", isSelected: ");
		result.append(isSelected);
		result.append(')');
		return result.toString();
	}

} //BaseItemImpl
