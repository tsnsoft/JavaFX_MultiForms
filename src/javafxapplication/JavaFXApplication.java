package javafxapplication;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    static Stage stageMain; // Общая переменная для доступа главной сцене
    static String namePerson = ""; // Общая переменная для сохранения текста

    @Override
    public void start(Stage stage) throws Exception {
        stageMain = stage; // Сохраняем ссылку на главную сцену в общей переменной
        stage.setScene(new SceneBuilder().getScene("1")); // Переход на первое окно
        stage.show(); // Активируем видимость программы
    }

    public static void main(String[] args) {
        launch(args);
    }

}
