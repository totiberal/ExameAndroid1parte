package exame.myexama14albertoab;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    Intent intent;
    TextView tvNome, tvModulo, tvNota;
    RadioButton rbSus, rbAp, rbNot, rbSob;
    Button btnNota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        rbSus=(RadioButton) findViewById(R.id.idSus);
        rbAp=(RadioButton) findViewById(R.id.idApr);
        rbNot=(RadioButton) findViewById(R.id.idNot);
        rbSob=(RadioButton) findViewById(R.id.idSob);
        tvNome=(TextView) findViewById(R.id.idNoraboa);
        tvModulo=(TextView) findViewById(R.id.idAcabar);
        tvNota=(TextView) findViewById(R.id.idtvNota);
        btnNota=(Button) findViewById(R.id.idScore);
        intent=getIntent();
        String nome=intent.getExtras().getString("nome");
        String modulo=intent.getExtras().getString("modulo");
        tvNome.append(" "+nome);
        tvModulo.append(" "+modulo);
        btnNota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbSob.isChecked()){
                    tvNota.setText("");
                    tvNota.setText(R.string.sobresaliente);
                }
                if(rbNot.isChecked()){
                    tvNota.setText("");
                    tvNota.setText(R.string.notable);
                }
                if(rbAp.isChecked()){
                    tvNota.setText("");
                    tvNota.setText(R.string.aprobado);
                }
                if(rbSus.isChecked()){
                    tvNota.setText("");
                    tvNota.setText(R.string.suspenso);
                }
            }
        });

    }
}
