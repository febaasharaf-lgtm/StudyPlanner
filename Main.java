import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/MainView.fxml"));
        Scene scene = new Scene(loader.load(), 400, 500);
        stage.setScene(scene);
        stage.setTitle("Smart Study Planner");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
