package com.example.orafa.conversormoeda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder nViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nViewHolder.editValue = (EditText)findViewById(R.id.edit_value);
        this.nViewHolder.textDollar = (TextView) findViewById(R.id.text_dollar);
        this.nViewHolder.textEuro = (TextView)findViewById(R.id.text_euro);
        this.nViewHolder.buttomCalculate = (Button) findViewById(R.id.button_calculate);
    }

    private static class ViewHolder{
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttomCalculate;
    }

}
