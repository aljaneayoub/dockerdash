module local_registry {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires com.jfoenix;
	requires java.desktop;
	requires javafx.web;
	requires java.sql;
	requires java.json;
	opens application to javafx.graphics, javafx.fxml;
}
