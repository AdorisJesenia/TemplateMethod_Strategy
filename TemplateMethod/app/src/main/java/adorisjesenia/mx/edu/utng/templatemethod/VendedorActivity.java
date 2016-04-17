package adorisjesenia.mx.edu.utng.templatemethod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Jessy on 16/04/2016.
 */
public class VendedorActivity extends Activity {



    private Personal personal;
    private Prestamo prestamo;
    private Cambaceo cambaceo;
    private Constitucional constitucional;
    private EditText edtNombre;
    private EditText edtSalarioBase;
    Spinner spinnerPersonal;
    private Button btnContinuar;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {
        edtNombre=(EditText)findViewById(R.id.edt_nombre);
        edtSalarioBase=(EditText)findViewById(R.id.edt_salario);
        spinnerPersonal =(Spinner)findViewById(R.id.spn_personas);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lista_vendedor, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPersonal.setAdapter(adapter);

        btnContinuar=(Button)findViewById(R.id.btn_continuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Empresa empresa = new Empresa();
                Cambaceo cambaceo= new Cambaceo();

                Intent intent = null;
                if(spinnerPersonal.getSelectedItem().toString().equals("Constitucional")){
                    intent = new Intent(getApplicationContext(), ConstitucionalActivity.class);


                }else if(spinnerPersonal.getSelectedItem().toString().equals("Cambaceo")){
                    intent = new Intent(getApplicationContext(), CambaceoActivity.class);

                }

                intent.putExtra("nombre", edtNombre.getText().toString());
                intent.putExtra("salario", Float.parseFloat(edtSalarioBase.getText().toString()));


                startActivity(intent);
            }
        });
    };
}




