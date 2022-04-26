package es.iespuertodelacruz.jc.canvasandroidlimpio;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;


public class MiCanvasView extends View {



    Paint pincelAzul;
    Paint pincelAmarillo;
    Paint pincelEscenario;
    Paint pincelBlanco;
    Paint pincelFondo;

    Canvas canvas;

    float centroX;
    float centroY;

    private void crearPinceles(){
        pincelAzul = new Paint();
        pincelAzul.setStrokeWidth(10);
        pincelAzul.setColor(Color.BLUE);

        pincelAmarillo = new Paint();
        pincelAmarillo.setStrokeWidth(15);
        pincelAmarillo.setStyle(Paint.Style.STROKE);
        pincelAmarillo.setColor(Color.YELLOW);


        pincelBlanco = new Paint();
        pincelBlanco.setStrokeWidth(25);
        pincelBlanco.setStyle(Paint.Style.STROKE);
        pincelBlanco.setColor(Color.WHITE);

        pincelFondo = new Paint();
        pincelFondo.setStrokeWidth(2);
        pincelFondo.setColor(Color.LTGRAY);

        pincelEscenario = new Paint();
        pincelEscenario.setStrokeWidth(20);
        pincelEscenario.setColor(Color.BLACK);
    }

    public MiCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        crearPinceles();

    }

    public MiCanvasView(Context context) {
        super(context);
        crearPinceles();
    }



    public void cambiarPunto(float x, float y){
        centroX = x;
        centroY = y;
    }



    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //paint.setStyle(Paint.Style.STROKE);

        this.canvas = canvas;

        float ancho = canvas.getWidth();
        float largo = canvas.getHeight();

        canvas.drawRect(0,0, ancho, largo, pincelFondo);




           // canvas.drawLine(xInicio+menorDistancia/2,yInicio+menorDistancia/2,xFin-menorDistancia/2,yFin-menorDistancia/2,pincelAzul);




        //int centroX=100;
        //int centroY=200;
        int radio=10;

        canvas.drawCircle(centroX,centroY, radio ,pincelAmarillo);


    }


}