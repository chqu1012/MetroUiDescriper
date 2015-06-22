package de.dc.emf.metro.model.template

import org.eclipse.emf.ecore.EObject
import de.dc.emf.metro.MetroPage

class MetroPageTemplate extends BaseMetroGenerator<MetroPage>{

	override template()'''«val size = model.metroControls.size»
	«IF size > 0»
	<GridPane hgap="5.0" vgap="5.0">
	   <columnConstraints>
	     <ColumnConstraints hgrow="SOMETIMES" minWidth="150.0" percentWidth="0.0" />
	     <ColumnConstraints hgrow="SOMETIMES" minWidth="150.0" percentWidth="0.0" />
	   </columnConstraints>
	   <rowConstraints>
	      «FOR i : 0..size SEPARATOR '\n'»<RowConstraints minHeight="10.0" percentHeight="0.0" vgrow="SOMETIMES" />«ENDFOR»
	   </rowConstraints>
	   <children>
	   	  «FOR i : 0..size SEPARATOR '\n'»<Label text="Label" GridPane.columnIndex="0" GridPane.rowIndex="«i»"/><Text fx:id="«model.metroControls.get(0).name»Text" GridPane.columnIndex="1" GridPane.rowIndex="«i»"/>«ENDFOR»
	   </children>
	   <padding>
	      <Insets bottom="5.0" left="5.0" right="5.0" top="5.0" />
	   </padding>
	</GridPane>
	«ENDIF»
	'''

	override isType(EObject obj) {
		obj instanceof MetroPage
	}

	override imports()'''
	<?import javafx.geometry.*?>
	<?import javafx.scene.image.*?>
	<?import javafx.scene.text.*?>
	<?import java.lang.*?>
	<?import java.util.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.control.*?>
	<?import javafx.scene.layout.*?>
	'''

	override controller()'''«model.name»Controller'''

	override css()'''«model.css»'''

}