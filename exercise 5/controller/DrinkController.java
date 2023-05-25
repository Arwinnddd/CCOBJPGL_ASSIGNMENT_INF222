package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    MountainDew mountaindew = new MountainDew();
    Coke coke = new Coke();
    Pepsi pepsi = new Pepsi();
    RootBeer rootbeer = new RootBeer();
    Water water = new Water();

    public void initialize() {

        mountaindew.setColor("Green");
        mountaindew.setTaste("Sweet and Sour");

        coke.setColor("Black");
        coke.setTaste("Very Sweet");

        pepsi.setColor("Blue");
        pepsi.setTaste("Crisp and Delicious");

        rootbeer.setColor("Black");
        rootbeer.setTaste("Sweet and Minty");

        water.setColor("Colorless");
        water.setTaste("Tasteless");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Mountain Dew is " + mountaindew.getColor() + " and " + mountaindew.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Coke is " + coke.getColor() + " and " + coke.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Pepsi is " + pepsi.getColor() + " and " + pepsi.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Root Beer is " + rootbeer.getColor() + " and " + rootbeer.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Water is " + water.getColor() + " and " + water.getTaste());
        }
        alert.showAndWait();

    }
}
