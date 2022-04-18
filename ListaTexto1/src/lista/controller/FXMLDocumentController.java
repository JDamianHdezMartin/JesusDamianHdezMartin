/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author JDamian
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField txtField;
    @FXML
    private Button buttonGuardar;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guardar(ActionEvent event) {
        listView.getItems().add(txtField.getText());
    }

    @FXML
    private void editar(MouseEvent event) {
        String textoseleccionado = listView.getSelectionModel().getSelectedItem();
        
    }
    
}
