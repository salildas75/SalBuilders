package com.example.salildas.salbuilders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

    }

    public void contactInfoClicked(View view) {
        Toast toast = Toast.makeText(this,"Comming Soon",Toast.LENGTH_LONG);
        toast.show();
    }
}
