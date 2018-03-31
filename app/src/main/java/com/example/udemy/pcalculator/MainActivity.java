package com.example.udemy.pcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class MainActivity extends AppCompatActivity {
    int flag=0;
    public static String txt="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pcalculator);
        /*MaterialCalendarView calview=findViewById(R.id.calview);*/
        Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiple,divide,equals,clear;

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        equals=findViewById(R.id.equals);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.plus);
        divide=findViewById(R.id.divide);
        multiple=findViewById(R.id.multiple);
        clear=findViewById(R.id.clearbtn);
        final TextView uppertext,maintext;
        uppertext=findViewById(R.id.uppertext);
        maintext=findViewById(R.id.maintext);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uppertext.setText("");
                maintext.setText("");
                flag=0;
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"1");
                maintext.setText(txt + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"2");
                maintext.setText(txt + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"3");
                maintext.setText(txt + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"4");
                maintext.setText(txt + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"5");
                maintext.setText(txt + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"6");
                maintext.setText(txt + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"7");
                maintext.setText(txt + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"8");
                maintext.setText(txt + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"9");
                maintext.setText(txt + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                uppertext.setText(txt+"0");
                maintext.setText(txt + "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=uppertext.getText().toString();
                if(!txt.equals(""))
                    if(!txt.equals("")||flagfunction()) {

                        uppertext.setText(txt + "+");
                        maintext.setText(txt + "+");
                    }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=uppertext.getText().toString();
                if(!txt.equals(""))
                    if(!txt.equals("")||flagfunction()) {
                        uppertext.setText(txt + "-");
                        maintext.setText(txt + "-");
                    }
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=uppertext.getText().toString();
                if(!txt.equals(""))
                    if(!txt.equals("")||flagfunction()) {
                        uppertext.setText(txt + "*");
                        maintext.setText(txt + "*");
                    }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=uppertext.getText().toString();
                if(!txt.equals("")||flagfunction()) {
                    uppertext.setText(txt.concat("/") );
                    maintext.setText(txt.concat("/"));
                }
                }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt=uppertext.getText().toString();
                String[]a=new String[2];
                String operator="";
                int opcount=0;
                for(int i=0;i<txt.length();i++)
                {

                    char car=txt.charAt(i);
                    if((car=='+'||car=='-'||car=='*'||car=='/')&& (operator.equals("")))
                    {
                        operator=car+"";
                        opcount++;
                    }
                    else if((car=='+'||car=='-'||car=='*'||car=='/')&&!operator.equals(""))
                    {
                        Toast.makeText(getApplicationContext(),"Invalid operation,only two operand allowed"
                                ,Toast.LENGTH_LONG).show();
                        return;
                    }
                    else
                    {
                    if(a[opcount]==null)
                      a[opcount]=""+car;
                     else
                        a[opcount]=a[opcount]+car;
                    }
                }
                    if(a.length<=0||a.length>=3)
                        return;
                    int operand1 = Integer.parseInt(a[0]);
                    int operand2=1;
                    if(!(a[1]==(null)))
                        operand2 = Integer.parseInt(a[1]);
                    else {
                        Toast.makeText(getApplicationContext(), "Second operand is empty", Toast.LENGTH_LONG).show();
                    return;
                    }
                    switch (operator) {
                        case "+":
                            int plusfun = operand1 + operand2;
                            uppertext.setText(""+plusfun);
                            maintext.setText(""+plusfun);
                            break;
                        case "-":
                            int minusfun = operand1 - operand2;
                            uppertext.setText(""+minusfun);
                            maintext.setText(""+minusfun);
                            break;
                        case "*":
                            int multifun = operand1 * operand2;
                            uppertext.setText(""+multifun);
                            maintext.setText(""+multifun);
                            break;
                        case "/":
                            try {
                                int dividefun = operand1 / operand2;
                                uppertext.setText("" + dividefun);
                                maintext.setText("" + dividefun);
                            }
                            catch (ArithmeticException e)
                            {
                                Log.i("",""+e);
                            }
                            break;

                    }
                }

        });
}

    private boolean flagfunction() {
        if(flag==0 && txt!="")
        {
            flag=1;
            return true;
        }
        return false;
    }
}
