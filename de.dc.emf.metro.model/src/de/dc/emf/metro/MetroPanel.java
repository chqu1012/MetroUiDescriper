/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroPanel#getMetroPages <em>Metro Pages</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroPanel()
 * @model
 * @generated
 */
public interface MetroPanel extends CustomizableElement {
	/**
	 * Returns the value of the '<em><b>Metro Pages</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.MetroPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Pages</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroPanel_MetroPages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetroPage> getMetroPages();

} // MetroPanel
