import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class TaulaKud implements Initializable {

    @FXML
    private TableView<StudentsModel> tbData;

    @FXML
    private TableColumn<StudentsModel, Integer> studentId;

    @FXML
    private TableColumn<StudentsModel, String> firstName;

    @FXML
    private TableColumn<StudentsModel, String> lastName;

    private Main mainApp;

    public void setMainApp(Main main) {
        mainApp = main;
    }

    private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList(
            new StudentsModel(1, "Jon", "Guridi"),
            new StudentsModel(2, "Ane", "Bengoa")
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentId.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        tbData.setItems(studentsModels);
    }
}
