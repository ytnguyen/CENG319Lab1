package assignment1.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class botActivity extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VRLifecycle", "The app is started");
        TextView theTextView = (TextView) findViewById(R.id.textView6);
        theTextView.setText("onStart excuted");
        Toast.makeText(botActivity.this,"VrOnStart", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("VRLifecycle", "The app is stoped");
        TextView theTextView = (TextView) findViewById(R.id.textView6);
        theTextView.setText("onStop executed");
        Toast.makeText(botActivity.this,"VrOnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VRLifecycle", "The app is destroyed");
        TextView theTextView = (TextView) findViewById(R.id.textView6);
        theTextView.setText("onDestroy executed");
        Toast.makeText(botActivity.this,"VrOnDestroy", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("VRLifecycle", "The app is created");
        setContentView(R.layout.activity_bot);
        TextView theTextView = (TextView) findViewById(R.id.textView5);
        theTextView.setText("onCreate excuted");
        Toast.makeText(botActivity.this,"VrOnCreate", Toast.LENGTH_SHORT).show();
    }
}