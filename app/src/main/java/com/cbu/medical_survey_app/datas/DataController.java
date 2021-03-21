package com.cbu.medical_survey_app.datas;

import android.content.Context;
import android.view.ViewGroup;

import java.util.HashMap;

public class DataController {
    final private Last_Data last_data;

    public DataController() {
        last_data = new Last_Data();
    }

    public void saveLastData(Context context){
        last_data.saveData(context);
    }

    public HashMap<String, String> getLastData() {
        return last_data.getData();
    }

    public void setLastDataToView(ViewGroup vg) {
        last_data.setDataToView(vg);
    }
}
