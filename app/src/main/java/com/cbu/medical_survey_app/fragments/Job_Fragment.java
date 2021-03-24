package com.cbu.medical_survey_app.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cbu.medical_survey_app.ButtonListener;
import com.cbu.medical_survey_app.MainActivity;
import com.cbu.medical_survey_app.R;

import java.text.ParseException;

public class Job_Fragment extends Fragment {

    private ButtonListener btl;
    private Context nowContext;

    public Job_Fragment() {

    }

    public Job_Fragment(Context context) {
        btl = new ButtonListener(context);
        nowContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.job_frag, container, false);

        Button bt_job_next = (Button) vg.findViewById(R.id.bt_job_next);
        bt_job_next.setOnClickListener(btl);
//
//        // 프래그먼트에 데이터 세팅
//        MainActivity.dtc.setDataToView(vg);

        return vg;
    }
}
