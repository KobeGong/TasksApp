package defpackage;

/* renamed from: cis reason: default package */
/* compiled from: PG */
final class cis {
    public static final java.util.Set a = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[]{"googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com"}));
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("([^\\?]+)(\\?+)");
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    public final defpackage.cly d;

    cis(defpackage.cly cly) {
        this.d = cly;
    }

    static java.lang.String a(java.lang.String str) {
        java.util.regex.Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static java.lang.String a(java.lang.String str, defpackage.cly cly, boolean z) {
        java.lang.String str2;
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
            java.lang.String a2 = a(str2);
            if (a2 != null) {
                str2 = a2;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        java.util.regex.Matcher matcher = e.matcher(str2);
        if (matcher.find()) {
            str2 = matcher.group(1);
            z2 = true;
        }
        java.util.regex.Matcher matcher2 = g.matcher(str2);
        if (matcher2.find()) {
            str2 = matcher2.replaceFirst("<ip>");
            z2 = true;
        }
        if (z2) {
            return str2;
        }
        java.util.regex.Matcher matcher3 = f.matcher(str2);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }
}
