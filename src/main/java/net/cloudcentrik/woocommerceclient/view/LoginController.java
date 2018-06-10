package net.cloudcentrik.woocommerceclient.view;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/** Controls the login screen */
public class LoginController {
  @FXML private TextField user;
  @FXML private TextField password;
  @FXML private Button loginButton;
  
  public void initialize() {}
  
  public void initManager(final LoginManager loginManager) {
    loginButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        String sessionID = authorize();
        if (sessionID != null) {
          loginManager.authenticated(sessionID);
        }else {
          showAlert();
        }
      }
    });
  }

  /**
   * Check authorization credentials.
   * 
   * If accepted, return a sessionID for the authorized session
   * otherwise, return null.
   */   
  private String authorize() {
    return 
      "admin".equals(user.getText()) && "admin".equals(password.getText())
            ? generateSessionID() 
            : null;
  }
  
  private static int sessionID = 0;

  private String generateSessionID() {
    sessionID++;
    return "xyzzy - session " + sessionID;
  }

  public void showAlert() {
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Login Error");
    alert.setHeaderText("Login incorrect");
    alert.setContentText("Please enter correct user name & password. \nDefault user is admin & password is admin");
    alert.showAndWait();
  }
}
