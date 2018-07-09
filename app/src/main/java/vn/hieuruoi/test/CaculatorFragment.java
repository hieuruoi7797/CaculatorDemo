package vn.hieuruoi.test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CaculatorFragment extends android.app.Fragment implements View.OnClickListener {
    TextView mTextViewResult;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;
    Button mButton0;
    Button mButtonPlus;
    Button mButtonMinus;
    Button mButtonMulti;
    Button mButtonDivi;
    Button mButtonEqual;
    Button mButtonAC;
    Button mButtonDot;
    Button mButtonPercent;
    Button mButtonReverse;
    String mResult;

    Calculator mCalculator;

    public CaculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        mResult = null;
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        mTextViewResult = v.findViewById(R.id.tv_result);
        mCalculator = new Calculator();
        createButtons(v);

        return v;
    }

    private void createButtons(View v) {
        mButton0 = v.findViewById(R.id.bt_0);
        mButton0.setOnClickListener(this);

        mButton1 = v.findViewById(R.id.bt_1);
        mButton1.setOnClickListener(this);

        mButton2 = v.findViewById(R.id.bt_2);
        mButton2.setOnClickListener(this);

        mButton3 = v.findViewById(R.id.bt_3);
        mButton3.setOnClickListener(this);

        mButton4 = v.findViewById(R.id.bt_4);
        mButton4.setOnClickListener(this);

        mButton5 = v.findViewById(R.id.bt_5);
        mButton5.setOnClickListener(this);

        mButton6 = v.findViewById(R.id.bt_6);
        mButton6.setOnClickListener(this);

        mButton7 = v.findViewById(R.id.bt_7);
        mButton7.setOnClickListener(this);

        mButton8 = v.findViewById(R.id.bt_8);
        mButton8.setOnClickListener(this);

        mButton9 = v.findViewById(R.id.bt_9);
        mButton9.setOnClickListener(this);

        mButtonPlus = v.findViewById(R.id.bt_plus);
        mButtonPlus.setOnClickListener(this);

        mButtonMinus = v.findViewById(R.id.bt_minus);
        mButtonMinus.setOnClickListener(this);

        mButtonMulti = v.findViewById(R.id.bt_multi);
        mButtonMulti.setOnClickListener(this);

        mButtonDivi = v.findViewById(R.id.bt_division);
        mButtonDivi.setOnClickListener(this);

        mButtonEqual = v.findViewById(R.id.bt_equal);
        mButtonEqual.setOnClickListener(this);

        mButtonAC = v.findViewById(R.id.bt_AC);
        mButtonAC.setOnClickListener(this);

        mButtonDot = v.findViewById(R.id.bt_dot);
        mButtonDot.setOnClickListener(this);

        mButtonPercent = v.findViewById(R.id.bt_percent);
        mButtonPercent.setOnClickListener(this);

        mButtonReverse = v.findViewById(R.id.bt_reverse);
        mButtonReverse.setOnClickListener(this);

    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.test, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_clear) {
            mTextViewResult.setText(null);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_0:
                mCalculator.printResult(mButton0,mTextViewResult);
                break;
            case R.id.bt_1:
                mCalculator.printResult(mButton1,mTextViewResult);
                break;
            case R.id.bt_2:
                mCalculator.printResult(mButton2,mTextViewResult);
                break;
            case R.id.bt_3:
                mCalculator.printResult(mButton3,mTextViewResult);
                break;
            case R.id.bt_4:
                mCalculator.printResult(mButton4,mTextViewResult);
                break;
            case R.id.bt_5:
                mCalculator.printResult(mButton5,mTextViewResult);
                break;
            case R.id.bt_6:
                mCalculator.printResult(mButton6,mTextViewResult);
                break;
            case R.id.bt_7:
                mCalculator.printResult(mButton7,mTextViewResult);
                break;
            case R.id.bt_8:
                mCalculator.printResult(mButton8,mTextViewResult);
                break;
            case R.id.bt_9:
                mCalculator.printResult(mButton9,mTextViewResult);
                break;
            case R.id.bt_AC:
                mTextViewResult.setText(null);
                mCalculator.setmResult(0);
                break;
            case R.id.bt_equal:
                mCalculator.convert((String) mTextViewResult.getText());
                mCalculator.setResult();
                mTextViewResult.setText(mCalculator.getmResult());
                break;
            case R.id.bt_percent:
                double d = mCalculator.getPercentResult((String) mTextViewResult.getText());
                mTextViewResult.setText(String.valueOf(d));
                break;
            case R.id.bt_reverse:
                double d2;
                d2 = Double.parseDouble((String) mTextViewResult.getText());
                d2 = -d2;
                mTextViewResult.setText(String.valueOf(d2));
                break;
            case R.id.bt_division:
                mCalculator.printResult(mButtonDivi,mTextViewResult);
                break;
            case R.id.bt_plus:
                mCalculator.printResult(mButtonPlus,mTextViewResult);
                break;
            case R.id.bt_dot:
                mCalculator.printResult(mButtonDot,mTextViewResult);
                break;
            case R.id.bt_minus:
                mCalculator.printResult(mButtonMinus,mTextViewResult);
                break;
            case R.id.bt_multi:
                mCalculator.printResult(mButtonMulti,mTextViewResult);
                break;


        }

    }
}






