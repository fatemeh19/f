package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.Pane;

import java.io.IOException;
import java.nio.file.Paths;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      first();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public void first(){
        try {

            Stage FirstPage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane) loader.load(Paths.get("src/sample/View/sample.fxml").toUri().toURL());
            FirstPage.setTitle("Sign up");
            FirstPage.setScene(new Scene(root,400,500));
            FirstPage.setResizable(false);
            FirstPage.show();

        }catch (IOException e){

            e.printStackTrace();

        }





    }




}



