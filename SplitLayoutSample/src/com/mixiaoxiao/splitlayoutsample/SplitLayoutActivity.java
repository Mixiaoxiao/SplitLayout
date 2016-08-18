package com.mixiaoxiao.splitlayoutsample;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import com.mixiaoxiao.library.splitlayout.SplitLayout;

public class SplitLayoutActivity extends Activity {

	private SplitLayout mVerticalSplitLayout, mHorizontalSplitLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_split_layout);
		mVerticalSplitLayout = (SplitLayout) findViewById(R.id.splitlayout_vertical);
		mHorizontalSplitLayout = (SplitLayout) findViewById(R.id.splitlayout_horizontal);
	}
	
	public void onClickVerticalSample(View v) {
		mVerticalSplitLayout.setVisibility(View.VISIBLE);
		mHorizontalSplitLayout.setVisibility(View.GONE);
	}
	
	public void onClickHorizontalSample(View v) {
		mVerticalSplitLayout.setVisibility(View.GONE);
		mHorizontalSplitLayout.setVisibility(View.VISIBLE);
	}
	public void onClickChild0(View v){
		//Toast.makeText(this, "CHILD 0", Toast.LENGTH_SHORT).show();
	}
	public void onClickChild1(View v){
		//Toast.makeText(this, "CHILD 1", Toast.LENGTH_SHORT).show();
	}
	public void onClickRotateScreen(View v) {
		if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		} else {
			setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		}
	}
}
