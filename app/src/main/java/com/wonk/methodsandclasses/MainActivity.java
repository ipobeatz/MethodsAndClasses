package com.wonk.methodsandclasses;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testMethod();


        System.out.println(math(3, 5));

        System.out.println(newMethod("harden"));
        username = "lebron";

        makeMusicians();

    }
    public void makeSimpsons() {
        Simpsons homer = new Simpsons("",4,"");
        homer.setAge(543);
        homer.getAge();
    }






    public void makeMusicians() {
        Musicians musicians = new Musicians("james", "guitar", 27);
        System.out.println("mcmc: " + musicians.name + musicians.instrument);
        musicians.name = "harden";
        //((TextView) findViewById(R.id.text_view)).setText(musicians.name);
    }



    public void testMethod() {

        int x = 4 + 4;
        System.out.println("value of x: " + x);
        username = "giannis";
    }

    public int math(int a, int b) {
        username = "paul";
        return a + b;
    }

    public String newMethod(String string) {

        return string + "newMethod";
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}