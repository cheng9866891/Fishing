package a.cheng.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","增加日志打印");
        Log.i("MainActivity","修改日志打印");
        Log.i("MainActivity","修改日志打印2");
        Log.i("MainActivity","修改日志打印3");
        Log.i("MainActivity","修改日志打印4");
        Log.i("MainActivity","修改日志打印5");
        Log.i("MainActivity","修改日志打印6");
        Log.i("MainActiivty","--fixup");
    }
}
