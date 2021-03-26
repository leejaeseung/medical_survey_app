package com.example.cbu_medical_survey_app.datas;


import android.content.Context;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.cbu_medical_survey_app.R;
import com.example.cbu_medical_survey_app.fragments.normal_fragment_1;
import com.example.cbu_medical_survey_app.fragments.normal_fragment_2;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class DataController {
    final private Last_Data last_data;
    final private MainData main_data;
    final private NormalData_1 normal_data;



    public DataController() {
        last_data = new Last_Data();
        main_data = new MainData();
        normal_data = new NormalData_1();
    }

    // survey_content에 연결된 프래그먼트에 따라 저장할 데이터 분기
    public void saveData(Context context) {
        Fragment nowFragment = ((FragmentActivity)context).getSupportFragmentManager().findFragmentById(R.id.survey_content);


        if(nowFragment instanceof normal_fragment_1){
            System.out.println("일반사항 Frag");
            normal_data.saveData(context);
        }
        else if(nowFragment instanceof normal_fragment_2){
            System.out.println("일반사항2 Frag");

        }
        else {
            System.out.println("아님");
        }


    }

//    public HashMap<String, String> getData(Context context) {
//        Fragment nowFragment = ((FragmentActivity)context).getSupportFragmentManager().findFragmentById(R.id.survey_content);
//
//        if(nowFragment instanceof Last_Fragment){
//            System.out.println("맞음");
//            return last_data.getData();
//        }
//        else {
//            System.out.println("아님");
//            return null;
//        }
//    }



    public int get_check_radio(ViewGroup vg){

     int checked_id = ((RadioGroup)vg.findViewById(R.id.pro1)).getCheckedRadioButtonId();

    return checked_id;
}




    public void setDataToView(ViewGroup vg) {

        switch (vg.getId()) {
            case R.id.normal_frag1: {
                normal_data.get_check_radio(get_check_radio(vg));
                normal_data.setDataToView(vg);
            }


        }

    }
    /*
    public void saveExcel(Context context) {
        Workbook workbook = new HSSFWorkbook();

        Sheet sheet = workbook.createSheet();

        Row row = sheet.createRow(0);
        Cell cell;

        int idx = 0;

        for (Map.Entry<String, String> entry: last_data.getData().entrySet()) {
            cell = row.createCell(idx++);
            cell.setCellValue(entry.getKey());
        }

        File xlsFile = new File(context.getExternalFilesDir(null), "text.xls");

        try{
            FileOutputStream os = new FileOutputStream(xlsFile);
            workbook.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(xlsFile.getAbsolutePath() + "에 저장됨");
    }*/
}
