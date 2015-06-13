/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.BaseItem;
import de.dc.emf.metro.CustomizableElement;
import de.dc.emf.metro.MetroControl;
import de.dc.emf.metro.MetroFactory;
import de.dc.emf.metro.MetroLabelCheckBox;
import de.dc.emf.metro.MetroLabelCombo;
import de.dc.emf.metro.MetroLabelText;
import de.dc.emf.metro.MetroLabelTextArea;
import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroPage;
import de.dc.emf.metro.MetroPanel;
import de.dc.emf.metro.MetroRoot;
import de.dc.emf.metro.MetroTable;
import de.dc.emf.metro.MetroTableColumn;
import de.dc.emf.metro.MetroTree;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetroPackageImpl extends EPackageImpl implements MetroPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroPanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroLabelTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroLabelComboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroLabelTextAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroLabelCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metroTreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.emf.metro.MetroPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetroPackageImpl() {
		super(eNS_URI, MetroFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetroPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetroPackage init() {
		if (isInited) return (MetroPackage)EPackage.Registry.INSTANCE.getEPackage(MetroPackage.eNS_URI);

		// Obtain or create and register package
		MetroPackageImpl theMetroPackage = (MetroPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetroPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetroPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMetroPackage.createPackageContents();

		// Initialize created meta-data
		theMetroPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetroPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetroPackage.eNS_URI, theMetroPackage);
		return theMetroPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroRoot() {
		return metroRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetroRoot_ApplicationName() {
		return (EAttribute)metroRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroRoot_MetroPages() {
		return (EReference)metroRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroPanel() {
		return metroPanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroPanel_MetroPages() {
		return (EReference)metroPanelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomizableElement() {
		return customizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomizableElement_Name() {
		return (EAttribute)customizableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroPage() {
		return metroPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetroPage_ShowButton() {
		return (EAttribute)metroPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroPage_MetroControls() {
		return (EReference)metroPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroControl() {
		return metroControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetroControl_IsRequiredField() {
		return (EAttribute)metroControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetroControl_Description() {
		return (EAttribute)metroControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroLabelText() {
		return metroLabelTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroLabelCombo() {
		return metroLabelComboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroLabelCombo_MetroLabelComboItem() {
		return (EReference)metroLabelComboEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroLabelTextArea() {
		return metroLabelTextAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroLabelCheckBox() {
		return metroLabelCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroLabelCheckBox_MetroLabelCheckBoxItem() {
		return (EReference)metroLabelCheckBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseItem() {
		return baseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseItem_Name() {
		return (EAttribute)baseItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseItem_Value() {
		return (EAttribute)baseItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseItem_IsSelected() {
		return (EAttribute)baseItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroTable() {
		return metroTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetroTable_MetroTableColumns() {
		return (EReference)metroTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroTableColumn() {
		return metroTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetroTableColumn_Name() {
		return (EAttribute)metroTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetroTree() {
		return metroTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroFactory getMetroFactory() {
		return (MetroFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		metroRootEClass = createEClass(METRO_ROOT);
		createEAttribute(metroRootEClass, METRO_ROOT__APPLICATION_NAME);
		createEReference(metroRootEClass, METRO_ROOT__METRO_PAGES);

		metroPanelEClass = createEClass(METRO_PANEL);
		createEReference(metroPanelEClass, METRO_PANEL__METRO_PAGES);

		customizableElementEClass = createEClass(CUSTOMIZABLE_ELEMENT);
		createEAttribute(customizableElementEClass, CUSTOMIZABLE_ELEMENT__NAME);

		metroPageEClass = createEClass(METRO_PAGE);
		createEAttribute(metroPageEClass, METRO_PAGE__SHOW_BUTTON);
		createEReference(metroPageEClass, METRO_PAGE__METRO_CONTROLS);

		metroControlEClass = createEClass(METRO_CONTROL);
		createEAttribute(metroControlEClass, METRO_CONTROL__IS_REQUIRED_FIELD);
		createEAttribute(metroControlEClass, METRO_CONTROL__DESCRIPTION);

		metroLabelTextEClass = createEClass(METRO_LABEL_TEXT);

		metroLabelComboEClass = createEClass(METRO_LABEL_COMBO);
		createEReference(metroLabelComboEClass, METRO_LABEL_COMBO__METRO_LABEL_COMBO_ITEM);

		metroLabelTextAreaEClass = createEClass(METRO_LABEL_TEXT_AREA);

		metroLabelCheckBoxEClass = createEClass(METRO_LABEL_CHECK_BOX);
		createEReference(metroLabelCheckBoxEClass, METRO_LABEL_CHECK_BOX__METRO_LABEL_CHECK_BOX_ITEM);

		baseItemEClass = createEClass(BASE_ITEM);
		createEAttribute(baseItemEClass, BASE_ITEM__NAME);
		createEAttribute(baseItemEClass, BASE_ITEM__VALUE);
		createEAttribute(baseItemEClass, BASE_ITEM__IS_SELECTED);

		metroTableEClass = createEClass(METRO_TABLE);
		createEReference(metroTableEClass, METRO_TABLE__METRO_TABLE_COLUMNS);

		metroTableColumnEClass = createEClass(METRO_TABLE_COLUMN);
		createEAttribute(metroTableColumnEClass, METRO_TABLE_COLUMN__NAME);

		metroTreeEClass = createEClass(METRO_TREE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metroPanelEClass.getESuperTypes().add(this.getCustomizableElement());
		metroPageEClass.getESuperTypes().add(this.getCustomizableElement());
		metroControlEClass.getESuperTypes().add(this.getCustomizableElement());
		metroLabelTextEClass.getESuperTypes().add(this.getMetroControl());
		metroLabelComboEClass.getESuperTypes().add(this.getMetroControl());
		metroLabelTextAreaEClass.getESuperTypes().add(this.getMetroControl());
		metroLabelCheckBoxEClass.getESuperTypes().add(this.getMetroControl());
		metroTableEClass.getESuperTypes().add(this.getMetroControl());
		metroTreeEClass.getESuperTypes().add(this.getMetroControl());

		// Initialize classes, features, and operations; add parameters
		initEClass(metroRootEClass, MetroRoot.class, "MetroRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetroRoot_ApplicationName(), ecorePackage.getEString(), "applicationName", null, 0, 1, MetroRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetroRoot_MetroPages(), this.getMetroPanel(), null, "metroPages", null, 0, -1, MetroRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroPanelEClass, MetroPanel.class, "MetroPanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetroPanel_MetroPages(), this.getMetroPage(), null, "metroPages", null, 0, -1, MetroPanel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customizableElementEClass, CustomizableElement.class, "CustomizableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomizableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CustomizableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroPageEClass, MetroPage.class, "MetroPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetroPage_ShowButton(), ecorePackage.getEBoolean(), "showButton", "true", 0, 1, MetroPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetroPage_MetroControls(), this.getMetroControl(), null, "metroControls", null, 0, -1, MetroPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroControlEClass, MetroControl.class, "MetroControl", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetroControl_IsRequiredField(), ecorePackage.getEBoolean(), "isRequiredField", null, 0, 1, MetroControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetroControl_Description(), ecorePackage.getEString(), "description", null, 0, 1, MetroControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroLabelTextEClass, MetroLabelText.class, "MetroLabelText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metroLabelComboEClass, MetroLabelCombo.class, "MetroLabelCombo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetroLabelCombo_MetroLabelComboItem(), this.getBaseItem(), null, "metroLabelComboItem", null, 0, -1, MetroLabelCombo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroLabelTextAreaEClass, MetroLabelTextArea.class, "MetroLabelTextArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metroLabelCheckBoxEClass, MetroLabelCheckBox.class, "MetroLabelCheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetroLabelCheckBox_MetroLabelCheckBoxItem(), this.getBaseItem(), null, "metroLabelCheckBoxItem", null, 0, -1, MetroLabelCheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseItemEClass, BaseItem.class, "BaseItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, BaseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseItem_IsSelected(), ecorePackage.getEBoolean(), "isSelected", null, 0, 1, BaseItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroTableEClass, MetroTable.class, "MetroTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetroTable_MetroTableColumns(), this.getMetroTableColumn(), null, "metroTableColumns", null, 0, -1, MetroTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroTableColumnEClass, MetroTableColumn.class, "MetroTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetroTableColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetroTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metroTreeEClass, MetroTree.class, "MetroTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MetroPackageImpl
