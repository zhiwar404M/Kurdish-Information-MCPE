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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
import java.util.regex.*;
import org.json.*;

public class TurtlemasterActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear43;
	private LinearLayout linear67;
	private LinearLayout linear68;
	private ImageView imageview34;
	private LinearLayout linear50;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private ImageView imageview35;
	private LinearLayout linear62;
	private LinearLayout linear63;
	private LinearLayout linear64;
	private ImageView imageview33;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private LinearLayout linear58;
	private Button button27;
	private ImageView imageview45;
	private ImageView imageview18;
	private TextView textview6;
	private Button button31;
	private ImageView imageview24;
	private Button button32;
	private ImageView imageview22;
	private Button button33;
	private ImageView imageview23;
	private Button button38;
	private ImageView imageview29;
	private Button button39;
	private ImageView imageview30;
	private Button button40;
	private ImageView imageview31;
	private Button button34;
	private ImageView imageview25;
	private Button button35;
	private ImageView imageview26;
	private Button button36;
	private ImageView imageview27;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.turtlemaster);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear43 = findViewById(R.id.linear43);
		linear67 = findViewById(R.id.linear67);
		linear68 = findViewById(R.id.linear68);
		imageview34 = findViewById(R.id.imageview34);
		linear50 = findViewById(R.id.linear50);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		imageview35 = findViewById(R.id.imageview35);
		linear62 = findViewById(R.id.linear62);
		linear63 = findViewById(R.id.linear63);
		linear64 = findViewById(R.id.linear64);
		imageview33 = findViewById(R.id.imageview33);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		linear58 = findViewById(R.id.linear58);
		button27 = findViewById(R.id.button27);
		imageview45 = findViewById(R.id.imageview45);
		imageview18 = findViewById(R.id.imageview18);
		textview6 = findViewById(R.id.textview6);
		button31 = findViewById(R.id.button31);
		imageview24 = findViewById(R.id.imageview24);
		button32 = findViewById(R.id.button32);
		imageview22 = findViewById(R.id.imageview22);
		button33 = findViewById(R.id.button33);
		imageview23 = findViewById(R.id.imageview23);
		button38 = findViewById(R.id.button38);
		imageview29 = findViewById(R.id.imageview29);
		button39 = findViewById(R.id.button39);
		imageview30 = findViewById(R.id.imageview30);
		button40 = findViewById(R.id.button40);
		imageview31 = findViewById(R.id.imageview31);
		button34 = findViewById(R.id.button34);
		imageview25 = findViewById(R.id.imageview25);
		button35 = findViewById(R.id.button35);
		imageview26 = findViewById(R.id.imageview26);
		button36 = findViewById(R.id.button36);
		imageview27 = findViewById(R.id.imageview27);
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), TurtleMaster1Activity.class);
					startActivity(i);
				}
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), TurtleMaster2Activity.class);
					startActivity(i);
				}
			}
		});
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), TurtleMaster3Activity.class);
					startActivity(i);
				}
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SplashTurtleActivity.class);
					startActivity(i);
				}
			}
		});
		
		button39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SplashTurtle2Activity.class);
					startActivity(i);
				}
			}
		});
		
		button40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SplashTurtle3Activity.class);
					startActivity(i);
				}
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LingeringTurtleActivity.class);
					startActivity(i);
				}
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LingeringTurtle2Activity.class);
					startActivity(i);
				}
			}
		});
		
		button36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LingeringTurtle3Activity.class);
					startActivity(i);
				}
			}
		});
	}
	
	private void initializeLogic() {
	}
	
}