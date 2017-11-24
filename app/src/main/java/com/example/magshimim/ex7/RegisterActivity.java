package com.example.magshimim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onButtonClick(View view) {

        // get the text from the EditText
        EditText firstName = (EditText) findViewById(R.id.inF);
        EditText lastName = (EditText) findViewById(R.id.inL);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        int gender = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(gender);
        String genderS = rb.getText().toString();
        String stringToPassBack = firstName.getText().toString();
        String stringToPassBack2 = lastName.getText().toString();
        // put the String to pass back into an Intent and close this activity
        Intent intent = new Intent();
        intent.putExtra("firstName", stringToPassBack);
        intent.putExtra("lastName", stringToPassBack2);
        intent.putExtra("gender", genderS);
        setResult(RESULT_OK, intent);
        finish();
    }

}
