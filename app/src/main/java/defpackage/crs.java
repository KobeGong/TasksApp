package defpackage;

import java.util.Arrays;

/* renamed from: crs  reason: default package */
/* compiled from: PG */
public final class crs {
    public boolean a = false;
    private final String b;
    private final crt c = new crt();
    private crt d = this.c;

    public crs(String str) {
        this.b = (String) cld.a(str);
    }

    public final crs a(String str, boolean z) {
        return a(str, String.valueOf(z));
    }

    public final crs a(String str, int i) {
        return a(str, String.valueOf(i));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder append = new StringBuilder(32).append(this.b).append('{');
        String str = "";
        for (crt crt = this.c.c; crt != null; crt = crt.c) {
            Object obj = crt.b;
            if (!z || obj != null) {
                append.append(str);
                str = ", ";
                if (crt.a != null) {
                    append.append(crt.a).append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    append.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    append.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
            }
        }
        return append.append('}').toString();
    }

    public final crt a() {
        crt crt = new crt();
        this.d.c = crt;
        this.d = crt;
        return crt;
    }

    public final crs a(String str, Object obj) {
        crt a2 = a();
        a2.b = obj;
        a2.a = (String) cld.a(str);
        return this;
    }
}
