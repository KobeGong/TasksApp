package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

@Deprecated
/* renamed from: cqa  reason: default package */
/* compiled from: PG */
public final class cqa {
    private static final Pattern a = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
    private static int b;

    static String a(int i, int i2, String str) {
        String str2;
        Set<String> unmodifiableSet;
        if (str == null) {
            return str;
        }
        if (!(str == null ? false : a.matcher(str).find())) {
            str2 = str;
            str = new StringBuilder(81).append("https://images").append(a()).append("-esmobile-opensocial.googleusercontent.com/gadgets/proxy").toString();
        } else {
            str2 = null;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.EMPTY.buildUpon();
        buildUpon.authority(parse.getAuthority());
        buildUpon.scheme(parse.getScheme());
        buildUpon.path(parse.getPath());
        if (!(i == -1 || i2 == -1)) {
            buildUpon.appendQueryParameter("resize_w", Integer.toString(i));
            buildUpon.appendQueryParameter("resize_h", Integer.toString(i2));
            buildUpon.appendQueryParameter("no_expand", "1");
        }
        Uri build = buildUpon.build();
        if (parse.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
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
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i3, indexOf2)));
                i3 = indexOf + 1;
            } while (i3 < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        Uri uri = build;
        for (String str3 : unmodifiableSet) {
            if (uri.getQueryParameter(str3) == null) {
                boolean z = "resize_w".equals(str3) || "resize_h".equals(str3) || "no_expand".equals(str3);
                boolean z2 = i == -1 || i2 == -1;
                Uri.Builder buildUpon2 = uri.buildUpon();
                if ("url".equals(str3)) {
                    buildUpon2.appendQueryParameter("url", parse.getQueryParameter("url"));
                } else if (!z2 || !z) {
                    for (String str4 : parse.getQueryParameters(str3)) {
                        buildUpon2.appendQueryParameter(str3, str4);
                    }
                }
                uri = buildUpon2.build();
            }
        }
        if (str2 != null && uri.getQueryParameter("url") == null) {
            Uri.Builder buildUpon3 = uri.buildUpon();
            buildUpon3.appendQueryParameter("url", str2);
            uri = buildUpon3.build();
        }
        if (uri.getQueryParameter("container") == null) {
            Uri.Builder buildUpon4 = uri.buildUpon();
            buildUpon4.appendQueryParameter("container", "esmobile");
            uri = buildUpon4.build();
        }
        if (uri.getQueryParameter("gadget") == null) {
            Uri.Builder buildUpon5 = uri.buildUpon();
            buildUpon5.appendQueryParameter("gadget", "a");
            uri = buildUpon5.build();
        }
        if (uri.getQueryParameter("rewriteMime") == null) {
            Uri.Builder buildUpon6 = uri.buildUpon();
            buildUpon6.appendQueryParameter("rewriteMime", "image/*");
            uri = buildUpon6.build();
        }
        return uri.toString();
    }

    private static synchronized int a() {
        int i;
        synchronized (cqa.class) {
            i = b + 1;
            b = i;
            b %= 3;
        }
        return i;
    }
}
