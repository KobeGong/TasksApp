package defpackage;

import android.text.TextUtils;

/* renamed from: bvh  reason: default package */
/* compiled from: PG */
public final class bvh {
    bvh() {
    }

    public static String a(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            bty.b("QueryHelper", new Exception(), "Error creating IN clause for number: [%d], column [%s]", Integer.valueOf(i), str);
            return "0";
        }
        StringBuilder append = new StringBuilder().append(str).append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            append.append("?,");
        }
        append.append("?)");
        return append.toString();
    }
}
