package exame.myexama14albertoab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MyExama14albertoab extends AppCompatActivity {
    Button  btnIntroduce, btnEmpezar;
    EditText etNome, etModulo;
    Spinner spinDay, spinMonth, spinYear;
    Intent intent;
    String nome=null;
    String modulo=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exama14albertoab);
        btnIntroduce=(Button) findViewById(R.id.idIntro);
        btnEmpezar=(Button) findViewById(R.id.idEmpezar);
        etNome=(EditText) findViewById(R.id.idName);
        etModulo=(EditText) findViewById(R.id.idModulo);
        intent=new Intent(getBaseContext(), SegundaActivity.class);
        btnIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome=etNome.getText().toString();
                modulo=etModulo.getText().toString();
                intent.putExtra("nome", nome);
                intent.putExtra("modulo", modulo);
                Toast.makeText(getApplicationContext(),"Nome: "+nome+" Modulo: "+modulo,Toast.LENGTH_SHORT).show();
            }
        });

        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nome==null || modulo==null) Toast.makeText(getApplicationContext(),R.string.mensaxe,Toast.LENGTH_SHORT).show();
                else startActivity(intent);
            }
        });
    }
}
