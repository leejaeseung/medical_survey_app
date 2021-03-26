package com.example.cbu_medical_survey_app.fragments;

import android.widget.RadioGroup;

public class RadioListener implements RadioGroup.OnCheckedChangeListener{

    public int id;


    public RadioListener(){

    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                id = i;
    }


}
