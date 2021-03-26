package com.example.cbu_medical_survey_app;

import android.content.Context;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.cbu_medical_survey_app.fragments.normal_fragment_1;
import com.example.cbu_medical_survey_app.fragments.normal_fragment_2;


public class ButtonController {

        // ButtonController가 만들어진 Context
        final private Context nowContext;
        private TextView title;
        private ImageView title_img;

        public ButtonController(Context context) {
            nowContext = context;
            title = (TextView)((Activity)context).findViewById(R.id.top_title);
            title_img = (ImageView)((Activity) context).findViewById(R.id.title_img);
        }

         //버튼이 눌렸을 때 동작들(datas에 저장하거나, 제출)
        public void normalComplete () {
            // 현재 뷰의 데이터들을 저장
            SubActivity.dtc.saveData(nowContext);
            Fragment fragment = new normal_fragment_2(nowContext);
            FragmentManager fm = ((FragmentActivity)nowContext).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.survey_content, fragment);
            fragmentTransaction.commit();
//        ((FragmentActivity)nowContext).startActivity(intent);
            // 데이터 엑셀에 저장
            //MainActivity.dtc.saveExcel(nowContext);

            // 설문 완료 시 앱 재시작
            /*
            Intent intent = new Intent(nowContext, MainActivity.class);
            ((Activity)nowContext).finishAffinity();
            ((Activity)nowContext).startActivity(intent);
            System.exit(0);*/
        }

        public void normalBack(){
            SubActivity.dtc.saveData(nowContext);
            Fragment fragment = new normal_fragment_1(nowContext);
            FragmentManager fm = ((FragmentActivity)nowContext).getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.survey_content, fragment);
            fragmentTransaction.commit();

        }


    }

