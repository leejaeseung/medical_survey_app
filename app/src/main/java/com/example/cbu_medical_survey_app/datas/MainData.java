
package com.example.cbu_medical_survey_app.datas;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.cbu_medical_survey_app.R;

import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;

public class MainData {


    final private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    private String user_name = "";
    private String user_address= "";

    final private LinkedHashMap<String, String> mapped_data;

    public MainData() {
        mapped_data = new LinkedHashMap<String, String>();
    }

    private String getString(EditText view) {
        return view.getText().toString();
    }


    public LinkedHashMap<String, String> getData() {
        return mapped_data;
    }

    public void saveData(Context nowContext) {
        user_name = getString((EditText)((Activity)nowContext).findViewById(R.id.main_input_name));
        user_address = getString((EditText)((Activity)nowContext).findViewById(R.id.main_input_address));

        mapped_data.put("사용자 이름",user_name);
        mapped_data.put("사용자 주소",user_address);

    }

    public void setDataToView(ViewGroup vg) {
        ((EditText) vg.findViewById(R.id.main_input_name)).setText(user_name);
        ((EditText) vg.findViewById(R.id.main_input_address)).setText(user_address);
    }

}
