package com.shablcu.shalu.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


    public void startService(View view){

        startService(new Intent(getBaseContext(), MyService.class));

    }
public  void stopservice(View view){

    Intent i=new Intent(getBaseContext(),MyService.class);
    stopService(i);
}


}
