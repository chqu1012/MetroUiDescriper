/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.emf.metro.MetroPackage
 * @generated
 */
public interface MetroFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetroFactory eINSTANCE = de.dc.emf.metro.impl.MetroFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	MetroRoot createMetroRoot();

	/**
	 * Returns a new object of class '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Panel</em>'.
	 * @generated
	 */
	MetroPanel createMetroPanel();

	/**
	 * Returns a new object of class '<em>Customizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customizable Element</em>'.
	 * @generated
	 */
	CustomizableElement createCustomizableElement();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	MetroPage createMetroPage();

	/**
	 * Returns a new object of class '<em>Label Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Text</em>'.
	 * @generated
	 */
	MetroLabelText createMetroLabelText();

	/**
	 * Returns a new object of class '<em>Label Combo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Combo</em>'.
	 * @generated
	 */
	MetroLabelCombo createMetroLabelCombo();

	/**
	 * Returns a new object of class '<em>Label Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Text Area</em>'.
	 * @generated
	 */
	MetroLabelTextArea createMetroLabelTextArea();

	/**
	 * Returns a new object of class '<em>Label Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Check Box</em>'.
	 * @generated
	 */
	MetroLabelCheckBox createMetroLabelCheckBox();

	/**
	 * Returns a new object of class '<em>Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Item</em>'.
	 * @generated
	 */
	BaseItem createBaseItem();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	MetroTable createMetroTable();

	/**
	 * Returns a new object of class '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Column</em>'.
	 * @generated
	 */
	MetroTableColumn createMetroTableColumn();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	MetroTree createMetroTree();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetroPackage getMetroPackage();

} //MetroFactory
