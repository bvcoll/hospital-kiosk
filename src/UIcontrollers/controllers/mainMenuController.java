package UIControllers.controllers;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
/**
 * Created by Leon Zhang on 2017/4/1.
 */

public class mainMenuController extends centralUIController implements Initializable {
  // define all ui elements
  @FXML
  private AnchorPane MainMenuPane;

  public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
  }

  public void gotoMap () {
    Stage primaryStage = (Stage) MainMenuPane.getScene().getWindow();
    try {
      mapViewFlag = 3;
      loadScene(primaryStage, "/MapScene.fxml");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void gotoSearch () {
    Stage primaryStage = (Stage) MainMenuPane.getScene().getWindow();
    try {
      loadScene(primaryStage, "/SearchMenu.fxml");
    } catch (Exception e) {
    }
  }

  public void gotoAdmin () {
    Stage primaryStage = (Stage) MainMenuPane.getScene().getWindow();
    try {
      loadScene(primaryStage, "/AdminLogin.fxml");
    } catch (Exception e) {
    }
  }

}
