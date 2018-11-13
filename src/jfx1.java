import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    public class jfx1 extends Application {
        @Override
        public void start(Stage primaryStage) {
            Button btn = new Button();
            Label lbl = new Label("Label");
            btn.setText("Say 'Hello World'");
            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    lbl.setText("Hello World!");
                }
            });
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().add(btn);
            root.getChildren().add(lbl);
            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
    }

