package defpackage;

import android.os.Looper;

/* renamed from: bco  reason: default package */
/* compiled from: PG */
public final class bco {
    public bbm a;
    private Looper b;

    public final ayo a() {
        if (this.a == null) {
            this.a = new bbm();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new ayo(this.a, this.b);
    }
}
