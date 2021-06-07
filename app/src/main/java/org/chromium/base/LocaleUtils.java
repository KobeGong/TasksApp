package org.chromium.base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.base.annotations.CalledByNative;

/* compiled from: PG */
public class LocaleUtils {
    private static final Map a;

    private LocaleUtils() {
    }

    @CalledByNative
    public static String getDefaultLocaleString() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String str = (String) a.get(language);
        if (str == null) {
            str = language;
        }
        String country = locale.getCountry();
        if (str.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (!country.isEmpty()) {
            return str + "-" + country;
        }
        return str;
    }

    @CalledByNative
    private static String getDefaultCountryCode() {
        CommandLine c = CommandLine.c();
        if (c.a()) {
            return c.b();
        }
        return Locale.getDefault().getCountry();
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("iw", "he");
        hashMap.put("ji", "yi");
        hashMap.put("in", "id");
        hashMap.put("tl", "fil");
        a = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("und", "");
        hashMap2.put("fil", "tl");
        Collections.unmodifiableMap(hashMap2);
    }
}
