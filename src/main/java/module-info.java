module org.example.assignment_lab_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.assignment_lab_02 to javafx.fxml;
    exports org.example.assignment_lab_02;
}