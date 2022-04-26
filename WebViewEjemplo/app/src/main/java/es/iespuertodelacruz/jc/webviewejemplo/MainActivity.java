package es.iespuertodelacruz.jc.webviewejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnAgregarWebView;
    EditText txtParaWebView;
    WebView webView;

    ArrayList<String> mensajes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnAgregarWebView = findViewById(R.id.btnAgregarWebView);
        txtParaWebView = findViewById(R.id.txtParaWebView);
        webView = findViewById(R.id.unnombre);


        btnAgregarWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = txtParaWebView.getText().toString();
                webView.loadDataWithBaseURL(null,agregarHtml(texto),"text/html", "utf-8", null);
            }
        });

    }



    String agregarHtml(String texto){
        mensajes.add(texto);

        String mensajesHTML = "";
        if( mensajes != null){
            for( String str: mensajes){
                mensajesHTML += "<tr> <td>" + str + "</td></tr>";
            }


        }
        String resultado =
                "<!DOCTYPE html >"+
                        "<html>"+
                        "<head>"+

                        "<meta charset='utf-8' />"+
                        "<meta name='author' content='juan carlos p.r.'/>"+
                        "<meta name='viewport' content='width=device-width, initial-scale=1.0'/>"+
                        "<title>resultados</title>"+


                        "<style type='text/css' media='screen'>"+
                        "*{ text-align: center;}"+
                        "body{background: #F7EDED;}"+
                        "table{ margin: auto;}"+
                        "td{"+
                        "background: pink;" +
                        "}"+

                        "</style>"+

                        "</head>"+
                        "<body>"+
                        "<table border='1'>"+
                        mensajesHTML +
                        "</table>"+
                        "</body>"+
                        "</html>";


        return resultado;


    }


}
