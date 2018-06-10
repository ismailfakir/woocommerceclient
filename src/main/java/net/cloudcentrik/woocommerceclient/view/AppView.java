package net.cloudcentrik.woocommerceclient.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppView extends Application {

    public void lodView() throws Exception{
        launch("");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       /* FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/mylogin.fxml"));
        loader.setController(new MyLoginController());

        Group vbox = loader.<Group>load();

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();*/

        Scene scene = new Scene(new StackPane());

        LoginManager loginManager = new LoginManager(scene);
        loginManager.showLoginScreen();

        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
