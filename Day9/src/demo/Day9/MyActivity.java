package demo.Day9;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    public static final String TAG="MyActivity";
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"开始");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"重新开始");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"继续");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"暂停");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"停止");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"销毁");
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
}
