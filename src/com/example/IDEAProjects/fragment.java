package com.example.IDEAProjects;

/**
 * Created with IntelliJ IDEA.
 * User: computer
 * Date: 14.10.13
 * Time: 1:27
 * To change this template use File | Settings | File Templates.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class fragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View fragView = inflater.inflate(R.layout.fragment, null);
        Button fragButt;
        final TextView fragTextView;
        fragButt = (Button) fragView.findViewById(R.id.button);
        fragTextView = (TextView) fragView.findViewById(R.id.textView);
        fragButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View fragView) {
                fragTextView.setVisibility(1);
            }
        });
        return fragView;
    }
}