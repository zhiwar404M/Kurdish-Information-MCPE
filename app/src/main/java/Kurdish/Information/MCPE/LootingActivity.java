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
import android.widget.ScrollView;
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

public class LootingActivity extends AppCompatActivity {
	
	private LinearLayout linear41;
	private ScrollView vscroll1;
	private LinearLayout linear39;
	private LinearLayout linear33;
	private TextView textview3;
	private LinearLayout linear34;
	private TextView textview5;
	private LinearLayout linear35;
	private TextView textview6;
	private LinearLayout linear40;
	private ImageView imageview25;
	private TextView textview2;
	private ImageView dr3;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.looting);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear41 = findViewById(R.id.linear41);
		vscroll1 = findViewById(R.id.vscroll1);
		linear39 = findViewById(R.id.linear39);
		linear33 = findViewById(R.id.linear33);
		textview3 = findViewById(R.id.textview3);
		linear34 = findViewById(R.id.linear34);
		textview5 = findViewById(R.id.textview5);
		linear35 = findViewById(R.id.linear35);
		textview6 = findViewById(R.id.textview6);
		linear40 = findViewById(R.id.linear40);
		imageview25 = findViewById(R.id.imageview25);
		textview2 = findViewById(R.id.textview2);
		dr3 = findViewById(R.id.dr3);
	}
	
	private void initializeLogic() {
	}
	
}