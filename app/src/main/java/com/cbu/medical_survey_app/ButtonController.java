package com.cbu.medical_survey_app;

import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.FragmentActivity;

import com.cbu.medical_survey_app.datas.Last_Data;

public class ButtonController {

    // ButtonController가 만들어진 Context
    private Context nowContext;

    public ButtonController(Context context) {
        nowContext = context;
    }

    // 버튼이 눌렸을 때 동작들(datas에 저장하거나, 제출)
    public void surveyComplete () {
        Intent intent = new Intent(nowContext, MainActivity.class);

        Last_Data ld = new Last_Data(nowContext);

        ((FragmentActivity)nowContext).startActivity(intent);
    }
}
