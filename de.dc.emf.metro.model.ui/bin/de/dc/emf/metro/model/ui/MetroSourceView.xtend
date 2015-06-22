package de.dc.emf.metro.model.ui

import de.dc.emf.metro.model.template.IGenerator
import de.dc.emf.metro.model.ui.xwt.MetroSourceViewer
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.custom.StyledText
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.ISelectionListener
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.ViewPart
import org.eclipse.emf.ecore.EObject
import de.dc.emf.metro.model.mapper.TemplateRegistry

class MetroSourceView extends ViewPart implements ISelectionListener {

	StyledText editor
	StyledText controllerEditor
	extension TemplateRegistry templates = new TemplateRegistry

	override createPartControl(Composite parent) {
		val viewer = new MetroSourceViewer(parent, 0)
		editor = viewer.editor
		controllerEditor = viewer.controllerEditor
		PlatformUI::workbench.activeWorkbenchWindow.selectionService.addSelectionListener(this)
	}

	override setFocus() {
	}

	override selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			var IGenerator template = null
			var IGenerator controllerTemplate = null
			val object = selection.firstElement
			if (object != null) {
				if (object instanceof EObject) {
					var eObject = object as EObject
					controllerTemplate = eObject.getControllerTemplate
					template = eObject.template
					if (template != null) {
						try {
							editor.text = template.gen(object)
							controllerEditor.text = controllerTemplate.gen(object)
						} catch (Exception e) {
							e.printStackTrace
						}
					}
				}
			}
		}
	}
}