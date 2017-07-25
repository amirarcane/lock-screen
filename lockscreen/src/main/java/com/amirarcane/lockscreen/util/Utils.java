package com.amirarcane.lockscreen.util;

import android.annotation.TargetApi;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by pc on 07/16/2017.
 */

public class Utils {
    // utility function
    private static String bytesToHexString(byte[] bytes) {
        // http://stackoverflow.com/questions/332079
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }

    // generate a hash
    public static String sha256(String s) {
        MessageDigest digest;
        String hash;

        try {
            digest = MessageDigest.getInstance("SHA-256");
            digest.update(s.getBytes());

            hash = bytesToHexString(digest.digest());

            return hash;
        } catch (NoSuchAlgorithmException e1) {
            return s;
        }
    }

}
