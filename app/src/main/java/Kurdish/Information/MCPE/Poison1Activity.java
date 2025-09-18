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

public class Poison1Activity extends AppCompatActivity {
	
	private LinearLayout linear41;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview5;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private TextView textview4;
	private ImageView imageview7;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private TextView textview9;
	private ImageView imageview4;
	private TextView textview10;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.poison1);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear41 = findViewById(R.id.linear41);
		linear43 = findViewById(R.id.linear43);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		textview5 = findViewById(R.id.textview5);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		textview4 = findViewById(R.id.textview4);
		imageview7 = findViewById(R.id.imageview7);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		textview9 = findViewById(R.id.textview9);
		imageview4 = findViewById(R.id.imageview4);
		textview10 = findViewById(R.id.textview10);
	}
	
	private void initializeLogic() {
	}
	
}