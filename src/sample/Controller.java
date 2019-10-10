package sample;

import connection.SearchDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    @FXML
    private TextField englishword;

    public void search(ActionEvent event) throws SQLException {
        String english = englishword.getText();
        SearchDB vietnam = new SearchDB();
        String trans = vietnam.SearchDB(english.trim());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Từ của bạn nghĩa là: " + trans );
        alert.show();
    }
}
