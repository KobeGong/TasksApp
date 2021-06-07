package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: cis  reason: default package */
/* compiled from: PG */
public final class cis {
    public static final Set a = new HashSet(Arrays.asList("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com"));
    public static final Pattern b = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern c = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final Pattern e = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern f = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern g = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    public final cly d;

    cis(cly cly) {
        this.d = cly;
    }

    static String a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String a(String str, cly cly, boolean z) {
        String str2;
        boolean z2;
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (cly == null || z) {
            str2 = str;
        } else {
            str2 = cly.a();
        }
        if (z) {
            z2 = true;
        } else {
            String a2 = a(str2);
            if (a2 != null) {
                str2 = a2;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        Matcher matcher = e.matcher(str2);
        if (matcher.find()) {
            str2 = matcher.group(1);
            z2 = true;
        }
        Matcher matcher2 = g.matcher(str2);
        if (matcher2.find()) {
            str2 = matcher2.replaceFirst("<ip>");
            z2 = true;
        }
        if (z2) {
            return str2;
        }
        Matcher matcher3 = f.matcher(str2);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }
}
