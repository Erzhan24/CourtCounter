package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void plusthreeA(View view) {

        score=score+3;
        displayForTeamA(score);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void plustwoA(View view) {

        score=score+2;
        displayForTeamA(score);
    }
    public void freeA(View view) {

        score=score+1;
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    int scoreb=0;
    /**
     * This method is called when the order button is clicked.
     */
    public void plusthreeB(View view) {

        scoreb=scoreb+3;
        displayForTeamB(scoreb);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void plustwoB(View view) {

        scoreb=scoreb+2;
        displayForTeamB(scoreb);
    }
    public void freeB(View view) {

        scoreb=scoreb+1;
        displayForTeamB(scoreb);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int scoreb) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreb));
    }
    public void reset(View view){
        score=0;
        scoreb=0;
        displayForTeamB(scoreb);
        displayForTeamA(score);
    }
}