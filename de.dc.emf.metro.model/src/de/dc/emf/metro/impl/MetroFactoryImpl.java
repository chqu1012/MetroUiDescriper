/**
 */
package de.dc.emf.metro.impl;

import de.dc.emf.metro.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetroFactoryImpl extends EFactoryImpl implements MetroFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetroFactory init() {
		try {
			MetroFactory theMetroFactory = (MetroFactory)EPackage.Registry.INSTANCE.getEFactory(MetroPackage.eNS_URI);
			if (theMetroFactory != null) {
				return theMetroFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetroFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetroPackage.METRO_ROOT: return createMetroRoot();
			case MetroPackage.METRO_PANEL: return createMetroPanel();
			case MetroPackage.CUSTOMIZABLE_ELEMENT: return createCustomizableElement();
			case MetroPackage.METRO_PAGE: return createMetroPage();
			case MetroPackage.METRO_LABEL_TEXT: return createMetroLabelText();
			case MetroPackage.METRO_LABEL_COMBO: return createMetroLabelCombo();
			case MetroPackage.METRO_LABEL_TEXT_AREA: return createMetroLabelTextArea();
			case MetroPackage.METRO_LABEL_CHECK_BOX: return createMetroLabelCheckBox();
			case MetroPackage.BASE_ITEM: return createBaseItem();
			case MetroPackage.METRO_TABLE: return createMetroTable();
			case MetroPackage.METRO_TABLE_COLUMN: return createMetroTableColumn();
			case MetroPackage.METRO_TREE: return createMetroTree();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroRoot createMetroRoot() {
		MetroRootImpl metroRoot = new MetroRootImpl();
		return metroRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroPanel createMetroPanel() {
		MetroPanelImpl metroPanel = new MetroPanelImpl();
		return metroPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizableElement createCustomizableElement() {
		CustomizableElementImpl customizableElement = new CustomizableElementImpl();
		return customizableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroPage createMetroPage() {
		MetroPageImpl metroPage = new MetroPageImpl();
		return metroPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroLabelText createMetroLabelText() {
		MetroLabelTextImpl metroLabelText = new MetroLabelTextImpl();
		return metroLabelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroLabelCombo createMetroLabelCombo() {
		MetroLabelComboImpl metroLabelCombo = new MetroLabelComboImpl();
		return metroLabelCombo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroLabelTextArea createMetroLabelTextArea() {
		MetroLabelTextAreaImpl metroLabelTextArea = new MetroLabelTextAreaImpl();
		return metroLabelTextArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroLabelCheckBox createMetroLabelCheckBox() {
		MetroLabelCheckBoxImpl metroLabelCheckBox = new MetroLabelCheckBoxImpl();
		return metroLabelCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseItem createBaseItem() {
		BaseItemImpl baseItem = new BaseItemImpl();
		return baseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroTable createMetroTable() {
		MetroTableImpl metroTable = new MetroTableImpl();
		return metroTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroTableColumn createMetroTableColumn() {
		MetroTableColumnImpl metroTableColumn = new MetroTableColumnImpl();
		return metroTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroTree createMetroTree() {
		MetroTreeImpl metroTree = new MetroTreeImpl();
		return metroTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroPackage getMetroPackage() {
		return (MetroPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetroPackage getPackage() {
		return MetroPackage.eINSTANCE;
	}

} //MetroFactoryImpl
