package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;
    private boolean booleanClear;
    private Button btn_secondActive;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        btn_secondActive = findViewById(R.id.btn_secondActive);


        btn_secondActive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String txt = tvResult.getText().toString();
                intent.putExtra("text",txt);
                startActivity(intent);
            }
        });
    }



    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                if (!booleanClear) {
                    tvResult.setText("1");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("1");
                    } else {
                        tvResult.append("1");
                    }
                }
                break;
            case R.id.btn_two:
                if (!booleanClear) {
                    tvResult.setText("2");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("2");
                    } else {
                        tvResult.append("2");
                    }
                }
                break;
            case R.id.btn_three:
                if (!booleanClear) {
                    tvResult.setText("3");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("3");
                    } else {
                        tvResult.append("3");
                    }
                }
                break;
            case R.id.btn_four:
                if (!booleanClear) {
                    tvResult.setText("4");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("4");
                    } else {
                        tvResult.append("4");
                    }
                }
                break;
            case R.id.btn_five:
                if (!booleanClear) {
                    tvResult.setText("5");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("5");
                    } else {
                        tvResult.append("5");
                    }
                }
                break;
            case R.id.btn_six:
                if (!booleanClear) {
                    tvResult.setText("6");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("6");
                    } else {
                        tvResult.append("6");
                    }
                }
                break;
            case R.id.btn_seven:
                if (!booleanClear) {
                    tvResult.setText("7");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("7");
                    } else {
                        tvResult.append("7");
                    }
                }
                break;
            case R.id.btn_eight:
                if (!booleanClear) {
                    tvResult.setText("8");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("8");
                    } else {
                        tvResult.append("8");
                    }
                }
                break;
            case R.id.btn_nine:
                if (!booleanClear) {
                    tvResult.setText("9");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.setText("9");
                    } else {
                        tvResult.append("9");
                    }
                }
                break;
            case R.id.btn_zero:
                if (!booleanClear) {
                    tvResult.setText("0");
                    btn_secondActive.setVisibility(View.GONE);
                    booleanClear = true;
                } else {
                    if (tvResult.getText().toString().equals("0")) {
                        tvResult.append("");
                    } else {
                        tvResult.append("0");
                    }
                }
                break;
            case R.id.btn_clear:
                tvResult.setText("");
                break;
        }
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_divide:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                btn_secondActive.setVisibility(View.GONE);
                operation = ":";
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_multiply:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "x";
                btn_secondActive.setVisibility(View.GONE);
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                btn_secondActive.setVisibility(View.GONE);
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                btn_secondActive.setVisibility(View.GONE);
                tvResult.setText(firstValue + operation);
                break;
            case R.id.btn_equal:
                String two = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(two);

                String result = null;

                if (operation.equals("+")) {
                    result = String.valueOf(firstValue + secondValue);
                } else if (operation.equals("-")) {
                    result = String.valueOf(firstValue - secondValue);
                } else if (operation.equals(":")) {
                    if (secondValue == 0) {
                        result = "Нельзя делить на ноль!";
                    } else {
                        result = String.valueOf(firstValue / secondValue);
                    }
                } else if (operation.equals("x")) {
                    result = String.valueOf(firstValue * secondValue);
                }

                tvResult.setText(firstValue + operation + secondValue + "=" + result);
                btn_secondActive.setVisibility(View.VISIBLE);
                booleanClear = false;
                break;


        }
    }
}