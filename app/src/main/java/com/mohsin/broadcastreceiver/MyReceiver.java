package com.mohsin.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");

        String intentstring=intent.getAction();
        switch (intentstring)
        {
            case Intent.ACTION_DIAL:
                Toast.makeText(context,"call"+intentstring,Toast.LENGTH_LONG).show();
                break;
        }

    }
}
