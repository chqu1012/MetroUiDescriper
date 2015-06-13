/**
 */
package de.dc.emf.metro;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.emf.metro.MetroFactory
 * @model kind="package"
 * @generated
 */
public interface MetroPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metro";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.dc-soft.org/metro";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metro";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetroPackage eINSTANCE = de.dc.emf.metro.impl.MetroPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroRootImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroRoot()
	 * @generated
	 */
	int METRO_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Application Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_ROOT__APPLICATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Metro Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_ROOT__METRO_PAGES = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.CustomizableElementImpl <em>Customizable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.CustomizableElementImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getCustomizableElement()
	 * @generated
	 */
	int CUSTOMIZABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Customizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroPanelImpl <em>Panel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroPanelImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroPanel()
	 * @generated
	 */
	int METRO_PANEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PANEL__NAME = CUSTOMIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metro Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PANEL__METRO_PAGES = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PANEL_FEATURE_COUNT = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Panel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PANEL_OPERATION_COUNT = CUSTOMIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroPageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroPageImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroPage()
	 * @generated
	 */
	int METRO_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PAGE__NAME = CUSTOMIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Show Button</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PAGE__SHOW_BUTTON = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metro Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PAGE__METRO_CONTROLS = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PAGE_FEATURE_COUNT = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_PAGE_OPERATION_COUNT = CUSTOMIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.MetroControl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.MetroControl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroControl()
	 * @generated
	 */
	int METRO_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_CONTROL__NAME = CUSTOMIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_CONTROL__IS_REQUIRED_FIELD = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_CONTROL__DESCRIPTION = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_CONTROL_FEATURE_COUNT = CUSTOMIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_CONTROL_OPERATION_COUNT = CUSTOMIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroLabelTextImpl <em>Label Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroLabelTextImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelText()
	 * @generated
	 */
	int METRO_LABEL_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Label Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroLabelComboImpl <em>Label Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroLabelComboImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelCombo()
	 * @generated
	 */
	int METRO_LABEL_COMBO = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metro Label Combo Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO__METRO_LABEL_COMBO_ITEM = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_COMBO_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroLabelTextAreaImpl <em>Label Text Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroLabelTextAreaImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelTextArea()
	 * @generated
	 */
	int METRO_LABEL_TEXT_AREA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_AREA__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_AREA__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_AREA__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Label Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_AREA_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Label Text Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_TEXT_AREA_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroLabelCheckBoxImpl <em>Label Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroLabelCheckBoxImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelCheckBox()
	 * @generated
	 */
	int METRO_LABEL_CHECK_BOX = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metro Label Check Box Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_LABEL_CHECK_BOX_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.BaseItemImpl <em>Base Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.BaseItemImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getBaseItem()
	 * @generated
	 */
	int BASE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ITEM__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ITEM__IS_SELECTED = 2;

	/**
	 * The number of structural features of the '<em>Base Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroTableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroTableImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTable()
	 * @generated
	 */
	int METRO_TABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metro Table Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE__METRO_TABLE_COLUMNS = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroTableColumnImpl <em>Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroTableColumnImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTableColumn()
	 * @generated
	 */
	int METRO_TABLE_COLUMN = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE_COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.emf.metro.impl.MetroTreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.emf.metro.impl.MetroTreeImpl
	 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTree()
	 * @generated
	 */
	int METRO_TREE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TREE__NAME = METRO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Is Required Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TREE__IS_REQUIRED_FIELD = METRO_CONTROL__IS_REQUIRED_FIELD;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TREE__DESCRIPTION = METRO_CONTROL__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TREE_FEATURE_COUNT = METRO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRO_TREE_OPERATION_COUNT = METRO_CONTROL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see de.dc.emf.metro.MetroRoot
	 * @generated
	 */
	EClass getMetroRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.MetroRoot#getApplicationName <em>Application Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Name</em>'.
	 * @see de.dc.emf.metro.MetroRoot#getApplicationName()
	 * @see #getMetroRoot()
	 * @generated
	 */
	EAttribute getMetroRoot_ApplicationName();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroRoot#getMetroPages <em>Metro Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Pages</em>'.
	 * @see de.dc.emf.metro.MetroRoot#getMetroPages()
	 * @see #getMetroRoot()
	 * @generated
	 */
	EReference getMetroRoot_MetroPages();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroPanel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Panel</em>'.
	 * @see de.dc.emf.metro.MetroPanel
	 * @generated
	 */
	EClass getMetroPanel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroPanel#getMetroPages <em>Metro Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Pages</em>'.
	 * @see de.dc.emf.metro.MetroPanel#getMetroPages()
	 * @see #getMetroPanel()
	 * @generated
	 */
	EReference getMetroPanel_MetroPages();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.CustomizableElement <em>Customizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customizable Element</em>'.
	 * @see de.dc.emf.metro.CustomizableElement
	 * @generated
	 */
	EClass getCustomizableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.CustomizableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.metro.CustomizableElement#getName()
	 * @see #getCustomizableElement()
	 * @generated
	 */
	EAttribute getCustomizableElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.dc.emf.metro.MetroPage
	 * @generated
	 */
	EClass getMetroPage();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.MetroPage#isShowButton <em>Show Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Button</em>'.
	 * @see de.dc.emf.metro.MetroPage#isShowButton()
	 * @see #getMetroPage()
	 * @generated
	 */
	EAttribute getMetroPage_ShowButton();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroPage#getMetroControls <em>Metro Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Controls</em>'.
	 * @see de.dc.emf.metro.MetroPage#getMetroControls()
	 * @see #getMetroPage()
	 * @generated
	 */
	EReference getMetroPage_MetroControls();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see de.dc.emf.metro.MetroControl
	 * @generated
	 */
	EClass getMetroControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.MetroControl#isIsRequiredField <em>Is Required Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required Field</em>'.
	 * @see de.dc.emf.metro.MetroControl#isIsRequiredField()
	 * @see #getMetroControl()
	 * @generated
	 */
	EAttribute getMetroControl_IsRequiredField();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.MetroControl#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.dc.emf.metro.MetroControl#getDescription()
	 * @see #getMetroControl()
	 * @generated
	 */
	EAttribute getMetroControl_Description();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroLabelText <em>Label Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Text</em>'.
	 * @see de.dc.emf.metro.MetroLabelText
	 * @generated
	 */
	EClass getMetroLabelText();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroLabelCombo <em>Label Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Combo</em>'.
	 * @see de.dc.emf.metro.MetroLabelCombo
	 * @generated
	 */
	EClass getMetroLabelCombo();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroLabelCombo#getMetroLabelComboItem <em>Metro Label Combo Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Label Combo Item</em>'.
	 * @see de.dc.emf.metro.MetroLabelCombo#getMetroLabelComboItem()
	 * @see #getMetroLabelCombo()
	 * @generated
	 */
	EReference getMetroLabelCombo_MetroLabelComboItem();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroLabelTextArea <em>Label Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Text Area</em>'.
	 * @see de.dc.emf.metro.MetroLabelTextArea
	 * @generated
	 */
	EClass getMetroLabelTextArea();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroLabelCheckBox <em>Label Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Check Box</em>'.
	 * @see de.dc.emf.metro.MetroLabelCheckBox
	 * @generated
	 */
	EClass getMetroLabelCheckBox();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroLabelCheckBox#getMetroLabelCheckBoxItem <em>Metro Label Check Box Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Label Check Box Item</em>'.
	 * @see de.dc.emf.metro.MetroLabelCheckBox#getMetroLabelCheckBoxItem()
	 * @see #getMetroLabelCheckBox()
	 * @generated
	 */
	EReference getMetroLabelCheckBox_MetroLabelCheckBoxItem();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.BaseItem <em>Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Item</em>'.
	 * @see de.dc.emf.metro.BaseItem
	 * @generated
	 */
	EClass getBaseItem();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.BaseItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.metro.BaseItem#getName()
	 * @see #getBaseItem()
	 * @generated
	 */
	EAttribute getBaseItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.BaseItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.emf.metro.BaseItem#getValue()
	 * @see #getBaseItem()
	 * @generated
	 */
	EAttribute getBaseItem_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.BaseItem#isIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dc.emf.metro.BaseItem#isIsSelected()
	 * @see #getBaseItem()
	 * @generated
	 */
	EAttribute getBaseItem_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see de.dc.emf.metro.MetroTable
	 * @generated
	 */
	EClass getMetroTable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.emf.metro.MetroTable#getMetroTableColumns <em>Metro Table Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metro Table Columns</em>'.
	 * @see de.dc.emf.metro.MetroTable#getMetroTableColumns()
	 * @see #getMetroTable()
	 * @generated
	 */
	EReference getMetroTable_MetroTableColumns();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Column</em>'.
	 * @see de.dc.emf.metro.MetroTableColumn
	 * @generated
	 */
	EClass getMetroTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.emf.metro.MetroTableColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.emf.metro.MetroTableColumn#getName()
	 * @see #getMetroTableColumn()
	 * @generated
	 */
	EAttribute getMetroTableColumn_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.emf.metro.MetroTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see de.dc.emf.metro.MetroTree
	 * @generated
	 */
	EClass getMetroTree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetroFactory getMetroFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroRootImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroRoot()
		 * @generated
		 */
		EClass METRO_ROOT = eINSTANCE.getMetroRoot();

		/**
		 * The meta object literal for the '<em><b>Application Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_ROOT__APPLICATION_NAME = eINSTANCE.getMetroRoot_ApplicationName();

		/**
		 * The meta object literal for the '<em><b>Metro Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_ROOT__METRO_PAGES = eINSTANCE.getMetroRoot_MetroPages();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroPanelImpl <em>Panel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroPanelImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroPanel()
		 * @generated
		 */
		EClass METRO_PANEL = eINSTANCE.getMetroPanel();

		/**
		 * The meta object literal for the '<em><b>Metro Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_PANEL__METRO_PAGES = eINSTANCE.getMetroPanel_MetroPages();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.CustomizableElementImpl <em>Customizable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.CustomizableElementImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getCustomizableElement()
		 * @generated
		 */
		EClass CUSTOMIZABLE_ELEMENT = eINSTANCE.getCustomizableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMIZABLE_ELEMENT__NAME = eINSTANCE.getCustomizableElement_Name();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroPageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroPageImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroPage()
		 * @generated
		 */
		EClass METRO_PAGE = eINSTANCE.getMetroPage();

		/**
		 * The meta object literal for the '<em><b>Show Button</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_PAGE__SHOW_BUTTON = eINSTANCE.getMetroPage_ShowButton();

		/**
		 * The meta object literal for the '<em><b>Metro Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_PAGE__METRO_CONTROLS = eINSTANCE.getMetroPage_MetroControls();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.MetroControl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.MetroControl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroControl()
		 * @generated
		 */
		EClass METRO_CONTROL = eINSTANCE.getMetroControl();

		/**
		 * The meta object literal for the '<em><b>Is Required Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_CONTROL__IS_REQUIRED_FIELD = eINSTANCE.getMetroControl_IsRequiredField();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_CONTROL__DESCRIPTION = eINSTANCE.getMetroControl_Description();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroLabelTextImpl <em>Label Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroLabelTextImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelText()
		 * @generated
		 */
		EClass METRO_LABEL_TEXT = eINSTANCE.getMetroLabelText();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroLabelComboImpl <em>Label Combo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroLabelComboImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelCombo()
		 * @generated
		 */
		EClass METRO_LABEL_COMBO = eINSTANCE.getMetroLabelCombo();

		/**
		 * The meta object literal for the '<em><b>Metro Label Combo Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_LABEL_COMBO__METRO_LABEL_COMBO_ITEM = eINSTANCE.getMetroLabelCombo_MetroLabelComboItem();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroLabelTextAreaImpl <em>Label Text Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroLabelTextAreaImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelTextArea()
		 * @generated
		 */
		EClass METRO_LABEL_TEXT_AREA = eINSTANCE.getMetroLabelTextArea();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroLabelCheckBoxImpl <em>Label Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroLabelCheckBoxImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroLabelCheckBox()
		 * @generated
		 */
		EClass METRO_LABEL_CHECK_BOX = eINSTANCE.getMetroLabelCheckBox();

		/**
		 * The meta object literal for the '<em><b>Metro Label Check Box Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM = eINSTANCE.getMetroLabelCheckBox_MetroLabelCheckBoxItem();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.BaseItemImpl <em>Base Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.BaseItemImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getBaseItem()
		 * @generated
		 */
		EClass BASE_ITEM = eINSTANCE.getBaseItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ITEM__NAME = eINSTANCE.getBaseItem_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ITEM__VALUE = eINSTANCE.getBaseItem_Value();

		/**
		 * The meta object literal for the '<em><b>Is Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ITEM__IS_SELECTED = eINSTANCE.getBaseItem_IsSelected();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroTableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroTableImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTable()
		 * @generated
		 */
		EClass METRO_TABLE = eINSTANCE.getMetroTable();

		/**
		 * The meta object literal for the '<em><b>Metro Table Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRO_TABLE__METRO_TABLE_COLUMNS = eINSTANCE.getMetroTable_MetroTableColumns();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroTableColumnImpl <em>Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroTableColumnImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTableColumn()
		 * @generated
		 */
		EClass METRO_TABLE_COLUMN = eINSTANCE.getMetroTableColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRO_TABLE_COLUMN__NAME = eINSTANCE.getMetroTableColumn_Name();

		/**
		 * The meta object literal for the '{@link de.dc.emf.metro.impl.MetroTreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.emf.metro.impl.MetroTreeImpl
		 * @see de.dc.emf.metro.impl.MetroPackageImpl#getMetroTree()
		 * @generated
		 */
		EClass METRO_TREE = eINSTANCE.getMetroTree();

	}

} //MetroPackage
