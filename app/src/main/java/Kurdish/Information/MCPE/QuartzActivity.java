package Kurdish.Information.MCPE;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
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
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class QuartzActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear39;
	private LinearLayout linear33;
	private TextView textview6;
	private TextView textview3;
	private LinearLayout linear34;
	private TextView textview5;
	private ImageView imageview25;
	private TextView textview2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.quartz);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear39 = findViewById(R.id.linear39);
		linear33 = findViewById(R.id.linear33);
		textview6 = findViewById(R.id.textview6);
		textview3 = findViewById(R.id.textview3);
		linear34 = findViewById(R.id.linear34);
		textview5 = findViewById(R.id.textview5);
		imageview25 = findViewById(R.id.imageview25);
		textview2 = findViewById(R.id.textview2);
	}
	
	private void initializeLogic() {
	}
	
}