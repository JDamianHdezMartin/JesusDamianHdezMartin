/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodetimeline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane panel;
    
    boolean iniciado = false;
    int pasoX = 3;
    int pasoY = 3;
    
    Timeline timeline = null;
    @FXML
    private Circle circulo;
    
    
    Timeline obtenerNuevoTimeLine(int velocidad){
        Timeline tl = new Timeline(new KeyFrame(
                Duration.millis(velocidad), ae -> actuar()
        ));
        tl.setCycleCount(Animation.INDEFINITE);
        return tl;
    }
    
    //aquí hacemos las acciones que correspondan para cada ejecución de la tarea
    void actuar(){
        double posCirculoX = circulo.getCenterX();
        double posCirculoY = circulo.getCenterY();
        
        posCirculoX += pasoX;
        posCirculoY += pasoY;
        
        if( posCirculoX > panel.getWidth()-20){
            pasoX *= -1;}

        if (posCirculoX < 0) {
            pasoX *= -1;

        }
        if( posCirculoY > panel.getHeight()-20){
            pasoY *= -1;}

        if (posCirculoY < 0) {
            pasoY *= -1;

        }
        circulo.setCenterX(posCirculoX);
        circulo.setCenterY(posCirculoY);
        }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeline = obtenerNuevoTimeLine(10);
    }    

    @FXML
    private void iniciarParar(ActionEvent event) {
        if(!iniciado && timeline != null ){
            timeline.play();
            
        }else{
            timeline.stop();
        }
        
        iniciado = !iniciado;
    }
}
