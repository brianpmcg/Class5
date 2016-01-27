package com.example.b.test5;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements Fragment2.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Toast.makeText(this.getBaseContext(), "Main2Activity:onCreate" + intent.getStringExtra("param1"), Toast.LENGTH_SHORT).show();


        //Place the Fragment 2 into the fragment frame in Activity2
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment2 newFragment2=Fragment2.newInstance(intent.getStringExtra("param1"), intent.getStringExtra("param2"));
        fragmentTransaction.add(R.id.fragment2Frame, newFragment2, "Fragment2");
        fragmentTransaction.commit();


        Toast.makeText(this,"Fragment2 set",Toast.LENGTH_SHORT).show();
    }


    public void onFragmentInteraction(Uri uri){
        //empty for now
    }

}
