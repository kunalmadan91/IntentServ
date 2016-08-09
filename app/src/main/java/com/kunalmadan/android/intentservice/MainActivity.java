package com.kunalmadan.android.intentservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,DownloadService.class);


        intent.putExtra("url","http://stacktips.com/api/get_category_posts/?dev=1&slug=android");

        startService(intent);
    }

    public class MyReceiver extends BroadcastReceiver{
       
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "heyyyyyyyyyyyyy", Toast.LENGTH_SHORT).show();
        }
    }
    /*private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {
        @Override

        public void onReceive(Context context, Intent intent) {
            Toast.makeText(MainActivity.this, "heyyyyyyyyyyyyy", Toast.LENGTH_SHORT).show();
           // String myString = intent.getStringExtra("key");
        }
    };*/

  /*  @Override
    public void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this)
                .registerReceiver(mBroadcastReceiver,
                        new IntentFilter("qwqww"));

    }

    // Unregister the receiver
    @Override
    public void onPause() {
        super.onPause();
        LocalBroadcastManager.getInstance(this)
                .unregisterReceiver(mBroadcastReceiver);
    }

*/


}
