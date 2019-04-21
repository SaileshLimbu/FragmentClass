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
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnAdd;
    private EditText etFirstNum, etSecondNum;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        btnAdd = view.findViewById(R.id.btnAdd);
        etFirstNum = view.findViewById(R.id.etFirstNum);
        etSecondNum = view.findViewById(R.id.etSecondNum);

        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(etFirstNum.getText().toString());
        int num2 = Integer.parseInt(etSecondNum.getText().toString());

        int sum = num1 + num2;
        Toast.makeText(getActivity(), "Sum is : " + sum, Toast.LENGTH_SHORT).show();
    }
}
