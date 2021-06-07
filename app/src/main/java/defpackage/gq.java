package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: gq  reason: default package */
/* compiled from: PG */
public final class gq {
    private static gq c;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new gr(this));

    public static gq a() {
        if (c == null) {
            c = new gq();
        }
        return c;
    }

    private gq() {
    }

    public final void b() {
        synchronized (this.a) {
        }
    }

    public final void c() {
        synchronized (this.a) {
        }
    }
}
