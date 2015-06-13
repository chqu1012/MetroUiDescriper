/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.emf.metro.MetroRoot#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link de.dc.emf.metro.MetroRoot#getMetroPages <em>Metro Pages</em>}</li>
 * </ul>
 *
 * @see de.dc.emf.metro.MetroPackage#getMetroRoot()
 * @model
 * @generated
 */
public interface MetroRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Name</em>' attribute.
	 * @see #setApplicationName(String)
	 * @see de.dc.emf.metro.MetroPackage#getMetroRoot_ApplicationName()
	 * @model
	 * @generated
	 */
	String getApplicationName();

	/**
	 * Sets the value of the '{@link de.dc.emf.metro.MetroRoot#getApplicationName <em>Application Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Name</em>' attribute.
	 * @see #getApplicationName()
	 * @generated
	 */
	void setApplicationName(String value);

	/**
	 * Returns the value of the '<em><b>Metro Pages</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.emf.metro.MetroPanel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metro Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metro Pages</em>' containment reference list.
	 * @see de.dc.emf.metro.MetroPackage#getMetroRoot_MetroPages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetroPanel> getMetroPages();

} // MetroRoot
