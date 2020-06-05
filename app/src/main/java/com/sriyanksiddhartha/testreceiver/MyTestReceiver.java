package com.sriyanksiddhartha.testreceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class MyTestReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Hello from Test Receiver", Toast.LENGTH_LONG).show();
	}
}
