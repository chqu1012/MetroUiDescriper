/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroLabelCheckBox#getMetroLabelCheckBoxItem <em>Metro Label Check Box Item</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroLabelCheckBox()
 * @model
 * @generated
 */
public interface MetroLabelCheckBox extends MetroControl {
	/**
	 * Returns the value of the '<em><b>Metro Label Check Box Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.BaseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Label Check Box Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Label Check Box Item</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroLabelCheckBox_MetroLabelCheckBoxItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseItem> getMetroLabelCheckBoxItem();

} // MetroLabelCheckBox
