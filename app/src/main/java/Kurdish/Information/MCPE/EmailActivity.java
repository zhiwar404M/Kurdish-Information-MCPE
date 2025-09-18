package Kurdish.Information.MCPE;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class EmailActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear40;
	private ScrollView vscroll1;
	private LinearLayout linear39;
	private LinearLayout linear42;
	private TextView textview8;
	private EditText edittext1;
	private Button button29;
	private LinearLayout linear43;
	
	private AlertDialog.Builder go;
	private Intent i = new Intent();
	private MediaPlayer mdp;
	private TimerTask tm;
	private SharedPreferences helpp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.email);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear40 = findViewById(R.id.linear40);
		vscroll1 = findViewById(R.id.vscroll1);
		linear39 = findViewById(R.id.linear39);
		linear42 = findViewById(R.id.linear42);
		textview8 = findViewById(R.id.textview8);
		edittext1 = findViewById(R.id.edittext1);
		button29 = findViewById(R.id.button29);
		linear43 = findViewById(R.id.linear43);
		go = new AlertDialog.Builder(this);
		helpp = getSharedPreferences("help", Activity.MODE_PRIVATE);
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent intent = new Intent(Intent.ACTION_SENDTO); intent.setData(Uri.parse("mailto:")); intent.putExtra(Intent.EXTRA_EMAIL , new String[] { "zhiwarup@gmail.com" }); intent.putExtra(Intent.EXTRA_SUBJECT, edittext1.getText().toString()); startActivity(Intent.createChooser(intent, "Email via..."));
			}
		});
	}
	
	private void initializeLogic() {
	}
	
}