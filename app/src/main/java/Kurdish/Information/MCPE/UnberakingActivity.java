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

public class UnberakingActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear39;
	private LinearLayout linear33;
	private TextView textview3;
	private LinearLayout linear34;
	private TextView textview5;
	private LinearLayout linear35;
	private TextView textview6;
	private LinearLayout linear40;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private ImageView imageview25;
	private TextView textview2;
	private ImageView hilmat;
	private ImageView dr3;
	private ImageView bejama;
	private ImageView pelaw;
	private ImageView skip;
	private ImageView imageview27;
	private ImageView imageview28;
	private ImageView imageview29;
	private ImageView imageview30;
	private ImageView imageview31;
	private ImageView imageview32;
	private ImageView imageview33;
	private ImageView imageview34;
	private ImageView imageview35;
	private ImageView imageview36;
	private ImageView imageview47;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.unberaking);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear39 = findViewById(R.id.linear39);
		linear33 = findViewById(R.id.linear33);
		textview3 = findViewById(R.id.textview3);
		linear34 = findViewById(R.id.linear34);
		textview5 = findViewById(R.id.textview5);
		linear35 = findViewById(R.id.linear35);
		textview6 = findViewById(R.id.textview6);
		linear40 = findViewById(R.id.linear40);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		imageview25 = findViewById(R.id.imageview25);
		textview2 = findViewById(R.id.textview2);
		hilmat = findViewById(R.id.hilmat);
		dr3 = findViewById(R.id.dr3);
		bejama = findViewById(R.id.bejama);
		pelaw = findViewById(R.id.pelaw);
		skip = findViewById(R.id.skip);
		imageview27 = findViewById(R.id.imageview27);
		imageview28 = findViewById(R.id.imageview28);
		imageview29 = findViewById(R.id.imageview29);
		imageview30 = findViewById(R.id.imageview30);
		imageview31 = findViewById(R.id.imageview31);
		imageview32 = findViewById(R.id.imageview32);
		imageview33 = findViewById(R.id.imageview33);
		imageview34 = findViewById(R.id.imageview34);
		imageview35 = findViewById(R.id.imageview35);
		imageview36 = findViewById(R.id.imageview36);
		imageview47 = findViewById(R.id.imageview47);
	}
	
	private void initializeLogic() {
	}
	
}