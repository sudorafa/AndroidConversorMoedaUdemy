package com.example.orafa.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        this.nViewHolder.buttomCalculate.setOnClickListener(this);

        this.clearValues();
    }

    private void clearValues() {
        this.nViewHolder.textDollar.setText("");
        this.nViewHolder.textEuro.setText("");
    }

    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.button_calculate){
            Double value = Double.valueOf(this.nViewHolder.editValue.getText().toString());
            this.nViewHolder.textDollar.setText(String.format("%,2f", value*3));
            this.nViewHolder.textEuro.setText(String.format("%,2f", value*4));

        }
    }


    private static class ViewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttomCalculate;
    }



}
