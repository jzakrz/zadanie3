package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class Controller {

    public TextField textfield;
    public Button button;
    public TableView tableview;
    public ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    public void initialize() {
        TableColumn<String, String> onlyColumn = (TableColumn<String, String>) tableview.getColumns().get(0);
        if (onlyColumn.getCellValueFactory() == null) {
            onlyColumn.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
        }
    }

    public void handleClick(ActionEvent actionEvent){

        if (textfield.getText() != null){

            list.add(textfield.getText());


        }
        tableview.setItems(list);
    }
}
