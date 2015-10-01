package com.markjlehman.breakthecode.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.markjlehman.breakthecode.R;
import com.markjlehman.breakthecode.models.Partner;
import com.markjlehman.breakthecode.models.PartnerLib;

public class PartnersActivity extends Activity {

    private TextView mNameLabel;
    private TextView mDescriptionLabel;
    private ImageView mPartnerImage;
    private Button mNextButton;

    private PartnerLib mPartnerLib;
    private Partner mCurrentPartner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partners);

        mNameLabel = (TextView) findViewById(R.id.nameLabel);
        mDescriptionLabel = (TextView) findViewById(R.id.descriptionLabel);
        mPartnerImage = (ImageView) findViewById(R.id.partnerImage);
        mNextButton = (Button) findViewById(R.id.nextPartnerButton);
        mPartnerLib = new PartnerLib();
        mCurrentPartner = mPartnerLib.getPartners().get(0);
        setLayoutContent();
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentPartner = mPartnerLib.nextPartner(mCurrentPartner);
                setLayoutContent();
            }
        });
    }

    private void setLayoutContent() {
        mNameLabel.setText(mCurrentPartner.getmName());
        mDescriptionLabel.setText(mCurrentPartner.getmDescription());
        mPartnerImage.setImageResource(mCurrentPartner.getmImage());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.partners, menu);
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
