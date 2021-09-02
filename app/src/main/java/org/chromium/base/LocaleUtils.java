package org.chromium.base;

/* compiled from: PG */
public class LocaleUtils {
    private static final java.util.Map a;

    private LocaleUtils() {
    }

    @org.chromium.base.annotations.CalledByNative
    public static java.lang.String getDefaultLocaleString() {
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.String language = locale.getLanguage();
        java.lang.String str = (java.lang.String) a.get(language);
        if (str == null) {
            str = language;
        }
        java.lang.String country = locale.getCountry();
        if (str.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (!country.isEmpty()) {
            return str + "-" + country;
        }
        return str;
    }

    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getDefaultCountryCode() {
        org.chromium.base.CommandLine c = org.chromium.base.CommandLine.c();
        if (c.a()) {
            return c.b();
        }
        return java.util.Locale.getDefault().getCountry();
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("iw", "he");
        hashMap.put("ji", "yi");
        hashMap.put("in", "id");
        hashMap.put("tl", "fil");
        a = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("und", "");
        hashMap2.put("fil", "tl");
        java.util.Collections.unmodifiableMap(hashMap2);
    }
}
