package com.example.customviewdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomEdittext extends EditText{

	public CustomEdittext(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(attrs);
		// TODO Auto-generated constructor stub 
	}

	public CustomEdittext(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs);
		// TODO Auto-generated constructor stub
	}	
	
	public CustomEdittext(Context context) {
		super(context);
		init(null);
		// TODO Auto-generated constructor stub 
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
		
		super.onDraw(canvas);
	}
	
	private void init(AttributeSet attrs) {
		if (attrs!=null) {
			 TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);
			 String fontName = a.getString(R.styleable.MyTextView_MyFont);
			 if (fontName!=null) {
				 Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName);
				 setTypeface(myTypeface);
				 
				 //FontCache.getFont(getContext(), "fonts/"+fontName);
			 }
			 a.recycle();
		}
	}

}
