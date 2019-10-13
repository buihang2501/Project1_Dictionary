package Control;

import Model.Word;
import connection.SearchDB;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
    @FXML
    private TextField englishword;
    @FXML
    private Label vietnamese;

    public void search(ActionEvent event) throws SQLException {
        Word word = new Word();
        word.setEnglish_Word(englishword.getText().toLowerCase());

        SearchDB vietnam = new SearchDB();
        String trans = vietnam.Translated(word.getEnglish_Word().trim());

        vietnamese.setText(trans);
    }

    public void Close(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }
}
