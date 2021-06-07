package defpackage;

import android.view.View;

/* renamed from: adx  reason: default package */
/* compiled from: PG */
final class adx {
    public aep a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    adx() {
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int b2;
        if (this.d) {
            b2 = this.a.c();
        } else {
            b2 = this.a.b();
        }
        this.c = b2;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }

    public final void a(View view, int i) {
        int a2 = this.a.a();
        if (a2 >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int c2 = (this.a.c() - a2) - this.a.b(view);
            this.c = this.a.c() - c2;
            if (c2 > 0) {
                int e2 = this.c - this.a.e(view);
                int b2 = this.a.b();
                int min = e2 - (b2 + Math.min(this.a.a(view) - b2, 0));
                if (min < 0) {
                    this.c = Math.min(c2, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int a3 = this.a.a(view);
        int b3 = a3 - this.a.b();
        this.c = a3;
        if (b3 > 0) {
            int c3 = (this.a.c() - Math.min(0, (this.a.c() - a2) - this.a.b(view))) - (a3 + this.a.e(view));
            if (c3 < 0) {
                this.c -= Math.min(b3, -c3);
            }
        }
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.c = this.a.b(view) + this.a.a();
        } else {
            this.c = this.a.a(view);
        }
        this.b = i;
    }
}
