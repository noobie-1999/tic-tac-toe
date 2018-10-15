package com.noobie1999.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private char matrix[][] = new char[3][3];
    private Button reset,b00,b01,b02,b10,b11,b12,b20,b21,b22;
    private TextView player1,player2,result;
    private boolean clicked[][] = {{false,false,false},{false,false,false},{false,false,false}};
    private int count=0,turn1=5,turn2=4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                matrix[i][j]=' ';
        reset = (Button) findViewById(R.id.resetButton);
        b00 = (Button) findViewById(R.id.button00);
        b01 = (Button) findViewById(R.id.button01);
        b02 = (Button) findViewById(R.id.button02);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);
        player1 = (TextView) findViewById(R.id.player1Score);
        player2 = (TextView) findViewById(R.id.player2Score);
        result = (TextView) findViewById(R.id.result);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<3;i++)
                    for(int j=0;j<3;j++)
                        matrix[i][j]=' ';
                count=0;
                b00.setText(" ");
                b01.setText(" ");
                b02.setText(" ");
                b10.setText(" ");
                b11.setText(" ");
                b12.setText(" ");
                b20.setText(" ");
                b21.setText(" ");
                b22.setText(" ");
                for(int i=0;i<3;i++)
                    for(int j=0;i<3;i++)
                        clicked[i][j]=false;
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[0][0]==false){
                    clicked[0][0]=true;
                    if(count%2==1) {
                        b00.setText("X");
                        matrix[0][0]='X';
                    }
                    else {
                        b00.setText("O");
                        matrix[0][0]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[0][1]==false){
                    clicked[0][1]=true;
                    if(count%2==1) {
                        b01.setText("X");
                        matrix[0][1]='X';

                    }
                    else {
                        b01.setText("O");
                        matrix[0][1]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[0][2]==false){
                    clicked[0][2]=true;
                    if(count%2==1) {
                        b02.setText("X");
                        matrix[0][2]='X';
                    }
                    else {
                        b02.setText("O");
                        matrix[0][2]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[1][0]==false){
                    clicked[1][0]=true;
                    if(count%2==1) {
                        b10.setText("X");
                        matrix[1][0]='X';
                    }
                    else {
                        b10.setText("O");
                        matrix[1][0]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[1][1]==false){
                    clicked[1][1]=true;
                    if(count%2==1) {
                        b11.setText("X");
                        matrix[1][1]='X';
                    }
                    else {
                        b11.setText("O");
                        matrix[1][1]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[1][2]==false){
                    if(count%2==1) {
                        b12.setText("X");
                        matrix[1][2]='X';
                    }
                    else {
                        b12.setText("O");
                        matrix[1][2]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[2][1]==false){
                    clicked[2][1]=true;
                    if(count%2==1) {
                        b21.setText("X");
                        matrix[2][1]='X';
                    }
                    else {
                        b21.setText("O");
                        matrix[2][1]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[2][0]==false){
                    if(count%2==1) {
                        b20.setText("X");
                        matrix[2][0]='X';
                    }
                    else {
                        b20.setText("O");
                        matrix[2][0]='O';
                    }
                    if(check()==true) {

                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if(clicked[2][2]==false){
                    if(count%2==1) {
                        b22.setText("X");
                        matrix[2][2]='X';
                    }
                    else {
                        b22.setText("O");
                        matrix[2][2]='O';
                    }
                    if(check()==true) {
                        result.setText("PLAYER"+(count%2)+ "WINS!!!");
                    }
                }
            }
        });
    }

    public boolean check(){
        boolean result = false;
        if((matrix[0][0]==matrix[0][1])&&(matrix[0][1]==matrix[0][2])&&(matrix[0][0]!=' '))
            result=true;
        else if((matrix[1][0]==matrix[1][1])&&(matrix[1][1]==matrix[1][2])&&(matrix[1][0]!=' '))
            result = true;
        else if((matrix[2][0]==matrix[2][1])&&(matrix[2][1]==matrix[2][2])&&(matrix[2][0]!=' '))
            result = true;
        else if((matrix[0][0]==matrix[1][0])&&(matrix[1][0]==matrix[2][0])&&(matrix[2][0]!=' '))
            result = true;
        else if((matrix[0][1]==matrix[1][1])&&(matrix[1][1]==matrix[2][1])&&(matrix[0][1]!=' '))
            result = true;
        else if((matrix[0][2]==matrix[1][2])&&(matrix[1][2]==matrix[2][2])&&(matrix[0][2]!=' '))
            result = true;
        else if((matrix[0][0]==matrix[1][1])&&(matrix[1][1]==matrix[2][2])&&(matrix[0][0]!=' '))
            result = true;
        else if((matrix[0][2]==matrix[1][1])&&(matrix[1][1]==matrix[2][0])&&(matrix[0][2]!=' '))
            result = true;

        return result;
    }
}
