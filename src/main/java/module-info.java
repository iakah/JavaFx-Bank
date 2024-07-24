module com.example.learnjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.learnjavafx to javafx.fxml;
    exports com.example.learnjavafx;
    exports com.example.learnjavafx.Controllers;
    exports com.example.learnjavafx.Controllers.Admin;
    exports com.example.learnjavafx.Controllers.Client;
    exports com.example.learnjavafx.Models;
    exports com.example.learnjavafx.Views;
}