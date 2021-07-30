package com.example.trupti.indianfestival;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FullScreen extends AppCompatActivity {
FragmentManager fragmentManager;
    DiwaliFragment1 diwaliFragment1;
    EidFragment eidFragment;
    ChristmasFragment christmasFragment;
    GudiFragment gudiFragment;
    HoliFragment holiFragment;
    NavaratriFragment navaratriFragment;
    OnamFragment onamFragment;
    SankrantiFragment sankrantiFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        fragmentManager=getSupportFragmentManager();
        diwaliFragment1=new DiwaliFragment1();
        eidFragment=new EidFragment();
        christmasFragment=new ChristmasFragment();
        gudiFragment=new GudiFragment();
        holiFragment=new HoliFragment();
        navaratriFragment=new NavaratriFragment();
        onamFragment=new OnamFragment();
        sankrantiFragment=new SankrantiFragment();

        Intent intent=getIntent();
        int fest=intent.getIntExtra("key",0);
        if(fest==0){
            fragmentManager.beginTransaction().replace(R.id.fl,diwaliFragment1).commit();
        }
        if(fest==1){
            fragmentManager.beginTransaction().replace(R.id.fl,eidFragment).commit();
        }
        if(fest==2){
            fragmentManager.beginTransaction().replace(R.id.fl,holiFragment).commit();
        }
        if(fest==3){
            fragmentManager.beginTransaction().replace(R.id.fl,onamFragment).commit();
        }
        if(fest==4){
            fragmentManager.beginTransaction().replace(R.id.fl,christmasFragment).commit();
        }
        if(fest==5){
            fragmentManager.beginTransaction().replace(R.id.fl,gudiFragment).commit();
        }
        if(fest==6){
            fragmentManager.beginTransaction().replace(R.id.fl,navaratriFragment).commit();
        }
        if(fest==7){
            fragmentManager.beginTransaction().replace(R.id.fl,sankrantiFragment).commit();
        }
    }
}
