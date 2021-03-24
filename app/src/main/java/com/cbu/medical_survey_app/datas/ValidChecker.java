package com.cbu.medical_survey_app.datas;

import java.util.LinkedHashMap;
import java.util.Map;

public class ValidChecker {

    public ValidChecker() {

    }

    public boolean lastChecker(LinkedHashMap<String, String> datas) {

        boolean isValid = true;

        for (Map.Entry<String, String> entry: datas.entrySet()) {
            if(entry.getValue().equals("")){
                isValid = false;
                break;
            }
        }

        return isValid;
    }
}
