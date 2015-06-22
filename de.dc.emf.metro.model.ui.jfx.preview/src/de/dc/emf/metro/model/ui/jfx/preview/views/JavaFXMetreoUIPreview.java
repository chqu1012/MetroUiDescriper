package de.dc.emf.metro.model.ui.jfx.preview.views;


import org.eclipse.fx.ui.workbench3.FXViewPart;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class JavaFXMetreoUIPreview extends FXViewPart {

	private BorderPane pane;

	@Override
	protected Scene createFxScene() {
		pane = new BorderPane();
		Button btn = new Button("Hallo");
		pane.setCenter(btn);
		return new Scene(pane);
	}

	@Override
	protected void setFxFocus() {

	}
}