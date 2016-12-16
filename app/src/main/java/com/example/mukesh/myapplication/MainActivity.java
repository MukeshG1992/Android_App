package com.example.mukesh.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    public WindowManager winManager;
    public RelativeLayout wrapperView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PowerManager powerManager= (PowerManager)getSystemService( Context.POWER_SERVICE );
        if (!powerManager.isScreenOn()) {
            PowerManager.WakeLock mWakeLock = powerManager.newWakeLock(
                    PowerManager.FULL_WAKE_LOCK |
                            PowerManager.ACQUIRE_CAUSES_WAKEUP,
                    "My Tag");
            mWakeLock.acquire();  
        }

       /* getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON|
                WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD|
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED|
                WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);

        Intent intent = new Intent();
        sendBroadcast(intent);
*/

        /*WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams( WindowManager.LayoutParams.TYPE_SYSTEM_ERROR,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE|
                        WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL|
                        WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN,
                PixelFormat.TRANSLUCENT);
        this.winManager = ((WindowManager)getApplicationContext().getSystemService(WINDOW_SERVICE));
        this.wrapperView = new RelativeLayout(getBaseContext());
        getWindow().setAttributes(localLayoutParams);
        View.inflate(this, R.layout.activity_main, this.wrapperView);
        this.winManager.addView(this.wrapperView, localLayoutParams)*/;

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }
}
