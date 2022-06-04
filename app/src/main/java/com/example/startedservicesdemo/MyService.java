package com.example.startedservicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    public static final String TAG = "MyTag";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate: Started Services");
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i=0; i<5; i++)
                {

                    try {

                        Thread.sleep(5000);

                    }catch (Exception e)
                    {

                    }

                    Log.d(TAG, "onStartCommand: Services Completed "+Integer.toString(i));

                }
            }
        };

        Thread thread = new Thread(runnable);

        thread.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy: Services Is Destroy");

    }
}