package de.dc.emf.metro.model.template

import org.eclipse.emf.ecore.EObject

interface IGenerator {
	def String gen(EObject obj)
}