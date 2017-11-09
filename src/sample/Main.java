package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage win;
    Button button;


    @Override
    public void start(Stage primaryStage) throws Exception{
        win = primaryStage;
        win.setTitle("Main window");
        StackPane layout = new StackPane();
        button = new Button("Click me");
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 200);
        win.setScene(scene);
        win.show();

        button.setOnAction(e -> {
            ModWin.display("Hello", "Our text");
        });

    }


    public static void main(String[] args) {
        launch(args);
    }

}
