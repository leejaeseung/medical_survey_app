package com.cbu.medical_survey_app.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.cbu.medical_survey_app.ButtonListener;
import com.cbu.medical_survey_app.R;

public class Last_Fragment extends Fragment {

    private ButtonListener btl;
//    private CalendarView today;
    private EditText ph_first_myself;
    private int ph_second_myself;

    public Last_Fragment(Context context) {
        btl = new ButtonListener(context);
    }

    // 프래그먼트가 만들어질 때 datas에서 데이터를 가져와 모든 뷰에 넣어줌
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.last_frag, container, false);

        Button bt_submit = (Button) vg.findViewById(R.id.bt_submit);
        bt_submit.setOnClickListener(btl);

        return vg;
    }
}
