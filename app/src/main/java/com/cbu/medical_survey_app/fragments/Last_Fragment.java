package com.cbu.medical_survey_app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.fragment.app.Fragment;

import com.cbu.medical_survey_app.ButtonListener;
import com.cbu.medical_survey_app.R;

public class Last_Fragment extends Fragment {

    private ButtonListener btl;

    public Last_Fragment() {
        btl = new ButtonListener();
    }

    // 여기서 프래그먼트에 있는 모든 뷰들의 값을 가져옴 -> datas에 저장
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.last_frag, container, false);

        Button bt_submit = (Button) vg.findViewById(R.id.bt_submit);
        bt_submit.setOnClickListener(btl);

        CalendarView cv = vg.findViewById(R.id.input_today);

        return vg;
    }
}
