package com;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    Pilha<Integer> stack = new Pilha<>();

    @FXML
    private Label viewStack;

    @FXML
    private TextField valorIn;

    @FXML
    protected void onPushButton() {
        try {
            stack.push(Integer.valueOf(valorIn.getText()));
            viewStack.setText(stack.printE());
        } catch (ExcecaoPilhaCheia e) {
            System.err.println();
        }
    }

    @FXML
    protected void onPopButton() {
        try {
            stack.pop();
            viewStack.setText(stack.printE());
        } catch (ExcecaoPilhaVazia e) {
            System.err.println();
        }
    }
}