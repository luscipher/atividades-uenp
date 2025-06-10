package com;
import javafx.scene.control.Alert;

class ExcecaoPilhaVazia extends RuntimeException {
    public ExcecaoPilhaVazia(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("ERRO");
        alert.setContentText("Pilha Vazia");
        alert.showAndWait();
    }
}