package com.entboost.im.cipher;

import android.content.Context;

public class ContextHolder {
   private static Context ApplicationContext;
   private  static String privateKey;

    public static void initial(Context context){
        ApplicationContext = context;
    }

    public static Context getContext(){
        return ApplicationContext;
    }

    public static void setKey(String key){
        privateKey = key;
    }

    public static String getKey(){
        return privateKey;
    }
}
