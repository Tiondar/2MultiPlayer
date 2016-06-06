package com.example.matteo.a2multiplayer;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ControllerFragment controllerFragment = new ControllerFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction().add(R.id.controllerFrag, controllerFragment);
        fragmentTransaction.addToBackStack(null).commit();

        MusicListFragment musicListFragment = new MusicListFragment();
        FragmentTransaction fragmentTransaction1 = fragmentManager.beginTransaction().add(R.id.listFrag, musicListFragment).addToBackStack(null);
        fragmentTransaction1.commit();




    }




}
