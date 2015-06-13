/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroPage#isShowButton <em>Show Button</em>}</li>
 *   <li>{@link de.dc.emf.metro.MetroPage#getMetroControls <em>Metro Controls</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroPage()
 * @model
 * @generated
 */
public interface MetroPage extends CustomizableElement {
	/**
	 * Returns the value of the '<em><b>Show Button</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Button</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Button</em>' attribute.
	 * @see #setShowButton(boolean)
	 * @see de.dc.emf.metro.MetroPackage#getMetroPage_ShowButton()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowButton();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.MetroPage#isShowButton <em>Show Button</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Button</em>' attribute.
	 * @see #isShowButton()
	 * @generated
	 */
	void setShowButton(boolean value);

	/**
	 * Returns the value of the '<em><b>Metro Controls</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.MetroControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Controls</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroPage_MetroControls()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetroControl> getMetroControls();

} // MetroPage
