package de.dc.emf.metro.model.template;

import de.dc.emf.metro.model.template.IGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class BaseMetroGenerator<T extends Object> implements IGenerator {
  private EObject obj;
  
  private String css;
  
  private String controller;
  
  @Override
  public String gen(final EObject obj) {
    String _xblockexpression = null;
    {
      this.obj = obj;
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isType = this.isType(obj);
        if (_isType) {
          _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
          _builder.newLine();
          _builder.newLine();
          String _imports = this.imports();
          _builder.append(_imports, "");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("<AnchorPane id=\"AnchorPane\" style=\"-fx-background-color: white;\" stylesheets=\"@../css/");
          _builder.append(this.css, "");
          _builder.append(".css\" xmlns=\"http://javafx.com/javafx/8\" xmlns:fx=\"http://javafx.com/fxml/1\"");
          _builder.newLineIfNotEmpty();
          _builder.append("  ");
          _builder.append("fx:controller=\"");
          _builder.append(this.controller, "  ");
          _builder.append("\">");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("<children>");
          _builder.newLine();
          _builder.append("\t");
          String _template = this.template();
          _builder.append(_template, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("</children>");
          _builder.newLine();
          _builder.append("</AnchorPane>");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }
  
  public abstract String template();
  
  public abstract String imports();
  
  public abstract String controller();
  
  public abstract String css();
  
  public abstract boolean isType(final EObject obj);
  
  public T getModel() {
    return ((T) this.obj);
  }
}
