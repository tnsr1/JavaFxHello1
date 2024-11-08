/**
 * 
 * @author Gemini
 */

package javafxhello1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxHello1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Создаем кнопку
        Button button = new Button("Нажмите меня!");
        button.setOnAction(event -> {
            // Действие, которое происходит при нажатии кнопки
            System.out.println("Кнопка нажата!");
        });

        // Создаем контейнер (HBox)
        HBox root = new HBox();
        root.getChildren().add(button);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));

        // Создаем сцену
        Scene scene = new Scene(root, 300, 100);

        // Устанавливаем сцену для окна
        primaryStage.setTitle("Мое первое JavaFX-приложение");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
