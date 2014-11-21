package com.example.sekhar.material;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MyActivity extends Activity {
    ImageView imgView;
    private Button mAnimateTick;
    private Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        imgView=(ImageView)findViewById(R.id.img);
        mAnimateTick=(Button)findViewById(R.id.animate_tick);
      drawable =imgView.getDrawable();
        mAnimateTick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            }
        });



        }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
