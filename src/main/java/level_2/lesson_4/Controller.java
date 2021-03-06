package level_2.lesson_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField messageText;

    @FXML
    private TextArea messagesArea;

    @FXML
    private Button buttonEnter;

    @FXML
    public void buttonEnterClick(ActionEvent actionEvent) {
        String enteredText = messageText.getText();
        if (enteredText == "") {
            return;
        }
        messagesArea.appendText(enteredText + "\n");
        messageText.clear();
    }
}
