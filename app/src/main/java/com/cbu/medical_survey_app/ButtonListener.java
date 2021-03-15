package com.cbu.medical_survey_app;

import android.view.View;
import android.widget.Button;

public class ButtonListener implements Button.OnClickListener {
    private ButtonController btc;

    public ButtonListener() {
        btc = new ButtonController();
    }

    // 버튼 리스너들 각 버튼에 controller를 연결시킴
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_submit :
                btc.surveyComplete();
                break;

            default:
                break;
        }
    }
}
