package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //называем наше окно
        primaryStage.setTitle("Hello World from JavaFX");

        //создаем лайаут где будет все отобржатся
        StackPane layout = new StackPane();

        //Создаем сцену и помещаем в нее лайаут
        Scene scene = new Scene(layout, 300, 300);

        //Привязываем сцену к окну
        primaryStage.setScene(scene);

        //создаем кномпку и вставляем ее в лайаут
        button = new Button("Button");
        layout.getChildren().add(button);

        //отображаем все
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
