package com.something.chris.newcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    //region global vars
    CardView oneButton;
    CardView twoButton;
    CardView threeButton;
    CardView fourButton;
    CardView fiveButton;
    CardView sixButton;
    CardView sevenButton;
    CardView eightButton;
    CardView nineButton;
    CardView zeroButton;
    CardView decimalButton;
    CardView equalsButton;
    CardView plusButton;
    CardView minusButton;
    CardView multiplyButton;
    CardView divideButton;
    CardView backspaceButton;
    CardView allClearButton;
    CardView openParenButton;
    CardView closeParenButton;
    TextView resultTextView;
    TextView inputTextView;
    //endregion


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //region findviewbyid
        oneButton = (CardView) findViewById(R.id.oneButton);
        twoButton = (CardView) findViewById(R.id.twoButton);
        threeButton = (CardView) findViewById(R.id.threeButton);
        fourButton = (CardView) findViewById(R.id.fourButton);
        fiveButton = (CardView) findViewById(R.id.fiveButton);
        sixButton = (CardView) findViewById(R.id.sixButton);
        sevenButton = (CardView) findViewById(R.id.sevenButton);
        eightButton = (CardView) findViewById(R.id.eightButton);
        nineButton = (CardView) findViewById(R.id.nineButton);
        zeroButton = (CardView) findViewById(R.id.zeroButton);
        decimalButton = (CardView) findViewById(R.id.decimalButton);
        equalsButton = (CardView) findViewById(R.id.equalsButton);
        plusButton = (CardView) findViewById(R.id.plusButton);
        minusButton = (CardView) findViewById(R.id.minusButton);
        multiplyButton = (CardView) findViewById(R.id.multiplyButton);
        divideButton = (CardView) findViewById(R.id.divideButton);
        backspaceButton = (CardView) findViewById(R.id.backspaceButton);
        allClearButton = (CardView) findViewById(R.id.allClearButton);
        openParenButton = (CardView) findViewById(R.id.openParenthesisButton);
        closeParenButton = (CardView) findViewById(R.id.closeParenthesisButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        inputTextView = (TextView) findViewById(R.id.inputTextView);
        //endregion

        resultTextView.setText("");
        inputTextView.setText("");

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputTextView.getText().toString().length() == 0) {
                    inputTextView.setText(inputTextView.getText().toString() + "0.");
                } else {
                    inputTextView.setText(inputTextView.getText().toString() + ".");
                }
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "0");
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "1");
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "2");
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "3");
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "4");
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "5");
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "6");
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "7");
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "8");
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "9");
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "+");
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "-");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "x");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "/");
            }
        });
        openParenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + "(");
            }
        });
        closeParenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText(inputTextView.getText().toString() + ")");
            }
        });
        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputTextView.getText().toString().length() != 0) {
                    inputTextView.setText(inputTextView.getText().toString().substring(0, inputTextView.getText().toString().length() - 1));
                }
            }
        });
        allClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputTextView.setText("");
                resultTextView.setText("");
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //123+123
                String inputText = inputTextView.getText().toString();
                if (inputText.length() == 0 || "+-x/".indexOf(inputText.charAt(inputText.length() - 1)) != -1) { // if +-x/ is in last character, add 0 so it dont crash
                    inputText += "0";
                }
                String res = "";
                for (int i = 0; i < inputText.length(); i++) {

                    if (inputText.charAt(i) == '+') {
                        res += ",+,";
                    } else if (inputText.charAt(i) == '-') {
                        res += ",-,";
                    } else if (inputText.charAt(i) == '/') {
                        res += ",/,";
                    } else if (inputText.charAt(i) == 'x') {
                        res += ",x,";
                    } else if (inputText.charAt(i) == '(') {
                        if (res.length() == 0){
                            res += "(,";
                        }
                        else {
                            res += ",(,";
                        }
                    } else if (inputText.charAt(i) == ')') {
                        res += ",),";
                    } else {
                        res += inputText.charAt(i);
                    }
                }
                res += ",";
                try {
                    String postfix = infixToPostfix(res);
                    float result = evaluatePostfix(postfix);
                    resultTextView.setText(String.valueOf(result));
                    resultTextView.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_in));
                    inputTextView.setText("");
                } catch (Exception e) {
                    resultTextView.setText("error!");
                }

            }
        });
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static int getPrecedence(String c) {
        char ch = c.charAt(0);
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case 'x':
            case '/':
                return 2;
            case '(':
                return 0;
        }
        return -1;
    }

    public static String infixToPostfix(String expression) {
        Stack myStack = new Stack();
        String result = "";

        String[] splitted = expression.split(",");
        ArrayList<String> b = new ArrayList<>();
        for (String s : splitted){
            if (!s.equals("")){
                b.add(s);
            }
        }
        String[] a = new String[b.size()];
        for (int i =  0; i < b.size(); i++){
            a[i] = b.get(i);
        }


        for (int i = 0; i < a.length; i++) {
            if (isNumeric(a[i])) { // IS AN OPERAND
                result += a[i] + ",";
            } else if (a[i].equals("(")) {
                myStack.push(a[i]);
            } else if (a[i].equals(")")) {
                String topToken = (String) myStack.pop();
                while (!topToken.equals("(")) {
                    result += topToken + ",";
                    topToken = (String) myStack.pop();
                }
            } else { // an operator is encountered
                while (!myStack.isEmpty() && getPrecedence(a[i]) <= getPrecedence((String) myStack.peek()))
                    result += myStack.pop() + ",";
                myStack.push(a[i]);
            }
        }
        while (!myStack.empty()) {
            result += myStack.pop() + ",";
        }
        return result;
    }

    public static float evaluatePostfix(String expression) {
        Stack myStack = new Stack();

        String[] a = expression.split(",");


        for (int i = 0; i < a.length; i++) {
            if (isNumeric(a[i])) { // IS AN OPERAND

                myStack.push(a[i]);
            } else {

                float arg1 = Float.parseFloat(String.valueOf(myStack.pop()));
                float arg2 = Float.parseFloat(String.valueOf(myStack.pop()));

                if (a[i].equals("+")) {
                    myStack.push(arg2 + arg1);

                }
                if (a[i].equals("-")) {
                    myStack.push(arg2 - arg1);

                }
                if (a[i].equals("x")) {
                    myStack.push(arg2 * arg1);

                }
                if (a[i].equals("/")) {
                    myStack.push(arg2 / arg1);

                }

            }
        }
        float finalResult = Float.parseFloat(String.valueOf(myStack.pop()));
        return finalResult;
    }

}