package javafxapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import static javafxapplication.JavaFXApplication.namePerson;
import static javafxapplication.JavaFXApplication.stageMain;

public class FXMLForm2Controller implements Initializable {

    @FXML
    private Label labelName;

    @FXML
    // Кнопка назад
    private void doPrior(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("1")); // Переход на первое окно
    }

    @FXML
    // Кнопка выхода
    private void doExit(ActionEvent event) {
        stageMain.close(); // Закрытие программы
    }

    @Override
    // Секция инициализации при старте окна
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Второе окно");
        labelName.setText(namePerson); // Установка текста в метке из общей переменной
    }

}
