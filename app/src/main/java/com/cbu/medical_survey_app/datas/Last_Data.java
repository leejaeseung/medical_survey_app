package com.cbu.medical_survey_app.datas;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.EditText;

import com.cbu.medical_survey_app.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;

public class Last_Data {

    final private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
    private String input_today = dateFormat.format(new Date());
    private String input_ph_first_myself = "";
    private String input_ph_second_myself = "";
    private String input_name_other = "";
    private String input_address_other = "";
    private String input_zipcode = "";
    private String input_address_myself = "";
    private String input_ph_first_myself2 = "";
    private String input_ph_second_myself2 = "";

    // 맵으로 하는게 나중에 편할 듯?
    final private LinkedHashMap<String, String> mapped_data;

    public Last_Data() {
        mapped_data = new LinkedHashMap<String, String>();
    }

    private String getString(CalendarView view) {
        return dateFormat.format(new Date(view.getDate()));
    }
    private String getString(EditText view) {
        return view.getText().toString();
    }

    public LinkedHashMap<String, String> getData() {
        return mapped_data;
    }

    // 현재 context로 데이터 갱신
    public void saveData(Context nowContext) {
        // 모든 뷰에서 값(String) 추출
        input_today = getString((CalendarView) ((Activity)nowContext).findViewById(R.id.input_today));
        input_ph_first_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_first_myself));
        input_ph_second_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_second_myself));
        input_name_other = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_name_other));
        input_address_other = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_address_other));
        input_zipcode = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_zipcode));
        input_address_myself = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_address_myself));
        input_ph_first_myself2 = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_first_myself2));
        input_ph_second_myself2 = getString((EditText) ((Activity)nowContext).findViewById(R.id.input_ph_second_myself2));

        mapped_data.put("제출일", input_today);
        mapped_data.put("본인 전화번호", input_ph_first_myself + input_ph_second_myself);
        mapped_data.put("지인 이름", input_name_other);
        mapped_data.put("지인 주소", input_address_other);
        mapped_data.put("본인 우편번호", input_zipcode);
        mapped_data.put("본인 주소", input_address_myself);
        mapped_data.put("본인 전화번호2", input_ph_first_myself2 + input_ph_second_myself2);
    }

    public void setDataToView(ViewGroup vg) {
        try{
            ((CalendarView) vg.findViewById(R.id.input_today)).setDate(dateFormat.parse(input_today).getTime());
        }
        catch (ParseException e) {
            System.out.println(e);
        }

        ((EditText) vg.findViewById(R.id.input_ph_first_myself)).setText(input_ph_first_myself);
        ((EditText) vg.findViewById(R.id.input_ph_second_myself)).setText(input_ph_second_myself);
        ((EditText) vg.findViewById(R.id.input_name_other)).setText(input_name_other);
        ((EditText) vg.findViewById(R.id.input_address_other)).setText(input_address_other);
        ((EditText) vg.findViewById(R.id.input_zipcode)).setText(input_zipcode);
        ((EditText) vg.findViewById(R.id.input_address_myself)).setText(input_address_myself);
        ((EditText) vg.findViewById(R.id.input_ph_first_myself2)).setText(input_ph_first_myself2);
        ((EditText) vg.findViewById(R.id.input_ph_second_myself2)).setText(input_ph_second_myself2);
    }
}
