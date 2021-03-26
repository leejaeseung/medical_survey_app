package com.example.cbu_medical_survey_app.fragments;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.cbu_medical_survey_app.ButtonListener;
import com.example.cbu_medical_survey_app.MainActivity;
import com.example.cbu_medical_survey_app.R;
import com.example.cbu_medical_survey_app.SubActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class normal_fragment_1 extends Fragment {
    private ButtonListener bt1;
    private Context nowContext;
    TextView editDate ;
    EditText pro3_4;
    Button next_btn;
    Calendar myCalendar = Calendar.getInstance();
    RadioGroup rg1,rg2,rg7;

    //각각의 Fragement마다 Instance를 반환
    /*
    public static normal_fragment_1 newInstance(){
        return new normal_fragment_1();
    }
*/


    //DateListener가 바뀔경우

    DatePickerDialog.OnDateSetListener setDate = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            myCalendar.set(Calendar.YEAR,i);
            myCalendar.set(Calendar.MONTH,i1);
            myCalendar.set(Calendar.DAY_OF_MONTH,i2);
            updateDate();
        }
    };


    public normal_fragment_1() {

    }

    public normal_fragment_1(Context context) {
        bt1 = new ButtonListener(context);
        nowContext = context;
    }



    // 프래그먼트가 만들어질 때 datas에서 데이터를 가져와 모든 뷰에 넣어줌
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.normal_frag_1, container, false);

        next_btn = (Button)vg.findViewById(R.id.next_btn_1);
        editDate = (TextView)vg.findViewById(R.id.pro3_1);
        pro3_4 = (EditText)vg.findViewById(R.id.pro3_4);

        rg1=(RadioGroup)vg.findViewById(R.id.pro1);
        rg2=(RadioGroup)vg.findViewById(R.id.pro2);
        rg7=(RadioGroup)vg.findViewById(R.id.pro7);



        next_btn.setOnClickListener(bt1);


        editDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(getContext(),setDate,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });




        // 프래그먼트에 데이터 세팅
        SubActivity.dtc.setDataToView(vg);

        return vg;
    }


    public void updateDate(){   //날짜 형식 변환
        String format1= "YYYY년 MM월 dd일";
        String format2= "YYMMdd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format1, Locale.KOREA);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(format2, Locale.KOREA);
        editDate.setText(simpleDateFormat.format(myCalendar.getTime()));
        pro3_4.setText(simpleDateFormat2.format(myCalendar.getTime()));

    }



}