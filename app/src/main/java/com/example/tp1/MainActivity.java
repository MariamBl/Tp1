package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText txt;
    TextView label;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txtPrix);
        sp2 = findViewById(R.id.SpPrix2);
        sp1 = findViewById(R.id.SpPrix1);
        btn = findViewById(R.id.btnConvert);
        label = findViewById(R.id.lbConvert);


        String[] from1 ={"MAD","EURO","USD","GBP"};
        ArrayAdapter a = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from1);
        sp1.setAdapter(a);

        String[] from2 ={"USD","EURO","MAD","GBP"};
        ArrayAdapter b = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from2);
        sp2.setAdapter(b);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double x;
                Double prix =Double.parseDouble(txt.getText().toString());
                if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="MAD"){
                    x= prix * 10.3779;
                    label.setText(x+" MAD");
               //     Toast.makeText(getApplicationContext(),x.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="EURO"){
                    x= prix * 0.939362;
                    label.setText(x+" EURO");
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="GBP"){
                    x= prix * 0.831021;
                    label.setText(x+" GBP");
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="USD"){
                    label.setText(prix+" USD");
                }

                else if (sp1.getSelectedItem().toString()=="MAD" && sp2.getSelectedItem().toString()=="USD"){
                    x= prix * 0.0963653;
                    label.setText(x+" USD");
                }
                else if (sp1.getSelectedItem().toString()=="MAD" && sp2.getSelectedItem().toString()=="EURO"){
                    x= prix * 0.0905299;
                    label.setText(x+" EURO");
                }
                else if (sp1.getSelectedItem().toString()=="MAD" && sp2.getSelectedItem().toString()=="GBP"){
                    x= prix * 0.079722;
                    label.setText(x+" GBP");
                }
                else if (sp1.getSelectedItem().toString()=="MAD" && sp2.getSelectedItem().toString()=="MAD"){

                    label.setText(prix+" MAD");
                }
                else if (sp1.getSelectedItem().toString()=="EURO" && sp2.getSelectedItem().toString()=="USD"){
                    x= prix * 1.06455;
                    label.setText(x+" USD");
                }
                else if (sp1.getSelectedItem().toString()=="EURO" && sp2.getSelectedItem().toString()=="MAD"){
                    x= prix * 11.0461;
                    label.setText(x+" MAD");
                }
                else if (sp1.getSelectedItem().toString()=="EURO" && sp2.getSelectedItem().toString()=="GBP"){
                    x= prix * 0.884378;
                    label.setText(x+" GBP");
                }
                else if (sp1.getSelectedItem().toString()=="EURO" && sp2.getSelectedItem().toString()=="EURO"){

                    label.setText(prix+" euro");
                }
                else if (sp1.getSelectedItem().toString()=="GBP" && sp2.getSelectedItem().toString()=="USD"){

                    x= prix * 1.20334;
                    label.setText(x+" USD");
                }
                else if (sp1.getSelectedItem().toString()=="GBP" && sp2.getSelectedItem().toString()=="EURO"){

                    x= prix * 1.13074;
                    label.setText(x+" euro");
                }
                else if (sp1.getSelectedItem().toString()=="GBP" && sp2.getSelectedItem().toString()=="MAD"){

                     x= prix * 12.5436 ;
                    label.setText(x+" MAD");
                }
                else if (sp1.getSelectedItem().toString()=="GBP" && sp2.getSelectedItem().toString()=="GBP"){

                    label.setText(prix+" GBP");
                }

            }
        });
    }
}