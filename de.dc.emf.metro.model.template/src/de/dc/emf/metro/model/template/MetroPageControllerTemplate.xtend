package de.dc.emf.metro.model.template

import org.eclipse.emf.ecore.EObject
import de.dc.emf.metro.MetroPage
import de.dc.emf.metro.MetroControl
import de.dc.emf.metro.MetroLabelText
import de.dc.emf.metro.MetroLabelCheckBox
import de.dc.emf.metro.MetroLabelCombo
import de.dc.emf.metro.MetroLabelTextArea

class MetroPageControllerTemplate implements IGenerator {

	override gen(EObject obj)'''
	«IF obj instanceof MetroPage»
	«val page = obj as MetroPage»
	«imports»

	public class «page.name.toFirstUpper»Controller{

		«FOR c: page.metroControls SEPARATOR '\n'»@FXML «c.type»«c.name.toFirstLower»;«ENDFOR»

	}
	«ENDIF»
	'''

	def dispatch getType(MetroLabelText c)'''TextField '''
	def dispatch getType(MetroLabelCheckBox c)'''CheckBox '''
	def dispatch getType(MetroLabelCombo c)'''ComboBox '''
	def dispatch getType(MetroLabelTextArea c)'''TextArea '''
	def dispatch getType(EObject c)''''''

	def imports()'''
	import java.net.URL;
	import java.util.*;
	import javafx.application.Platform;
	import javafx.beans.property.SimpleBooleanProperty;
	import javafx.beans.value.ObservableValue;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.concurrent.*;
	import javafx.event.ActionEvent;
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.image.ImageView;
	import javafx.scene.input.*;
	import javafx.scene.layout.*;
	import javafx.stage.StageStyle;
	import javafx.util.Callback;
	'''
}