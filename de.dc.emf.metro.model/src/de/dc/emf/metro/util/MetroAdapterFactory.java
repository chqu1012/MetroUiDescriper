/**
 */
package de.dc.emf.metro.util;

import de.dc.emf.metro.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.emf.metro.MetroPackage
 * @generated
 */
public class MetroAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetroPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetroPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroSwitch<Adapter> modelSwitch =
		new MetroSwitch<Adapter>() {
			@Override
			public Adapter caseMetroRoot(MetroRoot object) {
				return createMetroRootAdapter();
			}
			@Override
			public Adapter caseMetroPanel(MetroPanel object) {
				return createMetroPanelAdapter();
			}
			@Override
			public Adapter caseCustomizableElement(CustomizableElement object) {
				return createCustomizableElementAdapter();
			}
			@Override
			public Adapter caseMetroPage(MetroPage object) {
				return createMetroPageAdapter();
			}
			@Override
			public Adapter caseMetroControl(MetroControl object) {
				return createMetroControlAdapter();
			}
			@Override
			public Adapter caseMetroLabelText(MetroLabelText object) {
				return createMetroLabelTextAdapter();
			}
			@Override
			public Adapter caseMetroLabelCombo(MetroLabelCombo object) {
				return createMetroLabelComboAdapter();
			}
			@Override
			public Adapter caseMetroLabelTextArea(MetroLabelTextArea object) {
				return createMetroLabelTextAreaAdapter();
			}
			@Override
			public Adapter caseMetroLabelCheckBox(MetroLabelCheckBox object) {
				return createMetroLabelCheckBoxAdapter();
			}
			@Override
			public Adapter caseBaseItem(BaseItem object) {
				return createBaseItemAdapter();
			}
			@Override
			public Adapter caseMetroTable(MetroTable object) {
				return createMetroTableAdapter();
			}
			@Override
			public Adapter caseMetroTableColumn(MetroTableColumn object) {
				return createMetroTableColumnAdapter();
			}
			@Override
			public Adapter caseMetroTree(MetroTree object) {
				return createMetroTreeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroRoot
	 * @generated
	 */
	public Adapter createMetroRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroPanel <em>Panel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroPanel
	 * @generated
	 */
	public Adapter createMetroPanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.CustomizableElement <em>Customizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.CustomizableElement
	 * @generated
	 */
	public Adapter createCustomizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroPage
	 * @generated
	 */
	public Adapter createMetroPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroControl
	 * @generated
	 */
	public Adapter createMetroControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroLabelText <em>Label Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroLabelText
	 * @generated
	 */
	public Adapter createMetroLabelTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroLabelCombo <em>Label Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroLabelCombo
	 * @generated
	 */
	public Adapter createMetroLabelComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroLabelTextArea <em>Label Text Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroLabelTextArea
	 * @generated
	 */
	public Adapter createMetroLabelTextAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroLabelCheckBox <em>Label Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroLabelCheckBox
	 * @generated
	 */
	public Adapter createMetroLabelCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.BaseItem <em>Base Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.BaseItem
	 * @generated
	 */
	public Adapter createBaseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroTable
	 * @generated
	 */
	public Adapter createMetroTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroTableColumn <em>Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroTableColumn
	 * @generated
	 */
	public Adapter createMetroTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.emf.metro.MetroTree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.emf.metro.MetroTree
	 * @generated
	 */
	public Adapter createMetroTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetroAdapterFactory
