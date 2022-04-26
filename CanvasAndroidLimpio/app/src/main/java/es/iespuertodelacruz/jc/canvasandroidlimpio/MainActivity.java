package es.iespuertodelacruz.jc.canvasandroidlimpio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    MiCanvasView canvas;
    TextView mitxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mitxt = (TextView)findViewById(R.id.txtResultado);

        canvas = (MiCanvasView)findViewById(R.id.miCanvasView);
        canvas.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return posicionPulsada(v, event);
            }
        });

    }

    private boolean posicionPulsada(View v, MotionEvent event){



        float ancho = canvas.getWidth();
        float largo = canvas.getHeight();




        int x = (int) event.getX();
        int y = (int) event.getY();


        mitxt.setText("x: " + x + "; y:"+y);

        canvas.cambiarPunto(x,y);

        canvas.invalidate();

        return true;

    }
}