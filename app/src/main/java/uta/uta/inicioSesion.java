package uta.uta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioSesion extends AppCompatActivity {


    private Button inicioSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        inicioSesion = (Button) findViewById(R.id.button);
        inicioSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            sendMessage(v);
            }
        });
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);

    }
}
