package org.alphaecho.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuizApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_application);

        final Button btnKyqu = (Button) findViewById(R.id.button);
        EditText edtUser = (EditText) findViewById(R.id.editTxtUser);
        EditText edtPass = (EditText) findViewById(R.id.editTxtPass);

        btnKyqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenti = new Intent(this, MainKuizActivity.class);
                startActivity(intenti);
            }
        });
    }
}
