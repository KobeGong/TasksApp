package defpackage;

/* renamed from: bvm reason: default package */
final /* synthetic */ class bvm implements java.lang.Runnable {
    private final defpackage.bvn a;
    private final android.content.Intent b;

    bvm(defpackage.bvn bvn, android.content.Intent intent) {
        this.a = bvn;
        this.b = intent;
    }

    public final void run() {
        boolean z;
        long j;
        boolean z2 = true;
        defpackage.bvn bvn = this.a;
        android.content.Intent intent = this.b;
        defpackage.cld.a(intent != null);
        if ((intent.getFlags() & 268435456) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            j = 10000;
        } else {
            j = 60000;
        }
        if (j < 0) {
            z2 = false;
        }
        defpackage.cld.a(z2);
        defpackage.bvp bvp = new defpackage.bvp();
        bvp.a = java.lang.Long.valueOf(j);
        bvn.a(intent, bvp.a(android.os.SystemClock.uptimeMillis()).a());
    }
}
