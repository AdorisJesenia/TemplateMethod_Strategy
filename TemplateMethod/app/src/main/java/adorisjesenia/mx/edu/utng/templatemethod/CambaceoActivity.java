package adorisjesenia.mx.edu.utng.templatemethod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jessy on 14/04/2016.
 */
public class CambaceoActivity extends Activity {
    private Cambaceo cambaceo;
    private EditText edtCamionesVendidos;
    private EditText edtAutosVendidos;
    private Button btnCalcular;
    private Intent intent;
    private TextView txvNombre;
    private TextView txvSalarioBase;
    private TextView txvAutosVendidos;
    private TextView txvBonos;
    private TextView txvIngreso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cambaceoactivity);
        iniciarcomponentes();

    }

    private void iniciarcomponentes() {
        cambaceo = new Cambaceo();
        intent = getIntent();
        txvNombre = (TextView) findViewById(R.id.nombre);
        txvSalarioBase = (TextView) findViewById(R.id.salarioBase);
        txvAutosVendidos = (TextView) findViewById(R.id.autosVendidos);
        txvBonos = (TextView) findViewById(R.id.bonos);
        txvIngreso = (TextView) findViewById(R.id.ingreso);
        cambaceo.setNombre(intent.getStringExtra("nombre"));
        float salarioBase = intent.getFloatExtra("salario", 0.0f);
        cambaceo.setSalarioBase(salarioBase);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        edtAutosVendidos = (EditText) findViewById(R.id.edt_autosVendidos);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int autosVendidos = Integer.parseInt(
                        edtAutosVendidos.getText().toString());
                cambaceo.setAutosVendidos(autosVendidos);
                cambaceo.calcularBonos();


                txvNombre.setText("Nombre:" + cambaceo.getNombre());
                txvSalarioBase.setText("Salario Base" + (int) cambaceo.getSalarioBase());
                txvAutosVendidos.setText("Camiones Vendidos" + cambaceo.getAutosVendidos());
                txvBonos.setText("Bonos de productividad " + (int) cambaceo.getProductividad());
                txvIngreso.setText("Ingreso Mensual " + (int) cambaceo.getIngreso());




            }


        });


    }
}
