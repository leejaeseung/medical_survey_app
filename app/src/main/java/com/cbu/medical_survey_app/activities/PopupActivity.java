package com.cbu.medical_survey_app.activities;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.cbu.medical_survey_app.R;

public class PopupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.alert_popup);

        TextView text = findViewById(R.id.text_popup);
        SpannableStringBuilder ssb = new SpannableStringBuilder(text.getText());
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#FF0000")), 3, 13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        text.setText(ssb);
    }

    public void popupClose(View v) {
        finish();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_OUTSIDE) {
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        return;
    }
}
