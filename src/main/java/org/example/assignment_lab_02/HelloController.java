package org.example.assignment_lab_02;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    //Getting all the TextFields from SceneBuilder so that they can be referenced
    @FXML
    private TextField totalPayment;
    @FXML
    private TextField numberOfYears;
    @FXML
    private TextField loanAmount;
    @FXML
    private TextField monthlyPayment;
    @FXML
    private TextField annualInterestRate;

    //The method that is run when "Calculate" is hit
    @FXML
    protected void onCalculateButtonClick() {
        //Creating a decimal format so it rounds to nearest cent
        DecimalFormat d = new DecimalFormat("##.00");

        //Setting the entered amounts to floats
        float loanAmt = Float.parseFloat(loanAmount.getText());
        float numberOfYrs = Float.parseFloat(numberOfYears.getText());
        float aIR = Float.parseFloat(annualInterestRate.getText());
        //Calculating the total payment from the previously set floats
        float totalPymt = ((((aIR/100)*loanAmt)*numberOfYrs)+loanAmt);

        //Outputting the monthly and total payments to the application
        totalPayment.setText(String.valueOf("$"+d.format(totalPymt)));
        monthlyPayment.setText(String.valueOf("$"+d.format(totalPymt/12)));
    }

}