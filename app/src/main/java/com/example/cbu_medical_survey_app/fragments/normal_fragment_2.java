package com.example.cbu_medical_survey_app.fragments;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.cbu_medical_survey_app.ButtonListener;
import com.example.cbu_medical_survey_app.R;
import com.example.cbu_medical_survey_app.SubActivity;

import java.util.Calendar;
import java.util.Date;

public class normal_fragment_2 extends Fragment {

    private ButtonListener bt2;
    private Context nowContext;
    Button pre_btn1,next_btn2;
    public normal_fragment_2(){
    }
    public normal_fragment_2(Context context) {
        bt2 = new ButtonListener(context);
        nowContext = context;
    }

    public static normal_fragment_2 newInstance(){

        return new normal_fragment_2();
    }


    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.normal_frag_2, container, false);
        pre_btn1 = (Button)vg.findViewById(R.id.pre_btn_1);

        pre_btn1.setOnClickListener(bt2);





        // 프래그먼트에 데이터 세팅
        //MainActivity.dtc.setDataToView(vg);

        return vg;
    }






}
