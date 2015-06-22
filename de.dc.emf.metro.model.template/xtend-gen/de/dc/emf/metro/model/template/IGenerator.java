package de.dc.emf.metro.model.template;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface IGenerator {
  public abstract String gen(final EObject obj);
}
