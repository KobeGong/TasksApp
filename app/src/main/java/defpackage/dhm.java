package defpackage;

/* renamed from: dhm reason: default package */
/* compiled from: PG */
final class dhm implements defpackage.dkc {
    private final defpackage.dhj a;
    private int b;
    private int c;
    private int d = 0;

    public static defpackage.dhm a(defpackage.dhj dhj) {
        if (dhj.d != null) {
            return dhj.d;
        }
        return new defpackage.dhm(dhj);
    }

    private dhm(defpackage.dhj dhj) {
        this.a = (defpackage.dhj) defpackage.dim.a((java.lang.Object) dhj, "input");
        this.a.d = this;
    }

    public final int a() {
        if (this.d != 0) {
            this.b = this.d;
            this.d = 0;
        } else {
            this.b = this.a.a();
        }
        if (this.b == 0 || this.b == this.c) {
            return Integer.MAX_VALUE;
        }
        return this.b >>> 3;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        if (this.a.t() || this.b == this.c) {
            return false;
        }
        return this.a.b(this.b);
    }

    private final void a(int i) {
        if ((this.b & 7) != i) {
            throw defpackage.dir.f();
        }
    }

    public final double d() {
        a(1);
        return this.a.b();
    }

    public final float e() {
        a(5);
        return this.a.c();
    }

    public final long f() {
        a(0);
        return this.a.d();
    }

    public final long g() {
        a(0);
        return this.a.e();
    }

    public final int h() {
        a(0);
        return this.a.f();
    }

    public final long i() {
        a(1);
        return this.a.g();
    }

    public final int j() {
        a(5);
        return this.a.h();
    }

    public final boolean k() {
        a(0);
        return this.a.i();
    }

    public final java.lang.String l() {
        a(2);
        return this.a.j();
    }

    public final java.lang.String m() {
        a(2);
        return this.a.k();
    }

    public final java.lang.Object a(defpackage.dkh dkh, defpackage.dhw dhw) {
        a(2);
        return c(dkh, dhw);
    }

    public final java.lang.Object b(defpackage.dkh dkh, defpackage.dhw dhw) {
        a(3);
        return d(dkh, dhw);
    }

    private final java.lang.Object c(defpackage.dkh dkh, defpackage.dhw dhw) {
        int m = this.a.m();
        if (this.a.a >= this.a.b) {
            throw defpackage.dir.g();
        }
        int c2 = this.a.c(m);
        java.lang.Object a2 = dkh.a();
        this.a.a++;
        dkh.a(a2, this, dhw);
        dkh.c(a2);
        this.a.a(0);
        this.a.a--;
        this.a.d(c2);
        return a2;
    }

    private final java.lang.Object d(defpackage.dkh dkh, defpackage.dhw dhw) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            java.lang.Object a2 = dkh.a();
            dkh.a(a2, this, dhw);
            dkh.c(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw defpackage.dir.i();
        } finally {
            this.c = i;
        }
    }

    public final defpackage.dha n() {
        a(2);
        return this.a.l();
    }

    public final int o() {
        a(0);
        return this.a.m();
    }

    public final int p() {
        a(0);
        return this.a.n();
    }

    public final int q() {
        a(5);
        return this.a.o();
    }

    public final long r() {
        a(1);
        return this.a.p();
    }

    public final int s() {
        a(0);
        return this.a.q();
    }

    public final long t() {
        a(0);
        return this.a.r();
    }

    public final void a(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dhu) {
            defpackage.dhu dhu = (defpackage.dhu) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.a.m();
                    b(m);
                    int u = m + this.a.u();
                    do {
                        dhu.a(this.a.b());
                    } while (this.a.u() < u);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dhu.a(this.a.b());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.a.m();
                b(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Double.valueOf(this.a.b()));
                } while (this.a.u() < u2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Double.valueOf(this.a.b()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void b(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.die) {
            defpackage.die die = (defpackage.die) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        die.a(this.a.c());
                    } while (this.a.u() < u);
                    return;
                case 5:
                    break;
                default:
                    throw defpackage.dir.f();
            }
            do {
                die.a(this.a.c());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int m2 = this.a.m();
                c(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Float.valueOf(this.a.c()));
                } while (this.a.u() < u2);
                return;
            case 5:
                break;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Float.valueOf(this.a.c()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void c(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.d());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                djd.a(this.a.d());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Long.valueOf(this.a.d()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Long.valueOf(this.a.d()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void d(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.e());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                djd.a(this.a.e());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Long.valueOf(this.a.e()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Long.valueOf(this.a.e()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void e(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.f());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.f());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.f()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.f()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void f(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.a.m();
                    b(m);
                    int u = m + this.a.u();
                    do {
                        djd.a(this.a.g());
                    } while (this.a.u() < u);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                djd.a(this.a.g());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.a.m();
                b(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Long.valueOf(this.a.g()));
                } while (this.a.u() < u2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Long.valueOf(this.a.g()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void g(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        dil.d(this.a.h());
                    } while (this.a.u() < u);
                    return;
                case 5:
                    break;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.h());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int m2 = this.a.m();
                c(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.h()));
                } while (this.a.u() < u2);
                return;
            case 5:
                break;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.h()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void h(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dgy) {
            defpackage.dgy dgy = (defpackage.dgy) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dgy.a(this.a.i());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dgy.a(this.a.i());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Boolean.valueOf(this.a.i()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Boolean.valueOf(this.a.i()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void i(java.util.List list) {
        a(list, false);
    }

    public final void j(java.util.List list) {
        a(list, true);
    }

    private final void a(java.util.List list, boolean z) {
        int a2;
        int a3;
        if ((this.b & 7) != 2) {
            throw defpackage.dir.f();
        } else if (!(list instanceof defpackage.diz) || z) {
            do {
                list.add(z ? m() : l());
                if (!this.a.t()) {
                    a2 = this.a.a();
                } else {
                    return;
                }
            } while (a2 == this.b);
            this.d = a2;
        } else {
            defpackage.diz diz = (defpackage.diz) list;
            do {
                diz.a(n());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
        }
    }

    public final void a(java.util.List list, defpackage.dkh dkh, defpackage.dhw dhw) {
        int a2;
        if ((this.b & 7) != 2) {
            throw defpackage.dir.f();
        }
        int i = this.b;
        do {
            list.add(c(dkh, dhw));
            if (!this.a.t() && this.d == 0) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == i);
        this.d = a2;
    }

    public final void b(java.util.List list, defpackage.dkh dkh, defpackage.dhw dhw) {
        int a2;
        if ((this.b & 7) != 3) {
            throw defpackage.dir.f();
        }
        int i = this.b;
        do {
            list.add(d(dkh, dhw));
            if (!this.a.t() && this.d == 0) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == i);
        this.d = a2;
    }

    public final void k(java.util.List list) {
        int a2;
        if ((this.b & 7) != 2) {
            throw defpackage.dir.f();
        }
        do {
            list.add(n());
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void l(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.m());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.m());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.m()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.m()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void m(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.n());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.n());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.n()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.n()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void n(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        dil.d(this.a.o());
                    } while (this.a.u() < u);
                    return;
                case 5:
                    break;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.o());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 2:
                int m2 = this.a.m();
                c(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.o()));
                } while (this.a.u() < u2);
                return;
            case 5:
                break;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.o()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void o(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            switch (this.b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.a.m();
                    b(m);
                    int u = m + this.a.u();
                    do {
                        djd.a(this.a.p());
                    } while (this.a.u() < u);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                djd.a(this.a.p());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.a.m();
                b(m2);
                int u2 = m2 + this.a.u();
                do {
                    list.add(java.lang.Long.valueOf(this.a.p()));
                } while (this.a.u() < u2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Long.valueOf(this.a.p()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void p(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.dil) {
            defpackage.dil dil = (defpackage.dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.q());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                dil.d(this.a.q());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Integer.valueOf(this.a.q()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Integer.valueOf(this.a.q()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    public final void q(java.util.List list) {
        int a2;
        int a3;
        if (list instanceof defpackage.djd) {
            defpackage.djd djd = (defpackage.djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.r());
                    } while (this.a.u() < m);
                    d(m);
                    return;
                default:
                    throw defpackage.dir.f();
            }
            do {
                djd.a(this.a.r());
                if (!this.a.t()) {
                    a3 = this.a.a();
                } else {
                    return;
                }
            } while (a3 == this.b);
            this.d = a3;
            return;
        }
        switch (this.b & 7) {
            case 0:
                break;
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(java.lang.Long.valueOf(this.a.r()));
                } while (this.a.u() < m2);
                d(m2);
                return;
            default:
                throw defpackage.dir.f();
        }
        do {
            list.add(java.lang.Long.valueOf(this.a.r()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    private static void b(int i) {
        if ((i & 7) != 0) {
            throw defpackage.dir.i();
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.Map r7, defpackage.dji r8, defpackage.dhw r9) {
        /*
            r6 = this;
            r0 = 2
            r6.a(r0)
            dhj r0 = r6.a
            int r0 = r0.m()
            dhj r1 = r6.a
            int r2 = r1.c(r0)
            java.lang.Object r1 = r8.b
            java.lang.Object r0 = r8.d
        L_0x0014:
            int r3 = r6.a()     // Catch:{ all -> 0x0045 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x0062
            dhj r4 = r6.a     // Catch:{ all -> 0x0045 }
            boolean r4 = r4.t()     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x0062
            switch(r3) {
                case 1: goto L_0x004c;
                case 2: goto L_0x0055;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r6.c()     // Catch:{ dis -> 0x0036 }
            if (r3 != 0) goto L_0x0014
            dir r3 = new dir     // Catch:{ dis -> 0x0036 }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ dis -> 0x0036 }
            throw r3     // Catch:{ dis -> 0x0036 }
        L_0x0036:
            r3 = move-exception
            boolean r3 = r6.c()     // Catch:{ all -> 0x0045 }
            if (r3 != 0) goto L_0x0014
            dir r0 = new dir     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = "Unable to parse map entry."
            r0.<init>(r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            dhj r1 = r6.a
            r1.d(r2)
            throw r0
        L_0x004c:
            dln r3 = r8.a     // Catch:{ dis -> 0x0036 }
            r4 = 0
            r5 = 0
            java.lang.Object r1 = r6.a(r3, r4, r5)     // Catch:{ dis -> 0x0036 }
            goto L_0x0014
        L_0x0055:
            dln r3 = r8.c     // Catch:{ dis -> 0x0036 }
            java.lang.Object r4 = r8.d     // Catch:{ dis -> 0x0036 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ dis -> 0x0036 }
            java.lang.Object r0 = r6.a(r3, r4, r9)     // Catch:{ dis -> 0x0036 }
            goto L_0x0014
        L_0x0062:
            r7.put(r1, r0)     // Catch:{ all -> 0x0045 }
            dhj r0 = r6.a
            r0.d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhm.a(java.util.Map, dji, dhw):void");
    }

    private final java.lang.Object a(defpackage.dln dln, java.lang.Class cls, defpackage.dhw dhw) {
        switch (dln.ordinal()) {
            case 0:
                return java.lang.Double.valueOf(d());
            case 1:
                return java.lang.Float.valueOf(e());
            case 2:
                return java.lang.Long.valueOf(g());
            case 3:
                return java.lang.Long.valueOf(f());
            case 4:
                return java.lang.Integer.valueOf(h());
            case 5:
                return java.lang.Long.valueOf(i());
            case 6:
                return java.lang.Integer.valueOf(j());
            case 7:
                return java.lang.Boolean.valueOf(k());
            case 8:
                return m();
            case 10:
                a(2);
                return c(defpackage.djz.a.a(cls), dhw);
            case 11:
                return n();
            case 12:
                return java.lang.Integer.valueOf(o());
            case 13:
                return java.lang.Integer.valueOf(p());
            case 14:
                return java.lang.Integer.valueOf(q());
            case 15:
                return java.lang.Long.valueOf(r());
            case 16:
                return java.lang.Integer.valueOf(s());
            case 17:
                return java.lang.Long.valueOf(t());
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw defpackage.dir.i();
        }
    }

    private final void d(int i) {
        if (this.a.u() != i) {
            throw defpackage.dir.a();
        }
    }
}
