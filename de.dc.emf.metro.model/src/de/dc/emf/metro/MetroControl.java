/**
 */
package de.dc.emf.metro;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroControl#isIsRequiredField <em>Is Required Field</em>}</li>
 *   <li>{@link de.dc.emf.metro.MetroControl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroControl()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MetroControl extends CustomizableElement {
	/**
	 * Returns the value of the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required Field</em>' attribute.
	 * @see #setIsRequiredField(boolean)
	 * @see de.dc.emf.metro.MetroPackage#getMetroControl_IsRequiredField()
	 * @model
	 * @generated
	 */
	boolean isIsRequiredField();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.MetroControl#isIsRequiredField <em>Is Required Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required Field</em>' attribute.
	 * @see #isIsRequiredField()
	 * @generated
	 */
	void setIsRequiredField(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.dc.emf.metro.MetroPackage#getMetroControl_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.MetroControl#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // MetroControl
