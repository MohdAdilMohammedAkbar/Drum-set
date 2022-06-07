package com.my.newproject17;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
	
	private final Timer _timer = new Timer();
	
	private double a = 0;
	private double tom_1 = 0;
	private double tom_2 = 0;
	private double tom_3 = 0;
	private double Snare_ = 0;
	private double ride_ = 0;
	private double close__hh = 0;
	private double open__hh = 0;
	private double crash__l = 0;
	private double crash__m = 0;
	private double floor_ = 0;
	private double kick_ = 0;
	private double soundplaying = 0;
	private double splash__ = 0;
	private double kick_2 = 0;
	private double b = 0;
	
	private LinearLayout background;
	private Button piece;
	private Button button3;
	private Button button7;
	private Button button8;
	private Button button10;
	private Button button9;
	private Button btn_for_1;
	private Button btn_for_2;
	private Button btn_for_3;
	private Button btn_for_4;
	private Button btn_for_5;
	private Button btn_for_6;
	private ImageView openhh;
	private ImageView newtom1two;
	private ImageView newtom1three;
	private ImageView newtom1one;
	private ImageView crash1two;
	private ImageView snare;
	private ImageView kick1;
	private ImageView ride1;
	private ImageView kick1two;
	private ImageView floor;
	private ImageView snare1;
	private ImageView crash1;
	private ImageView closehh;
	private ImageView splash;
	
	private final Intent intent = new Intent();
	private TimerTask timer;
	private SoundPool tom1;
	private SoundPool tom2;
	private SoundPool tom3;
	private SoundPool Snare;
	private SoundPool ride;
	private SoundPool close_hh;
	private SoundPool open_hh;
	private SoundPool crash_l;
	private SoundPool crash_m;
	private SoundPool kick;
	private SoundPool floor__;
	private SoundPool splash_;
	private SoundPool kick2;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize();
		
		initializeLogic();
	}
	
	private void initialize() {
		
		background = findViewById(R.id.background);
		piece = findViewById(R.id.piece);
		button3 = findViewById(R.id.button3);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button10 = findViewById(R.id.button10);
		button9 = findViewById(R.id.button9);
		btn_for_1 = findViewById(R.id.btn_for_1);
		btn_for_2 = findViewById(R.id.btn_for_2);
		btn_for_3 = findViewById(R.id.btn_for_3);
		btn_for_4 = findViewById(R.id.btn_for_4);
		btn_for_5 = findViewById(R.id.btn_for_5);
		btn_for_6 = findViewById(R.id.btn_for_6);
		openhh = findViewById(R.id.openhh);
		newtom1two = findViewById(R.id.newtom1two);
		newtom1three = findViewById(R.id.newtom1three);
		newtom1one = findViewById(R.id.newtom1one);
		crash1two = findViewById(R.id.crash1two);
		snare = findViewById(R.id.snare);
		kick1 = findViewById(R.id.kick1);
		ride1 = findViewById(R.id.ride1);
		kick1two = findViewById(R.id.kick1two);
		floor = findViewById(R.id.floor);
		snare1 = findViewById(R.id.snare1);
		crash1 = findViewById(R.id.crash1);
		closehh = findViewById(R.id.closehh);
		splash = findViewById(R.id.splash);
		
		piece.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 1) {
					btn_for_1.setVisibility(View.VISIBLE);
					btn_for_2.setVisibility(View.VISIBLE);
					btn_for_3.setVisibility(View.VISIBLE);
					btn_for_6.setVisibility(View.VISIBLE);
					btn_for_4.setVisibility(View.VISIBLE);
					btn_for_5.setVisibility(View.VISIBLE);
					a = 0;
					b = 1;
				}
				else {
					btn_for_1.setVisibility(View.INVISIBLE);
					btn_for_2.setVisibility(View.INVISIBLE);
					btn_for_3.setVisibility(View.INVISIBLE);
					btn_for_6.setVisibility(View.INVISIBLE);
					btn_for_4.setVisibility(View.INVISIBLE);
					btn_for_5.setVisibility(View.INVISIBLE);
					a = 1;
				}
				piece.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								piece.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button3.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								button3.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button7.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								button7.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button8.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								button8.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button10.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								button10.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {

			}
		});
		
		btn_for_1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundColor(0xFF000000);
				}
				btn_for_1.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_1.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		btn_for_2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundColor(0xFFFFFFFF);
				}
				btn_for_2.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_2.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		btn_for_3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundResource(R.drawable.wood);
				}
				btn_for_3.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_3.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		btn_for_4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundResource(R.drawable.tiles2);
					background.getBackground().setColorFilter(0xFF03A9F4, PorterDuff.Mode.MULTIPLY);
				}
				btn_for_4.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_4.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		btn_for_5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundResource(R.drawable.carpet);
				}
				btn_for_5.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_5.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		btn_for_6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (a == 0) {
					background.setBackgroundColor(0xFFFF9800);
				}
				if (b == 0) {
					background.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFFF44336,0xFF2196F3}));
				}
				btn_for_6.setAlpha((float)(0.5d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								btn_for_6.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(timer, 200);
			}
		});
		
		openhh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				openhh.setScaleY((float)(4.2d));
				openhh.setScaleX((float)(4.2d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								openhh.setScaleX((float)(3.9d));
								openhh.setScaleY((float)(3.9d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = open_hh.play((int)(open__hh), 1.0f, 1.0f, 1, 0, 1.0f);
				close_hh.stop((int)(close__hh));
			}
		});
		
		newtom1two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				soundplaying = tom2.play((int)(tom_2), 1.0f, 1.0f, 1, 0, 1.0f);
				newtom1two.setScaleY((float)(1.8d));
				newtom1two.setScaleX((float)(1.8d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								newtom1two.setScaleX((float)(1.5d));
								newtom1two.setScaleY((float)(1.5d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
			}
		});
		
		newtom1three.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				soundplaying = tom3.play((int)(tom_3), 1.0f, 1.0f, 1, 0, 1.0f);
				newtom1three.setScaleY((float)(1.7d));
				newtom1three.setScaleX((float)(1.7d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								newtom1three.setScaleX((float)(1.5d));
								newtom1three.setScaleY((float)(1.5d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
			}
		});
		
		newtom1one.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				soundplaying = tom1.play((int)(tom_1), 1.0f, 1.0f, 1, 0, 1.0f);
				newtom1one.setScaleY((float)(1.7d));
				newtom1one.setScaleX((float)(1.7d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								newtom1one.setScaleX((float)(1.5d));
								newtom1one.setScaleY((float)(1.5d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
			}
		});
		
		crash1two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				crash1two.setScaleY((float)(3.8d));
				crash1two.setScaleX((float)(3.8d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								crash1two.setScaleX((float)(3.5d));
								crash1two.setScaleY((float)(3.5d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = crash_m.play((int)(crash__m), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		kick1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kick1.setScaleY((float)(4.3d));
				kick1.setScaleX((float)(4.3d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								kick1.setScaleX((float)(4));
								kick1.setScaleY((float)(4));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = kick.play((int)(kick_), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		ride1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ride1.setScaleY((float)(4.3d));
				ride1.setScaleX((float)(4.3d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								ride1.setScaleX((float)(4));
								ride1.setScaleY((float)(4));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = ride.play((int)(ride_), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		kick1two.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kick1two.setScaleY((float)(4.3d));
				kick1two.setScaleX((float)(4.3d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								kick1two.setScaleX((float)(4));
								kick1two.setScaleY((float)(4));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = kick2.play((int)(kick_2), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		floor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				floor.setScaleY((float)(5.3d));
				floor.setScaleX((float)(5.3d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								floor.setScaleX((float)(5));
								floor.setScaleY((float)(5));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = floor__.play((int)(floor_), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		snare1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				snare.setScaleX((float)(4.3d));
				snare.setScaleY((float)(4.3d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								snare.setScaleX((float)(4));
								snare.setScaleY((float)(4));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = Snare.play((int)(Snare_), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		crash1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				crash1.setScaleY((float)(3.8d));
				crash1.setScaleX((float)(3.8d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								crash1.setScaleX((float)(3.5d));
								crash1.setScaleY((float)(3.5d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = crash_l.play((int)(crash__l), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		
		closehh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				closehh.setScaleY((float)(4.2d));
				closehh.setScaleX((float)(4.2d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								closehh.setScaleX((float)(3.9d));
								closehh.setScaleY((float)(3.9d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = close_hh.play((int)(close__hh), 1.0f, 1.0f, 1, 0, 1.0f);
				open_hh.stop(open_hh.play((int)(open__hh), 1.0f, 1.0f, 1, 0, 1.0f));
			}
		});
		
		splash.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				splash.setScaleY((float)(3.9d));
				splash.setScaleX((float)(3.9d));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								splash.setScaleX((float)(3.6d));
								splash.setScaleY((float)(3.6d));
							}
						});
					}
				};
				_timer.schedule(timer, 500);
				soundplaying = splash_.play((int)(splash__), 1.0f, 1.0f, 1, 0, 1.0f);
			}
		});
		

	}
	
	private void initializeLogic() {
		btn_for_1.setVisibility(View.INVISIBLE);
		btn_for_2.setVisibility(View.INVISIBLE);
		btn_for_3.setVisibility(View.INVISIBLE);
		btn_for_6.setVisibility(View.INVISIBLE);
		btn_for_4.setVisibility(View.INVISIBLE);
		btn_for_5.setVisibility(View.INVISIBLE);
		a = 1;
		b = 1;
		openhh.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		crash1two.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		snare.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		kick1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		ride1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		kick1two.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		floor.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		snare.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		snare1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		crash1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		closehh.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		splash.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, Color.TRANSPARENT, Color.TRANSPARENT));
		snare1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)0, 0xFF607D8B, 0xFFFFEB3B));
		tom1 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		tom_1 = tom1.load(getApplicationContext(), R.raw.tom1, 1);
		tom2 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		tom_2 = tom2.load(getApplicationContext(), R.raw.tom2, 1);
		tom3 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		tom_3 = tom3.load(getApplicationContext(), R.raw.tom3, 1);
		Snare = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		Snare_ = Snare.load(getApplicationContext(), R.raw.snare, 1);
		ride = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		ride_ = ride.load(getApplicationContext(), R.raw.ride, 1);
		close_hh = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		close__hh = close_hh.load(getApplicationContext(), R.raw.closehh, 1);
		open_hh = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		open__hh = open_hh.load(getApplicationContext(), R.raw.openhh, 1);
		crash_l = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		crash__l = crash_l.load(getApplicationContext(), R.raw.crashl, 1);
		crash_m = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		crash__m = crash_m.load(getApplicationContext(), R.raw.crashm, 1);
		kick = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		kick_ = kick.load(getApplicationContext(), R.raw.new_kick, 1);
		splash_ = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		splash__ = splash_.load(getApplicationContext(), R.raw.crashr, 1);
		floor__ = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		floor_ = floor__.load(getApplicationContext(), R.raw.floor, 1);
		kick2 = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
		kick_2 = kick2.load(getApplicationContext(), R.raw.new_kick, 1);
		btn_for_1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		btn_for_2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		btn_for_3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		btn_for_4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		btn_for_5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		btn_for_6.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		piece.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		button3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		button7.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		button8.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		button9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
		button10.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)10, 0xFF000000, 0xFFFF5722));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);

	}
	
	@Override
	public void onBackPressed() {
		
	}

	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int[] _location = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int[] _location = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			_arr.valueAt(_iIdx);
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
