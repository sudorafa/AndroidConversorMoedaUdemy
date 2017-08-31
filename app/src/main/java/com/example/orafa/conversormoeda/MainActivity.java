package com.example.orafa.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//terceiro método para onclick>implements View.OnClickListener

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder nViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.editValue = (EditText)findViewById(R.id.edit_value);
        this.nViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.nViewHolder.textEuro = (TextView)findViewById(R.id.text_euro);
        this.nViewHolder.buttomCalculate = (Button) findViewById(R.id.button_calculate);

        //segundo método para onclick
        this.nViewHolder.buttomCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //lógica para o método dois
            }
        });

        //terceiro método
        this.nViewHolder.buttomCalculate.setOnClickListener(this);
    }

    public void teste(View view) {
        //lógica para o botão. Prrimeiro método
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button_calculate){
            //lógic para o botão. terceiro métodp
        }
    }

    private static class ViewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttomCalculate;
    }



}
