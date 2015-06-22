package de.dc.emf.metro.model.template

import org.eclipse.emf.ecore.EObject

abstract class BaseMetroGenerator<T> implements IGenerator{

	EObject obj

	String css
	String controller

	override gen(EObject obj){
	this.obj=obj
	'''
	«IF obj.type»
	<?xml version="1.0" encoding="UTF-8"?>

	«imports»

	<AnchorPane id="AnchorPane" style="-fx-background-color: white;" stylesheets="@../css/«css».css" xmlns="http://javafx.com/javafx/8" xmlns:fx="http://javafx.com/fxml/1"
	  fx:controller="«controller»">

	<children>
		«template»
	</children>
	</AnchorPane>
	«ENDIF»
	'''
	}

	def abstract String template()
	def abstract String imports()
	def abstract String controller()
	def abstract String css()
	def abstract boolean isType(EObject obj)

	def T getModel(){
		obj as T
	}
}