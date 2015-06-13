/**
 */
package de.dc.emf.metro.util;

import de.dc.emf.metro.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.emf.metro.MetroPackage
 * @generated
 */
public class MetroSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetroPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroSwitch() {
		if (modelPackage == null) {
			modelPackage = MetroPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetroPackage.METRO_ROOT: {
				MetroRoot metroRoot = (MetroRoot)theEObject;
				T result = caseMetroRoot(metroRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_PANEL: {
				MetroPanel metroPanel = (MetroPanel)theEObject;
				T result = caseMetroPanel(metroPanel);
				if (result == null) result = caseCustomizableElement(metroPanel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.CUSTOMIZABLE_ELEMENT: {
				CustomizableElement customizableElement = (CustomizableElement)theEObject;
				T result = caseCustomizableElement(customizableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_PAGE: {
				MetroPage metroPage = (MetroPage)theEObject;
				T result = caseMetroPage(metroPage);
				if (result == null) result = caseCustomizableElement(metroPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_CONTROL: {
				MetroControl metroControl = (MetroControl)theEObject;
				T result = caseMetroControl(metroControl);
				if (result == null) result = caseCustomizableElement(metroControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_LABEL_TEXT: {
				MetroLabelText metroLabelText = (MetroLabelText)theEObject;
				T result = caseMetroLabelText(metroLabelText);
				if (result == null) result = caseMetroControl(metroLabelText);
				if (result == null) result = caseCustomizableElement(metroLabelText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_LABEL_COMBO: {
				MetroLabelCombo metroLabelCombo = (MetroLabelCombo)theEObject;
				T result = caseMetroLabelCombo(metroLabelCombo);
				if (result == null) result = caseMetroControl(metroLabelCombo);
				if (result == null) result = caseCustomizableElement(metroLabelCombo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_LABEL_TEXT_AREA: {
				MetroLabelTextArea metroLabelTextArea = (MetroLabelTextArea)theEObject;
				T result = caseMetroLabelTextArea(metroLabelTextArea);
				if (result == null) result = caseMetroControl(metroLabelTextArea);
				if (result == null) result = caseCustomizableElement(metroLabelTextArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_LABEL_CHECK_BOX: {
				MetroLabelCheckBox metroLabelCheckBox = (MetroLabelCheckBox)theEObject;
				T result = caseMetroLabelCheckBox(metroLabelCheckBox);
				if (result == null) result = caseMetroControl(metroLabelCheckBox);
				if (result == null) result = caseCustomizableElement(metroLabelCheckBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.BASE_ITEM: {
				BaseItem baseItem = (BaseItem)theEObject;
				T result = caseBaseItem(baseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_TABLE: {
				MetroTable metroTable = (MetroTable)theEObject;
				T result = caseMetroTable(metroTable);
				if (result == null) result = caseMetroControl(metroTable);
				if (result == null) result = caseCustomizableElement(metroTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_TABLE_COLUMN: {
				MetroTableColumn metroTableColumn = (MetroTableColumn)theEObject;
				T result = caseMetroTableColumn(metroTableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetroPackage.METRO_TREE: {
				MetroTree metroTree = (MetroTree)theEObject;
				T result = caseMetroTree(metroTree);
				if (result == null) result = caseMetroControl(metroTree);
				if (result == null) result = caseCustomizableElement(metroTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroRoot(MetroRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroPanel(MetroPanel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomizableElement(CustomizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroPage(MetroPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroControl(MetroControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroLabelText(MetroLabelText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroLabelCombo(MetroLabelCombo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Text Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Text Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroLabelTextArea(MetroLabelTextArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroLabelCheckBox(MetroLabelCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseItem(BaseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroTable(MetroTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroTableColumn(MetroTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetroTree(MetroTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetroSwitch
