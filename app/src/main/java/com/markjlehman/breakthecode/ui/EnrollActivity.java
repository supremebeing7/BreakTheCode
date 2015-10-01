package com.markjlehman.breakthecode.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.markjlehman.breakthecode.R;

public class EnrollActivity extends Activity {

    private EditText mNameText;
    private EditText mEmailText;
    private Button mSubmitButton;
    private TextView mThankYouText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);
        mNameText = (EditText) findViewById(R.id.nameInput);
        mEmailText = (EditText) findViewById(R.id.emailInput);
        mSubmitButton = (Button) findViewById(R.id.submitButton);
        mThankYouText = (TextView) findViewById(R.id.thankYouLabel);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameText.getText().toString();
                String email = mEmailText.getText().toString();
                mThankYouText.setText("Thank you " + name + " - " + email);
                mThankYouText.setVisibility(View.VISIBLE);
                mNameText.setVisibility(View.INVISIBLE);
                mEmailText.setVisibility(View.INVISIBLE);
                mSubmitButton.setVisibility(View.INVISIBLE);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.enroll, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
