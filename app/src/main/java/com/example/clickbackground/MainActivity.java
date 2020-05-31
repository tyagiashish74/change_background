package com.example.clickbackground;

import androidx.appcompat.app.AppCompatActivity;
        import androidx.constraintlayout.widget.ConstraintLayout;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button aredbtn,abluebtn,aylwbtn;
    ConstraintLayout acl;
    RadioGroup arg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ConstraintLayout acl;
        acl = findViewById(R.id.cl);
        arg = findViewById(R.id.rg);
     /* abluebtn=findViewById(R.id.btnblue);
        aredbtn=findViewById(R.id.btnred);
        aylwbtn=findViewById(R.id.btnylw);*/
        arg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId==R.id.btnblue)
                    acl.setBackgroundColor(Color.BLUE);
                else if (checkedId==R.id.btnred)
                    acl.setBackgroundColor(Color.RED);
                else if (checkedId==R.id.btnylw)
                    acl.setBackgroundColor(Color.YELLOW);
            }
        });
    }
    // Method 1:
    /*for changing background do all changes in line = arg.setBackgroundColor(Color.BLUE):
     1.constraint layout = use acl in place of arg;
     2.radiogroup = use arg in place of arg;
     3.button background = use abluebtn,aredbtn,aylwbtn in place of arg;
     Do the above changes in below for changing background.
     */
    //Action of Method1.
    //This method is only done because oncall() method in xml file must(first check xml file )  be to set = allbutton in all radio button.
/*
    public void allbutton (View v){
      if (v.equals(abluebtn))
          arg.setBackgroundColor(Color.BLUE);
      if (v.equals(aredbtn))
          arg.setBackgroundColor(Color.RED);
      if (v.equals(aylwbtn))
          arg.setBackgroundColor(Color.YELLOW);
    }
*/

}

