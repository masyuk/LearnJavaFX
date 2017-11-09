package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ModWin {

    public static void display(String title, String context){
        Stage win = new Stage();
        win.initModality(Modality.APPLICATION_MODAL);
        win.setTitle(title);
        win.setMinWidth(150);
        win.setMinHeight(120);

        Label label = new Label(context);
        label.setFont(Font.font(15));

        Button btClose = new Button("Close");
        btClose.setOnAction(e -> win.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, btClose);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        win.setScene(scene);
        win.show();

    }
}
