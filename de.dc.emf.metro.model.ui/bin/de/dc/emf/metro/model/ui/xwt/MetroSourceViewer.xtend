package de.dc.emf.metro.model.ui.xwt

import de.dc.emf.metro.model.ui.style.JavaLineStyler
import java.util.HashMap
import org.eclipse.e4.xwt.DefaultLoadingContext
import org.eclipse.e4.xwt.IConstants
import org.eclipse.e4.xwt.IXWTLoader
import org.eclipse.e4.xwt.XWT
import org.eclipse.e4.xwt.annotation.UI
import org.eclipse.swt.SWT
import org.eclipse.swt.custom.StyledText
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.xtend.lib.annotations.Accessors

class MetroSourceViewer extends Composite {

	@UI Composite editorComposite
	@UI Composite controllerComposite

	@Accessors StyledText editor
	@Accessors StyledText controllerEditor

	new(Composite parent, int style) {
		super(parent, style)
		setLayout(new FillLayout)
		var name = MetroSourceViewer.simpleName + IConstants.XWT_EXTENSION_SUFFIX
		var url = MetroSourceViewer.getResource(name)
		var options = new HashMap<String, Object>
		options.put(IXWTLoader.CLASS_PROPERTY, this)
		options.put(IXWTLoader.CONTAINER_PROPERTY, this)
		XWT.setLoadingContext(new DefaultLoadingContext(class.classLoader))
		XWT.loadWithOptions(url, options)

		val styleBit = SWT.NONE.bitwiseOr(SWT.H_SCROLL).bitwiseOr(SWT.V_SCROLL).bitwiseOr(SWT.MULTI)

		editor = new StyledText(editorComposite, styleBit)
		editor.addLineStyleListener(new JavaLineStyler)

		controllerEditor = new StyledText(controllerComposite, styleBit)
		controllerEditor.addLineStyleListener(new JavaLineStyler)
	}

}
