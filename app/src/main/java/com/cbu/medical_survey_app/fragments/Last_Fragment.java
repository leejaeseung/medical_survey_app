package com.cbu.medical_survey_app.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.cbu.medical_survey_app.ButtonListener;
import com.cbu.medical_survey_app.MainActivity;
import com.cbu.medical_survey_app.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Last_Fragment extends Fragment {

    private ButtonListener btl;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    private Context nowContext;

    public Last_Fragment() {

    }

    public Last_Fragment(Context context) {
        btl = new ButtonListener(context);
        nowContext = context;
    }

    // 프래그먼트가 만들어질 때 datas에서 데이터를 가져와 모든 뷰에 넣어줌
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.last_frag, container, false);

        Button bt_submit = (Button) vg.findViewById(R.id.bt_submit);
        bt_submit.setOnClickListener(btl);

        CalendarView cv = ((CalendarView)vg.findViewById(R.id.input_today));

        // 캘린더뷰 날짜 변경 시마다 현재 날짜를 갱신
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String nowDate = year + "년 " + (month + 1) + "월 " + dayOfMonth + "일";
                try {
                    cv.setDate(dateFormat.parse(nowDate).getTime());
                }
                catch (ParseException e) {
                    System.out.println(e);
                }
            }
        });

        // 프래그먼트에 데이터 세팅
        MainActivity.dtc.setDataToView(vg);

        return vg;
    }
}
