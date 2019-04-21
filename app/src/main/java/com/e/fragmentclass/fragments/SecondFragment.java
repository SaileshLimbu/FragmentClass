package com.e.fragmentclass.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragmentclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {


    private Button btnArea;
    private EditText etRadius;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnArea = view.findViewById(R.id.btnArea);
        etRadius = view.findViewById(R.id.etRadius);

        btnArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius = Integer.parseInt(etRadius.getText().toString());


        float area = (float) (3.14 * radius * radius);

        Toast.makeText(getActivity(), "Area is : " + area, Toast.LENGTH_SHORT).show();
    }
}
