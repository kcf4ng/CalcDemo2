package com.example.calcdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int n1=0;
    String op="";
    private View.OnClickListener btn1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("1");
            else
                lblNum.setText(lblNum.getText().toString()+"1");
        }
    };

    private View.OnClickListener btn2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("2");
            else
                lblNum.setText(lblNum.getText().toString()+"2");
        }
    };
    private View.OnClickListener btn3_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("3");
            else
                lblNum.setText(lblNum.getText().toString()+"3");
        }
    };
    private View.OnClickListener btn4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("4");
            else
                lblNum.setText(lblNum.getText().toString()+"4");
        }
    };
    private View.OnClickListener btn5_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("5");
            else
                lblNum.setText(lblNum.getText().toString()+"5");
        }
    };
    private View.OnClickListener btn6_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("6");
            else
                lblNum.setText(lblNum.getText().toString()+"6");
        }
    };
    private View.OnClickListener btn7_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("7");
            else
                lblNum.setText(lblNum.getText().toString()+"7");
        }
    };
    private View.OnClickListener btn8_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("8");
            else
                lblNum.setText(lblNum.getText().toString()+"8");
        }
    };
    private View.OnClickListener btn9_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("9");
            else
                lblNum.setText(lblNum.getText().toString()+"9");

        }
    };
    private View.OnClickListener btn0_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = Integer.parseInt(lblNum.getText().toString());
            if(i==0)
                lblNum.setText("0");
            else
                lblNum.setText(lblNum.getText().toString()+"0");
        }
    };
    private View.OnClickListener btnPlus_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblNum.getText().toString());
            op="+";
            lblNum.setText("0");

        }
    };

    private View.OnClickListener btnMin_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblNum.getText().toString());
            op="-";
            lblNum.setText("0");
        }
    };
    private View.OnClickListener btnMulti_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblNum.getText().toString());
            op="*";
            lblNum.setText("0");
        }
    };
    private View.OnClickListener btnDiv_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            n1 = Integer.parseInt(lblNum.getText().toString());
            op="/";
            lblNum.setText("0");
        }
    };

    private View.OnClickListener btnCalc_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int n2 = Integer.parseInt(lblNum.getText().toString());
            if("+".equals(op))
                lblNum.setText(String.valueOf(n1+n2));
            else if ("-".equals(op))
                lblNum.setText(String.valueOf(n1-n2));
            else if ("*".equals(op))
                lblNum.setText(String.valueOf(n1*n2));
            else if ("/".equals(op))
                lblNum.setText(String.valueOf(n1/n2));

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialComponent();
    }

    private void InitialComponent() {
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(btn1_click);
        lblNum = findViewById(R.id.lblNumber);
        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(btn2_click);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(btn3_click);
        btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(btn4_click);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(btn5_click);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(btn6_click);
        btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(btn7_click);
        btn8 =findViewById(R.id.btn8);
        btn8.setOnClickListener(btn8_click);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(btn9_click);
        btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(btn0_click);
        btnPlus= findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(btnPlus_click);
        btnCalc=findViewById(R.id.btnOk);
        btnCalc.setOnClickListener(btnCalc_click);
        btnMin = findViewById(R.id.btnMin);
        btnMin.setOnClickListener(btnMin_click);
        btnMulti= findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(btnMulti_click);
        btnDiv=findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(btnDiv_click);
    }


    TextView lblNum;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnPlus,btnCalc,btnMin,btnMulti,btnDiv;

}
