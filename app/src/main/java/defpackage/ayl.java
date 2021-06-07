package defpackage;

/* renamed from: ayl  reason: default package */
/* compiled from: PG */
public class ayl extends Exception {
    public static final long serialVersionUID = 0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ayl(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r1 = r5.f
            java.lang.String r0 = r5.g
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r5.g
        L_0x0008:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + 13
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            return
        L_0x002d:
            java.lang.String r0 = ""
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayl.<init>(com.google.android.gms.common.api.Status):void");
    }

    public ayl() {
    }

    private ayl(String str) {
        super(str);
    }

    private ayl(String str, Throwable th) {
        super(str, th);
    }

    public ayl(Throwable th) {
        super(th);
    }

    public ayl(String str, byte b) {
        this(str);
    }

    public ayl(String str, Exception exc) {
        this(str, (Throwable) exc);
    }

    public ayl(String str, Exception exc, byte b) {
        this(str, exc);
    }
}
