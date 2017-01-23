package com.wordpress.mnsalim.foodgrabber.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.wordpress.mnsalim.foodgrabber.R;

public class HomeActivity extends AppCompatActivity {

    private ImageButton ibSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    /**
     * Initiate View object and primary functions.
     */
    private void initView()
    {
        ibSearch = (ImageButton) findViewById(R.id.ibSearch);
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibSearchIntent = new Intent(HomeActivity.this, ShopMapActivity.class);
                startActivity(ibSearchIntent);
            }
        });
    }
}
