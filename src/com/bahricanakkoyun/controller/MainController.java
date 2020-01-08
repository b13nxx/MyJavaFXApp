package com.bahricanakkoyun.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import com.bahricanakkoyun.main.Main;

public class MainController {
  @FXML
  private TextField NickTextBox;

  public void onShowDialogButtonClick() {
    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Welcome, " + NickTextBox.getText(), ButtonType.OK);
    alert.show();
  }

  public void onOpenIcon8WebsiteButtonClick() {
    Main.openWebsite("https://icons8.com");
  }
}
