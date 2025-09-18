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
import android.widget.Button;
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

public class CurseofvanishingBindingActivity extends AppCompatActivity {
	
	private LinearLayout linear47;
	private LinearLayout linear22;
	private LinearLayout linear45;
	private LinearLayout linear44;
	private ImageView imageview14;
	private Button button23;
	private TextView textview6;
	private TextView textview7;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.curseofvanishing_binding);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear47 = findViewById(R.id.linear47);
		linear22 = findViewById(R.id.linear22);
		linear45 = findViewById(R.id.linear45);
		linear44 = findViewById(R.id.linear44);
		imageview14 = findViewById(R.id.imageview14);
		button23 = findViewById(R.id.button23);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
	}
	
	private void initializeLogic() {
	}
	
}