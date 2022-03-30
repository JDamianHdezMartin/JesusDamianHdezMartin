/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespto.JDamian.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Pane pnContenedor;
    @FXML
    private ImageView imgCafe;
    @FXML
    private Button btnCafe;
    

    private Object objetoFX = imgCafe;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void moverObjeto(MouseEvent event) {
    
            double posX = event.getSceneX() - 27;
            double posY = event.getSceneY() - 151;
            
            imgCafe.setLayoutX(posX);
            imgCafe.setLayoutY(posY);
        
    }
    
}
