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

public class PoshActivity extends AppCompatActivity {
	
	private ScrollView vscroll2;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private LinearLayout linear58;
	private LinearLayout linear54;
	private LinearLayout linear53;
	private LinearLayout linear52;
	private LinearLayout linear60;
	private LinearLayout linear59;
	private LinearLayout linear61;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear62;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private Button butlisaratay;
	private ImageView imageview18;
	private Button button43;
	private ImageView imageview35;
	private ScrollView vscroll1;
	private Button button40;
	private ImageView imageview31;
	private Button button39;
	private ImageView imageview30;
	private Button button38;
	private ImageView imageview29;
	private Button button45;
	private ImageView imageview37;
	private Button leaping;
	private ImageView imageview36;
	private Button button27;
	private ImageView imageview38;
	private Button regeneration;
	private ImageView imageview19;
	private Button swiftnees;
	private ImageView imageview20;
	private Button fireresistance;
	private ImageView imageview21;
	private Button poison;
	private ImageView imageview22;
	private Button healing;
	private ImageView imageview23;
	private Button button46;
	private ImageView imageview24;
	private Button weknes;
	private ImageView imageview25;
	private Button strength;
	private ImageView imageview26;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.posh);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll2 = findViewById(R.id.vscroll2);
		linear40 = findViewById(R.id.linear40);
		linear41 = findViewById(R.id.linear41);
		linear58 = findViewById(R.id.linear58);
		linear54 = findViewById(R.id.linear54);
		linear53 = findViewById(R.id.linear53);
		linear52 = findViewById(R.id.linear52);
		linear60 = findViewById(R.id.linear60);
		linear59 = findViewById(R.id.linear59);
		linear61 = findViewById(R.id.linear61);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear62 = findViewById(R.id.linear62);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		butlisaratay = findViewById(R.id.butlisaratay);
		imageview18 = findViewById(R.id.imageview18);
		button43 = findViewById(R.id.button43);
		imageview35 = findViewById(R.id.imageview35);
		vscroll1 = findViewById(R.id.vscroll1);
		button40 = findViewById(R.id.button40);
		imageview31 = findViewById(R.id.imageview31);
		button39 = findViewById(R.id.button39);
		imageview30 = findViewById(R.id.imageview30);
		button38 = findViewById(R.id.button38);
		imageview29 = findViewById(R.id.imageview29);
		button45 = findViewById(R.id.button45);
		imageview37 = findViewById(R.id.imageview37);
		leaping = findViewById(R.id.leaping);
		imageview36 = findViewById(R.id.imageview36);
		button27 = findViewById(R.id.button27);
		imageview38 = findViewById(R.id.imageview38);
		regeneration = findViewById(R.id.regeneration);
		imageview19 = findViewById(R.id.imageview19);
		swiftnees = findViewById(R.id.swiftnees);
		imageview20 = findViewById(R.id.imageview20);
		fireresistance = findViewById(R.id.fireresistance);
		imageview21 = findViewById(R.id.imageview21);
		poison = findViewById(R.id.poison);
		imageview22 = findViewById(R.id.imageview22);
		healing = findViewById(R.id.healing);
		imageview23 = findViewById(R.id.imageview23);
		button46 = findViewById(R.id.button46);
		imageview24 = findViewById(R.id.imageview24);
		weknes = findViewById(R.id.weknes);
		imageview25 = findViewById(R.id.imageview25);
		strength = findViewById(R.id.strength);
		imageview26 = findViewById(R.id.imageview26);
		
		//OnTouch
		butlisaratay.setOnTouchListener(new View.OnTouchListener(){
				@Override
				public boolean onTouch(View v, MotionEvent event){
						int ev = event.getAction();
						switch (ev) {
								case MotionEvent.ACTION_DOWN:
								
								 
								
								break;
								case MotionEvent.ACTION_UP:
								
								 
								
								break;
						} return true;
				}
		});
		
		butlisaratay.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ButlysarataActivity.class);
					startActivity(i);
				}
				
			}
		});
		
		button43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SlowfallingActivity.class);
					startActivity(i);
				}
			}
		});
		
		button40.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), TurtlemasterActivity.class);
					startActivity(i);
				}
			}
		});
		
		button39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), InvisibilityActivity.class);
					startActivity(i);
				}
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), WaterbreathingActivity.class);
					startActivity(i);
				}
			}
		});
		
		button45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), HarmingActivity.class);
					startActivity(i);
				}
			}
		});
		
		leaping.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LeapingActivity.class);
					startActivity(i);
				}
			}
		});
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SlownessActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview38.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		regeneration.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), RegenerationActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview19.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		swiftnees.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SwiftneesActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview20.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		fireresistance.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FireresistanceActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview21.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		poison.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), PoisonActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview22.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		healing.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), HealingActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview23.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		button46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), NightvisionActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview24.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		weknes.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), WeaknessActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview25.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		strength.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), StrengthActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview26.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
	}
	
	private void initializeLogic() {
	}
	
}