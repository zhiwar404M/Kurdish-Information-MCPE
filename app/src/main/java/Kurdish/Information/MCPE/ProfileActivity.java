package Kurdish.Information.MCPE;

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

public class ProfileActivity extends AppCompatActivity {
	
	private LinearLayout linear3;
	private ScrollView vscroll3;
	private Button button30;
	private LinearLayout linear8;
	private TextView textview4;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private ImageView imageview9;
	private Button button28;
	private ImageView imageview10;
	private Button button29;
	
	private Intent i = new Intent();
	private AlertDialog.Builder d;
	private Intent youtube_facbook_url = new Intent();
	private MediaPlayer h;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.profile);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		vscroll3 = findViewById(R.id.vscroll3);
		button30 = findViewById(R.id.button30);
		linear8 = findViewById(R.id.linear8);
		textview4 = findViewById(R.id.textview4);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear12 = findViewById(R.id.linear12);
		linear11 = findViewById(R.id.linear11);
		imageview9 = findViewById(R.id.imageview9);
		button28 = findViewById(R.id.button28);
		imageview10 = findViewById(R.id.imageview10);
		button29 = findViewById(R.id.button29);
		d = new AlertDialog.Builder(this);
		
		button30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				h.start();
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube_facbook_url.setAction(Intent.ACTION_VIEW);
				youtube_facbook_url.setData(Uri.parse("https://youtube.com/@zhiwarxyt?si=FbthVi7j3X2SokH7"));
				startActivity(youtube_facbook_url);
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				youtube_facbook_url.setAction(Intent.ACTION_VIEW);
				youtube_facbook_url.setData(Uri.parse("https://www.facebook.com/scripthack.pubg?mibextid=ZbWKwL"));
				startActivity(youtube_facbook_url);
			}
		});
	}
	
	private void initializeLogic() {
	}
	
}