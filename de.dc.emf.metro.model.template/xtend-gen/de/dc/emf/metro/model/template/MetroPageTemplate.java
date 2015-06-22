package de.dc.emf.metro.model.template;

import de.dc.emf.metro.MetroControl;
import de.dc.emf.metro.MetroPage;
import de.dc.emf.metro.model.template.BaseMetroGenerator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class MetroPageTemplate extends BaseMetroGenerator<MetroPage> {
  @Override
  public String template() {
    StringConcatenation _builder = new StringConcatenation();
    MetroPage _model = this.getModel();
    EList<MetroControl> _metroControls = _model.getMetroControls();
    final int size = _metroControls.size();
    _builder.newLineIfNotEmpty();
    {
      if ((size > 0)) {
        _builder.append("\t");
        _builder.append("<GridPane hgap=\"5.0\" vgap=\"5.0\">");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("<columnConstraints>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("     ");
        _builder.append("<ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"150.0\" percentWidth=\"0.0\" />");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("     ");
        _builder.append("<ColumnConstraints hgrow=\"SOMETIMES\" minWidth=\"150.0\" percentWidth=\"0.0\" />");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("</columnConstraints>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("<rowConstraints>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("      ");
        {
          IntegerRange _upTo = new IntegerRange(0, size);
          boolean _hasElements = false;
          for(final Integer i : _upTo) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate("\n", "\t      ");
            }
            _builder.append("<RowConstraints minHeight=\"10.0\" percentHeight=\"0.0\" vgrow=\"SOMETIMES\" />");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("</rowConstraints>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("<children>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   \t  ");
        {
          IntegerRange _upTo_1 = new IntegerRange(0, size);
          boolean _hasElements_1 = false;
          for(final Integer i_1 : _upTo_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate("\n", "\t   \t  ");
            }
            _builder.append("<Label text=\"Label\" GridPane.columnIndex=\"0\" GridPane.rowIndex=\"");
            _builder.append(i_1, "\t   \t  ");
            _builder.append("\"/><Text fx:id=\"");
            MetroPage _model_1 = this.getModel();
            EList<MetroControl> _metroControls_1 = _model_1.getMetroControls();
            MetroControl _get = _metroControls_1.get(0);
            String _name = _get.getName();
            _builder.append(_name, "\t   \t  ");
            _builder.append("Text\" GridPane.columnIndex=\"1\" GridPane.rowIndex=\"");
            _builder.append(i_1, "\t   \t  ");
            _builder.append("\"/>");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("</children>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("<padding>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("      ");
        _builder.append("<Insets bottom=\"5.0\" left=\"5.0\" right=\"5.0\" top=\"5.0\" />");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("   ");
        _builder.append("</padding>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</GridPane>");
        _builder.newLine();
      }
    }
    return _builder.toString();
  }
  
  @Override
  public boolean isType(final EObject obj) {
    return (obj instanceof MetroPage);
  }
  
  @Override
  public String imports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?import javafx.geometry.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.image.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.text.*?>");
    _builder.newLine();
    _builder.append("<?import java.lang.*?>");
    _builder.newLine();
    _builder.append("<?import java.util.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.control.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.layout.*?>");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public String controller() {
    StringConcatenation _builder = new StringConcatenation();
    MetroPage _model = this.getModel();
    String _name = _model.getName();
    _builder.append(_name, "");
    _builder.append("Controller");
    return _builder.toString();
  }
  
  @Override
  public String css() {
    StringConcatenation _builder = new StringConcatenation();
    MetroPage _model = this.getModel();
    String _css = _model.getCss();
    _builder.append(_css, "");
    return _builder.toString();
  }
}
