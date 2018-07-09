package vn.hieuruoi.test;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Calculator {
    String[] mNumbers;
    char mCalculation;
    double mResult = 0;


    public Calculator() {
        mCalculation = new Character('+');

    }
    public void printResult( Button button,TextView textView){
        Log.d( "printResult: TVGet text", (String) textView.getText());
        Log.d( "printResult: BTGet text", (String) button.getText());
        textView.setText(String.format("%s%s",textView.getText(),button.getText()));

    }

    public boolean isNumber(char c) {
        if (c == '0'
                || c == '1'
                || c == '2'
                || c == '3'
                || c == '4'
                || c == '5'
                || c == '6'
                || c == '7'
                || c == '8'
                || c == '9'
                || c == '.')
            return true;
        return false;
    }

    public void convert(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (this.isNumber(s.charAt(i)) == false) {
                mCalculation = s.charAt(i);
            }
            if (mCalculation == '+') {
                mNumbers = s.split("\\+");
            } else mNumbers = s.split(String.valueOf(mCalculation));

        }

    }

    public void setmResult(double d) {
        this.mResult = d;
    }

    public double getPercentResult(String s) {
        double d = Double.parseDouble(s);
        return d / 100;
    }

    public void setResult() {

        double d1 = Double.parseDouble(mNumbers[0]);
        double d2 = Double.parseDouble(mNumbers[1]);
        if (mCalculation == '+')
            this.mResult = d1 + d2;
        if (mCalculation == '-')
            this.mResult = d1 - d2;
        if (mCalculation == 'X')
            this.mResult = d1 * d2;
        if (mCalculation == '/')
            this.mResult = d1 / d2;
    }


    public String getmResult() {
        String s = String.valueOf(mResult);
        return s;
    }
}

