package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreCounter extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_counter);
    }
    int redScore=0;
    int blueScore=0;
    int zeroAll = 0;
    public void addFourRed(View view){
        redScore=redScore+4;
        displayForRed(redScore);
    }
    public void addThreeRed(View view){
        redScore=redScore+3;
        displayForRed(redScore);

    }
    public void addTwoRed(View view){
        redScore=redScore+2;
        displayForRed(redScore);
    }
    public void addOneRed(View view){
        redScore=redScore+1;
        displayForRed(redScore);
    }
    public void addFourBlue(View view){
        blueScore=blueScore+4;
        displayForBlue(blueScore);
    }
    public void addThreeBlue(View view){
        blueScore=blueScore+3;
        displayForBlue(blueScore);
    }
    public void addTwoBlue(View view){
        blueScore=blueScore+2;
        displayForBlue(blueScore);
    }
    public void addOneBlue(View view){
        blueScore=blueScore+1;
        displayForBlue(blueScore);
    }
    public void displayForBlue(int point2){
        TextView scoreView = (TextView)findViewById(R.id.BlueScore);
        scoreView.setText(String.valueOf(point2));
    }
    public void resetButton(View view){
        blueScore=0;
        redScore=0;
        displayForRed(redScore);
        displayForBlue(blueScore);
    }

    public void displayForRed(int point) {
        TextView scoreView = (TextView) findViewById(R.id.RedScore);
        scoreView.setText(String.valueOf(point));
    }
}
