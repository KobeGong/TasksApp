package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* renamed from: bvm  reason: default package */
final /* synthetic */ class bvm implements Runnable {
    private final bvn a;
    private final Intent b;

    bvm(bvn bvn, Intent intent) {
        this.a = bvn;
        this.b = intent;
    }

    public final void run() {
        boolean z;
        long j;
        boolean z2 = true;
        bvn bvn = this.a;
        Intent intent = this.b;
        cld.a(intent != null);
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
        cld.a(z2);
        bvp bvp = new bvp();
        bvp.a = Long.valueOf(j);
        bvn.a(intent, bvp.a(SystemClock.uptimeMillis()).a());
    }
}
