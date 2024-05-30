package com.fongmi.android.tv.utils;

import android.content.res.Resources;

import java.util.Locale;

public class LanguageUtil {
    public static void setLanguage(Resources resources, int lang) {
        resources.getConfiguration().locale = getLocale(lang);
        resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
    }

    public static int locale() {
        if (!Locale.getDefault().getLanguage().equals("zh")) return 0;
        if (Locale.getDefault().getCountry().equals("TW")) return 2;
        return 1;
    }

    private static Locale getLocale(int lang) {
        if (lang == 1) return Locale.SIMPLIFIED_CHINESE;
        else if (lang == 2) return Locale.TRADITIONAL_CHINESE;
        else return Locale.ENGLISH;
    }

}