/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.BaseItem;
import de.dc.emf.metro.MetroLabelCheckBox;
import de.dc.emf.metro.MetroPackage;

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
 * An implementation of the model object '<em><b>Label Check Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroLabelCheckBoxImpl#isIsRequiredField <em>Is Required Field</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroLabelCheckBoxImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroLabelCheckBoxImpl#getMetroLabelCheckBoxItem <em>Metro Label Check Box Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroLabelCheckBoxImpl extends CustomizableElementImpl implements MetroLabelCheckBox {
	/**
	 * The default value of the '{@link #isIsRequiredField() <em>Is Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequiredField()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_FIELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequiredField() <em>Is Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequiredField()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequiredField = IS_REQUIRED_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetroLabelCheckBoxItem() <em>Metro Label Check Box Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroLabelCheckBoxItem()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseItem> metroLabelCheckBoxItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelCheckBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_LABEL_CHECK_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequiredField() {
		return isRequiredField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequiredField(boolean newIsRequiredField) {
		boolean oldIsRequiredField = isRequiredField;
		isRequiredField = newIsRequiredField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD, oldIsRequiredField, isRequiredField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_LABEL_CHECK_BOX__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseItem> getMetroLabelCheckBoxItem() {
		if (metroLabelCheckBoxItem == null) {
			metroLabelCheckBoxItem = new EObjectContainmentEList<BaseItem>(BaseItem.class, this, MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM);
		}
		return metroLabelCheckBoxItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM:
				return ((InternalEList<?>)getMetroLabelCheckBoxItem()).basicRemove(otherEnd, msgs);
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
			case MetroPackage.METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD:
				return isIsRequiredField();
			case MetroPackage.METRO_LABEL_CHECK_BOX__DESCRIPTION:
				return getDescription();
			case MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM:
				return getMetroLabelCheckBoxItem();
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
			case MetroPackage.METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD:
				setIsRequiredField((Boolean)newValue);
				return;
			case MetroPackage.METRO_LABEL_CHECK_BOX__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM:
				getMetroLabelCheckBoxItem().clear();
				getMetroLabelCheckBoxItem().addAll((Collection<? extends BaseItem>)newValue);
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
			case MetroPackage.METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD:
				setIsRequiredField(IS_REQUIRED_FIELD_EDEFAULT);
				return;
			case MetroPackage.METRO_LABEL_CHECK_BOX__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM:
				getMetroLabelCheckBoxItem().clear();
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
			case MetroPackage.METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD:
				return isRequiredField != IS_REQUIRED_FIELD_EDEFAULT;
			case MetroPackage.METRO_LABEL_CHECK_BOX__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetroPackage.METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM:
				return metroLabelCheckBoxItem != null && !metroLabelCheckBoxItem.isEmpty();
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
		result.append(" (isRequiredField: ");
		result.append(isRequiredField);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MetroLabelCheckBoxImpl
