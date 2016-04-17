package adorisjesenia.mx.edu.utng.templatemethod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Jessy on 07/04/2016.
 */
public class MainActivity extends Activity {



    private Personal personal;
    private Prestamo prestamo;
    private Cambaceo cambaceo;
    private Constitucional constitucional;

  Spinner spinnerAcciones;
    private Button btnContinuar;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proyectoactivity);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {

        spinnerAcciones =(Spinner)findViewById(R.id.spn_accion);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lista_acciones, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAcciones.setAdapter(adapter);

        btnContinuar=(Button)findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = null;
                if(spinnerAcciones.getSelectedItem().toString().equals("Consultar ingreso mensual")){
                    intent = new Intent(getApplicationContext(), VendedorActivity.class);

                }else if(spinnerAcciones.getSelectedItem().toString().equals("Consultar Prestamo")){
                    intent = new Intent(getApplicationContext(), PrestamoActivity.class);

                }


            }
        });
    };
}


