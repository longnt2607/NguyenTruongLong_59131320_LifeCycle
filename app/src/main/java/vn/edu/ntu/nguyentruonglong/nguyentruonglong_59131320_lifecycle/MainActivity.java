package vn.edu.ntu.nguyentruonglong.nguyentruonglong_59131320_lifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate called");

        Toast.makeText(getApplicationContext(), "onCreate called", Toast.LENGTH_SHORT).show();

        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spDF = new SimpleDateFormat("HH:mm:ss");
        String strDate = spDF.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart called");
        Toast.makeText(getApplicationContext(), "onStart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume called");
        Toast.makeText(getApplicationContext(), "onResume called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart called");
        Toast.makeText(getApplicationContext(), "onRestart called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause called");
        Toast.makeText(getApplicationContext(), "onPause called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
        Toast.makeText(getApplicationContext(), "onStop called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy called", Toast.LENGTH_SHORT).show();
    }
}
