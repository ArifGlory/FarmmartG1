package com.example.fujimiya.farmmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CobaTampilan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_tampilan);

        MapsFragment mapsFragment = new MapsFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmen_con,mapsFragment);
        fragmentTransaction.commit();
    }
}
