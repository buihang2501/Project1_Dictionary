package Control;

import connection.SearchDB;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Search {
    @FXML
    private TextField englishword;

    public void search(ActionEvent event) throws SQLException {
        String word = englishword.getText();
        String english = word.toLowerCase();

        SearchDB vietnam = new SearchDB();
        String trans = vietnam.Translate(english.trim());

        //Đưa nghĩa của từ ra màn hình thông báo
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Từ của bạn nghĩa là: " + trans );
        alert.show();
    }
}
