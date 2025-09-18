startActivity(new Intent(this, Object.class));package Kurdish.Information.MCPE;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.media.MediaPlayer;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double loading = 0;
	private String texta = "";
	
	private ArrayList<String> text = new ArrayList<>();
	
	private LinearLayout linear3;
	private TextView textview1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private ImageView imageview1;
	private HorizontalScrollView hscroll1;
	
	private AlertDialog.Builder dialog;
	private Intent i = new Intent();
	private TimerTask tm;
	private MediaPlayer mdp;
	private AlertDialog.Builder d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		textview1 = findViewById(R.id.textview1);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		imageview1 = findViewById(R.id.imageview1);
		hscroll1 = findViewById(R.id.hscroll1);
		dialog = new AlertDialog.Builder(this);
		d = new AlertDialog.Builder(this);
		
		linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		tm = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (true) {
							i.setClass(getApplicationContext(), EnchantActivity.class);
							startActivity(i);
						}
					}
				});
			}
		};
		_timer.schedule(tm, (int)(2500));
	}
	
	public void _textview(final TextView _text, final String _string) {
		if (_text.getText().toString().toLowerCase().contains(_string.toLowerCase())) {
			_text.setVisibility(View.VISIBLE);
		}
		else {
			_text.setVisibility(View.GONE);
		}
	}
	
}
