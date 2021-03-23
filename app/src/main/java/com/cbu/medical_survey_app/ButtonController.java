package com.cbu.medical_survey_app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class ButtonController {

    // ButtonController가 만들어진 Context
    final private Context nowContext;

    public ButtonController(Context context) {
        nowContext = context;
    }

    // 버튼이 눌렸을 때 동작들(datas에 저장하거나, 제출)
    public void surveyComplete () {

        // 현재 뷰의 데이터들을 저장
        MainActivity.dtc.saveData(nowContext);

//        Fragment fragment = new Last_Fragment(nowContext);
//        FragmentManager fm = ((FragmentActivity)nowContext).getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fm.beginTransaction();
//        fragmentTransaction.replace(R.id.survey_content, fragment);
//        fragmentTransaction.commit();
//        ((FragmentActivity)nowContext).startActivity(intent);
        // 데이터 엑셀에 저장
        MainActivity.dtc.saveExcel(nowContext);

        // 설문 완료 시 앱 재시작
        Intent intent = new Intent(nowContext, MainActivity.class);
        ((Activity)nowContext).finishAffinity();
        ((Activity)nowContext).startActivity(intent);
        System.exit(0);
    }
}
