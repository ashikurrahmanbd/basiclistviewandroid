package com.example.basiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);

        final String[] country_names = getResources().getStringArray(R.array.country_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.samplelistvewlayout, R.id.textViewId, country_names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Clicked On "+country_names[i], Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, InformationActivity.class);

                String countryName = country_names[i].toString();

                intent.putExtra("countryname", countryName);

                startActivity(intent);

            }
        });




    }
}
