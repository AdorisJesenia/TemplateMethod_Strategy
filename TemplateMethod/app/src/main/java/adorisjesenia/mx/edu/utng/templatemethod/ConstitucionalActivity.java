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
public class ConstitucionalActivity extends Activity {
    Constitucional constitucional;
    private EditText edtNombre;
    private EditText edtSalarioBase;
    private EditText edtCamionesVendidos;
    private Button btnCalcular;
    private Intent intent;
    private TextView txvNombre;
    private TextView txvSalarioBase;
    private TextView txvCamionesVendidos;
    private TextView txvBonos;
    private TextView txvIngreso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cosntitucionalactivity);

        btnCalcular = (Button)findViewById(R.id.btn_calcular1);
        edtCamionesVendidos = (EditText)findViewById(R.id.edt_camionesVendidos);
        txvNombre=(TextView)findViewById(R.id.nombre);
        txvSalarioBase=(TextView)findViewById(R.id.salarioBase);
        txvCamionesVendidos=(TextView)findViewById(R.id.camionesVendidos);
        txvBonos=(TextView)findViewById(R.id.bonos);
        txvIngreso=(TextView)findViewById(R.id.ingreso);


        constitucional = new Constitucional();

        intent = getIntent();
        constitucional.setNombre(intent.getStringExtra("nombre"));
        float salarioBase = intent.getFloatExtra("salario", 0.0f);
        constitucional.setSalarioBase(salarioBase);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                int camionesVendidos = Integer.parseInt(
                        edtCamionesVendidos.getText().toString());
                constitucional.setCamionesVendidos(camionesVendidos);
                constitucional.calcularBonos();

                txvNombre.setText("Nombre:" + constitucional.getNombre());
                txvSalarioBase.setText("Salario Base" + (int) constitucional.getSalarioBase());
                txvCamionesVendidos.setText("Camiones Vendidos" + constitucional.getCamionesVendidos());
                txvBonos.setText("Bonos de productividad " + (int) constitucional.getProductividad());
                txvIngreso.setText("Ingreso Mensual " + (int) constitucional.getIngreso());

                ;

            }


        });


    }
}

