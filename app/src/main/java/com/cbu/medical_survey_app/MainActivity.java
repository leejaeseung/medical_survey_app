package com.cbu.medical_survey_app;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.cbu.medical_survey_app.customView.SurveyViewControl;
import com.cbu.medical_survey_app.datas.DataController;
import com.cbu.medical_survey_app.fragments.Job_Fragment;
import com.cbu.medical_survey_app.fragments.Last_Fragment;

import org.w3c.dom.Text;

public class MainActivity extends FragmentActivity {

    private InputMethodManager imm;
    public static DataController dtc = new DataController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_page);

        TextView title = (TextView)findViewById(R.id.top_title);
        title.setText("직업 사항");
        ImageView img = (ImageView)findViewById(R.id.title_img);
        img.setImageResource(0);

        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.survey_content, new Job_Fragment(this));
        fragmentTransaction.commit();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        // 키보드 바깥 클릭 시 키보드 닫는 로직
        View v = getCurrentFocus();

        if(v != null && (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_MOVE) && v instanceof EditText && !v.getClass().getName().startsWith("android.webkit.")){
            int[] scrcoords = new int[2];
            v.getLocationOnScreen(scrcoords);
            float x = event.getRawX() + v.getLeft() - scrcoords[0];
            float y = event.getRawY() + v.getTop() - scrcoords[1];

            if(x < v.getLeft() || x > v.getRight() || y < v.getTop() || y > v.getBottom())
                ((InputMethodManager)this.getSystemService(Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow((this.getWindow().getDecorView().getApplicationWindowToken()), 0);
        }
        return super.dispatchTouchEvent(event);
    }

//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//
//        System.out.println("들어옴");
//
//        switch (newConfig.orientation) {
//            case Configuration.ORIENTATION_PORTRAIT:
////                dtc.saveData(this);
//                break;
//            case Configuration.ORIENTATION_LANDSCAPE:
////                dtc.saveData(this);
//                break;
//        }
//    }

}