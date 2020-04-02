package com.example.androidinterviewquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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

    private CheckBox uno, dos, tries, quatro, sinco, seis, siete, ocho;

    private RadioButton first, second, third, fourth;
    private TextView explanation;
    private Button btnDone;
    private Button btnHelp;

    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;
    private TextView five;
    private TextView six;
    private TextView seven;
    private TextView eight;

    private ImageView img_one;
    private ImageView img_two;
    private ImageView img_three;
    private ImageView img_four;
    private ImageView img_five;
    private ImageView img_six;
    private ImageView img_seven;
    private ImageView img_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnChkIos();

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

        five = (TextView) findViewById(R.id.explanation_5);
        six = (TextView) findViewById(R.id.explanation_6);
        seven = (TextView) findViewById(R.id.explanation_7);
        eight = (TextView) findViewById(R.id.explanation_8);

        explanation = (TextView) findViewById(R.id.text);

        img_one = (ImageView) findViewById(R.id.imageView_1);
        img_one.setImageResource(R.drawable.images_1);
        img_two = (ImageView) findViewById(R.id.imageView_2);
        img_two.setImageResource(R.drawable.images_2);
        img_three = (ImageView) findViewById(R.id.imageView_3);
        img_three.setImageResource(R.drawable.images_3);
        img_four = (ImageView) findViewById(R.id.imageView_4);
        img_four.setImageResource(R.drawable.images_4);
        img_one = (ImageView) findViewById(R.id.imageView_5);
        img_one.setImageResource(R.drawable.images_5);
        img_two = (ImageView) findViewById(R.id.imageView_6);
        img_two.setImageResource(R.drawable.images_6);
        img_three = (ImageView) findViewById(R.id.imageView_7);
        img_three.setImageResource(R.drawable.images_7);
        img_four = (ImageView) findViewById(R.id.imageView_8);
        img_four.setImageResource(R.drawable.images_8);

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

                // checkboxes 1
                if (uno.isChecked() && tries.isChecked()) {
                    five.setText(R.string.correct);
                } else {
                    five.setText(R.string.explanation_5);
                    uno.setChecked(false);
                    dos.setChecked(false);
                    tries.setChecked(false);
                    quatro.setChecked(false);
                }

                // checkboxes 2
                if (sinco.isChecked() && seis.isChecked()) {
                    six.setText(R.string.correct);
                } else {
                    six.setText(R.string.explanation_6);
                    sinco.setChecked(false);
                    seis.setChecked(false);
                    siete.setChecked(false);
                    ocho.setChecked(false);
                }



                // radio buttons
                if (selectedId1 == -1 || selectedId2 == -1 || selectedId3 == -1 || selectedId4 == -1) {
                    toastMessage(R.string.empty_radio);
                } else if (!first.isChecked() && !second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                } else if (first.isChecked() && !second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    one.setText(R.string.correct);
                } else if (!first.isChecked() && second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup1.clearCheck();
                    two.setText(R.string.correct);
                } else if (!first.isChecked() && !second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    three.setText(R.string.correct);
                } else if (!first.isChecked() && !second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    four.setText(R.string.correct);
                } else if (first.isChecked() && second.isChecked() && !third.isChecked() && !fourth.isChecked()) {
                    three.setText(R.string.explanation_3);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    one.setText(R.string.correct);
                    two.setText(R.string.correct);
                } else if (!first.isChecked() && second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup1.clearCheck();
                    two.setText(R.string.correct);
                    three.setText(R.string.correct);
                } else if (!first.isChecked() && !second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    three.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else if (first.isChecked() && !second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    four.setText(R.string.explanation_4);
                    radioGroup2.clearCheck();
                    radioGroup4.clearCheck();
                    one.setText(R.string.correct);
                    three.setText(R.string.correct);
                } else if (!first.isChecked() && second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    three.setText(R.string.explanation_3);
                    radioGroup1.clearCheck();
                    radioGroup3.clearCheck();
                    two.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else if (first.isChecked() && !second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    three.setText(R.string.explanation_3);
                    radioGroup2.clearCheck();
                    radioGroup3.clearCheck();
                    one.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else if (first.isChecked() && second.isChecked() && third.isChecked() && !fourth.isChecked()) {
                    four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    one.setText(R.string.correct);
                    two.setText(R.string.correct);
                    three.setText(R.string.correct);
                } else if (first.isChecked() && second.isChecked() && !third.isChecked() && fourth.isChecked()) {
                    three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    one.setText(R.string.correct);
                    two.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else if (first.isChecked() && !second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    one.setText(R.string.correct);
                    three.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else if (!first.isChecked() && second.isChecked() && third.isChecked() && fourth.isChecked()) {
                    one.setText(R.string.explanation_1);
                    radioGroup1.clearCheck();
                    two.setText(R.string.correct);
                    three.setText(R.string.correct);
                    four.setText(R.string.correct);
                } else {
                    // Uncheck or reset the radio buttons initially
                    one.setText(R.string.correct);
                    two.setText(R.string.correct);
                    three.setText(R.string.correct);
                    four.setText(R.string.correct);
                }
            }
        });
    }

    private void addListenerOnChkIos() {
        //Getting instance of CheckBoxes from the activty_main.xml file
        uno = (CheckBox) findViewById(R.id.checkBox1);
        dos = (CheckBox) findViewById(R.id.checkBox2);
        tries = (CheckBox) findViewById(R.id.checkBox3);
        quatro = (CheckBox) findViewById(R.id.checkBox4);
        sinco = (CheckBox) findViewById(R.id.checkBox5);
        seis = (CheckBox) findViewById(R.id.checkBox6);
        siete = (CheckBox) findViewById(R.id.checkBox7);
        ocho = (CheckBox) findViewById(R.id.checkBox8);
    }

    public void help(View view) {
        one.setText(R.string.explanation_1);
        two.setText(R.string.explanation_2);
        three.setText(R.string.explanation_3);
        four.setText(R.string.explanation_4);
    }

    public void toastMessage(int resource) {
        Toast toast = Toast.makeText(getApplicationContext(), getText(resource), Toast.LENGTH_SHORT);
        TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.RED);
        toastMessage.setTextSize(25);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }
}