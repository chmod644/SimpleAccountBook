package com.example.n.simpleaccountbook;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create Fragment
        BlankFragment fragment = new BlankFragment();
        // Use transaction to add or delete Fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // fragment is added to R.id.container
        transaction.add(R.id.container, fragment);

        transaction.commit();
    }
}
