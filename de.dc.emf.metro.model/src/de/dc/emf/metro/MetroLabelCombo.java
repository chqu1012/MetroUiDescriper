/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Combo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroLabelCombo#getMetroLabelComboItem <em>Metro Label Combo Item</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroLabelCombo()
 * @model
 * @generated
 */
public interface MetroLabelCombo extends MetroControl {
	/**
	 * Returns the value of the '<em><b>Metro Label Combo Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.BaseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Label Combo Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Label Combo Item</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroLabelCombo_MetroLabelComboItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseItem> getMetroLabelComboItem();

} // MetroLabelCombo
