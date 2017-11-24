package com.example.magshimim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivityForResult(intent,1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == RESULT_OK) { // Activity.RESULT_OK

                // get String data from Intent
                String returnString = data.getStringExtra("firstName");
                String returnString2 = data.getStringExtra("lastName");

                // set text view with string
                TextView textView = (TextView) findViewById(R.id.intro);

                textView.setText(returnString);
            }

    }
}
