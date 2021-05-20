package sg.edu.rp.c346.id20047518.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer1 = findViewById(R.id.textView);
        Intent i = getIntent();
        String questionsSelected = i.getStringExtra("Question");

        tvAnswer1.setText(questionsSelected+" answer is: Gone");

    }
}