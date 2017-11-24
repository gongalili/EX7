package com.example.magshimim.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        if (requestCode == 1)
        {
            if (resultCode == RESULT_OK)
            {
                String gender;

                if(data.getStringExtra("gender").compareTo("Male") == 0)
                {
                    gender = "Mr. ";
                }
                else
                {
                    gender = "Ms. ";
                }
                String returnString = "Welcome back " + gender + " " + data.getStringExtra("firstName") + ", " + data.getStringExtra("lastName");


                TextView textView = (TextView) findViewById(R.id.intro);
                Button b = (Button) findViewById(R.id.button);
                b.setText("again..");
                textView.setText(returnString);
            }
        }
    }
}
