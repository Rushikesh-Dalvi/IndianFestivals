package com.example.trupti.indianfestival;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Trupti on 11/19/2018.
 */

public class SankrantiFragment extends Fragment {
    TextView t;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sankrantifragment, container, false);
        t=v.findViewById(R.id.readmore);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Makar_Sankranti"));
                startActivity(i1);
            }
        });
        return v;
    }
}
