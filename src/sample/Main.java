package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

    Button button = new Button();
    TextField textField = new TextField();
    HBox hbox = new HBox();
    private Generator generator = new Generator();

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
            String text = "";
            generator.readFile();
            //generator.printElements(generator.readFile());
            text = generator.printRandomName(generator.readFile());
            System.out.println("TEST:" + text);
            textField.setText(text);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
