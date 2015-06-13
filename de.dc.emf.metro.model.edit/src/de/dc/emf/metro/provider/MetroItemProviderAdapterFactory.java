/**
 */
package de.dc.emf.metro.provider;

import de.dc.emf.metro.util.MetroAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetroItemProviderAdapterFactory extends MetroAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetroItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroRootItemProvider metroRootItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroRootAdapter() {
		if (metroRootItemProvider == null) {
			metroRootItemProvider = new MetroRootItemProvider(this);
		}

		return metroRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroPanel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroPanelItemProvider metroPanelItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroPanel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroPanelAdapter() {
		if (metroPanelItemProvider == null) {
			metroPanelItemProvider = new MetroPanelItemProvider(this);
		}

		return metroPanelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.CustomizableElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomizableElementItemProvider customizableElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.CustomizableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomizableElementAdapter() {
		if (customizableElementItemProvider == null) {
			customizableElementItemProvider = new CustomizableElementItemProvider(this);
		}

		return customizableElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroPageItemProvider metroPageItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroPageAdapter() {
		if (metroPageItemProvider == null) {
			metroPageItemProvider = new MetroPageItemProvider(this);
		}

		return metroPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroLabelText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelTextItemProvider metroLabelTextItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroLabelText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroLabelTextAdapter() {
		if (metroLabelTextItemProvider == null) {
			metroLabelTextItemProvider = new MetroLabelTextItemProvider(this);
		}

		return metroLabelTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroLabelCombo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelComboItemProvider metroLabelComboItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroLabelCombo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroLabelComboAdapter() {
		if (metroLabelComboItemProvider == null) {
			metroLabelComboItemProvider = new MetroLabelComboItemProvider(this);
		}

		return metroLabelComboItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroLabelTextArea} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelTextAreaItemProvider metroLabelTextAreaItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroLabelTextArea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroLabelTextAreaAdapter() {
		if (metroLabelTextAreaItemProvider == null) {
			metroLabelTextAreaItemProvider = new MetroLabelTextAreaItemProvider(this);
		}

		return metroLabelTextAreaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroLabelCheckBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroLabelCheckBoxItemProvider metroLabelCheckBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroLabelCheckBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroLabelCheckBoxAdapter() {
		if (metroLabelCheckBoxItemProvider == null) {
			metroLabelCheckBoxItemProvider = new MetroLabelCheckBoxItemProvider(this);
		}

		return metroLabelCheckBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.BaseItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseItemItemProvider baseItemItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.BaseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseItemAdapter() {
		if (baseItemItemProvider == null) {
			baseItemItemProvider = new BaseItemItemProvider(this);
		}

		return baseItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroTable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroTableItemProvider metroTableItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroTableAdapter() {
		if (metroTableItemProvider == null) {
			metroTableItemProvider = new MetroTableItemProvider(this);
		}

		return metroTableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroTableColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroTableColumnItemProvider metroTableColumnItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroTableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroTableColumnAdapter() {
		if (metroTableColumnItemProvider == null) {
			metroTableColumnItemProvider = new MetroTableColumnItemProvider(this);
		}

		return metroTableColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.emf.metro.MetroTree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetroTreeItemProvider metroTreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.emf.metro.MetroTree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetroTreeAdapter() {
		if (metroTreeItemProvider == null) {
			metroTreeItemProvider = new MetroTreeItemProvider(this);
		}

		return metroTreeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (metroRootItemProvider != null) metroRootItemProvider.dispose();
		if (metroPanelItemProvider != null) metroPanelItemProvider.dispose();
		if (customizableElementItemProvider != null) customizableElementItemProvider.dispose();
		if (metroPageItemProvider != null) metroPageItemProvider.dispose();
		if (metroLabelTextItemProvider != null) metroLabelTextItemProvider.dispose();
		if (metroLabelComboItemProvider != null) metroLabelComboItemProvider.dispose();
		if (metroLabelTextAreaItemProvider != null) metroLabelTextAreaItemProvider.dispose();
		if (metroLabelCheckBoxItemProvider != null) metroLabelCheckBoxItemProvider.dispose();
		if (baseItemItemProvider != null) baseItemItemProvider.dispose();
		if (metroTableItemProvider != null) metroTableItemProvider.dispose();
		if (metroTableColumnItemProvider != null) metroTableColumnItemProvider.dispose();
		if (metroTreeItemProvider != null) metroTreeItemProvider.dispose();
	}

}