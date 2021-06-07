package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: arr  reason: default package */
/* compiled from: PG */
public final class arr {
    private static arr e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new ars(this));
    public aru c;
    public aru d;

    static arr a() {
        if (e == null) {
            e = new arr();
        }
        return e;
    }

    private arr() {
    }

    public final void a(art art) {
        synchronized (this.a) {
            if (e(art) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void b(art art) {
        synchronized (this.a) {
            if (e(art) && this.c.c) {
                this.c.c = false;
                a(this.c);
            }
        }
    }

    public final boolean c(art art) {
        boolean e2;
        synchronized (this.a) {
            e2 = e(art);
        }
        return e2;
    }

    public final boolean d(art art) {
        boolean z;
        synchronized (this.a) {
            z = e(art) || f(art);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (this.d != null) {
            this.c = this.d;
            this.d = null;
            art art = (art) this.c.a.get();
            if (art != null) {
                ard.a.sendMessage(ard.a.obtainMessage(0, art.a));
            } else {
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(aru aru, int i) {
        art art = (art) aru.a.get();
        if (art == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(aru);
        ard.a.sendMessage(ard.a.obtainMessage(1, i, 0, art.a));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean e(art art) {
        return this.c != null && this.c.a(art);
    }

    /* access modifiers changed from: package-private */
    public final boolean f(art art) {
        return this.d != null && this.d.a(art);
    }

    /* access modifiers changed from: package-private */
    public final void a(aru aru) {
        if (aru.b != -2) {
            int i = 2750;
            if (aru.b > 0) {
                i = aru.b;
            } else if (aru.b == -1) {
                i = 1500;
            }
            this.b.removeCallbacksAndMessages(aru);
            this.b.sendMessageDelayed(Message.obtain(this.b, 0, aru), (long) i);
        }
    }
}
