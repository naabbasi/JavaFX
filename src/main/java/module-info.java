module com.qterminals.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.qterminals.demo to javafx.fxml;
    exports com.qterminals.demo;
    exports com.qterminals.demo.controllers;
    opens com.qterminals.demo.controllers to javafx.fxml;
    exports com.qterminals.demo.scenes;
    opens com.qterminals.demo.scenes to javafx.fxml;
}