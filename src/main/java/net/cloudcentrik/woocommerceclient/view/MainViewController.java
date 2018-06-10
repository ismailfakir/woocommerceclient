package net.cloudcentrik.woocommerceclient.view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import net.cloudcentrik.woocommerceclient.EndpointBaseType;
import net.cloudcentrik.woocommerceclient.WooCommerceApiClient;
import net.cloudcentrik.woocommerceclient.WooCommerceJsonUtils;

/** Controls the main application screen */
public class MainViewController {
  @FXML private Button logoutButton;
  @FXML private Label  sessionLabel;

  @FXML
  private ComboBox<String> requestCombobox;

  @FXML
  private TextArea responseTextArea;

  @FXML
  private Button apiRequestButton;

  private EndpointBaseType endpointBaseType;
  
  public void initialize(){

    // listen for changes to the fruit combo box selection and update the displayed fruit image accordingly.
    requestCombobox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
      @Override public void changed(ObservableValue<? extends String> selected, String oldValue, String newValue) {
        if (newValue != null) {
          switch(newValue) {
            case "orders":  {
              endpointBaseType=EndpointBaseType.ORDERS;
              responseTextArea.setText("Getting all orders");   break;
            }
            case "products": {
              endpointBaseType=EndpointBaseType.PRODUCTS;
              responseTextArea.setText("Getting all products");   break;
            }
            case "customers":   {
              endpointBaseType=EndpointBaseType.CUSTOMERS;
              responseTextArea.setText("Getting all customers");   break;
            }
          }
        }
      }
    });

    apiRequestButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e){
        if(endpointBaseType!=null&&endpointBaseType.equals(EndpointBaseType.PRODUCTS)){
          responseTextArea.setText(WooCommerceJsonUtils.prettifyJson(WooCommerceApiClient.getAllProduct()));
        }

      }
    });


  }
  
  public void initSessionID(final LoginManager loginManager, String sessionID) {
    sessionLabel.setText(sessionID);
    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        loginManager.logout();
      }
    });
  }
}