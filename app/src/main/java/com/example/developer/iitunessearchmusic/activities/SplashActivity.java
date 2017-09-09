package com.example.developer.iitunessearchmusic.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.developer.iitunessearchmusic.R;

/**
 * Created by developer on 9/8/17.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //NetworkConnection.testPath(getString(R.string.base_url));
        //NetworkConnection.useDecodedUTFInUrl(true);

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(SplashActivity.this, Main.class);
                    startActivity(intent);
                    finish();
                }

            }
        };
        thread.start();
    }
}
