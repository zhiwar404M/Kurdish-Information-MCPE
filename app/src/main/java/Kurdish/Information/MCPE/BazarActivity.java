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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class BazarActivity extends AppCompatActivity {
	
	private String _reward_ad_unit_id;
	
	private boolean connect = false;
	
	private ScrollView vscroll1;
	private LinearLayout linear19;
	private LinearLayout linear2;
	private LinearLayout linear70;
	private LinearLayout linear68;
	private LinearLayout linear67;
	private LinearLayout linear66;
	private LinearLayout linear65;
	private LinearLayout linear64;
	private LinearLayout linear63;
	private LinearLayout linear62;
	private LinearLayout linear61;
	private LinearLayout linear60;
	private LinearLayout linear59;
	private LinearLayout linear58;
	private LinearLayout linear18;
	private LinearLayout linear50;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear57;
	private Button reklam;
	private TextView textview4;
	private Button button64;
	private Button button61;
	private Button button62;
	private Button button63;
	private Button button58;
	private Button button59;
	private Button button60;
	private Button button55;
	private Button button56;
	private Button button57;
	private Button button52;
	private Button button53;
	private Button button54;
	private Button button49;
	private Button button50;
	private Button button51;
	private Button button46;
	private Button button47;
	private Button button48;
	private Button button43;
	private Button button44;
	private Button button45;
	private Button button40;
	private Button button41;
	private Button button42;
	private Button button37;
	private Button button38;
	private Button button39;
	private Button button34;
	private Button button35;
	private Button button36;
	private Button button31;
	private Button button32;
	private Button button33;
	private Button button4;
	private Button skin6;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button16;
	private Button button17;
	private Button button18;
	private Button button19;
	private Button button20;
	private Button button21;
	private Button button22;
	private Button button23;
	private Button button24;
	private Button button25;
	private Button button26;
	private Button button27;
	private Button button28;
	private Button button29;
	private Button button30;
	
	private RewardedAd rewandads;
	private OnUserEarnedRewardListener _rewandads_on_user_earned_reward_listener;
	private RewardedAdLoadCallback _rewandads_rewarded_ad_load_callback;
	private FullScreenContentCallback _rewandads_full_screen_content_callback;
	private AlertDialog.Builder d;
	private Intent i = new Intent();
	private SharedPreferences data1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.bazar);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear19 = findViewById(R.id.linear19);
		linear2 = findViewById(R.id.linear2);
		linear70 = findViewById(R.id.linear70);
		linear68 = findViewById(R.id.linear68);
		linear67 = findViewById(R.id.linear67);
		linear66 = findViewById(R.id.linear66);
		linear65 = findViewById(R.id.linear65);
		linear64 = findViewById(R.id.linear64);
		linear63 = findViewById(R.id.linear63);
		linear62 = findViewById(R.id.linear62);
		linear61 = findViewById(R.id.linear61);
		linear60 = findViewById(R.id.linear60);
		linear59 = findViewById(R.id.linear59);
		linear58 = findViewById(R.id.linear58);
		linear18 = findViewById(R.id.linear18);
		linear50 = findViewById(R.id.linear50);
		linear51 = findViewById(R.id.linear51);
		linear52 = findViewById(R.id.linear52);
		linear53 = findViewById(R.id.linear53);
		linear54 = findViewById(R.id.linear54);
		linear55 = findViewById(R.id.linear55);
		linear56 = findViewById(R.id.linear56);
		linear57 = findViewById(R.id.linear57);
		reklam = findViewById(R.id.reklam);
		textview4 = findViewById(R.id.textview4);
		button64 = findViewById(R.id.button64);
		button61 = findViewById(R.id.button61);
		button62 = findViewById(R.id.button62);
		button63 = findViewById(R.id.button63);
		button58 = findViewById(R.id.button58);
		button59 = findViewById(R.id.button59);
		button60 = findViewById(R.id.button60);
		button55 = findViewById(R.id.button55);
		button56 = findViewById(R.id.button56);
		button57 = findViewById(R.id.button57);
		button52 = findViewById(R.id.button52);
		button53 = findViewById(R.id.button53);
		button54 = findViewById(R.id.button54);
		button49 = findViewById(R.id.button49);
		button50 = findViewById(R.id.button50);
		button51 = findViewById(R.id.button51);
		button46 = findViewById(R.id.button46);
		button47 = findViewById(R.id.button47);
		button48 = findViewById(R.id.button48);
		button43 = findViewById(R.id.button43);
		button44 = findViewById(R.id.button44);
		button45 = findViewById(R.id.button45);
		button40 = findViewById(R.id.button40);
		button41 = findViewById(R.id.button41);
		button42 = findViewById(R.id.button42);
		button37 = findViewById(R.id.button37);
		button38 = findViewById(R.id.button38);
		button39 = findViewById(R.id.button39);
		button34 = findViewById(R.id.button34);
		button35 = findViewById(R.id.button35);
		button36 = findViewById(R.id.button36);
		button31 = findViewById(R.id.button31);
		button32 = findViewById(R.id.button32);
		button33 = findViewById(R.id.button33);
		button4 = findViewById(R.id.button4);
		skin6 = findViewById(R.id.skin6);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		button10 = findViewById(R.id.button10);
		button11 = findViewById(R.id.button11);
		button12 = findViewById(R.id.button12);
		button13 = findViewById(R.id.button13);
		button14 = findViewById(R.id.button14);
		button15 = findViewById(R.id.button15);
		button16 = findViewById(R.id.button16);
		button17 = findViewById(R.id.button17);
		button18 = findViewById(R.id.button18);
		button19 = findViewById(R.id.button19);
		button20 = findViewById(R.id.button20);
		button21 = findViewById(R.id.button21);
		button22 = findViewById(R.id.button22);
		button23 = findViewById(R.id.button23);
		button24 = findViewById(R.id.button24);
		button25 = findViewById(R.id.button25);
		button26 = findViewById(R.id.button26);
		button27 = findViewById(R.id.button27);
		button28 = findViewById(R.id.button28);
		button29 = findViewById(R.id.button29);
		button30 = findViewById(R.id.button30);
		d = new AlertDialog.Builder(this);
		data1 = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		reklam.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				RewardedAd.load(BazarActivity.this, _reward_ad_unit_id, new AdRequest.Builder().build(), _rewandads_rewarded_ad_load_callback);
				data1.edit().putString("data", textview4.getText().toString()).commit();
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.CustomToast(getApplicationContext(), "بەرێزم تۆ نزیکەی ".concat(textview4.getText().toString()).concat(" کوردیش کۆینت پێیە دەتوانی لە دەستە چەپت زیادی بکەیت🏦💰!"), 0xFFF44336, 10, 0xFF000000, 2, SketchwareUtil.BOTTOM);
			}
		});
		
		button64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.CustomToast(getApplicationContext(), "Kurdish Coin \nبەکاردێت بۆ کرینی Skin ئیتر هەر جۆرە Skinـێک بێت وە دەتوانی کلیک(بەنجە) لە Skinــکان بدەیت بۆ بینینی پشتەوەی Skinــنەکان بۆ بەدەست هێنانی Kurdish Coin لە لای دەستەچەپ دەتوانی بە سەیر کردنی ریکلامێک 10Kurdish Coin بەدەست بێنی خۆشەویستن 🙂💙", 0xFFF44336, 10, 0xFF000000, 2, SketchwareUtil.BOTTOM);
			}
		});
		
		button61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					if (!(10 < Double.parseDouble(textview4.getText().toString()))) {
						SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
					}
					else {
						textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
					}
				}
			}
		});
		
		button58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					if (!(10 < Double.parseDouble(textview4.getText().toString()))) {
						SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
					}
					else {
						if (!(20 < Double.parseDouble(textview4.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
						}
						else {
							if (!(30 < Double.parseDouble(textview4.getText().toString()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
							}
							else {
								textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 40)));
							}
						}
					}
				}
			}
		});
		
		button56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 60)));
				}
			}
		});
		
		button53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 80)));
				}
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 110)));
				}
			}
		});
		
		button47.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button44.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		skin6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					SketchwareUtil.showMessage(getApplicationContext(), "تۆ نزیکەی ".concat(textview4.getText().toString().concat(" کوردیش کۆینت پێیە بۆیە بەشی کرینی ئەم سکینە ناکات تکایە پارەکەت زیاد بکە💰!")));
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) - 20)));
				}
			}
		});
		
		_rewandads_rewarded_ad_load_callback = new RewardedAdLoadCallback() {
			@Override
			public void onAdFailedToLoad(LoadAdError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				if (connect) {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "تکایە ئینتەر نێتەکەت داگیرسێنە 📡!");
					SketchwareUtil.showMessage(getApplicationContext(), "بەبێ ئینتەرنێت ناتوانی پارە وەرگری 💰!");
				}
			}
			
			@Override
			public void onAdLoaded(RewardedAd _param1) {
				rewandads = _param1;
				rewandads.show(BazarActivity.this, _rewandads_on_user_earned_reward_listener);
			}
		};
		
		_rewandads_full_screen_content_callback = new FullScreenContentCallback() {
			@Override
			public void onAdDismissedFullScreenContent() {
				
			}
			
			@Override
			public void onAdFailedToShowFullScreenContent(AdError _adError) {
				final int _errorCode = _adError.getCode();
				final String _errorMessage = _adError.getMessage();
				SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
			}
			
			@Override
			public void onAdShowedFullScreenContent() {
				if (rewandads != null) {
					rewandads.setFullScreenContentCallback(_rewandads_full_screen_content_callback);
				} else {
					SketchwareUtil.showMessage(getApplicationContext(), "Error: RewardedAd rewandads hasn't been loaded yet!");
				}
			}
		};
		
		_rewandads_on_user_earned_reward_listener = new OnUserEarnedRewardListener() {
			@Override
			public void onUserEarnedReward(RewardItem _param1) {
				int _rewardAmount = _param1.getAmount();
				String _rewardType = _param1.getType();
				if (!(0 < Double.parseDouble(textview4.getText().toString()))) {
					textview4.setText("10");
				}
				else {
					textview4.setText(String.valueOf((long)(Double.parseDouble(textview4.getText().toString()) + 10)));
				}
			}
		};
	}
	
	private void initializeLogic() {
	}
	
	@Override
	public void onBackPressed() {
		if (true) {
			i.setClass(getApplicationContext(), EnchantActivity.class);
			startActivity(i);
		}
		data1.edit().putString("data", textview4.getText().toString()).commit();
	}
}