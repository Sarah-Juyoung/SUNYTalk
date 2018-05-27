package com.example.user.sunytalk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAnnouncement(View target){
        Intent intent = new Intent(getApplicationContext(), announcement.class);
        startActivity(intent);
    }

    public void openBuysell(View target){
        Intent intent = new Intent(getApplicationContext(), buysell.class);
        startActivity(intent);
    }

    public void openLogin(View target){
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
    }

    public void openLostFound(View target){
        Intent intent = new Intent(getApplicationContext(), lostfound.class);
        startActivity(intent);
    }

    public void openOpenboard(View target){
        Intent intent = new Intent(getApplicationContext(), openboard.class);
        startActivity(intent);
    }

    public void openSetting(View target){
        Intent intent = new Intent(getApplicationContext(), setting.class);
        startActivity(intent);
    }

    public void openShuttle(View target){
        Intent intent = new Intent(getApplicationContext(), shuttle.class);
        startActivity(intent);
    }

    public void openSignup(View target){
        Intent intent = new Intent(getApplicationContext(), signup.class);
        startActivity(intent);
    }

    public void openSignup2(View target){
        Intent intent = new Intent(getApplicationContext(), signup2.class);
        startActivity(intent);
    }



    public void IHateMcKenna(){

    }
}
