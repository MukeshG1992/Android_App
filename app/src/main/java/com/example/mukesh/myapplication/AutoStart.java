package com.example.mukesh.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by mukesh on 12/14/2016.
 */
public class AutoStart extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent new_intent= new Intent().setClass( context, MainActivity.class );
        new_intent.addFlags( Intent.FLAG_ACTIVITY_CLEAR_TOP );
        new_intent.addFlags( Intent.FLAG_ACTIVITY_NEW_TASK );
        context.startActivity( new_intent );

    /*    if(intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            Toast.makeText(context,"hello ",Toast.LENGTH_LONG).show();
            Intent localIntent = new Intent(context, MainActivity.class);
            localIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            localIntent.addFlags(WindowManager.LayoutParams.TYPE_SYSTEM_ERROR);
           *//* localIntent.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON|
                    WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD|
                    WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED|
                    WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);*//*
            context.startActivity(localIntent);*/



    }
}
