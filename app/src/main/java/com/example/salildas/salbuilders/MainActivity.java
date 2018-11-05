package com.example.salildas.salbuilders;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void LoginButtonClicked(View view) {
        EditText editText = (EditText) findViewById(R.id.email);
        EditText editText2 = (EditText) findViewById(R.id.pass);

        String email = editText.getText().toString();
        String pass = editText2.getText().toString();

        String oemail = "admin";
        String opass = "admin";

        if(email.equals(oemail) && pass.equals(opass)){

            Intent intent = new Intent(this,Navigation.class);
            startActivity(intent);

        }else {
            Toast toast = Toast.makeText(this,"Invalid Email/Password",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
