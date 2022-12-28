package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double result;
    double curNum;
    String operation;
    TextView showResult;
    TextView showProcess;
    String process;
    boolean firstNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initialize();
        result = 0;
        operation = "+";
        showResult = (TextView) findViewById(R.id.showRslt);
        showProcess = (TextView) findViewById(R.id.showProc);
        process = "";
        curNum = 0;
        firstNum = true;

    }

    public void initialize(){
        double result = 0;
        String operation = "+";
        TextView showResult = (TextView) findViewById(R.id.showRslt);
        TextView showProcess = (TextView) findViewById(R.id.showProc);
        String process = "";
    }


    public void button1(View v){

        curNum = curNum*10 + 1;
        process += "1";
//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button2(View v){
        Log.d("curNum", curNum+"");

        curNum = curNum*10 + 2;
        process += "2";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button3(View v){

        curNum = curNum*10 + 3;
        process += "3";

        Log.d("current number", curNum+"");

        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button4(View v){

        curNum = curNum*10 + 4;
        process += "4";

        Log.d("curNum", curNum+"");


//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button5(View v){

        curNum = curNum*10 + 5;
        process += "5";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button6(View v){

        curNum = curNum*10 + 6;
        process += "6";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button7(View v){
        curNum = curNum*10 + 7;
        process += "7";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button8(View v){


        curNum = curNum*10 + 8;
        process += "8";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button9(View v){

        curNum = curNum*10 + 9;
        process += "9";

        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void button0(View v){
        curNum = curNum*10;
        process += "0";

//        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void add(View v){
        if (firstNum){
            result = curNum;
            firstNum = false;
        } else {
            if (operation.equals("+")){
                result += curNum;
            }else if (operation.equals("-")){
                result -= curNum;
            }else if (operation.equals("*")){
                result *= curNum;
            }else if (operation.equals("/")){
                result /= curNum;
            }
        }
        curNum = 0;
        operation = "+";
        process += " + ";
        showResult.setText(result+"");
        showProcess.setText(process);
        Log.d("result", result+"");

    }

    public void subtract(View v){
        if (firstNum){
            result = curNum;
            firstNum = false;
        } else {
            if (operation.equals("+")){
                result += curNum;
            }else if (operation.equals("-")){
                result -= curNum;
            }else if (operation.equals("*")){
                result *= curNum;
            }else if (operation.equals("/")){
                result /= curNum;
            }
        }
        curNum = 0;
        operation = "-";
        process += " - ";
        showResult.setText(result+"");
        showProcess.setText(process);
        Log.d("result", result+"");

    }

    public void multiply(View v){
        if (firstNum){
            result = curNum;
            firstNum = false;
        } else {
            if (operation.equals("+")){
                result += curNum;
            }else if (operation.equals("-")){
                result -= curNum;
            }else if (operation.equals("*")){
                result *= curNum;
            }else if (operation.equals("/")){
                result /= curNum;
            }
        }
        curNum = 0;
        operation = "*";
        process += " × ";
        showResult.setText(result+"");
        showProcess.setText(process);
        Log.d("result", result+"");

    }

    public void divide(View v){
        if (firstNum){
            result = curNum;
            firstNum = false;
        } else {
            if (operation.equals("+")){
                result += curNum;
            }else if (operation.equals("-")){
                result -= curNum;
            }else if (operation.equals("*")){
                result *= curNum;
            }else if (operation.equals("/")){
                result /= curNum;
            }
        }
        curNum = 0;
        operation = "/";
        process += " ÷ ";
        showResult.setText(result+"");
        showProcess.setText(process);
        Log.d("result", result+"");

    }

    public void reset(View v){

        result=0;
        curNum = 0;
        process="";
        operation="+";
        firstNum = true;
        showResult.setText(result+"");
        showProcess.setText(process);
    }

    public void equal(View v){
        if (operation.equals("+")){
            result += curNum;
        }else if (operation.equals("-")){
            result -= curNum;
        }else if (operation.equals("*")){
            result *= curNum;
        }else if (operation.equals("/")){
            result /= curNum;
        }
        process = process + " = " + result;
        showProcess.setText(process);
        curNum = 0;
        showResult.setText(result+"");
//        process = "";
        showProcess.setText(process);

    }
}