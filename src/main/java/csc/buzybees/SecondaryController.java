package csc.buzybees;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class SecondaryController {

    @FXML
    private Button secondaryButton;
    @FXML
    private ChoiceBox<?> teamChoiceBox;
    @FXML
    private Button homeButton;
    @FXML
    private Button profileButton;
    @FXML
    private Button taskAssignmentButton;
    @FXML
    private Button scheduleButton;
    @FXML
    private Button leaveRequestButton;
    @FXML
    private Button toolsButton;
    @FXML
    private Button userSettingsButton;
    @FXML
    private Button paymentMethodsButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}