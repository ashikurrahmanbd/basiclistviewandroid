package com.example.basiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class InformationActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textView2Id);


        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

            String value = bundle.getString("countryname");

           try{
               if(value.equalsIgnoreCase("bangladesh")){
                   imageView.setImageResource(R.drawable.androidprac);
                   textView.setText("Bangladesh Content");
               }
               if(value.equalsIgnoreCase("india")){
                   imageView.setImageResource(R.drawable.androidprac);
                   textView.setText("India  Content");
               }
           }catch (Exception e){

           }

        }







    }
}
