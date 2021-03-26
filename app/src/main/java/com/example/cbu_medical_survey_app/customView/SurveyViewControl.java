package com.example.cbu_medical_survey_app.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.cbu_medical_survey_app.R;

public class SurveyViewControl extends ConstraintLayout {

    ImageView img;
    TextView text;

    public SurveyViewControl(Context context) {
        super(context);
        initView();
    }
    public SurveyViewControl(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
        getAttrs(attrs);
    }

    public SurveyViewControl(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs);
        initView();
        getAttrs(attrs, defStyle);
    }

    private void initView() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.survey_view, this, false);
        addView(v);

        text = (TextView) findViewById(R.id.top_title);
        img = (ImageView)findViewById(R.id.title_img);
    }

    private void getAttrs(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.SurveyViewControl);

        setTypeArray(typedArray);
    }

    private void getAttrs(AttributeSet attrs, int defStyle) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.SurveyViewControl, defStyle, 0);

        setTypeArray(typedArray);
    }

    private void setTypeArray(TypedArray typedArray) {
        String text_string = typedArray.getString(R.styleable.SurveyViewControl_pageTitle);
        int img_src = typedArray.getResourceId(R.styleable.SurveyViewControl_titleImg, 0);
        text.setText(text_string);
        img.setImageResource(img_src);

        typedArray.recycle();
    }

    void setText(String text_string){
        text.setText(text_string);
    }
}