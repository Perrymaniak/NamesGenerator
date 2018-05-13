package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler {

    Button button = new Button();
    TextField textField = new TextField();
    HBox hbox = new HBox();

    @Override
    public void start(Stage primaryStage){

        primaryStage.setTitle("Names Generator");

        button.setText("Click Me!");
        button.setOnAction(this);

        textField.setEditable(false);

        hbox.setSpacing(10);
        hbox.setMargin(textField, new Insets(20,20,20,20));
        hbox.setMargin(button, new Insets(20,20,20,5));

        ObservableList list = hbox.getChildren();
        list.addAll(textField, button);

        primaryStage.setScene(new Scene(hbox, 300, 50));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    @Override
    public void handle(Event event) {
        if(event.getSource() == button){
            System.out.println("Good to see you!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
