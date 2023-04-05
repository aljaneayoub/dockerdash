module local_registry {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires com.jfoenix;
	
	opens application to javafx.graphics, javafx.fxml;
}
