package com.example.chocolatecafeappproject11;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] deserts = new String[]{"Chocolate Mousse", "Chocolate Cake", "Chocolate Macaron","Paris Cafe Website"};
        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, deserts);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, chocolate_mousse.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, chocolate_cake.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, chcolate_macaron.class));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chocolatharlem.com")));
                        break;
                    default:

                        break;
                }
            }
        });
    }
}
