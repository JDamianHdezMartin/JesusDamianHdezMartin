/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basejuegosnake;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    

    @FXML
    private Canvas canvas;
    @FXML
    private Button btnIniciarParar;
    
   
    
    KeyCode direccionSnake;
    int velocidadJuego=100;
    
    GraphicsContext gc;
    
    
    
    
    public void limpiar(){
     
        direccionSnake = KeyCode.RIGHT;
        //inicialmente se movería a la derecha
        
        gc.setFill(Color.ANTIQUEWHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
        gc = canvas.getGraphicsContext2D();
        
        canvas.setFocusTraversable(true); 
        limpiar();

        
        //gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }    

 

    
    
    
    
    @FXML
    private void saludar(MouseEvent event) {
        /*
        System.out.println("se ha pulsado tecla!!");
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        dibujarSnake();       
*/
        
    }
    

    

    
    /**public void moverJuego(){
        
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        gc.setFill(Color.ANTIQUEWHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
      
   
        
    }*/

    
  
    Timeline timeline = null;
    
    /**@FXML
    private void iniciarParar(ActionEvent event) {

 

        
            timeline = new Timeline(new KeyFrame(
                Duration.millis(velocidadJuego), ae -> moverJuego()
            ));
            timeline.setCycleCount(Animation.INDEFINITE);
              

//            timeline.stop();
            
  
  //          timeline.play();
    
        
    }*/

    /**@FXML
    private void girarSnake(KeyEvent event) {
        int mult = 1;
        KeyCode tecla = event.getCode();
        switch( tecla ){
            case UP:  break;
            case DOWN:  break;
                        

                    
            case LEFT:  break;
            case RIGHT:  
                    
                    break;
        }
        event.consume();
    }*/
    
}
