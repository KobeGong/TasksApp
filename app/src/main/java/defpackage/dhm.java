package defpackage;

import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: dhm  reason: default package */
/* compiled from: PG */
public final class dhm implements dkc {
    private final dhj a;
    private int b;
    private int c;
    private int d = 0;

    public static dhm a(dhj dhj) {
        if (dhj.d != null) {
            return dhj.d;
        }
        return new dhm(dhj);
    }

    private dhm(dhj dhj) {
        this.a = (dhj) dim.a((Object) dhj, "input");
        this.a.d = this;
    }

    @Override // defpackage.dkc
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

    @Override // defpackage.dkc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dkc
    public final boolean c() {
        if (this.a.t() || this.b == this.c) {
            return false;
        }
        return this.a.b(this.b);
    }

    private final void a(int i) {
        if ((this.b & 7) != i) {
            throw dir.f();
        }
    }

    @Override // defpackage.dkc
    public final double d() {
        a(1);
        return this.a.b();
    }

    @Override // defpackage.dkc
    public final float e() {
        a(5);
        return this.a.c();
    }

    @Override // defpackage.dkc
    public final long f() {
        a(0);
        return this.a.d();
    }

    @Override // defpackage.dkc
    public final long g() {
        a(0);
        return this.a.e();
    }

    @Override // defpackage.dkc
    public final int h() {
        a(0);
        return this.a.f();
    }

    @Override // defpackage.dkc
    public final long i() {
        a(1);
        return this.a.g();
    }

    @Override // defpackage.dkc
    public final int j() {
        a(5);
        return this.a.h();
    }

    @Override // defpackage.dkc
    public final boolean k() {
        a(0);
        return this.a.i();
    }

    @Override // defpackage.dkc
    public final String l() {
        a(2);
        return this.a.j();
    }

    @Override // defpackage.dkc
    public final String m() {
        a(2);
        return this.a.k();
    }

    @Override // defpackage.dkc
    public final Object a(dkh dkh, dhw dhw) {
        a(2);
        return c(dkh, dhw);
    }

    @Override // defpackage.dkc
    public final Object b(dkh dkh, dhw dhw) {
        a(3);
        return d(dkh, dhw);
    }

    private final Object c(dkh dkh, dhw dhw) {
        int m = this.a.m();
        if (this.a.a >= this.a.b) {
            throw dir.g();
        }
        int c2 = this.a.c(m);
        Object a2 = dkh.a();
        this.a.a++;
        dkh.a(a2, this, dhw);
        dkh.c(a2);
        this.a.a(0);
        dhj dhj = this.a;
        dhj.a--;
        this.a.d(c2);
        return a2;
    }

    private final Object d(dkh dkh, dhw dhw) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            Object a2 = dkh.a();
            dkh.a(a2, this, dhw);
            dkh.c(a2);
            if (this.b == this.c) {
                return a2;
            }
            throw dir.i();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.dkc
    public final dha n() {
        a(2);
        return this.a.l();
    }

    @Override // defpackage.dkc
    public final int o() {
        a(0);
        return this.a.m();
    }

    @Override // defpackage.dkc
    public final int p() {
        a(0);
        return this.a.n();
    }

    @Override // defpackage.dkc
    public final int q() {
        a(5);
        return this.a.o();
    }

    @Override // defpackage.dkc
    public final long r() {
        a(1);
        return this.a.p();
    }

    @Override // defpackage.dkc
    public final int s() {
        a(0);
        return this.a.q();
    }

    @Override // defpackage.dkc
    public final long t() {
        a(0);
        return this.a.r();
    }

    @Override // defpackage.dkc
    public final void a(List list) {
        int a2;
        int a3;
        if (list instanceof dhu) {
            dhu dhu = (dhu) list;
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
                    throw dir.f();
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
                    list.add(Double.valueOf(this.a.b()));
                } while (this.a.u() < u2);
                return;
            default:
                throw dir.f();
        }
        do {
            list.add(Double.valueOf(this.a.b()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void b(List list) {
        int a2;
        int a3;
        if (list instanceof die) {
            die die = (die) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        die.a(this.a.c());
                    } while (this.a.u() < u);
                    return;
                case 3:
                case 4:
                default:
                    throw dir.f();
                case 5:
                    break;
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
                    list.add(Float.valueOf(this.a.c()));
                } while (this.a.u() < u2);
                return;
            case 3:
            case 4:
            default:
                throw dir.f();
            case 5:
                break;
        }
        do {
            list.add(Float.valueOf(this.a.c()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void c(List list) {
        int a2;
        int a3;
        if (list instanceof djd) {
            djd djd = (djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.d());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.d()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.d()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void d(List list) {
        int a2;
        int a3;
        if (list instanceof djd) {
            djd djd = (djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.e());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.e()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.e()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void e(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.f());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.f()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.f()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void f(List list) {
        int a2;
        int a3;
        if (list instanceof djd) {
            djd djd = (djd) list;
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
                    throw dir.f();
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
                    list.add(Long.valueOf(this.a.g()));
                } while (this.a.u() < u2);
                return;
            default:
                throw dir.f();
        }
        do {
            list.add(Long.valueOf(this.a.g()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void g(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        dil.d(this.a.h());
                    } while (this.a.u() < u);
                    return;
                case 3:
                case 4:
                default:
                    throw dir.f();
                case 5:
                    break;
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
                    list.add(Integer.valueOf(this.a.h()));
                } while (this.a.u() < u2);
                return;
            case 3:
            case 4:
            default:
                throw dir.f();
            case 5:
                break;
        }
        do {
            list.add(Integer.valueOf(this.a.h()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void h(List list) {
        int a2;
        int a3;
        if (list instanceof dgy) {
            dgy dgy = (dgy) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dgy.a(this.a.i());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Boolean.valueOf(this.a.i()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Boolean.valueOf(this.a.i()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void i(List list) {
        a(list, false);
    }

    @Override // defpackage.dkc
    public final void j(List list) {
        a(list, true);
    }

    private final void a(List list, boolean z) {
        int a2;
        int a3;
        if ((this.b & 7) != 2) {
            throw dir.f();
        } else if (!(list instanceof diz) || z) {
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
            diz diz = (diz) list;
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

    @Override // defpackage.dkc
    public final void a(List list, dkh dkh, dhw dhw) {
        int a2;
        if ((this.b & 7) != 2) {
            throw dir.f();
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

    @Override // defpackage.dkc
    public final void b(List list, dkh dkh, dhw dhw) {
        int a2;
        if ((this.b & 7) != 3) {
            throw dir.f();
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

    @Override // defpackage.dkc
    public final void k(List list) {
        int a2;
        if ((this.b & 7) != 2) {
            throw dir.f();
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

    @Override // defpackage.dkc
    public final void l(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.m());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.m()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void m(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.n());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.n()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void n(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 2:
                    int m = this.a.m();
                    c(m);
                    int u = m + this.a.u();
                    do {
                        dil.d(this.a.o());
                    } while (this.a.u() < u);
                    return;
                case 3:
                case 4:
                default:
                    throw dir.f();
                case 5:
                    break;
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
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.u() < u2);
                return;
            case 3:
            case 4:
            default:
                throw dir.f();
            case 5:
                break;
        }
        do {
            list.add(Integer.valueOf(this.a.o()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void o(List list) {
        int a2;
        int a3;
        if (list instanceof djd) {
            djd djd = (djd) list;
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
                    throw dir.f();
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
                    list.add(Long.valueOf(this.a.p()));
                } while (this.a.u() < u2);
                return;
            default:
                throw dir.f();
        }
        do {
            list.add(Long.valueOf(this.a.p()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void p(List list) {
        int a2;
        int a3;
        if (list instanceof dil) {
            dil dil = (dil) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        dil.d(this.a.q());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Integer.valueOf(this.a.q()));
            if (!this.a.t()) {
                a2 = this.a.a();
            } else {
                return;
            }
        } while (a2 == this.b);
        this.d = a2;
    }

    @Override // defpackage.dkc
    public final void q(List list) {
        int a2;
        int a3;
        if (list instanceof djd) {
            djd djd = (djd) list;
            switch (this.b & 7) {
                case 0:
                    break;
                case 1:
                default:
                    throw dir.f();
                case 2:
                    int m = this.a.m() + this.a.u();
                    do {
                        djd.a(this.a.r());
                    } while (this.a.u() < m);
                    d(m);
                    return;
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
            case 1:
            default:
                throw dir.f();
            case 2:
                int m2 = this.a.m() + this.a.u();
                do {
                    list.add(Long.valueOf(this.a.r()));
                } while (this.a.u() < m2);
                d(m2);
                return;
        }
        do {
            list.add(Long.valueOf(this.a.r()));
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
            throw dir.i();
        }
    }

    @Override // defpackage.dkc
    public final void a(Map map, dji dji, dhw dhw) {
        a(2);
        int c2 = this.a.c(this.a.m());
        Object obj = dji.b;
        Object obj2 = dji.d;
        while (true) {
            try {
                int a2 = a();
                if (a2 != Integer.MAX_VALUE && !this.a.t()) {
                    switch (a2) {
                        case 1:
                            obj = a(dji.a, (Class) null, (dhw) null);
                            break;
                        case 2:
                            obj2 = a(dji.c, dji.d.getClass(), dhw);
                            break;
                        default:
                            try {
                                if (c()) {
                                    break;
                                } else {
                                    throw new dir("Unable to parse map entry.");
                                }
                            } catch (dis e) {
                                if (c()) {
                                    break;
                                } else {
                                    throw new dir("Unable to parse map entry.");
                                }
                            }
                    }
                } else {
                    map.put(obj, obj2);
                }
            } finally {
                this.a.d(c2);
            }
        }
        map.put(obj, obj2);
    }

    private final Object a(dln dln, Class cls, dhw dhw) {
        switch (dln.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(e());
            case 2:
                return Long.valueOf(g());
            case 3:
                return Long.valueOf(f());
            case 4:
                return Integer.valueOf(h());
            case 5:
                return Long.valueOf(i());
            case 6:
                return Integer.valueOf(j());
            case 7:
                return Boolean.valueOf(k());
            case 8:
                return m();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                a(2);
                return c(djz.a.a(cls), dhw);
            case 11:
                return n();
            case 12:
                return Integer.valueOf(o());
            case 13:
                return Integer.valueOf(p());
            case 14:
                return Integer.valueOf(q());
            case 15:
                return Long.valueOf(r());
            case 16:
                return Integer.valueOf(s());
            case 17:
                return Long.valueOf(t());
        }
    }

    private static void c(int i) {
        if ((i & 3) != 0) {
            throw dir.i();
        }
    }

    private final void d(int i) {
        if (this.a.u() != i) {
            throw dir.a();
        }
    }
}
