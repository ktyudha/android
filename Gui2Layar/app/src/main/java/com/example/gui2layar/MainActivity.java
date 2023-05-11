package com.example.gui2layar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;



public class MainActivity extends Activity {
    TextView dtnama, dtalamat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        dtnama = (TextView) findViewById(R.id.TextView01);
        dtalamat = (TextView) findViewById(R.id.TextView02);
        dtnama.setText("Nama = "+ Gui2LayarActivity.nama);
        dtalamat.setText("Alamat = " + Gui2LayarActivity.alamat);
    }

}