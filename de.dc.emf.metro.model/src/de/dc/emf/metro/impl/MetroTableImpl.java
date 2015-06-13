/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroTable;
import de.dc.emf.metro.MetroTableColumn;

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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.impl.MetroTableImpl#isIsRequiredField <em>Is Required Field</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroTableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.dc.emf.metro.impl.MetroTableImpl#getMetroTableColumns <em>Metro Table Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetroTableImpl extends CustomizableElementImpl implements MetroTable {
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
	 * The cached value of the '{@link #getMetroTableColumns() <em>Metro Table Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroTableColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<MetroTableColumn> metroTableColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetroPackage.Literals.METRO_TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_TABLE__IS_REQUIRED_FIELD, oldIsRequiredField, isRequiredField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetroPackage.METRO_TABLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetroTableColumn> getMetroTableColumns() {
		if (metroTableColumns == null) {
			metroTableColumns = new EObjectContainmentEList<MetroTableColumn>(MetroTableColumn.class, this, MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS);
		}
		return metroTableColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS:
				return ((InternalEList<?>)getMetroTableColumns()).basicRemove(otherEnd, msgs);
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
			case MetroPackage.METRO_TABLE__IS_REQUIRED_FIELD:
				return isIsRequiredField();
			case MetroPackage.METRO_TABLE__DESCRIPTION:
				return getDescription();
			case MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS:
				return getMetroTableColumns();
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
			case MetroPackage.METRO_TABLE__IS_REQUIRED_FIELD:
				setIsRequiredField((Boolean)newValue);
				return;
			case MetroPackage.METRO_TABLE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS:
				getMetroTableColumns().clear();
				getMetroTableColumns().addAll((Collection<? extends MetroTableColumn>)newValue);
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
			case MetroPackage.METRO_TABLE__IS_REQUIRED_FIELD:
				setIsRequiredField(IS_REQUIRED_FIELD_EDEFAULT);
				return;
			case MetroPackage.METRO_TABLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS:
				getMetroTableColumns().clear();
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
			case MetroPackage.METRO_TABLE__IS_REQUIRED_FIELD:
				return isRequiredField != IS_REQUIRED_FIELD_EDEFAULT;
			case MetroPackage.METRO_TABLE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetroPackage.METRO_TABLE__METRO_TABLE_COLUMNS:
				return metroTableColumns != null && !metroTableColumns.isEmpty();
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

} //MetroTableImpl
