package Ex02;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass2 extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		System.out.println(1111);
		Parent root = FXMLLoader.load(getClass().getResource("EventTest2.fxml"));
		System.out.println(2222);
		Scene scene = new Scene(root);
		System.out.println(3333);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
