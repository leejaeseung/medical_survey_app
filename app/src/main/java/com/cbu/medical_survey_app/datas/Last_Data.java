package com.cbu.medical_survey_app.datas;

import android.app.Activity;
import android.content.Context;
import android.widget.CalendarView;
import android.widget.EditText;

import com.cbu.medical_survey_app.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Last_Data {

//    private String today;
//    private String ph_first_myself;
//    private String ph_second_myself;
//    private String name_other;
//    private String address_other;
//    private String zipcode;
//    private String address_myself;
//    private String ph_first_myself2;
//    private String ph_second_myself2;

    // 맵으로 하는게 나중에 편할 듯?
    private HashMap<String, String> mapped_data;

    public Last_Data(Context nowContext) {
        mapped_data = new HashMap<String, String>();

        // 모든 뷰에서 값(String) 추출
        String today = getString((CalendarView) ((Activity)nowContext).findViewById(R.id.input_today));
        String ph_first_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_first_myself));
        String ph_second_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_second_myself));
        String name_other = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_name_other));
        String address_other = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_address_other));
        String zipcode = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_zipcode));
        String address_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_address_myself));
        String ph_first_myself2 = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_first_myself2));
        String ph_second_myself2 = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_second_myself2));

        mapped_data.put("제출일", today);
        mapped_data.put("본인 전화번호", ph_first_myself + ph_second_myself);
        mapped_data.put("지인 이름", name_other);
        mapped_data.put("지인 주소", address_other);
        mapped_data.put("본인 우편번호", zipcode);
        mapped_data.put("본인 주소", address_myself);
        mapped_data.put("본인 전화번호2", ph_first_myself2 + ph_second_myself2);

    }

    private String getString(CalendarView view) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

        return dateFormat.format(new Date(view.getDate()));
    }
    private String getString(EditText view) {
        return view.getText().toString();
    }
}
