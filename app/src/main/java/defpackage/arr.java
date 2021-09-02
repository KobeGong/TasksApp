package defpackage;

/* renamed from: arr reason: default package */
/* compiled from: PG */
final class arr {
    private static defpackage.arr e;
    public final java.lang.Object a = new java.lang.Object();
    public final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.ars(this));
    public defpackage.aru c;
    public defpackage.aru d;

    static defpackage.arr a() {
        if (e == null) {
            e = new defpackage.arr();
        }
        return e;
    }

    private arr() {
    }

    public final void a(defpackage.art art) {
        synchronized (this.a) {
            if (e(art) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void b(defpackage.art art) {
        synchronized (this.a) {
            if (e(art) && this.c.c) {
                this.c.c = false;
                a(this.c);
            }
        }
    }

    public final boolean c(defpackage.art art) {
        boolean e2;
        synchronized (this.a) {
            e2 = e(art);
        }
        return e2;
    }

    public final boolean d(defpackage.art art) {
        boolean z;
        synchronized (this.a) {
            z = e(art) || f(art);
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (this.d != null) {
            this.c = this.d;
            this.d = null;
            defpackage.art art = (defpackage.art) this.c.a.get();
            if (art != null) {
                defpackage.ard.a.sendMessage(defpackage.ard.a.obtainMessage(0, art.a));
            } else {
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.aru aru, int i) {
        defpackage.art art = (defpackage.art) aru.a.get();
        if (art == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(aru);
        defpackage.ard.a.sendMessage(defpackage.ard.a.obtainMessage(1, i, 0, art.a));
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e(defpackage.art art) {
        return this.c != null && this.c.a(art);
    }

    /* access modifiers changed from: 0000 */
    public final boolean f(defpackage.art art) {
        return this.d != null && this.d.a(art);
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.aru aru) {
        if (aru.b != -2) {
            int i = 2750;
            if (aru.b > 0) {
                i = aru.b;
            } else if (aru.b == -1) {
                i = 1500;
            }
            this.b.removeCallbacksAndMessages(aru);
            this.b.sendMessageDelayed(android.os.Message.obtain(this.b, 0, aru), (long) i);
        }
    }
}
