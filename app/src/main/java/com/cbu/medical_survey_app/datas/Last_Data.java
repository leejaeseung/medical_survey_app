package com.cbu.medical_survey_app.datas;

import android.app.Activity;
import android.content.Context;
import android.widget.CalendarView;
import android.widget.EditText;

import com.cbu.medical_survey_app.R;

import java.util.Date;

public class Last_Data {

    private CalendarView today;
    private EditText ph_first_myself;
    private EditText ph_second_myself;
    private EditText name_other;
    private EditText address_other;
    private EditText zipcode;
    private EditText address_myself;
    private EditText ph_first_myself2;
    private EditText ph_second_myself2;

    public Last_Data(Context nowContext) {
        today = ((Activity)nowContext).findViewById(R.id.input_today);
        ph_first_myself = ((Activity)nowContext).findViewById(R.id.input_ph_first_myself);
        ph_second_myself = ((Activity)nowContext).findViewById(R.id.input_ph_second_myself);
        name_other = ((Activity)nowContext).findViewById(R.id.input_name_other);
        address_other = ((Activity)nowContext).findViewById(R.id.input_address_other);
        zipcode = ((Activity)nowContext).findViewById(R.id.input_zipcode);
        address_myself = ((Activity)nowContext).findViewById(R.id.input_address_myself);
        ph_first_myself2 = ((Activity)nowContext).findViewById(R.id.input_ph_first_myself2);
        ph_second_myself2 = ((Activity)nowContext).findViewById(R.id.input_ph_second_myself2);

        Date dt = new Date(today.getDate());

        String nowDate = dt.
    }
}
