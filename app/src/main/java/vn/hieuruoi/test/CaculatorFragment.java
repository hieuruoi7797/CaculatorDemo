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
        mButtonMinus = v.findViewById(R.id.bt_minus);
        mButtonMulti = v.findViewById(R.id.bt_mutil);
        mButtonDivi = v.findViewById(R.id.bt_division);
        mButtonEqual = v.findViewById(R.id.bt_equal);
        mButtonAC = v.findViewById(R.id.bt_AC);
        mButtonDot = v.findViewById(R.id.bt_dot);
        mButtonPercent = v.findViewById(R.id.bt_percent);
        mButtonReverse = v.findViewById(R.id.bt_reverse);
        mTextViewResult = v.findViewById(R.id.tv_result);
        mCalculator = new Calculator();
        input();

        return v;
    }


    private void input() {
        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + ".");
            }
        });
        mButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText((mTextViewResult.getText() + "+"));
            }
        });
        mButtonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "-");
            }
        });
        mButtonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "X");
            }
        });
        mButtonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(mTextViewResult.getText() + "/");
            }
        });
        mButtonReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d;
                d = Double.parseDouble((String) mTextViewResult.getText());
                d = -d;
                mTextViewResult.setText(String.valueOf(d));
            }
        });
        mButtonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d = mCalculator.getPercentResult((String) mTextViewResult.getText());
                mTextViewResult.setText(String.valueOf(d));
            }
        });
        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCalculator.convert((String) mTextViewResult.getText());
                mCalculator.setResult();
                mTextViewResult.setText(mCalculator.getmResult());
            }
        });
        mButtonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextViewResult.setText(null);
                mCalculator.setmResult(0);
            }
        });

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
                mTextViewResult.setText(mTextViewResult.getText() + "0");
                break;
            case R.id.bt_1:
                mTextViewResult.setText(mTextViewResult.getText() + "1");
                break;
            case R.id.bt_2:
                mTextViewResult.setText(mTextViewResult.getText() + "2");
                break;
            case R.id.bt_3:
                mTextViewResult.setText(mTextViewResult.getText() + "3");
                break;
            case R.id.bt_4:
                mTextViewResult.setText(mTextViewResult.getText() + "4");
                break;
            case R.id.bt_5:
                mTextViewResult.setText(mTextViewResult.getText() + "5");
                break;
            case R.id.bt_6:
                mTextViewResult.setText(mTextViewResult.getText() + "6");
                break;
            case R.id.bt_7:
                mTextViewResult.setText(mTextViewResult.getText() + "7");
                break;
            case R.id.bt_8:
                mTextViewResult.setText(mTextViewResult.getText() + "8");
                break;
            case R.id.bt_9:
                mTextViewResult.setText(mTextViewResult.getText() + "9");
                break;
        }

    }
}






