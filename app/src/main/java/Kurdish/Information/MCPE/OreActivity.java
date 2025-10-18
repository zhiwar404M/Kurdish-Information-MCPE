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
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
// Unity Ads imports (ensure unity-ads library present when building with AIDE)
import com.unity3d.ads.*;
import com.unity3d.ads.banner.*;
import com.unity3d.ads.banner.BannerErrorInfo;
import com.unity3d.ads.banner.BannerView;
import com.unity3d.ads.banner.BannerView.IListener;
import com.unity3d.ads.banner.BannerPosition;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class OreActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear41;
	private LinearLayout linear22;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private Button button27;
	private ImageView imageview18;
	private Button button23;
	private ImageView imageview14;
	private Button button28;
	private ImageView imageview19;
	private Button button29;
	private ImageView imageview20;
	private Button button30;
	private ImageView imageview21;
	private Button button31;
	private ImageView imageview22;
	private Button button32;
	private ImageView imageview23;
	private Button button33;
	private ImageView imageview24;
	private Button button34;
	private ImageView imageview25;
	private Button button35;
	private ImageView imageview26;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.ore);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear41 = findViewById(R.id.linear41);
		linear22 = findViewById(R.id.linear22);
		linear42 = findViewById(R.id.linear42);
		linear43 = findViewById(R.id.linear43);
		linear44 = findViewById(R.id.linear44);
		linear45 = findViewById(R.id.linear45);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		button27 = findViewById(R.id.button27);
		imageview18 = findViewById(R.id.imageview18);
		button23 = findViewById(R.id.button23);
		imageview14 = findViewById(R.id.imageview14);
		button28 = findViewById(R.id.button28);
		imageview19 = findViewById(R.id.imageview19);
		button29 = findViewById(R.id.button29);
		imageview20 = findViewById(R.id.imageview20);
		button30 = findViewById(R.id.button30);
		imageview21 = findViewById(R.id.imageview21);
		button31 = findViewById(R.id.button31);
		imageview22 = findViewById(R.id.imageview22);
		button32 = findViewById(R.id.button32);
		imageview23 = findViewById(R.id.imageview23);
		button33 = findViewById(R.id.button33);
		imageview24 = findViewById(R.id.imageview24);
		button34 = findViewById(R.id.button34);
		imageview25 = findViewById(R.id.imageview25);
		button35 = findViewById(R.id.button35);
		imageview26 = findViewById(R.id.imageview26);
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), NetherriteActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), DiamondActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), IronActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), QuartzActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), GoalActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), GoldActivity.class);
					startActivity(i);
				}
			}
		});
		
		imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), CopperActivity.class);
					startActivity(i);
				}
			}
		});
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), CrestalActivity.class);
					startActivity(i);
				}
			}
		});
		
		button34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), EmeraldActivity.class);
					startActivity(i);
				}
			}
		});
		
		button35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (true) {
					i.setClass(getApplicationContext(), LapizActivity.class);
					startActivity(i);
				}
			}
		});
	}
	
	private void initializeLogic() {
        // Initialize Unity Ads in this screen if needed (replace with your game ID)
        _UnityAds("1234567", false);
        // Preload a placement so it's ready to show
        try {
            UnityAds.load("Rewarded_Android", loadListener);
        } catch (Throwable ignored) {
        }
	}
	
	public void _onRewardComplete() {
		SketchwareUtil.showMessage(getApplicationContext(), "onRewardComplete");
	}
	
	
	public void _UnityAds(final String _UnityGameID, final boolean _enableRealAds) {
		UnityAds.initialize(this, _UnityGameID, !_enableRealAds, null);
	}
	private IUnityAdsLoadListener loadListener = new IUnityAdsLoadListener() {
			
			@Override
            public void onUnityAdsAdLoaded(String __UnityPlacementID) {
                    UnityAds.show(OreActivity.this, __UnityPlacementID, new UnityAdsShowOptions(), showListener);
			
		}
			@Override
			public void onUnityAdsFailedToLoad(String __UnityPlacementID, UnityAds.UnityAdsLoadError IUnityAdErrorPlayBack, String message) {
			SketchwareUtil.showMessage(getApplicationContext(), __UnityPlacementID.concat(":".concat(IUnityAdErrorPlayBack.toString())));
			}
		
		};
	
	private BannerView.IListener bannerListener = new BannerView.IListener() {
				
					@Override
				public void onBannerLoaded(BannerView bannerAdView) {
							 
				}
				
				@Override
				public void onBannerFailedToLoad(BannerView bannerAdView, BannerErrorInfo IUnityAdErrorPlayBack) {
							SketchwareUtil.showMessage(getApplicationContext(), IUnityAdErrorPlayBack.toString());
				}
				
				@Override
				public void onBannerClick(BannerView bannerAdView) {
							 
				}
				@Override
				public void onBannerLeftApplication(BannerView bannerAdView) {
							 
				}
				
	};
	private IUnityAdsShowListener showListener = new IUnityAdsShowListener() {
			 @Override
			public void onUnityAdsShowFailure(String __UnityPlacementID, UnityAds.UnityAdsShowError IUnityAdErrorPlayBack, String message) {
					  SketchwareUtil.showMessage(getApplicationContext(), __UnityPlacementID.concat(":".concat(IUnityAdErrorPlayBack.toString())));
			}
			
		
			@Override
			public void onUnityAdsShowStart(String __UnityPlacementID) {
					
					 
			}
			
		
			@Override
			public void onUnityAdsShowClick(String __UnityPlacementID) {
					
					 
			}
			
		
			@Override
			public void onUnityAdsShowComplete(String __UnityPlacementID, UnityAds.UnityAdsShowCompletionState __UnityAdsState) {
			 if (__UnityPlacementID.equals("Rewarded_Android")) {
				if (__UnityAdsState.equals(UnityAds.UnityAdsShowCompletionState.COMPLETED)) {
					_onRewardComplete();
				}
			}
			else {
				SketchwareUtil.showMessage(getApplicationContext(), "onAdInterstitialComplete");
			}		
		}
		
	};
	// UnityAds SDK 4.6.1 by t.me/ovidiuux 
	{
	}
	
}
