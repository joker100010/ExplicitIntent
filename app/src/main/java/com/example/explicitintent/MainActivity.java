package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void implicitInt(View view)
        {
            Uri uri = Uri.parse("http://www.google.com");
            Intent it = new Intent(ACTION_VIEW,uri);
            startActivity(it);
        }

        public void implicitDail(View view)
        {
            Uri uri = Uri.parse("tel:03352588084");
            Intent it = new Intent(ACTION_DIAL,uri);
            startActivity(it);
        }
        public void Map(View view)
        {
            Uri uri = Uri.parse("geo:34.05,71.52");
            Intent it = new Intent(ACTION_VIEW,uri);
            startActivity(it);
        }
        public void CallActivity(View view)
        {
            Intent it = new Intent(this, softwaredemo.class);
            it.putExtra("Classname", "BSSE-A");
            it.putExtra("CLass strength", 28);
            startActivity(it);
        }
    }


