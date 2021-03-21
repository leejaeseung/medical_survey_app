package com.cbu.medical_survey_app.datas;

import android.content.Context;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.cbu.medical_survey_app.R;
import com.cbu.medical_survey_app.fragments.Last_Fragment;

import java.util.HashMap;

public class DataController {
    final private Last_Data last_data;

    public DataController() {
        last_data = new Last_Data();
    }

    public void saveData(Context context) {
        Fragment nowFragment = ((FragmentActivity)context).getSupportFragmentManager().findFragmentById(R.id.survey_content);

        if(nowFragment instanceof Last_Fragment){
            System.out.println("맞음");
            last_data.saveData(context);
        }
        else {
            System.out.println("아님");
        }


    }

    public HashMap<String, String> getData(Context context) {
        Fragment nowFragment = ((FragmentActivity)context).getSupportFragmentManager().findFragmentById(R.id.survey_content);

        if(nowFragment instanceof Last_Fragment){
            System.out.println("맞음");
            return last_data.getData();
        }
        else {
            System.out.println("아님");
            return null;
        }
    }

    public void setDataToView(ViewGroup vg) {
//        Fragment nowFragment = ((FragmentActivity)context).getSupportFragmentManager().findFragmentById(R.id.survey_content);

        switch (vg.getId()) {
            case R.id.last_frag: {
                last_data.setDataToView(vg);
            }
        }


//        if(nowFragment instanceof Last_Fragment){
//            System.out.println("맞음");
//            last_data.setDataToView(vg);
//        }
//        else {
//            System.out.println("아님");
//        }
    }
}
