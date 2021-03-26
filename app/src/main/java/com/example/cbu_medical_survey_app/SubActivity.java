package com.example.cbu_medical_survey_app;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cbu_medical_survey_app.datas.DataController;
import com.example.cbu_medical_survey_app.fragments.normal_fragment_1;

public class SubActivity extends AppCompatActivity {

    public static DataController dtc = new DataController();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_page);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.survey_content,new normal_fragment_1(this)).commit();


    }

    //프래그먼트 간 이동
    public void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.survey_content,fragment).commit();

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
}
