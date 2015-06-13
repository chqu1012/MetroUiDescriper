/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.BaseItem#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.emf.metro.BaseItem#getValue <em>Value</em>}</li>
 *   <li>{@link de.dc.emf.metro.BaseItem#isIsSelected <em>Is Selected</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getBaseItem()
 * @model
 * @generated
 */
public interface BaseItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.emf.metro.MetroPackage#getBaseItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.BaseItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dc.emf.metro.MetroPackage#getBaseItem_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.BaseItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Selected</em>' attribute.
	 * @see #setIsSelected(boolean)
	 * @see de.dc.emf.metro.MetroPackage#getBaseItem_IsSelected()
	 * @model
	 * @generated
	 */
	boolean isIsSelected();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.BaseItem#isIsSelected <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selected</em>' attribute.
	 * @see #isIsSelected()
	 * @generated
	 */
	void setIsSelected(boolean value);

} // BaseItem
