/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroTable#getMetroTableColumns <em>Metro Table Columns</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroTable()
 * @model
 * @generated
 */
public interface MetroTable extends MetroControl {
	/**
	 * Returns the value of the '<em><b>Metro Table Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.MetroTableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Table Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Table Columns</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroTable_MetroTableColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetroTableColumn> getMetroTableColumns();

} // MetroTable
