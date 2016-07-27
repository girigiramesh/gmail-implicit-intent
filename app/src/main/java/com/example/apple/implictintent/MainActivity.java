package com.example.apple.implictintent;

import android.content.Intent;
import android.net.Uri;
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
    public void forgotpass(View v){
        Toast.makeText(MainActivity.this,"Forgot Password",Toast.LENGTH_LONG).show();
    }
    public void signin(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Implict Intent Document");
        intent.putExtra(Intent.EXTRA_TEXT, "ACTION_SENDTO (for no attachment) or\n" +
                "ACTION_SEND (for one attachment) or\n" +
                "ACTION_SEND_MULTIPLE (for multiple attachments)");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void signup(View V){
        Toast.makeText(MainActivity.this,"Sign Up",Toast.LENGTH_LONG).show();

    }
}
