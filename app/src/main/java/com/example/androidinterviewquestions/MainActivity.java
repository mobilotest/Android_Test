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

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;

    private RadioButton first, second, third, fourth;
    private TextView explanation;
    private Button btnDone;
    private Button btnHelp;

    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;

    private ImageView img_one;
    private ImageView img_two;
    private ImageView img_three;
    private ImageView img_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);

        first = (RadioButton) findViewById(R.id.rb1_1);
        second = (RadioButton) findViewById(R.id.rb2_3);
        third = (RadioButton) findViewById(R.id.rb3_2);
        fourth = (RadioButton) findViewById(R.id.rb4_1);

        one = (TextView) findViewById(R.id.explanation_1);
        two = (TextView) findViewById(R.id.explanation_2);
        three = (TextView) findViewById(R.id.explanation_3);
        four = (TextView) findViewById(R.id.explanation_4);

        explanation = (TextView) findViewById(R.id.text);

        img_one = (ImageView) findViewById(R.id.imageView_1);
        img_one.setImageResource(R.drawable.images_1);
        img_two = (ImageView) findViewById(R.id.imageView_2);
        img_two.setImageResource(R.drawable.images_2);
        img_three = (ImageView) findViewById(R.id.imageView_3);
        img_three.setImageResource(R.drawable.images_3);
        img_four = (ImageView) findViewById(R.id.imageView_4);
        img_four.setImageResource(R.drawable.images_4);

        btnDone = (Button) findViewById(R.id.done);
        btnHelp = (Button) findViewById(R.id.help);

        // Uncheck or reset the radio buttons initially
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();

        // Add the Listener to the RadioGroup
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            // The flow will come here when any of the radio buttons in the radioGroup has been clicked
            // Check which radio button has been clicked
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // Get the selected Radio Button
                RadioButton radioButton1 = (RadioButton) radioGroup1.findViewById(checkedId);
                RadioButton radioButton2 = (RadioButton) radioGroup2.findViewById(checkedId);
                RadioButton radioButton3 = (RadioButton) radioGroup3.findViewById(checkedId);
                RadioButton radioButton4 = (RadioButton) radioGroup4.findViewById(checkedId);
            }
        });

        // Add the Listener to the Submit Button
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // When submit button is clicked, Ge the Radio Button which is set
                // If no Radio Button is set, -1 will be returned
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup1.getCheckedRadioButtonId();
                int selectedId3 = radioGroup1.getCheckedRadioButtonId();
                int selectedId4 = radioGroup1.getCheckedRadioButtonId();
                if (selectedId1 == -1 || selectedId2 == -1 || selectedId3 == -1 || selectedId4 == -1) {
                    toastMessage(R.string.empty);
                } else if (!first.isChecked() && !second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && !second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && !second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && !second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && !second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && !second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    four.setText(R.string.explanation_4);
                    radioGroup2.clearCheck();
                    radioGroup4.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    three.setText(R.string.explanation_3);
                    radioGroup1.clearCheck();
                    radioGroup3.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && !second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    radioGroup2.clearCheck();
                    radioGroup3.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    toastMessage(R.string.fail);
                } else if (first.isChecked() && !second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    toastMessage(R.string.fail);
                } else if (!first.isChecked() && second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    radioGroup1.clearCheck();
                    toastMessage(R.string.fail);
                }else{
                    toastMessage(R.string.great);
                    // Uncheck or reset the radio buttons initially
                    radioGroup1.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup4.clearCheck();
                    one.setText("");
                    two.setText("");
                    three.setText("");
                    four.setText("");
                }
            }
        });
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
        toastMessage.setTextSize(40);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }
}