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
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class EnchantActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private String _reward_ad_unit_id;
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private double ii = 0;
	private String endstr = "";
	private String url = "";
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private ImageView imageview48;
	private LinearLayout linear2;
	private ImageView imageview43;
	private LinearLayout linear68;
	private ImageView imageview45;
	private LinearLayout linear71;
	private ImageView imageview46;
	private LinearLayout linear72;
	private ImageView imageview47;
	private LinearLayout liner;
	private LinearLayout linear39;
	private LinearLayout linear33;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private LinearLayout linear30;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear27;
	private LinearLayout linear26;
	private LinearLayout linear12;
	private LinearLayout linear10;
	private LinearLayout linear9;
	private LinearLayout linear25;
	private LinearLayout linear24;
	private LinearLayout linear23;
	private LinearLayout linear34;
	private LinearLayout linear22;
	private LinearLayout linear18;
	private LinearLayout linear17;
	private LinearLayout linear16;
	private LinearLayout linear38;
	private LinearLayout linear15;
	private LinearLayout linear45;
	private LinearLayout linear44;
	private LinearLayout linear43;
	private LinearLayout linear42;
	private LinearLayout linear41;
	private LinearLayout linear40;
	private LinearLayout linear63;
	private LinearLayout linear62;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear70;
	private LinearLayout linear61;
	private LinearLayout linear67;
	private ImageView imageview42;
	private Button impaling;
	private ImageView imageview41;
	private Button power;
	private ImageView imageview40;
	private Button furtune;
	private ImageView imageview39;
	private Button unbearking;
	private ImageView imageview38;
	private Button sliktouch;
	private ImageView imageview37;
	private Button looting;
	private ImageView imageview36;
	private Button efficiency;
	private ImageView imageview34;
	private Button Aspect;
	private ImageView imageview33;
	private Button knock;
	private ImageView imageview32;
	private Button fether;
	private ImageView imageview31;
	private Button Fire_Protection;
	private ImageView imageview30;
	private Button Protection;
	private ImageView imageview29;
	private Button BaneOfArthropods;
	private ImageView imageview28;
	private Button Smite;
	private ImageView imageview27;
	private Button Sharpness;
	private ImageView imageview26;
	private Button Punch;
	private ImageView imageview25;
	private Button AquaAffinity;
	private ImageView imageview24;
	private Button Depth;
	private ImageView imageview23;
	private Button Respiration;
	private ImageView imageview22;
	private Button Thorns;
	private ImageView imageview21;
	private Button Projectile;
	private ImageView imageview20;
	private Button BlastProtection;
	private ImageView imageview19;
	private Button Flame;
	private ImageView imageview18;
	private Button Infinity;
	private ImageView imageview17;
	private Button Luck_Of_Sea;
	private ImageView imageview16;
	private Button Lure;
	private ImageView imageview15;
	private Button FrostWalker;
	private ImageView imageview14;
	private Button Mending;
	private ImageView imageview13;
	private Button Multi;
	private ImageView imageview12;
	private Button Quick;
	private ImageView imageview11;
	private Button Channeling;
	private ImageView imageview10;
	private Button Riptide;
	private ImageView imageview9;
	private Button Loyalty;
	private ImageView imageview8;
	private Button Piercing;
	private ImageView imageview7;
	private Button Speed;
	private ImageView imageview6;
	private Button Curse_Of_Vanishing_binding;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear16;
	private LinearLayout _drawer_linear19;
	private LinearLayout _drawer_linear15;
	private LinearLayout _drawer_linear17;
	private ImageView _drawer_imageview8;
	private ImageView _drawer_imageview7;
	private Button _drawer_button29;
	private ImageView _drawer_imageview9;
	private Button _drawer_button30;
	private ImageView _drawer_imageview10;
	private Button _drawer_button31;
	
	private Intent i = new Intent();
	private TimerTask tm;
	private RewardedAd ads;
	private OnUserEarnedRewardListener _ads_on_user_earned_reward_listener;
	private RewardedAdLoadCallback _ads_rewarded_ad_load_callback;
	private FullScreenContentCallback _ads_full_screen_content_callback;
	
	private OnCompleteListener firebasecloud_onCompleteListener;
	private AlertDialog.Builder dialog;
	private Intent youtube = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.enchant);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(EnchantActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		imageview48 = findViewById(R.id.imageview48);
		linear2 = findViewById(R.id.linear2);
		imageview43 = findViewById(R.id.imageview43);
		linear68 = findViewById(R.id.linear68);
		imageview45 = findViewById(R.id.imageview45);
		linear71 = findViewById(R.id.linear71);
		imageview46 = findViewById(R.id.imageview46);
		linear72 = findViewById(R.id.linear72);
		imageview47 = findViewById(R.id.imageview47);
		liner = findViewById(R.id.liner);
		linear39 = findViewById(R.id.linear39);
		linear33 = findViewById(R.id.linear33);
		linear32 = findViewById(R.id.linear32);
		linear31 = findViewById(R.id.linear31);
		linear30 = findViewById(R.id.linear30);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		linear27 = findViewById(R.id.linear27);
		linear26 = findViewById(R.id.linear26);
		linear12 = findViewById(R.id.linear12);
		linear10 = findViewById(R.id.linear10);
		linear9 = findViewById(R.id.linear9);
		linear25 = findViewById(R.id.linear25);
		linear24 = findViewById(R.id.linear24);
		linear23 = findViewById(R.id.linear23);
		linear34 = findViewById(R.id.linear34);
		linear22 = findViewById(R.id.linear22);
		linear18 = findViewById(R.id.linear18);
		linear17 = findViewById(R.id.linear17);
		linear16 = findViewById(R.id.linear16);
		linear38 = findViewById(R.id.linear38);
		linear15 = findViewById(R.id.linear15);
		linear45 = findViewById(R.id.linear45);
		linear44 = findViewById(R.id.linear44);
		linear43 = findViewById(R.id.linear43);
		linear42 = findViewById(R.id.linear42);
		linear41 = findViewById(R.id.linear41);
		linear40 = findViewById(R.id.linear40);
		linear63 = findViewById(R.id.linear63);
		linear62 = findViewById(R.id.linear62);
		linear64 = findViewById(R.id.linear64);
		linear65 = findViewById(R.id.linear65);
		linear66 = findViewById(R.id.linear66);
		linear70 = findViewById(R.id.linear70);
		linear61 = findViewById(R.id.linear61);
		linear67 = findViewById(R.id.linear67);
		imageview42 = findViewById(R.id.imageview42);
		impaling = findViewById(R.id.impaling);
		imageview41 = findViewById(R.id.imageview41);
		power = findViewById(R.id.power);
		imageview40 = findViewById(R.id.imageview40);
		furtune = findViewById(R.id.furtune);
		imageview39 = findViewById(R.id.imageview39);
		unbearking = findViewById(R.id.unbearking);
		imageview38 = findViewById(R.id.imageview38);
		sliktouch = findViewById(R.id.sliktouch);
		imageview37 = findViewById(R.id.imageview37);
		looting = findViewById(R.id.looting);
		imageview36 = findViewById(R.id.imageview36);
		efficiency = findViewById(R.id.efficiency);
		imageview34 = findViewById(R.id.imageview34);
		Aspect = findViewById(R.id.Aspect);
		imageview33 = findViewById(R.id.imageview33);
		knock = findViewById(R.id.knock);
		imageview32 = findViewById(R.id.imageview32);
		fether = findViewById(R.id.fether);
		imageview31 = findViewById(R.id.imageview31);
		Fire_Protection = findViewById(R.id.Fire_Protection);
		imageview30 = findViewById(R.id.imageview30);
		Protection = findViewById(R.id.Protection);
		imageview29 = findViewById(R.id.imageview29);
		BaneOfArthropods = findViewById(R.id.BaneOfArthropods);
		imageview28 = findViewById(R.id.imageview28);
		Smite = findViewById(R.id.Smite);
		imageview27 = findViewById(R.id.imageview27);
		Sharpness = findViewById(R.id.Sharpness);
		imageview26 = findViewById(R.id.imageview26);
		Punch = findViewById(R.id.Punch);
		imageview25 = findViewById(R.id.imageview25);
		AquaAffinity = findViewById(R.id.AquaAffinity);
		imageview24 = findViewById(R.id.imageview24);
		Depth = findViewById(R.id.Depth);
		imageview23 = findViewById(R.id.imageview23);
		Respiration = findViewById(R.id.Respiration);
		imageview22 = findViewById(R.id.imageview22);
		Thorns = findViewById(R.id.Thorns);
		imageview21 = findViewById(R.id.imageview21);
		Projectile = findViewById(R.id.Projectile);
		imageview20 = findViewById(R.id.imageview20);
		BlastProtection = findViewById(R.id.BlastProtection);
		imageview19 = findViewById(R.id.imageview19);
		Flame = findViewById(R.id.Flame);
		imageview18 = findViewById(R.id.imageview18);
		Infinity = findViewById(R.id.Infinity);
		imageview17 = findViewById(R.id.imageview17);
		Luck_Of_Sea = findViewById(R.id.Luck_Of_Sea);
		imageview16 = findViewById(R.id.imageview16);
		Lure = findViewById(R.id.Lure);
		imageview15 = findViewById(R.id.imageview15);
		FrostWalker = findViewById(R.id.FrostWalker);
		imageview14 = findViewById(R.id.imageview14);
		Mending = findViewById(R.id.Mending);
		imageview13 = findViewById(R.id.imageview13);
		Multi = findViewById(R.id.Multi);
		imageview12 = findViewById(R.id.imageview12);
		Quick = findViewById(R.id.Quick);
		imageview11 = findViewById(R.id.imageview11);
		Channeling = findViewById(R.id.Channeling);
		imageview10 = findViewById(R.id.imageview10);
		Riptide = findViewById(R.id.Riptide);
		imageview9 = findViewById(R.id.imageview9);
		Loyalty = findViewById(R.id.Loyalty);
		imageview8 = findViewById(R.id.imageview8);
		Piercing = findViewById(R.id.Piercing);
		imageview7 = findViewById(R.id.imageview7);
		Speed = findViewById(R.id.Speed);
		imageview6 = findViewById(R.id.imageview6);
		Curse_Of_Vanishing_binding = findViewById(R.id.Curse_Of_Vanishing_binding);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear13 = _nav_view.findViewById(R.id.linear13);
		_drawer_linear12 = _nav_view.findViewById(R.id.linear12);
		_drawer_linear20 = _nav_view.findViewById(R.id.linear20);
		_drawer_linear14 = _nav_view.findViewById(R.id.linear14);
		_drawer_linear16 = _nav_view.findViewById(R.id.linear16);
		_drawer_linear19 = _nav_view.findViewById(R.id.linear19);
		_drawer_linear15 = _nav_view.findViewById(R.id.linear15);
		_drawer_linear17 = _nav_view.findViewById(R.id.linear17);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_imageview7 = _nav_view.findViewById(R.id.imageview7);
		_drawer_button29 = _nav_view.findViewById(R.id.button29);
		_drawer_imageview9 = _nav_view.findViewById(R.id.imageview9);
		_drawer_button30 = _nav_view.findViewById(R.id.button30);
		_drawer_imageview10 = _nav_view.findViewById(R.id.imageview10);
		_drawer_button31 = _nav_view.findViewById(R.id.button31);
		dialog = new AlertDialog.Builder(this);
		
		imageview48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		imageview43.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), EnchantActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview45.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), OreActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview46.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), PoshActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview47.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		imageview47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Uri uri = Uri.parse("https://www.youtube.com/channel/UCZ5hbF90KzwHbqeeHaj7F4w"); Intent likeIng = new Intent(Intent.ACTION_VIEW, uri); likeIng.setPackage("com.google.android.youtube"); try { startActivity(likeIng); } catch (ActivityNotFoundException e) { startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/sketchware_kurdish"))); }
			}
		});
		
		linear32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		impaling.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ImpalingActivity.class);
					startActivity(i);
				}
			}
		});
		
		//OnTouch
		power.setOnTouchListener(new View.OnTouchListener(){
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
		
		power.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), PowerActivity.class);
					startActivity(i);
				}
			}
		});
		
		furtune.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FortuneActivity.class);
					startActivity(i);
				}
			}
		});
		
		unbearking.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), UnberakingActivity.class);
					startActivity(i);
				}
			}
		});
		
		sliktouch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SilktouchActivity.class);
					startActivity(i);
				}
			}
		});
		
		looting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LootingActivity.class);
					startActivity(i);
				}
			}
		});
		
		efficiency.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), EfficiencyActivity.class);
					startActivity(i);
				}
			}
		});
		
		Aspect.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FireAspectActivity.class);
					startActivity(i);
				}
			}
		});
		
		knock.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), KnockbackActivity.class);
					startActivity(i);
				}
			}
		});
		
		fether.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FeatherfallingActivity.class);
					startActivity(i);
				}
			}
		});
		
		Fire_Protection.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FireprotectionActivity.class);
					startActivity(i);
				}
			}
		});
		
		Protection.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ProtectionActivity.class);
					startActivity(i);
				}
			}
		});
		
		BaneOfArthropods.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), BaneOfArthropodsActivity.class);
					startActivity(i);
				}
			}
		});
		
		Smite.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SmiteActivity.class);
					startActivity(i);
				}
			}
		});
		
		Sharpness.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SharpnessActivity.class);
					startActivity(i);
				}
			}
		});
		
		Punch.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), PunchActivity.class);
					startActivity(i);
				}
			}
		});
		
		AquaAffinity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), AquaActivity.class);
					startActivity(i);
				}
			}
		});
		
		Depth.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), DepthActivity.class);
					startActivity(i);
				}
			}
		});
		
		Respiration.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), RespirationActivity.class);
					startActivity(i);
				}
			}
		});
		
		Thorns.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ThornsActivity.class);
					startActivity(i);
				}
			}
		});
		
		Projectile.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ProjectileActivity.class);
					startActivity(i);
				}
			}
		});
		
		BlastProtection.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), BlastprotectionActivity.class);
					startActivity(i);
				}
			}
		});
		
		Flame.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FlameActivity.class);
					startActivity(i);
				}
			}
		});
		
		Infinity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), InfinityActivity.class);
					startActivity(i);
				}
			}
		});
		
		Luck_Of_Sea.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LuckOftheSeaActivity.class);
					startActivity(i);
				}
			}
		});
		
		Lure.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LureActivity.class);
					startActivity(i);
				}
			}
		});
		
		FrostWalker.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), FrostwalkerActivity.class);
					startActivity(i);
				}
			}
		});
		
		Mending.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), MendingActivity.class);
					startActivity(i);
				}
			}
		});
		
		Multi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), MultishotActivity.class);
					startActivity(i);
				}
			}
		});
		
		Quick.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), QuickchargeActivity.class);
					startActivity(i);
				}
			}
		});
		
		Channeling.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), ChannelingActivity.class);
					startActivity(i);
				}
			}
		});
		
		Riptide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), RiptideActivity.class);
					startActivity(i);
				}
			}
		});
		
		Loyalty.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LoyaltyActivity.class);
					startActivity(i);
				}
			}
		});
		
		Piercing.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), PiercingActivity.class);
					startActivity(i);
				}
			}
		});
		
		Speed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), SoulspeedActivity.class);
					startActivity(i);
				}
			}
		});
		
		Curse_Of_Vanishing_binding.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), CurseofvanishingBindingActivity.class);
					startActivity(i);
				}
			}
		});
		
		_ads_rewarded_ad_load_callback = new RewardedAdLoadCallback() {
			@Override
			public void onAdFailedToLoad(LoadAdError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
			
			@Override
			public void onAdLoaded(RewardedAd _param1) {
				ads = _param1;
				ads.show(EnchantActivity.this, _ads_on_user_earned_reward_listener);
			}
		};
		
		_ads_full_screen_content_callback = new FullScreenContentCallback() {
			@Override
			public void onAdDismissedFullScreenContent() {
				
			}
			
			@Override
			public void onAdFailedToShowFullScreenContent(AdError _adError) {
				final int _errorCode = _adError.getCode();
				final String _errorMessage = _adError.getMessage();
				
			}
			
			@Override
			public void onAdShowedFullScreenContent() {
				if (ads != null) {
					ads.setFullScreenContentCallback(_ads_full_screen_content_callback);
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "Error: RewardedAd ads hasn't been loaded yet!");
				}
			}
		};
		
		_ads_on_user_earned_reward_listener = new OnUserEarnedRewardListener() {
			@Override
			public void onUserEarnedReward(RewardItem _param1) {
				int _rewardAmount = _param1.getAmount();
				String _rewardType = _param1.getType();
				.setText(_rewardType);
			}
		};
		
		firebasecloud_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
			@Override
			public void onComplete(Task<InstanceIdResult> task) {
				final boolean _success = task.isSuccessful();
				final String _token = task.getResult().getToken();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				SketchwareUtil.showMessage(getApplicationContext(), _token);
			}
		};
	}
	
	private void initializeLogic() {
		_drawer_button29.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								if (true) {
					i.setClass(getApplicationContext(), ProfileActivity.class);
					startActivity(i);
				}
						}
				});
		_drawer_button30.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								if (true) {
					i.setClass(getApplicationContext(), EmailActivity.class);
					startActivity(i);
				}
						}
				});
		_drawer_button31.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
								dialog.setTitle("دەرچوون لە بەرنامەکە");
				dialog.setMessage("ئایا دڵنیایت کە دەتەوێ لە بەرنامەکەدا بچیتە دەرەوە؟");
				dialog.setIcon(R.drawable.zhiwarlogo_2);
				dialog.setPositiveButton("بەڵێ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						finishAffinity();
					}
				});
				dialog.setNegativeButton("نەخێر", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
						}
				});
	}
	
	@Override
	public void onBackPressed() {
		dialog.setTitle("دەرچوون لە بەرنامەکە");
		dialog.setMessage("ئایا دڵنیایت کە دەتەوێ لە بەرنامەکەدا بچیتە دەرەوە؟");
		dialog.setIcon(R.drawable.zhiwarlogo_2);
		dialog.setPositiveButton("بەڵێ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		dialog.setNegativeButton("نەخێر", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialog.create().show();
	}
	public void _Search(final TextView _textview, final String _string) {
		if (_textview.getText().toString().toLowerCase().contains(_string.toLowerCase())) {
			_textview.setVisibility(View.VISIBLE);
		}
		else {
			_textview.setVisibility(View.GONE);
		}
	}
	
}