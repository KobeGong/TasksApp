package defpackage;

import java.util.regex.Pattern;

/* renamed from: bjw  reason: default package */
/* compiled from: PG */
public final class bjw {
    public static final bjw a = new bjw();
    private Pattern[] b = new Pattern[0];

    private bjw() {
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        synchronized (this) {
            azb.b(strArr.length == strArr2.length);
            this.b = new Pattern[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                this.b[i] = Pattern.compile(strArr[i]);
            }
        }
    }
}
