package hcmute.edu.vn.tuyendt.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    Button btnAdd,btnSub,btnMultiply,btnDevide,btnDot,btnEqual,btnDel,btnC; // C: clear screen
    TextView mainScreen,secondScreen;

    String expression; 
    String operation; // store +,-,x,/

    boolean checkDot = false;
    boolean checkEqual = false; // true = pressed "=" , false = didnt press "="
    double num1,num2;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getBtn();

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText("");
                mainScreen.setText("");
                expression="";
                operation="";
                checkEqual = false;
                checkDot = false;
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "0");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    expression = mainScreen.getText().toString();
                    mainScreen.setText(expression + "9");
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual){
                    if( !checkDot)
                        expression = mainScreen.getText().toString();
                        mainScreen.setText(expression + ".");
                        checkDot = true;
                }
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( mainScreen.getText()  == ""){
                    num1 = 0;
                    secondScreen.setText("0 + ");
                }else {
                    num1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " + ");
                }
                mainScreen.setText("");
                expression="";
                operation="+";
                checkDot = false;
                checkEqual = false;
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( mainScreen.getText()  == ""){
                    num1 = 0;
                    secondScreen.setText("0 - ");
                }else {
                    num1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " - ");
                }
                mainScreen.setText("");
                expression="";
                operation="-";
                checkDot = false;
                checkEqual = false;
            }
        });
        btnDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( mainScreen.getText()  == ""){
                    num1 = 0;
                    secondScreen.setText("0 / ");
                }else {
                    num1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " / ");
                }
                mainScreen.setText("");
                expression="";
                operation="/";
                checkDot = false;
                checkEqual = false;
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( mainScreen.getText()  == ""){
                    num1 = 0;
                    secondScreen.setText("0 x ");
                }else {
                    num1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " x ");
                }
                mainScreen.setText("");
                expression="";
                operation="x";
                checkDot = false;
                checkEqual = false;
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( !checkEqual ){
                    checkDot = false;
                    expression = mainScreen.getText().toString();
                    num2 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(secondScreen.getText().toString() + mainScreen.getText().toString() + "");
                    mainScreen.setText("");
                    if(operation == "+"){
                        result = num1 + num2;
                    } else if (operation == "-") {
                        result = num1-num2;
                    } else if (operation == "/") {
                        result = num1/num2;
                    } else if (operation == "*") {
                        result = num1*num2;
                    }
                    checkEqual = true;
                    mainScreen.setText(result + "");
                }
                operation="";
                //checkDot = false;
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkEqual){
                    String val = mainScreen.getText().toString();
                    if(!val.isEmpty()){
                        val = val.substring(0,val.length() - 1);
                        mainScreen.setText(val);
                    }
                }
            }
        });

    }

    protected  void getBtn(){
        // number
        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        // operator
        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMultiply = findViewById(R.id.btn_multiply    );
        btnDevide = findViewById(R.id.btn_devide);
        btnDel = findViewById(R.id.btn_del);
        btnDot = findViewById(R.id.btn_dot);
        btnEqual = findViewById(R.id.btn_equal);
        btnC =findViewById(R.id.btn_off);
        // outputscreen
        mainScreen = findViewById(R.id.tv_mainscreen);
        secondScreen = findViewById(R.id.tv_subscreen);
    }
}

