package de.dc.emf.metro.model.mapper

import de.dc.emf.metro.MetroPage
import de.dc.emf.metro.model.template.IGenerator
import de.dc.emf.metro.model.template.MetroPageTemplate
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import static de.dc.emf.metro.model.mapper.TemplateTypes.*
import de.dc.emf.metro.model.template.MetroPageControllerTemplate

class TemplateRegistry {

	Map<TemplateTypes, IGenerator> registry = new HashMap

	new() {
		registry.put(MetroPage, new MetroPageTemplate)

		registry.put(MetroPageController, new MetroPageControllerTemplate)
	}

	def dispatch getTemplate(MetroPage obj){ registry.get(MetroPage)}
	def dispatch getTemplate(EObject obj){}

	def dispatch getControllerTemplate(MetroPage obj){ registry.get(MetroPageController)}
	def dispatch getControllerTemplate(EObject obj){}

}