package Kurdish.Information.MCPE;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class WelcomeBazarActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double num = 0;
	
	private LinearLayout linear3;
	private LinearLayout linear11;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear8;
	private ImageView imageview1;
	private TextView textview1;
	private ProgressBar progressbar1;
	
	private Intent i = new Intent();
	private TimerTask tm;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.welcome_bazar);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		linear11 = findViewById(R.id.linear11);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear8 = findViewById(R.id.linear8);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		progressbar1 = findViewById(R.id.progressbar1);
	}
	
	private void initializeLogic() {
		tm = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (true) {
							i.setClass(getApplicationContext(), BazarActivity.class);
							startActivity(i);
						}
					}
				});
			}
		};
		_timer.schedule(tm, (int)(2500));
	}
	
	@Override
	public void onBackPressed() {
		if (num < 100) {
			SketchwareUtil.showMessage(getApplicationContext(), "ببووڕە ناتوانی لەم بەشە بگەرێتە دواوەوە تکایە چاوەرێ بکە تا دەچێتە ناوەوە⌛");
		}
		else {
			finish();
		}
		num++;
	}
}