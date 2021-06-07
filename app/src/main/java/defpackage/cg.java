package defpackage;

import java.util.HashSet;

/* renamed from: cg  reason: default package */
/* compiled from: PG */
public final class cg {
    public final ch a;
    public final int b;
    public cg c;
    public int d = 0;
    public int e = bg.l;
    public int f = bg.j;
    public int g = 0;
    public cf h;
    private int i = -1;

    public cg(ch chVar, int i2) {
        this.a = chVar;
        this.b = i2;
    }

    public final void a() {
        if (this.h == null) {
            this.h = new cf(bg.f);
        } else {
            this.h.a();
        }
    }

    public final int b() {
        if (this.a.J == 8) {
            return 0;
        }
        if (this.i < 0 || this.c == null || this.c.a.J != 8) {
            return this.d;
        }
        return this.i;
    }

    public final void c() {
        this.c = null;
        this.d = 0;
        this.i = -1;
        this.e = bg.m;
        this.g = 0;
        this.f = bg.j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(defpackage.cg r6, int r7, int r8, int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg.a(cg, int, int, int, int, boolean):boolean");
    }

    public final boolean d() {
        return this.c != null;
    }

    public final String toString() {
        return ((String) null) + ":" + bg.v[this.b - 1] + (this.c != null ? " connected to " + this.c.a(new HashSet()) : "");
    }

    private final String a(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        return ((String) null) + ":" + bg.v[this.b - 1] + (this.c != null ? " connected to " + this.c.a(hashSet) : "");
    }
}
