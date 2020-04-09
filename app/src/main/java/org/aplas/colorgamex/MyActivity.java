package org.aplas.colorgamex;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivity extends AppCompatActivity {

    TextView timer, clrText, scoreText;
    EditText passwd;
    Button submit, start;
    ViewGroup accessbox, colorbox, buttonbox1, buttonbox2, scorebox, progressbox;
    ProgressBar progress;
    Switch isMinus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        timer = findViewById(R.id.timerText);
        clrText = findViewById(R.id.clrText);
        scoreText = findViewById(R.id.scoreText);
        passwd = findViewById(R.id.appCode);
        submit = findViewById(R.id.submitBtn);
        start = findViewById(R.id.startBtn);
        accessbox = findViewById(R.id.accessBox);
        colorbox = findViewById(R.id.colorBox);
        buttonbox1 = findViewById(R.id.buttonBox1);
        buttonbox2 = findViewById(R.id.buttonBox2);
        scorebox = findViewById(R.id.scoreBox);
        progressbox = findViewById(R.id.progressBox);
        progress = findViewById(R.id.progressScore);
        isMinus = findViewById(R.id.isMinus);
    }

    public void openGame(View v) {
        String keyword = getString(R.string.keyword);
        String pass = passwd.getText().toString();

        if (keyword.equals(pass)) {
            passwd.setVisibility(View.INVISIBLE);
            submit.setVisibility(View.INVISIBLE);
            accessbox.setVisibility(View.VISIBLE);
            colorbox.setVisibility(View.VISIBLE);
            buttonbox1.setVisibility(View.VISIBLE);
            buttonbox2.setVisibility(View.VISIBLE);
            scorebox.setVisibility(View.VISIBLE);
            progressbox.setVisibility(View.VISIBLE);

            Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG).show();
        } else {
            passwd.setVisibility(View.VISIBLE);
            submit.setVisibility(View.VISIBLE);
            accessbox.setVisibility(View.VISIBLE);
            colorbox.setVisibility(View.INVISIBLE);
            buttonbox1.setVisibility(View.INVISIBLE);
            buttonbox2.setVisibility(View.INVISIBLE);
            scorebox.setVisibility(View.INVISIBLE);
            progressbox.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(), "Password is wrong", Toast.LENGTH_LONG).show();
        }
    }

    public void startGame(View v) {

    }

    public void submitColor(View v) {

    }
}
