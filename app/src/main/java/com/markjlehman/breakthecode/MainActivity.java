package com.markjlehman.breakthecode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mPartnersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.enrollButton);
        mSponsorsButton = (Button) findViewById(R.id.sponsorsButton);
        mPartnersButton = (Button) findViewById(R.id.partnersButton);

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enrollIntent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(enrollIntent);
            }
        });
        mSponsorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sponsorsIntent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(sponsorsIntent);
            }
        });
        mPartnersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partnersIntent = new Intent(MainActivity.this, PartnersActivity.class);
                startActivity(partnersIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}
