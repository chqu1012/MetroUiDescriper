/**
 */
package de.dc.emf.metro.provider;


import de.dc.emf.metro.MetroFactory;
import de.dc.emf.metro.MetroPackage;
import de.dc.emf.metro.MetroPage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.emf.metro.MetroPage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetroPageItemProvider extends CustomizableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroPageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addShowButtonPropertyDescriptor(object);
			addMetroControlsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Show Button feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowButtonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetroPage_showButton_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetroPage_showButton_feature", "_UI_MetroPage_type"),
				 MetroPackage.Literals.METRO_PAGE__SHOW_BUTTON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metro Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetroControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MetroPage_metroControls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MetroPage_metroControls_feature", "_UI_MetroPage_type"),
				 MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MetroPage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetroPage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MetroPage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MetroPage_type") :
			getString("_UI_MetroPage_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MetroPage.class)) {
			case MetroPackage.METRO_PAGE__SHOW_BUTTON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetroPackage.METRO_PAGE__METRO_CONTROLS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroLabelText()));

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroLabelCombo()));

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroLabelTextArea()));

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroLabelCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroTable()));

		newChildDescriptors.add
			(createChildParameter
				(MetroPackage.Literals.METRO_PAGE__METRO_CONTROLS,
				 MetroFactory.eINSTANCE.createMetroTree()));
	}

}
