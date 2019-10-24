package com.technicalkeeda.currencyconverter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public void btnClick(View view){
        EditText  DollerAmoutn=(EditText) findViewById(R.id.editText);
        String dollers= DollerAmoutn.getText().toString();
        boolean check=true;
        for(int i=0;i<dollers.length()-1;i++){
            if(dollers.charAt(i)!=46||dollers.charAt(i)!='0'||dollers.charAt(i)!='1'||dollers.charAt(i)!='2'||dollers.charAt(i)!='3'||dollers.charAt(i)!='4'||dollers.charAt(i)!='5'||dollers.charAt(i)!='6'||dollers.charAt(i)!='7'||dollers.charAt(i)!='8'||dollers.charAt(i)!='9'){
                Toast.makeText(this, "please enter valid input", Toast.LENGTH_SHORT).show();
                check =false;
                break;
            }
        }
        if(check) {
            double doubledollers = Double.parseDouble(dollers);
            double inr = (doubledollers * 71.5);
            String ans = Double.toString(inr);


            String toasttext = "value of " + dollers + " $ in INR" + " is " + ans + " Rupee";
            Toast.makeText(this, toasttext, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
