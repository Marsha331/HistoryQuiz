package net.swallowsnest.historyquiz;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatCheckBox;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
    }

    public void gradeQuiz(View view) {
        gradeQuestion1();
        gradeQuestion2();
        gradeQuestion3();
        gradeQuestion4();
        gradeQuestion5();
        gradeQuestion6();
        gradeQuestion7();
        Toast.makeText(this, "Your score is " + score + " out of 7 possible.", Toast.LENGTH_LONG).show();

        resetScore();
    }

    private void gradeQuestion1() {
        RadioGroup question = (RadioGroup) findViewById(R.id.rg1);
        int answer = question.getCheckedRadioButtonId();

        if (answer == R.id.radio_Britain) {
            score += 1;
        }
    }

    private void gradeQuestion2() {
        RadioGroup question = (RadioGroup) findViewById(R.id.rg2);
        int answer = question.getCheckedRadioButtonId();

        if (answer == R.id.radio_Grant) {
            score += 1;
        }
    }

    public void gradeQuestion3() {
        boolean maryland = ((CheckBox) findViewById(R.id.check_Maryland)).isChecked();
        boolean virginia = ((CheckBox) findViewById(R.id.check_Virginia)).isChecked();
        boolean delaware = ((CheckBox) findViewById(R.id.check_Delaware)).isChecked();
        boolean newyork = ((CheckBox) findViewById(R.id.check_NewYork)).isChecked();

        if (delaware || newyork) {
            return;
        }

        if (maryland && virginia) {
            score += 1;
        }
    }

    private void gradeQuestion4() {
        RadioGroup question = (RadioGroup) findViewById(R.id.rg3);
        int answer = question.getCheckedRadioButtonId();

        if (answer == R.id.radio_Davis) {
            score += 1;
        }
    }

    private void gradeQuestion5() {
        RadioGroup question = (RadioGroup) findViewById(R.id.rg4);
        int answer = question.getCheckedRadioButtonId();

        if (answer == R.id.radio_1773) {
            score += 1;
        }
    }

    private void gradeQuestion6() {
        EditText question = (EditText) findViewById(R.id.et1);
        String answer = question.getText().toString();

        if (answer.equals("HIROSHIMA")) {
            score += 1;
        }
    }

    private void gradeQuestion7() {
        RadioGroup question = (RadioGroup) findViewById(R.id.rg5);
        int answer = question.getCheckedRadioButtonId();

        if (answer == R.id.radio_1787) {
            score += 1;
        }
    }

    public void resetScore() {
        score = 0;
    }
}