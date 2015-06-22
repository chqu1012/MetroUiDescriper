package de.dc.emf.metro.model.mapper;

import de.dc.emf.metro.MetroPage;
import de.dc.emf.metro.model.mapper.TemplateTypes;
import de.dc.emf.metro.model.template.IGenerator;
import de.dc.emf.metro.model.template.MetroPageControllerTemplate;
import de.dc.emf.metro.model.template.MetroPageTemplate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TemplateRegistry {
  private Map<TemplateTypes, IGenerator> registry = new HashMap<TemplateTypes, IGenerator>();
  
  public TemplateRegistry() {
    MetroPageTemplate _metroPageTemplate = new MetroPageTemplate();
    this.registry.put(TemplateTypes.MetroPage, _metroPageTemplate);
    MetroPageControllerTemplate _metroPageControllerTemplate = new MetroPageControllerTemplate();
    this.registry.put(TemplateTypes.MetroPageController, _metroPageControllerTemplate);
  }
  
  protected IGenerator _getTemplate(final MetroPage obj) {
    return this.registry.get(TemplateTypes.MetroPage);
  }
  
  protected IGenerator _getTemplate(final EObject obj) {
    return null;
  }
  
  protected IGenerator _getControllerTemplate(final MetroPage obj) {
    return this.registry.get(TemplateTypes.MetroPageController);
  }
  
  protected IGenerator _getControllerTemplate(final EObject obj) {
    return null;
  }
  
  public IGenerator getTemplate(final EObject obj) {
    if (obj instanceof MetroPage) {
      return _getTemplate((MetroPage)obj);
    } else if (obj != null) {
      return _getTemplate(obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }
  
  public IGenerator getControllerTemplate(final EObject obj) {
    if (obj instanceof MetroPage) {
      return _getControllerTemplate((MetroPage)obj);
    } else if (obj != null) {
      return _getControllerTemplate(obj);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(obj).toString());
    }
  }
}
