package com.example.trupti.indianfestival;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    GridView gridview;
    ArrayList<Integer> imagearray;
    ArrayList<String> namearray;
    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fm=getSupportFragmentManager();
        imagearray=new ArrayList();
        imagearray.add(R.drawable.diwa);
        imagearray.add(R.drawable.eid);
        imagearray.add(R.drawable.holli);
        imagearray.add(R.drawable.pola);
        imagearray.add(R.drawable.xmas);
        imagearray.add(R.drawable.gudi);
        imagearray.add(R.drawable.navra);
        imagearray.add(R.drawable.sanktranti);

        namearray=new ArrayList();
        namearray.add("Diwali");
        namearray.add("Eid");
        namearray.add("Holi");
        namearray.add("Onam");
        namearray.add("Christmas");
        namearray.add("Gudi Padwa");
        namearray.add("Navratri");
        namearray.add("Makar Sanktranti");

        GridViewAdapter gridViewAdapter=new GridViewAdapter();
        gridview=(GridView) findViewById(R.id.grids);
        gridview.setAdapter(gridViewAdapter);
       gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(HomeActivity.this,FullScreen.class);
                intent.putExtra("key",i);
                startActivity(intent);
            }
        });
    }
    public class GridViewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return imagearray.size();
        }
        @Override
        public Object getItem(int i) {
            return imagearray.get(i);
        }
        @Override
        public long getItemId(int i) {
            return i;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View v=layoutInflater.inflate(R.layout.grid_view,null);
            ImageView img=v.findViewById(R.id.iv);
            img.setImageResource( imagearray.get(i));
            TextView textView=v.findViewById(R.id.tv);
            textView.setText(namearray.get(i));
            return v;
        }
    }
}
