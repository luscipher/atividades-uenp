package com;

import javafx.scene.control.Alert;

class ExcecaoPilhaCheia extends RuntimeException {
    public ExcecaoPilhaCheia(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("ERRO");
        alert.setContentText("Pilha Cheia");
        alert.showAndWait();
    }
}