module local_registry {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires com.jfoenix;
	requires java.desktop;
	requires javafx.web;
	opens application to javafx.graphics, javafx.fxml;
}
