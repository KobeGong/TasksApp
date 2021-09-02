package defpackage;

/* renamed from: bvh reason: default package */
/* compiled from: PG */
public final class bvh {
    bvh() {
    }

    public static java.lang.String a(java.lang.String str, int i) {
        if (i <= 0 || android.text.TextUtils.isEmpty(str)) {
            defpackage.bty.b("QueryHelper", new java.lang.Exception(), "Error creating IN clause for number: [%d], column [%s]", java.lang.Integer.valueOf(i), str);
            return "0";
        }
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(str).append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            append.append("?,");
        }
        append.append("?)");
        return append.toString();
    }
}
