package defpackage;

/* renamed from: gq reason: default package */
/* compiled from: PG */
public final class gq {
    private static defpackage.gq c;
    public final java.lang.Object a = new java.lang.Object();
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.gr(this));

    public static defpackage.gq a() {
        if (c == null) {
            c = new defpackage.gq();
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
