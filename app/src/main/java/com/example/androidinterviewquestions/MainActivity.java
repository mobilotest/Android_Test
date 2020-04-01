package com.example.androidinterviewquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView question_1;
    private TextView question_2;
    private TextView question_3;
    private TextView question_4;
    private RadioGroup radioGroup;
    private RadioButton first, second, third, four;
    private TextView explanation;
    private Button btnDone;
    private Button btnHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup4);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup1, int checkedId) {
            }
        });
        first = (RadioButton) findViewById(R.id.rb1_1);
        second = (RadioButton) findViewById(R.id.rb1_2);
        third = (RadioButton) findViewById(R.id.rb1_3);
        four = (RadioButton) findViewById(R.id.rb1_4);

        explanation = (TextView) findViewById(R.id.text);

        ImageView one = (ImageView) findViewById(R.id.imageView_1);
        one.setImageResource(R.drawable.images_1);
        ImageView two = (ImageView) findViewById(R.id.imageView_2);
        two.setImageResource(R.drawable.images_2);
        ImageView three = (ImageView) findViewById(R.id.imageView_3);
        three.setImageResource(R.drawable.images_3);
        ImageView four = (ImageView) findViewById(R.id.imageView_4);
        four.setImageResource(R.drawable.images_4);

        btnDone = (Button) findViewById(R.id.done);
        btnHelp = (Button) findViewById(R.id.help);
    }


    public void done(View view) {
//        if (){
            toastMessage(R.string.great);
//        } else {
            toastMessage(R.string.fail);
//        }
    }

    public void help(View view) {
        TextView one = (TextView) findViewById(R.id.explanation_1);
        one.setText(R.string.explanation_1);
        TextView two = (TextView) findViewById(R.id.explanation_2);
        two.setText(R.string.explanation_2);
        TextView three = (TextView) findViewById(R.id.explanation_3);
        three.setText(R.string.explanation_3);
        TextView four = (TextView) findViewById(R.id.explanation_4);
        four.setText(R.string.explanation_4);
    }

    public void toastMessage(int resource) {
        Toast toast = Toast.makeText(getApplicationContext(), getText(resource), Toast.LENGTH_SHORT);
        TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.RED);
        toastMessage.setTextSize(45);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }
}