package com.example.androidinterviewquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;

    private CheckBox checkBox_uno, checkBox_dos, checkBox_tres, checkBox_quatro, checkBox_sinco, checkBox_seis, checkBox_siete, checkBox_ocho;
    private RadioButton correctAnswer_first, correctAnswer_second, correctAnswer_third, correctAnswer_fourth;

    private TextView explanation;

    private TextView answer_edit1;
    private TextView answer_edit2;

    private Button btnDone;
    private Button btnHelp;

    private TextView explanation_one;
    private TextView explanation_two;
    private TextView explanation_three;
    private TextView explanation_four;
    private TextView explanation_five;
    private TextView explanation_six;
    private TextView explanation_seven;
    private TextView explanation_eight;

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

        // radiogroups
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);

        // checkboxes
        checkBox_uno = (CheckBox) findViewById(R.id.checkBox1);
        checkBox_dos = (CheckBox) findViewById(R.id.checkBox2);
        checkBox_tres = (CheckBox) findViewById(R.id.checkBox3);
        checkBox_quatro = (CheckBox) findViewById(R.id.checkBox4);
        checkBox_sinco = (CheckBox) findViewById(R.id.checkBox5);
        checkBox_seis = (CheckBox) findViewById(R.id.checkBox6);
        checkBox_siete = (CheckBox) findViewById(R.id.checkBox7);
        checkBox_ocho = (CheckBox) findViewById(R.id.checkBox8);

        // correct answers
        correctAnswer_first = (RadioButton) findViewById(R.id.rb1_1);
        correctAnswer_second = (RadioButton) findViewById(R.id.rb2_3);
        correctAnswer_third = (RadioButton) findViewById(R.id.rb3_2);
        correctAnswer_fourth = (RadioButton) findViewById(R.id.rb4_1);

        explanation_one = (TextView) findViewById(R.id.explanation_1);
        explanation_two = (TextView) findViewById(R.id.explanation_2);
        explanation_three = (TextView) findViewById(R.id.explanation_3);
        explanation_four = (TextView) findViewById(R.id.explanation_4);
        explanation_five = (TextView) findViewById(R.id.explanation_5);
        explanation_six = (TextView) findViewById(R.id.explanation_6);
        explanation_seven = (TextView) findViewById(R.id.explanation_7);
        explanation_eight = (TextView) findViewById(R.id.explanation_8);

        explanation = (TextView) findViewById(R.id.text);

        img_one = (ImageView) findViewById(R.id.imageView_1);
        img_one.setImageResource(R.drawable.images_1);
        img_two = (ImageView) findViewById(R.id.imageView_2);
        img_two.setImageResource(R.drawable.images_2);
        img_three = (ImageView) findViewById(R.id.imageView_3);
        img_three.setImageResource(R.drawable.images_3);
        img_four = (ImageView) findViewById(R.id.imageView_4);
        img_four.setImageResource(R.drawable.images_4);
        img_five = (ImageView) findViewById(R.id.imageView_5);
        img_five.setImageResource(R.drawable.images_5);
        img_six = (ImageView) findViewById(R.id.imageView_6);
        img_six.setImageResource(R.drawable.images_6);
        img_seven = (ImageView) findViewById(R.id.imageView_7);
        img_seven.setImageResource(R.drawable.images_7);
        img_eight = (ImageView) findViewById(R.id.imageView_9);
        img_eight.setImageResource(R.drawable.images_9);

        btnDone = (Button) findViewById(R.id.done);
        btnHelp = (Button) findViewById(R.id.help);

        answer_edit1 = (EditText) findViewById(R.id.edit_text1);
        answer_edit2 = (EditText) findViewById(R.id.edit_text2);

        // Uncheck or reset the radio buttons initially
        resetAllRadioSelections();

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

                TextInputEditText edit_text_1_validation = (TextInputEditText) findViewById(R.id.edit_text1);
                if (edit_text_1_validation.getText().toString().equalsIgnoreCase(String.valueOf("start()"))) { // I don't understand why R.string.answer_25 doesn't work ;(
                    explanation_seven.setText(R.string.correct);
                } else {
                    explanation_seven.setText(R.string.explanation_7);
                }

                TextInputEditText edit_text_2_validation = (TextInputEditText) findViewById(R.id.edit_text2);
                if (edit_text_2_validation.getText().toString().equalsIgnoreCase(String.valueOf("outside"))) { // I don't understand why R.string.answer_26 doesn't work ;(
                    explanation_eight.setText(R.string.correct);
                } else {
                    explanation_eight.setText(R.string.explanation_8);
                }


                // checkboxes 1
                if (checkBox_uno.isChecked() && !checkBox_dos.isChecked() && checkBox_tres.isChecked() && !checkBox_quatro.isChecked()) {
                    explanation_five.setText(R.string.correct);
                } else {
                    explanation_five.setText(R.string.explanation_5);
                    checkBox_uno.setChecked(false);
                    checkBox_dos.setChecked(false);
                    checkBox_tres.setChecked(false);
                    checkBox_quatro.setChecked(false);
                }

                // checkboxes 2
                if (checkBox_sinco.isChecked() && checkBox_seis.isChecked() && !checkBox_siete.isChecked() && !checkBox_ocho.isChecked()) {
                    explanation_six.setText(R.string.correct);
                } else {
                    explanation_six.setText(R.string.explanation_6);
                    checkBox_sinco.setChecked(false);
                    checkBox_seis.setChecked(false);
                    checkBox_siete.setChecked(false);
                    checkBox_ocho.setChecked(false);
                }

                // radio buttons
                if (selectedId1 == -1 || selectedId2 == -1 || selectedId3 == -1 || selectedId4 == -1) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_two.setText(R.string.explanation_2);
                    explanation_three.setText(R.string.explanation_3);
                    explanation_four.setText(R.string.explanation_4);
                } else if (!correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_two.setText(R.string.explanation_2);
                    explanation_three.setText(R.string.explanation_3);
                    explanation_four.setText(R.string.explanation_4);
                    resetAllRadioSelections();
                } else if (correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_two.setText(R.string.explanation_2);
                    explanation_three.setText(R.string.explanation_3);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    explanation_one.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_three.setText(R.string.explanation_3);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    radioGroup1.clearCheck();
                    explanation_two.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_two.setText(R.string.explanation_2);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    explanation_three.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_two.setText(R.string.explanation_2);
                    explanation_three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    explanation_four.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_three.setText(R.string.explanation_3);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup3.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_two.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    radioGroup1.clearCheck();
                    explanation_two.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    radioGroup1.clearCheck();
                    explanation_three.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_two.setText(R.string.explanation_2);
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup2.clearCheck();
                    radioGroup4.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    explanation_three.setText(R.string.explanation_3);
                    radioGroup1.clearCheck();
                    radioGroup3.clearCheck();
                    explanation_two.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_two.setText(R.string.explanation_2);
                    explanation_three.setText(R.string.explanation_3);
                    radioGroup2.clearCheck();
                    radioGroup3.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && !correctAnswer_fourth.isChecked()) {
                    explanation_four.setText(R.string.explanation_4);
                    radioGroup4.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_two.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && !correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_three.setText(R.string.explanation_3);
                    radioGroup3.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_two.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else if (correctAnswer_first.isChecked() && !correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_two.setText(R.string.explanation_2);
                    radioGroup2.clearCheck();
                    explanation_one.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else if (!correctAnswer_first.isChecked() && correctAnswer_second.isChecked() && correctAnswer_third.isChecked() && correctAnswer_fourth.isChecked()) {
                    explanation_one.setText(R.string.explanation_1);
                    radioGroup1.clearCheck();
                    explanation_two.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                } else {
                    // Uncheck or reset the radio buttons initially
                    explanation_one.setText(R.string.correct);
                    explanation_two.setText(R.string.correct);
                    explanation_three.setText(R.string.correct);
                    explanation_four.setText(R.string.correct);
                }

                // grade calculator
                scoreCounter();
            }
        });
    }

    /**
     * This method will show all explanations for each questions without cleaning correct answers
     **/
    public void help(View view) {
        explanation_one.setText(R.string.explanation_1);
        explanation_two.setText(R.string.explanation_2);
        explanation_three.setText(R.string.explanation_3);
        explanation_four.setText(R.string.explanation_4);
        explanation_five.setText(R.string.explanation_5);
        explanation_six.setText(R.string.explanation_6);
        explanation_seven.setText(R.string.explanation_7);
        explanation_eight.setText(R.string.explanation_8);
    }

    /**
     * This method should clean all selection of all radio groups
     **/
    public void resetAllRadioSelections() {
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
    }

    /**
     * This method shows toast messages in red text
     *
     * @param text for input some message
     */
    public void toastMessage(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
        toastMessage.setTextColor(Color.RED);
        toastMessage.setTextSize(30);
        toast.setGravity(Gravity.CENTER, 0, 500);
        toast.show();
    }

    /**
     * This method calculates score: correct answers vs wrong or empty and show them in Toast message
     **/
    public void scoreCounter() {
        int correctSum = 0;
        if (explanation_one.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_two.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_three.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_four.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_five.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_six.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_seven.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        if (explanation_eight.getText().toString().equalsIgnoreCase(String.valueOf("CORRECT!"))) {
            correctSum++;
        }
        toastMessage("Correct : " + correctSum + " / Wrong: " + (8 - correctSum));
    }
}