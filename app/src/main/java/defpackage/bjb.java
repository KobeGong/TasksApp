package defpackage;

import android.util.Log;
import java.util.Locale;

/* renamed from: bjb  reason: default package */
/* compiled from: PG */
public final class bjb {
    private final String a;
    private final String b;
    private final int c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bjb(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = ""
        L_0x0005:
            r6.<init>(r7, r0)
            return
        L_0x0009:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 91
            r1.append(r0)
            int r2 = r8.length
            r0 = 0
        L_0x0015:
            if (r0 >= r2) goto L_0x002b
            r3 = r8[r0]
            int r4 = r1.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0025
            java.lang.String r4 = ","
            r1.append(r4)
        L_0x0025:
            r1.append(r3)
            int r0 = r0 + 1
            goto L_0x0015
        L_0x002b:
            r0 = 93
            java.lang.StringBuilder r0 = r1.append(r0)
            r2 = 32
            r0.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjb.<init>(java.lang.String, java.lang.String[]):void");
    }

    private bjb(String str, String str2) {
        this.b = str2;
        this.a = str;
        new avi(str, (byte) 0);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public final void a(String str, Object... objArr) {
        if (this.c <= 3) {
            c(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        Log.w(this.a, c(str, objArr));
    }

    public final String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }
}
