package com.example.cbu_medical_survey_app.datas;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;

import com.example.cbu_medical_survey_app.R;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;

public class NormalData_1 {
    final private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    private String user_sex="";
    private int user_sex_id;
    private String user_marred_status="";
    private String user_brith="";
    private String user_czs="";
    private String user_mom_age="";
    private String user_id_front="";
    private String user_id_back="";
    private String user_height="";
    private String user_weight="";
    private String user_period_address="";
    private String user_weight_20th="";
    private String user_weight_30th="";
    private String user_weight_best="";
    private String user_final_education="";
    private String user_household_member="";
    private String user_salary = "";




        final private LinkedHashMap<String, String> mapped_data;

        public NormalData_1() {
            mapped_data = new LinkedHashMap<String, String>();
        }

        private String getString(EditText view) {
            return view.getText().toString();
        }

        public LinkedHashMap<String, String> getData() {
            return mapped_data;
        }

        public void get_check_radio(int id){
            user_sex_id=id;
        }

    public void saveData(Context nowContext) {

          //user_sex  = getString((RadioGroup)(((Activity)nowContext).findViewById(user_sex_id));
            user_czs=getString((EditText)((Activity)nowContext).findViewById(R.id.pro3_2));
        user_mom_age=getString((EditText)((Activity)nowContext).findViewById(R.id.pro3_3));
        user_id_front=getString((EditText)((Activity)nowContext).findViewById(R.id.pro3_4));
        user_id_back=getString((EditText)((Activity)nowContext).findViewById(R.id.pro3_5));
        user_height=getString((EditText)((Activity)nowContext).findViewById(R.id.pro4_1));
        user_weight=getString((EditText)((Activity)nowContext).findViewById(R.id.pro4_2));
        user_weight_20th=getString((EditText)((Activity)nowContext).findViewById(R.id.pro6_1));
        user_weight_30th=getString((EditText)((Activity)nowContext).findViewById(R.id.pro6_2));
        user_weight_best=getString((EditText)((Activity)nowContext).findViewById(R.id.pro6_3));
        user_household_member=getString((EditText)((Activity)nowContext).findViewById(R.id.pro8_1));
        user_salary=getString((EditText)((Activity)nowContext).findViewById(R.id.pro9_1));

          //  mapped_data.put("사용자 성별",user_sex);
            mapped_data.put("사용자 띠",user_czs);
            mapped_data.put("사용자 부모나이(사용자를 낳았을 때)",user_mom_age);
            mapped_data.put("사용자 주민번호 앞자리",user_id_front);
            mapped_data.put("사용자 주민번호 뒷자리",user_id_back);
            mapped_data.put("사용자 키",user_height);
            mapped_data.put("사용자 몸무게",user_weight);
            mapped_data.put("사용자 20~25살 몸무게",user_weight_20th);
            mapped_data.put("사용자 35~40살 모무게",user_weight_30th);
            mapped_data.put("사용자 최고 몸무게",user_weight_best);
            mapped_data.put("사용자 가족구성원 수",user_household_member);
            mapped_data.put("사용자 가족 할당 총 수입",user_salary);



        }

        public void setDataToView(ViewGroup vg) {
            //if(((RadioButton)vg.findViewById(user_sex_id)).isChecked())
            //if(((RadioButton)vg.findViewById(R.id.pro1_1)).isChecked()||((RadioButton)vg.findViewById(R.id.pro1_2)).isChecked())
            ((RadioButton)vg.findViewById(R.id.pro1_1)).setChecked(true);

            ((EditText)vg.findViewById(R.id.pro3_2)).setText(user_czs);
            ((EditText)vg.findViewById(R.id.pro3_3)).setText(user_mom_age);
            ((EditText)vg.findViewById(R.id.pro3_4)).setText(user_id_front);
            ((EditText)vg.findViewById(R.id.pro3_5)).setText(user_id_back);
            ((EditText)vg.findViewById(R.id.pro4_1)).setText(user_height);
            ((EditText)vg.findViewById(R.id.pro4_2)).setText(user_weight);
            ((EditText)vg.findViewById(R.id.pro6_1)).setText(user_weight_20th);
            ((EditText)vg.findViewById(R.id.pro6_2)).setText(user_weight_30th);
            ((EditText)vg.findViewById(R.id.pro6_3)).setText(user_weight_best);
            ((EditText)vg.findViewById(R.id.pro8_1)).setText(user_household_member);
            ((EditText)vg.findViewById(R.id.pro9_1)).setText(user_salary);


        }
}

