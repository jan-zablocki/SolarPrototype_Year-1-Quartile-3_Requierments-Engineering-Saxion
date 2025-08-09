module com.suxiondevelopment.solarprototype {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.suxiondevelopment.solarprototype to javafx.fxml;
    exports com.suxiondevelopment.solarprototype;
}