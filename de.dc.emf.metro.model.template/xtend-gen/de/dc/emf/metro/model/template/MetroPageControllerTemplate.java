package de.dc.emf.metro.model.template;

import de.dc.emf.metro.MetroControl;
import de.dc.emf.metro.MetroLabelCheckBox;
import de.dc.emf.metro.MetroLabelCombo;
import de.dc.emf.metro.MetroLabelText;
import de.dc.emf.metro.MetroLabelTextArea;
import de.dc.emf.metro.MetroPage;
import de.dc.emf.metro.model.template.IGenerator;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class MetroPageControllerTemplate implements IGenerator {
  @Override
  public String gen(final EObject obj) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((obj instanceof MetroPage)) {
        final MetroPage page = ((MetroPage) obj);
        _builder.newLineIfNotEmpty();
        CharSequence _imports = this.imports();
        _builder.append(_imports, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("public class ");
        String _name = page.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("Controller{");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        {
          EList<MetroControl> _metroControls = page.getMetroControls();
          boolean _hasElements = false;
          for(final MetroControl c : _metroControls) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            _builder.append("@FXML ");
            CharSequence _type = this.getType(c);
            _builder.append(_type, "\t");
            String _name_1 = c.getName();
            String _firstLower = StringExtensions.toFirstLower(_name_1);
            _builder.append(_firstLower, "\t");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  protected CharSequence _getType(final MetroLabelText c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TextField ");
    return _builder;
  }
  
  protected CharSequence _getType(final MetroLabelCheckBox c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CheckBox ");
    return _builder;
  }
  
  protected CharSequence _getType(final MetroLabelCombo c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ComboBox ");
    return _builder;
  }
  
  protected CharSequence _getType(final MetroLabelTextArea c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("TextArea ");
    return _builder;
  }
  
  protected CharSequence _getType(final EObject c) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence imports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.net.URL;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import javafx.application.Platform;");
    _builder.newLine();
    _builder.append("import javafx.beans.property.SimpleBooleanProperty;");
    _builder.newLine();
    _builder.append("import javafx.beans.value.ObservableValue;");
    _builder.newLine();
    _builder.append("import javafx.collections.FXCollections;");
    _builder.newLine();
    _builder.append("import javafx.collections.ObservableList;");
    _builder.newLine();
    _builder.append("import javafx.concurrent.*;");
    _builder.newLine();
    _builder.append("import javafx.event.ActionEvent;");
    _builder.newLine();
    _builder.append("import javafx.fxml.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.control.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.image.ImageView;");
    _builder.newLine();
    _builder.append("import javafx.scene.input.*;");
    _builder.newLine();
    _builder.append("import javafx.scene.layout.*;");
    _builder.newLine();
    _builder.append("import javafx.stage.StageStyle;");
    _builder.newLine();
    _builder.append("import javafx.util.Callback;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getType(final EObject c) {
    if (c instanceof MetroLabelCheckBox) {
      return _getType((MetroLabelCheckBox)c);
    } else if (c instanceof MetroLabelCombo) {
      return _getType((MetroLabelCombo)c);
    } else if (c instanceof MetroLabelText) {
      return _getType((MetroLabelText)c);
    } else if (c instanceof MetroLabelTextArea) {
      return _getType((MetroLabelTextArea)c);
    } else if (c != null) {
      return _getType(c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
