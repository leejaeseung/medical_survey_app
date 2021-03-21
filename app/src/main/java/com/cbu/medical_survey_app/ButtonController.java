package com.cbu.medical_survey_app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.cbu.medical_survey_app.fragments.Last_Fragment;

public class ButtonController {

    // ButtonController가 만들어진 Context
    final private Context nowContext;

    public ButtonController(Context context) {
        nowContext = context;
    }

    // 버튼이 눌렸을 때 동작들(datas에 저장하거나, 제출)
    public void surveyComplete () {
//        Intent intent = new Intent(nowContext, MainActivity.class);

        // 현재 뷰의 데이터들을 저장
        MainActivity.dtc.saveLastData(nowContext);

        // 테스트용, 나중엔 종료 로직으로
        Fragment fragment = new Last_Fragment(nowContext);
        FragmentManager fm = ((FragmentActivity)nowContext).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.survey_content, fragment);
        fragmentTransaction.commit();
//        ((FragmentActivity)nowContext).startActivity(intent);
    }
}
