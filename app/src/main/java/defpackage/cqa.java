package defpackage;

@java.lang.Deprecated
/* renamed from: cqa reason: default package */
/* compiled from: PG */
public final class cqa {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    static java.lang.String a(int i, int i2, java.lang.String str) {
        boolean find;
        java.lang.String str2;
        java.util.Set<java.lang.String> unmodifiableSet;
        boolean z;
        boolean z2;
        if (str == null) {
            return str;
        }
        if (str == null) {
            find = false;
        } else {
            find = a.matcher(str).find();
        }
        if (!find) {
            str2 = str;
            str = "https://images" + a() + "-esmobile-opensocial.googleusercontent.com/gadgets/proxy";
        } else {
            str2 = null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        android.net.Uri.Builder buildUpon = android.net.Uri.EMPTY.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (!(i == -1 || i2 == -1)) {
            buildUpon.appendQueryParameter("resize_w", java.lang.Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", java.lang.Integer.toString(i2));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        android.net.Uri build = buildUpon.build();
        if (parse.isOpaque()) {
            throw new java.lang.UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        java.lang.String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = java.util.Collections.emptySet();
        } else {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int i3 = 0;
            do {
                int indexOf = encodedQuery.indexOf(38, i3);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i3);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(android.net.Uri.decode(encodedQuery.substring(i3, indexOf2)));
                i3 = indexOf + 1;
            } while (i3 < encodedQuery.length());
            unmodifiableSet = java.util.Collections.unmodifiableSet(linkedHashSet);
        }
        android.net.Uri uri = build;
        for (java.lang.String str3 : unmodifiableSet) {
            if (uri.getQueryParameter(str3) == null) {
                if ("resize_w".equals(str3) || "resize_h".equals(str3) || "no_expand".equals(str3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == -1 || i2 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                android.net.Uri.Builder buildUpon2 = uri.buildUpon();
                if ("url".equals(str3)) {
                    buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                } else if (!z2 || !z) {
                    for (java.lang.String appendQueryParameter : parse.getQueryParameters(str3)) {
                        buildUpon2.appendQueryParameter(str3, appendQueryParameter);
                    }
                }
                uri = buildUpon2.build();
            }
        }
        if (str2 != null && uri.getQueryParameter("url") == null) {
            android.net.Uri.Builder buildUpon3 = uri.buildUpon();
            buildUpon3.appendQueryParameter("url", str2);
            uri = buildUpon3.build();
        }
        if (uri.getQueryParameter("container") == null) {
            android.net.Uri.Builder buildUpon4 = uri.buildUpon();
            buildUpon4.appendQueryParameter("container", "esmobile");
            uri = buildUpon4.build();
        }
        if (uri.getQueryParameter("gadget") == null) {
            android.net.Uri.Builder buildUpon5 = uri.buildUpon();
            buildUpon5.appendQueryParameter("gadget", "a");
            uri = buildUpon5.build();
        }
        if (uri.getQueryParameter("rewriteMime") == null) {
            android.net.Uri.Builder buildUpon6 = uri.buildUpon();
            buildUpon6.appendQueryParameter("rewriteMime", "image/*");
            uri = buildUpon6.build();
        }
        return uri.toString();
    }

    private static synchronized int a() {
        int i;
        synchronized (defpackage.cqa.class) {
            i = b + 1;
            b = i;
            b %= 3;
        }
        return i;
    }
}
