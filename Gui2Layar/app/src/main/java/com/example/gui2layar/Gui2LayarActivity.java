package com.example.gui2layar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Gui2LayarActivity extends Activity {
    EditText nm, almt;
    Button pilih, reset;
    public static String nama;
    public static String alamat;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = (EditText) findViewById(R.id.EditText01);
        almt = (EditText) findViewById(R.id.EditText02);
        pilih = (Button) findViewById(R.id.Button01);
        reset = (Button) findViewById(R.id.Button02);
        pilih.setOnClickListener(new click01());
        reset.setOnClickListener(new click02());
    }
    class click01 implements View.OnClickListener {
        public void onClick(View v) {
            nama = nm.getText().toString();
            alamat = almt.getText().toString();
            Intent i= new Intent (Gui2LayarActivity.this, MainActivity.class);
            finish();
            startActivity(i);
        }
    }
    class click02 implements View.OnClickListener {
        public void onClick(View v) {
            nm.setText("");
            almt.setText("");
        }
    }
}
