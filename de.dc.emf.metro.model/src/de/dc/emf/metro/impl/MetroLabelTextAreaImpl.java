/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.MetroLabelTextArea;
import de.dc.emf.metro.MetroPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Text Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroLabelTextAreaImpl#isIsRequiredField <em>Is Required Field</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroLabelTextAreaImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroLabelTextAreaImpl extends CustomizableElementImpl implements MetroLabelTextArea {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelTextAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_LABEL_TEXT_AREA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD, oldIsRequiredField, isRequiredField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_LABEL_TEXT_AREA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetroPackage.METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD:
				return isIsRequiredField();
			case MetroPackage.METRO_LABEL_TEXT_AREA__DESCRIPTION:
				return getDescription();
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
			case MetroPackage.METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD:
				setIsRequiredField((Boolean)newValue);
				return;
			case MetroPackage.METRO_LABEL_TEXT_AREA__DESCRIPTION:
				setDescription((String)newValue);
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
			case MetroPackage.METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD:
				setIsRequiredField(IS_REQUIRED_FIELD_EDEFAULT);
				return;
			case MetroPackage.METRO_LABEL_TEXT_AREA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MetroPackage.METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD:
				return isRequiredField != IS_REQUIRED_FIELD_EDEFAULT;
			case MetroPackage.METRO_LABEL_TEXT_AREA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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

} //MetroLabelTextAreaImpl
