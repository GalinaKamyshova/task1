package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;
    @FXML
    public Button closeButton;
    @FXML
    public Stage primaryStage;

    float X, A, B, Y;
    @FXML
    public void Vihod () {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void onClickMethod() {
        X = Float.parseFloat(text1.getText());
        A = Float.parseFloat(text2.getText());
        B = Float.parseFloat(text3.getText());
        if (X > 7)
            Y = X * (A + B) * (A + B);
        else
            Y = (X + 4)/(A * A + B* B);
        System.out.println("X=" + X);
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("Y=" + Y);
        text4.setText(String.valueOf(Y));
    }

    public void onClickMethodvtoroy() {
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
    }
}