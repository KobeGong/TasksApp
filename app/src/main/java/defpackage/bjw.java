package defpackage;

/* renamed from: bjw reason: default package */
/* compiled from: PG */
public final class bjw {
    public static final defpackage.bjw a = new defpackage.bjw();
    private java.util.regex.Pattern[] b = new java.util.regex.Pattern[0];

    private bjw() {
    }

    public final synchronized void a(java.lang.String[] strArr, java.lang.String[] strArr2) {
        boolean z;
        synchronized (this) {
            if (strArr.length == strArr2.length) {
                z = true;
            } else {
                z = false;
            }
            defpackage.azb.b(z);
            this.b = new java.util.regex.Pattern[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                this.b[i] = java.util.regex.Pattern.compile(strArr[i]);
            }
        }
    }
}
