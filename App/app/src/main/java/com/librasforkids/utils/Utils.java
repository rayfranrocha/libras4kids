package com.librasforkids.utils;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.InputStream;

public class Utils {

    public static Bitmap getBitmapFromAssets(AssetManager assetManager, String fileName) {

        Bitmap bitmap = null;

        try {
            InputStream istr = assetManager.open(fileName);
            bitmap = BitmapFactory.decodeStream(istr);
            istr.close();
        } catch (Exception ex) {
        } finally {
            Log.e("getBitmapFromAssets", "Erro na tentativa de ler o arquivo " + fileName + ".");
        }
        return bitmap;
    }
}
