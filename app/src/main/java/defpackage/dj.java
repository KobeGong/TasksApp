package defpackage;

import android.view.View;

/* renamed from: dj  reason: default package */
/* compiled from: PG */
public final class dj {
    public int a;
    public int b;
    private final View c;
    private int d;

    public dj(View view) {
        this.c = view;
    }

    public final void a() {
        this.a = this.c.getTop();
        this.d = this.c.getLeft();
        b();
    }

    private final void b() {
        sn.b(this.c, this.b - (this.c.getTop() - this.a));
        sn.c(this.c, 0 - (this.c.getLeft() - this.d));
    }

    public final boolean a(int i) {
        if (this.b == i) {
            return false;
        }
        this.b = i;
        b();
        return true;
    }
}
