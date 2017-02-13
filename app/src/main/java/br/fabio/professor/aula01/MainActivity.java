package br.fabio.professor.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtDigite;
    private Button btnTestar;
    private TextView txvExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDigite = (EditText) findViewById(R.id.txtDigite);
        btnTestar = (Button) findViewById(R.id.btnTestar);
        txvExibir = (TextView) findViewById(R.id.txvExibir);
    }

    public void testar(View v){
        String mensagem = txtDigite.getText().toString();
        txvExibir.setText(mensagem);
    }
}
