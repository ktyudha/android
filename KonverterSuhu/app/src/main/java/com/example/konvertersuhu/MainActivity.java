package com.example.konvertersuhu;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends Activity {
    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText1);
    }
    public void myClickHandler(View view) {
        switch (view.getId()) {
            case R.id.button1:
            RadioButton celciusButton = (RadioButton) findViewById(R.id.radio0);
            RadioButton fahrenheitButtonn = (RadioButton) findViewById(R.id.radio1);
            if (text.getText().length() == 0) {
                Toast.makeText(this, "Input Salah!", Toast.LENGTH_LONG).show();
                return;
            }
            float inputValue = Float.parseFloat(text.getText().toString());
            if (celciusButton.isChecked()) {
                text.setText(String.valueOf(konveriFahrenheiToCelcius(inputValue)));
                celciusButton.setChecked(false);
                fahrenheitButtonn.setChecked(true);
            } else {
                text.setText(String.valueOf(konveriCelciusToFahrenheit(inputValue)));
                celciusButton.setChecked(true);
                fahrenheitButtonn.setChecked(false);
            }
            break;
        }
    }
    private float konveriFahrenheiToCelcius(float fahrenheit) {
        return ((fahrenheit - 32) * 5/9);
    }
    private float konveriCelciusToFahrenheit(float celcius) {
        return ((celcius * 9) /5 ) + 32;
    }
}