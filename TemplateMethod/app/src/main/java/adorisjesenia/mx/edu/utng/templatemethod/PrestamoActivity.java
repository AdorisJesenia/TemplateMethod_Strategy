package adorisjesenia.mx.edu.utng.templatemethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Jessy on 15/04/2016.
 */
public class PrestamoActivity extends AppCompatActivity {
    //declaramos los elemenetos a utilizar
    private EditText edtprestamo;
    private Button btnConsultar;
    private TextView txvPrestamo;
    private TextView txvEstado;
    private TextView txvDescripcion;
    Spinner spinnerPersonal;
    Prestamo prestamo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prestamoactivity);
        edtprestamo=(EditText)findViewById(R.id.edt_prestamo);
        txvPrestamo=(TextView)findViewById(R.id.tipo);
        txvEstado=(TextView)findViewById(R.id.estado);
        txvDescripcion=(TextView)findViewById(R.id.descripcion);
        spinnerPersonal =(Spinner)findViewById(R.id.spn_personas);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.lista_vendedor, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPersonal.setAdapter(adapter);

        btnConsultar=(Button)findViewById(R.id.btn_consultar);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Empresa empresa = new Empresa();
                Constitucional constitucional =new Constitucional();

                Cambaceo cambaceo= new Cambaceo();
                Prestamo prestamo = new Prestamo();

                if(spinnerPersonal.getSelectedItem().toString().equals("Constitucional")){

                    prestamo= new PrestamoFinal().pedirPrestamo(constitucional, edtprestamo.getText().toString());

                }else if(spinnerPersonal.getSelectedItem().toString().equals("Cambaceo")){

                    prestamo= new PrestamoFinal().pedirPrestamo(cambaceo, edtprestamo.getText().toString());
                }

                txvPrestamo.setText("Tipo de prestamo"+prestamo.getTipo());
                txvEstado.setText("Estado"+prestamo.getEstado());
                txvDescripcion.setText("Descripcion"+prestamo.getDescripcion());


            }
        });

prestamo = null;
    }
}
