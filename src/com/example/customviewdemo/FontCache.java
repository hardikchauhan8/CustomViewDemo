package com.example.customviewdemo;

import java.util.HashMap;
import java.util.Map;

import android.content.Context;
import android.graphics.Typeface;

public class FontCache {
    private static Map<String, Typeface> fontMap = new HashMap<String, Typeface>();
 
    public static Typeface getFont(Context context, String fontName){
        if (fontMap.containsKey(fontName)){
            return fontMap.get(fontName);
        }
        else {
            Typeface tf = Typeface.createFromAsset(context.getAssets(), fontName);
            fontMap.put(fontName, tf);
            return tf;
        }
    }
}