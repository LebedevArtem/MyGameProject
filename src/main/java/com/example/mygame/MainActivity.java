package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
TextView a;
Resources res;
Button math2;
Bitmap bitmap;
Image geroy;
String s;
Button button;
Button button3;
Button button4;
Button buttonleft;
Button button5;
Button button2;
Button exitBut;
Button exitBt5;
Button var3;
Button exitBut3;
Button buttona;
Button lie;
Button but;
Button var3a;
Button button7;
Toast toast;
Button exit;
Button button6;
Button math1;
 Button agree;
Button Exitbutton;
Button leftbut2;
Button buttonlose;
Button math;
Button buttonleft3;
Button rightbut;
Button buttonlie;
Button ExitBut;
Button buttonlie2;
Button meet;
Button rightbut2;
    Button exitBut4;
    Button rightbut3;
    Button var2;
    Button var3b;
int progess;
Button agree2;
Button leftbut4;
EditText editText2;
Button rightbut4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        but=findViewById ( R.id.confirm );
        agree=findViewById ( R.id.confirm3 );
        agree2=findViewById ( R.id.confirm4 );
        editText=findViewById ( R.id.edittext );
        math=findViewById ( R.id.butmath );
        leftbut2=findViewById ( R.id.butleft2 );
        a=findViewById ( R.id.firsttext );
        leftbut4=findViewById ( R.id.butleft4 );
        rightbut4=findViewById ( R.id.rightbut4 );
        rightbut3=findViewById ( R.id.rightbut3 );
        exitBut=findViewById ( R.id.exitButto );
        math1=findViewById ( R.id.confirm2 );
        math2=findViewById ( R.id.butmath1 );
        rightbut2=findViewById ( R.id.rightbut2 );
        lie=findViewById ( R.id.rightbut );
        editText2=findViewById ( R.id.edittext2 );
        var3a=findViewById ( R.id.variable3a );
        button=findViewById ( R.id.firstbutto );
        buttonleft3=findViewById ( R.id.butleft3 );
        exit=findViewById ( R.id.escape );
        rightbut=findViewById ( R.id.rightbut1 );
        buttonleft=findViewById ( R.id.butleft1 );
        var3b=findViewById ( R.id.variable3b );
        buttonlie2=findViewById ( R.id.rightlie2 );
        button3=findViewById ( R.id.exotBut2 );
        button2=findViewById ( R.id.but2 );
        meet=findViewById ( R.id.butleft );
        exitBt5=findViewById ( R.id.exitBut6 );
        buttonlose=findViewById ( R.id.but9 );
       var2=findViewById ( R.id.variable2 );
       var3=findViewById ( R.id.variable3 );
        button4=findViewById ( R.id.but3 );
        button5=findViewById ( R.id.but4 );
        exitBut3=findViewById ( R.id.exitBut3 );
        exitBut4=findViewById ( R.id.exitBut4 );
        button7=findViewById ( R.id.but7 );
        buttona=findViewById ( R.id.but8 );
        ExitBut=findViewById ( R.id.end );
        button6=findViewById ( R.id.but5 );
        Exitbutton=findViewById ( R.id.exitBut5 );
    }
    public void Start(View view){

        s="Вам нужна эта работа," +
                " у вас заканчиваются последние деньги.";
    a.setText ( s );
    button.setVisibility ( View.GONE );
    exitBut.setVisibility ( View.GONE );
    button2.setVisibility ( View.VISIBLE);
    button3.setVisibility ( View.VISIBLE);}
    public void meet(View view){
    button.setVisibility ( View.GONE );
    s="На собеседование пришло много людей, " +
            "вы слышали из толпы, что все идут на должность программиста, как и вы ";
    a.setText ( s );
    button4.setVisibility ( View.VISIBLE );
    exitBut3.setVisibility ( View .VISIBLE);
        button2.setVisibility ( View.GONE);
        button3.setVisibility ( View.GONE);}
        public void aftermeet(View view){
    s="Вышел человек из комнаты собеседований, который назвал вашу фамилию";
a.setText ( s );
    button4.setVisibility ( View.GONE );
    exitBut3.setVisibility ( View.GONE );
    button5.setVisibility ( View.VISIBLE );
    exitBut4.setVisibility ( View.VISIBLE );
    }
  public void aftermeet1(View view){
    s="Оказалось, что пригласили не вас, а вашего однофамильца";
a.setText ( s );
button5.setVisibility ( View.GONE );
exitBut4.setVisibility ( View.GONE );
button6.setVisibility ( View.VISIBLE );
Exitbutton.setVisibility ( View.VISIBLE );
    }
    public void aftermeet2(View view){
        s="Вы узнали интересную информацию о собеседовании";
        a.setText ( s );
        button6.setVisibility ( View.GONE );
        Exitbutton.setVisibility ( View.GONE );
        button7.setVisibility ( View.VISIBLE );
        var2.setVisibility ( View.VISIBLE );

    }
    public void aftermeet2a(View view){
        s="Вы решаете подслушать разговор ";
        a.setText ( s );
        button6.setVisibility ( View.GONE );
        Exitbutton.setVisibility ( View.GONE );
        buttona.setVisibility ( View.VISIBLE );
buttonlose.setVisibility ( View.VISIBLE );
    }
    public void aftermeet3b(View view){
        s="Вы частично узнали, что будет на собеседовании," +
                " но не успели подготовить ответы на " +
                "частые вопросы с собеседования, вас приглашают на собеседование";
        a.setText ( s );
        var2.setVisibility ( View.GONE);
        buttona.setVisibility ( View.GONE );
        exit.setVisibility ( View.VISIBLE );
        var3b.setVisibility ( View.VISIBLE );
    }
    public void aftermeet3(View view){
        s="Узнав, что будет на собеседовании, " +
                "вы успеваете подготовить ответы на частые вопросы с собеседования, " +
                "вас приглашают на собеседование  ";

            a.setText ( s );
button7.setVisibility ( View.GONE );
    var2.setVisibility ( View.GONE );
    var3.setVisibility ( View.VISIBLE );
    exit.setVisibility ( View.VISIBLE );
    }
    public void aftermeet3a(View view){
        s="Вы частично узнали, что будет на собеседовании," +
                " но не успели подготовить ответы на " +
                "частые вопросы с собеседования, вас приглашают на собеседование";
        a.setText ( s );
        buttonlose.setVisibility ( View.GONE);
        buttona.setVisibility ( View.GONE );
        var3a.setVisibility ( View.VISIBLE );
       exit.setVisibility ( View.VISIBLE );
    }
    public void aftermeet4(View view){

        s="Вы успешно рассказали вступительную речь, после чего вас спрашивают о ваших языках программирования";
        a.setText ( s );
     var3.setVisibility ( View.GONE );
     exit.setVisibility ( View.GONE );
     meet.setVisibility ( View.VISIBLE );
     lie.setVisibility ( View.VISIBLE );
    }
    public void aftermeet4a(View view){
        a.setText ( "Вы плохо рассказали вступительную речь, после чего вас спрашивают о ваших языках программирования " );

        var3a.setVisibility ( View.GONE );
 exit.setVisibility ( View.GONE );
 buttonleft.setVisibility ( View.VISIBLE );
 rightbut.setVisibility ( View.VISIBLE );
    }
    public void aftermeet4b(View view){
        a.setText ( "Вы с трудом рассказали вступительную речь, " +
                "после чего вас спрашивают о ваших языках программирования " );
    exit.setVisibility ( View.GONE );
    var3b.setVisibility ( View.GONE );
    leftbut2.setVisibility ( View.VISIBLE );
    rightbut2.setVisibility ( View.VISIBLE );
    }
    public void aftermeet5(View view){
        a.setText ( "После демонстрирования навыков программирования вам говорят," +
                " что компании нужны только грамотные рабочие," +
                "вам предлагают написать текст " );
        meet.setVisibility ( View.GONE );
        lie.setVisibility ( View.GONE );
        rightbut3.setVisibility ( View.VISIBLE );
        buttonleft3.setVisibility ( View.VISIBLE );
    }
    public void aftermeet5a(View view){
        a.setText ( "После демонстрирования навыков программирования вам говорят," +
                " что компании нужны только грамотные рабочие," +
                "вам предлагают написать текст " );
        buttonleft.setVisibility ( View.GONE );
        rightbut.setVisibility ( View.GONE );
        rightbut4.setVisibility ( View.VISIBLE );
        leftbut4.setVisibility ( View.VISIBLE );
    }
    public void aftermeet5b(View view){
        rightbut2.setVisibility ( View.GONE );
        leftbut2.setVisibility ( View.GONE );
        rightbut4.setVisibility ( View.VISIBLE );
        leftbut4.setVisibility ( View.VISIBLE );
    }
    public void aftermeet6(View view){
        a.setVisibility ( View.GONE );
        buttonleft3.setVisibility ( View.GONE );
        rightbut4.setVisibility ( View.GONE );
        editText.setVisibility ( View.VISIBLE);
        editText.setText ( "Я х_чу п_лучить эту должность" );
        but.setVisibility ( View.VISIBLE );
    }
    public void aftermeet6a(View view){
        a.setVisibility ( View.GONE );
        rightbut4.setVisibility ( View.GONE );
        leftbut4.setVisibility ( View.GONE );
        editText.setVisibility ( View.VISIBLE );
        editText.setText ( "Я бы пре_почёл должность прогр_ммиста любой другой " );
        agree.setVisibility ( View.VISIBLE );

    }
    public void aftermeet7(View view){
     editText.setVisibility ( View.GONE );
        a.setVisibility ( View.VISIBLE );

        if ("Я хочу получить эту должность".equals ( editText.getText ().toString () )) {
            a.setText ( "Хорошо, вы достаточно граммотны, как насчет обычных знаний математики?" );
        but.setVisibility ( View.GONE );
        math.setVisibility ( View.VISIBLE );
        }
        else {
            a.setText ( "Вы не прошли собеседование, компания нашла другого на должность программиста" );
            agree.setVisibility ( View.GONE );
            a.setVisibility ( View.VISIBLE );
            ExitBut.setVisibility ( View.VISIBLE );
        }
    }
    public void aftermeet7a(View view){
        editText.setVisibility ( View.GONE );
        a.setVisibility ( View.VISIBLE );

        if ("Я бы предпочёл должность программиста любой другой ".equals ( editText.getText () .toString ())) {
            a.setText ( "Хорошо, вы достаточно граммотны, как насчет обычных знаний математики?" );
            agree.setVisibility ( View.GONE );
            math2.setVisibility ( View.VISIBLE );

    }
        else
        a.setText ( "Вы не прошли собеседование, компания нашла другого на должность программиста" );
        agree.setVisibility ( View.GONE );
        a.setVisibility ( View.VISIBLE );
        editText.setVisibility ( View.GONE );
        ExitBut.setVisibility ( View.VISIBLE );
    }
    public void math(View view){
        a.setVisibility ( View.GONE );
        editText2.setText ( "12*7=?" );
        editText2.setVisibility ( View.VISIBLE );
        math1.setVisibility ( View.VISIBLE );
    }
    public void math2(View view){
        a.setVisibility ( View.GONE );
        editText2.setText ( "23*12=?" );
        editText2.setVisibility ( View.VISIBLE );
        agree2.setVisibility ( View.VISIBLE );

    }
    public void aftermath(View view){
        if (editText2.getText ().toString ().equals ( "12*7=84" )){
        a.setText ( "Вы прошли собеседование и получили работу" );
        rightbut3.setVisibility ( View.GONE );
        var2.setVisibility ( View.GONE );
            leftbut4.setVisibility ( View.GONE );
            buttonleft3.setVisibility ( View.GONE );
        editText2.setVisibility ( View.GONE );
        button7.setVisibility ( View.GONE );
        math1.setVisibility ( View.GONE );
        a.setVisibility ( View.VISIBLE );
        math.setVisibility ( View.GONE );}
        else {
            a.setText ( "Вы не прошли собеседование, компания нашла другого на должность программиста" );
          math1.setVisibility ( View.GONE );
            button.setVisibility ( View.VISIBLE );
            a.setVisibility ( View.VISIBLE );

        }
        editText2.setVisibility ( View.GONE );
        math1.setVisibility (View.GONE );
    }
    public void aftermath1(View view){
        leftbut4.setVisibility ( View.GONE );
        if (editText2.getText ().toString ().equals ( "23*12=276" )){
            a.setText ( "Вы прошли собеседование и получили работу" );
            rightbut3.setVisibility ( View.GONE );
            var2.setVisibility ( View.GONE );
            leftbut4.setVisibility ( View.GONE );
            math2.setVisibility ( View.GONE );
            buttonleft3.setVisibility ( View.GONE );
            agree2.setVisibility ( View.GONE );
            editText2.setVisibility ( View.GONE );
            button7.setVisibility ( View.GONE );
            math1.setVisibility ( View.GONE );
            a.setVisibility ( View.VISIBLE );
            math.setVisibility ( View.GONE );}
        else {
            a.setText ( "Вы не прошли собеседование, компания нашла другого на должность программиста" );
            a.setVisibility ( View.VISIBLE );
        agree2.setVisibility ( View.GONE );
        editText2.setVisibility ( View.GONE );
        button.setVisibility ( View.VISIBLE );
        }
    }
    public void Exit(View view){
        a.setText ( "Вы не прошли собеседование, компания нашла другого на должность программиста" );
      a.setVisibility ( View.VISIBLE );
     button.setVisibility ( View.VISIBLE );
     ExitBut.setVisibility ( View.VISIBLE );
    }
    public void lie(View view){
    a.setText ( "Вам говорят показать навыки программирования на этом языке" );
buttonlie.setVisibility ( View.VISIBLE );
buttonlie2.setVisibility ( View.VISIBLE );
lie.setVisibility ( View.GONE );
meet.setVisibility ( View.GONE );
    }
public void exitgame(View view){
        System.exit ( 1 );
}
}


