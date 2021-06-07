package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: adw  reason: default package */
/* compiled from: PG */
public final class adw extends afd implements aif {
    private int n;
    private adz o;
    private aep p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private aea u;
    private final adx v;
    private final ady w;
    private int x;

    public adw() {
        this((byte) 0);
    }

    public adw(byte b) {
        this.n = 1;
        this.q = false;
        this.r = true;
        this.s = -1;
        this.t = Integer.MIN_VALUE;
        this.u = null;
        this.v = new adx();
        this.w = new ady();
        this.x = 2;
        a((String) null);
        if (1 != this.n || this.p == null) {
            this.p = new aep(this, 0);
            this.v.a = this.p;
            this.n = 1;
            h();
        }
        a((String) null);
    }

    @Override // defpackage.afd
    public final boolean a() {
        return true;
    }

    @Override // defpackage.afd
    public final afh b() {
        return new afh();
    }

    @Override // defpackage.afd
    public final void a(AccessibilityEvent accessibilityEvent) {
        int i = -1;
        super.a(accessibilityEvent);
        if (k() > 0) {
            View a = a(0, k(), false);
            accessibilityEvent.setFromIndex(a == null ? -1 : a(a));
            View a2 = a(k() - 1, -1, false);
            if (a2 != null) {
                i = a(a2);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    @Override // defpackage.afd
    public final Parcelable c() {
        if (this.u != null) {
            return new aea(this.u);
        }
        aea aea = new aea();
        if (k() > 0) {
            y();
            boolean z = this.q;
            aea.c = z;
            if (z) {
                View B = B();
                aea.b = this.p.c() - this.p.b(B);
                aea.a = a(B);
                return aea;
            }
            View A = A();
            aea.a = a(A);
            aea.b = this.p.a(A) - this.p.b();
            return aea;
        }
        aea.a = -1;
        return aea;
    }

    @Override // defpackage.afd
    public final void a(Parcelable parcelable) {
        if (parcelable instanceof aea) {
            this.u = (aea) parcelable;
            h();
        }
    }

    @Override // defpackage.afd
    public final boolean d() {
        return this.n == 0;
    }

    @Override // defpackage.afd
    public final boolean e() {
        return this.n == 1;
    }

    private final void w() {
        boolean z = true;
        if (this.n == 1 || !x()) {
            z = false;
        }
        this.q = z;
    }

    @Override // defpackage.afd
    public final View a(int i) {
        int k = k();
        if (k == 0) {
            return null;
        }
        int a = i - a(e(0));
        if (a >= 0 && a < k) {
            View e = e(a);
            if (a(e) == i) {
                return e;
            }
        }
        return super.a(i);
    }

    private final int h(aft aft) {
        if (aft.a != -1) {
            return this.p.e();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
    @Override // defpackage.afd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.afn r13, defpackage.aft r14) {
        /*
        // Method dump skipped, instructions count: 1204
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adw.a(afn, aft):void");
    }

    @Override // defpackage.afd
    public final void a(aft aft) {
        super.a(aft);
        this.u = null;
        this.s = -1;
        this.t = Integer.MIN_VALUE;
        this.v.a();
    }

    private final int a(int i, afn afn, aft aft, boolean z) {
        int c;
        int c2 = this.p.c() - i;
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -d(-c2, afn, aft);
        int i3 = i + i2;
        if (!z || (c = this.p.c() - i3) <= 0) {
            return i2;
        }
        this.p.a(c);
        return i2 + c;
    }

    private final int b(int i, afn afn, aft aft, boolean z) {
        int b;
        int b2 = i - this.p.b();
        if (b2 <= 0) {
            return 0;
        }
        int i2 = -d(b2, afn, aft);
        int i3 = i + i2;
        if (!z || (b = i3 - this.p.b()) <= 0) {
            return i2;
        }
        this.p.a(-b);
        return i2 - b;
    }

    private final void a(adx adx) {
        d(adx.b, adx.c);
    }

    private final void d(int i, int i2) {
        this.o.c = this.p.c() - i2;
        this.o.e = this.q ? -1 : 1;
        this.o.d = i;
        this.o.f = 1;
        this.o.b = i2;
        this.o.g = Integer.MIN_VALUE;
    }

    private final void b(adx adx) {
        e(adx.b, adx.c);
    }

    private final void e(int i, int i2) {
        int i3;
        this.o.c = i2 - this.p.b();
        this.o.d = i;
        adz adz = this.o;
        if (this.q) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        adz.e = i3;
        this.o.f = -1;
        this.o.b = i2;
        this.o.g = Integer.MIN_VALUE;
    }

    private final boolean x() {
        if (sn.a.j(this.b) == 1) {
            return true;
        }
        return false;
    }

    private final void y() {
        if (this.o == null) {
            this.o = new adz();
        }
    }

    @Override // defpackage.afd
    public final void b(int i) {
        this.s = i;
        this.t = Integer.MIN_VALUE;
        if (this.u != null) {
            this.u.a = -1;
        }
        h();
    }

    private final void f(int i, int i2) {
        this.s = i;
        this.t = i2;
        if (this.u != null) {
            this.u.a = -1;
        }
        h();
    }

    @Override // defpackage.afd
    public final int a(int i, afn afn, aft aft) {
        if (this.n == 1) {
            return 0;
        }
        return d(i, afn, aft);
    }

    @Override // defpackage.afd
    public final int b(int i, afn afn, aft aft) {
        if (this.n == 0) {
            return 0;
        }
        return d(i, afn, aft);
    }

    @Override // defpackage.afd
    public final int b(aft aft) {
        return i(aft);
    }

    @Override // defpackage.afd
    public final int c(aft aft) {
        return i(aft);
    }

    @Override // defpackage.afd
    public final int d(aft aft) {
        return j(aft);
    }

    @Override // defpackage.afd
    public final int e(aft aft) {
        return j(aft);
    }

    @Override // defpackage.afd
    public final int f(aft aft) {
        return k(aft);
    }

    @Override // defpackage.afd
    public final int g(aft aft) {
        return k(aft);
    }

    private final int i(aft aft) {
        int max;
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        aep aep = this.p;
        View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        View b = b(z);
        boolean z2 = this.r;
        boolean z3 = this.q;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        int min = Math.min(afd.a(a), afd.a(b));
        int max2 = Math.max(afd.a(a), afd.a(b));
        if (z3) {
            max = Math.max(0, (aft.a() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z2) {
            return max;
        }
        return Math.round(((float) (aep.b() - aep.a(a))) + ((((float) Math.abs(aep.b(b) - aep.a(a))) / ((float) (Math.abs(afd.a(a) - afd.a(b)) + 1))) * ((float) max)));
    }

    private final int j(aft aft) {
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        aep aep = this.p;
        View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        View b = b(z);
        boolean z2 = this.r;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(afd.a(a) - afd.a(b)) + 1;
        }
        return Math.min(aep.e(), aep.b(b) - aep.a(a));
    }

    private final int k(aft aft) {
        boolean z = true;
        if (k() == 0) {
            return 0;
        }
        y();
        aep aep = this.p;
        View a = a(!this.r);
        if (this.r) {
            z = false;
        }
        View b = b(z);
        boolean z2 = this.r;
        if (k() == 0 || aft.a() == 0 || a == null || b == null) {
            return 0;
        }
        if (!z2) {
            return aft.a();
        }
        return (int) ((((float) (aep.b(b) - aep.a(a))) / ((float) (Math.abs(afd.a(a) - afd.a(b)) + 1))) * ((float) aft.a()));
    }

    private final void a(int i, int i2, boolean z, aft aft) {
        int b;
        int i3 = -1;
        int i4 = 1;
        this.o.k = z();
        this.o.h = h(aft);
        this.o.f = i;
        if (i == 1) {
            this.o.h += this.p.f();
            View B = B();
            adz adz = this.o;
            if (!this.q) {
                i3 = 1;
            }
            adz.e = i3;
            this.o.d = a(B) + this.o.e;
            this.o.b = this.p.b(B);
            b = this.p.b(B) - this.p.c();
        } else {
            View A = A();
            this.o.h += this.p.b();
            adz adz2 = this.o;
            if (!this.q) {
                i4 = -1;
            }
            adz2.e = i4;
            this.o.d = a(A) + this.o.e;
            this.o.b = this.p.a(A);
            b = (-this.p.a(A)) + this.p.b();
        }
        this.o.c = i2;
        if (z) {
            this.o.c -= b;
        }
        this.o.g = b;
    }

    private final boolean z() {
        return this.p.g() == 0 && this.p.d() == 0;
    }

    @Override // defpackage.afd
    public final void a(int i, afg afg) {
        int i2;
        boolean z;
        if (this.u == null || !this.u.a()) {
            w();
            boolean z2 = this.q;
            if (this.s == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.s;
                z = z2;
            }
        } else {
            z = this.u.c;
            i2 = this.u.a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.x && i2 >= 0 && i2 < i; i4++) {
            afg.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // defpackage.afd
    public final void a(int i, int i2, aft aft, afg afg) {
        if (this.n != 0) {
            i = i2;
        }
        if (k() != 0 && i != 0) {
            y();
            a(i > 0 ? 1 : -1, Math.abs(i), true, aft);
            adz adz = this.o;
            int i3 = adz.d;
            if (i3 >= 0 && i3 < aft.a()) {
                afg.a(i3, Math.max(0, adz.g));
            }
        }
    }

    private final int d(int i, afn afn, aft aft) {
        if (k() == 0 || i == 0) {
            return 0;
        }
        this.o.a = true;
        y();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, aft);
        int a = this.o.g + a(afn, this.o, aft, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.p.a(-i);
        this.o.i = i;
        return i;
    }

    @Override // defpackage.afd
    public final void a(String str) {
        if (this.u == null) {
            super.a(str);
        }
    }

    private final void a(afn afn, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, afn);
                }
                return;
            }
            while (i > i2) {
                a(i, afn);
                i--;
            }
        }
    }

    private final void a(afn afn, adz adz) {
        if (adz.a && !adz.k) {
            if (adz.f == -1) {
                int i = adz.g;
                int k = k();
                if (i >= 0) {
                    int d = this.p.d() - i;
                    if (this.q) {
                        for (int i2 = 0; i2 < k; i2++) {
                            View e = e(i2);
                            if (this.p.a(e) < d || this.p.d(e) < d) {
                                a(afn, 0, i2);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i3 = k - 1; i3 >= 0; i3--) {
                        View e2 = e(i3);
                        if (this.p.a(e2) < d || this.p.d(e2) < d) {
                            a(afn, k - 1, i3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i4 = adz.g;
            if (i4 >= 0) {
                int k2 = k();
                if (this.q) {
                    for (int i5 = k2 - 1; i5 >= 0; i5--) {
                        View e3 = e(i5);
                        if (this.p.b(e3) > i4 || this.p.c(e3) > i4) {
                            a(afn, k2 - 1, i5);
                            return;
                        }
                    }
                    return;
                }
                for (int i6 = 0; i6 < k2; i6++) {
                    View e4 = e(i6);
                    if (this.p.b(e4) > i4 || this.p.c(e4) > i4) {
                        a(afn, 0, i6);
                        return;
                    }
                }
            }
        }
    }

    private final int a(afn afn, adz adz, aft aft, boolean z) {
        View view;
        int i;
        int i2;
        int i3;
        int i4;
        int l;
        int f;
        int i5 = adz.c;
        if (adz.g != Integer.MIN_VALUE) {
            if (adz.c < 0) {
                adz.g += adz.c;
            }
            a(afn, adz);
        }
        int i6 = adz.c + adz.h;
        ady ady = this.w;
        while (true) {
            if (!adz.k && i6 <= 0) {
                break;
            }
            if (!(adz.d >= 0 && adz.d < aft.a())) {
                break;
            }
            ady.a = 0;
            ady.b = false;
            ady.c = false;
            ady.d = false;
            if (adz.j != null) {
                int size = adz.j.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        view = null;
                        break;
                    }
                    View view2 = ((afv) adz.j.get(i7)).a;
                    afh afh = (afh) view2.getLayoutParams();
                    if (!afh.a.m() && adz.d == afh.a.c()) {
                        adz.a(view2);
                        view = view2;
                        break;
                    }
                    i7++;
                }
            } else {
                View view3 = afn.a(adz.d, Long.MAX_VALUE).a;
                adz.d += adz.e;
                view = view3;
            }
            if (view == null) {
                ady.b = true;
            } else {
                afh afh2 = (afh) view.getLayoutParams();
                if (adz.j == null) {
                    if (this.q == (adz.f == -1)) {
                        super.a(view, -1, false);
                    } else {
                        super.a(view, 0, false);
                    }
                } else {
                    if (this.q == (adz.f == -1)) {
                        super.a(view, -1, true);
                    } else {
                        super.a(view, 0, true);
                    }
                }
                afh afh3 = (afh) view.getLayoutParams();
                Rect e = this.b.e(view);
                int i8 = e.top;
                int a = afd.a(this.l, this.j, e.left + e.right + 0 + l() + n() + afh3.leftMargin + afh3.rightMargin, afh3.width, d());
                int a2 = afd.a(this.m, this.k, e.bottom + i8 + 0 + m() + o() + afh3.topMargin + afh3.bottomMargin, afh3.height, e());
                if (view.isLayoutRequested() || !this.f || !afd.b(view.getWidth(), a, afh3.width) || !afd.b(view.getHeight(), a2, afh3.height)) {
                    view.measure(a, a2);
                }
                ady.a = this.p.e(view);
                if (this.n == 1) {
                    if (x()) {
                        f = this.l - n();
                        l = f - this.p.f(view);
                    } else {
                        l = l();
                        f = this.p.f(view) + l;
                    }
                    if (adz.f == -1) {
                        int i9 = adz.b;
                        i2 = adz.b - ady.a;
                        i = l;
                        i4 = i9;
                        i3 = f;
                    } else {
                        i2 = adz.b;
                        i = l;
                        i4 = adz.b + ady.a;
                        i3 = f;
                    }
                } else {
                    int m = m();
                    int f2 = this.p.f(view) + m;
                    if (adz.f == -1) {
                        int i10 = adz.b;
                        i = adz.b - ady.a;
                        i2 = m;
                        i3 = i10;
                        i4 = f2;
                    } else {
                        i = adz.b;
                        i2 = m;
                        i3 = adz.b + ady.a;
                        i4 = f2;
                    }
                }
                afh afh4 = (afh) view.getLayoutParams();
                Rect rect = afh4.b;
                view.layout(i + rect.left + afh4.leftMargin, i2 + rect.top + afh4.topMargin, (i3 - rect.right) - afh4.rightMargin, (i4 - rect.bottom) - afh4.bottomMargin);
                if (afh2.a.m() || afh2.a.s()) {
                    ady.c = true;
                }
                ady.d = view.hasFocusable();
            }
            if (ady.b) {
                break;
            }
            adz.b += ady.a * adz.f;
            if (!ady.c || this.o.j != null || !aft.g) {
                adz.c -= ady.a;
                i6 -= ady.a;
            } else {
                i6 = i6;
            }
            if (adz.g != Integer.MIN_VALUE) {
                adz.g += ady.a;
                if (adz.c < 0) {
                    adz.g += adz.c;
                }
                a(afn, adz);
            }
            if (z && ady.d) {
                break;
            }
        }
        return i5 - adz.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.afd
    public final boolean f() {
        boolean z;
        if (!(this.k == 1073741824 || this.j == 1073741824)) {
            int k = k();
            int i = 0;
            while (true) {
                if (i >= k) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = e(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final View A() {
        return e(this.q ? k() - 1 : 0);
    }

    private final View B() {
        return e(this.q ? 0 : k() - 1);
    }

    private final View a(boolean z) {
        if (this.q) {
            return a(k() - 1, -1, z);
        }
        return a(0, k(), z);
    }

    private final View b(boolean z) {
        if (this.q) {
            return a(0, k(), z);
        }
        return a(k() - 1, -1, z);
    }

    private final View l(aft aft) {
        return c(k() - 1, -1, aft.a());
    }

    private final View c(int i, int i2, int i3) {
        View view;
        View view2 = null;
        y();
        int b = this.p.b();
        int c = this.p.c();
        int i4 = i2 > i ? 1 : -1;
        View view3 = null;
        while (i != i2) {
            View e = e(i);
            int a = a(e);
            if (a >= 0 && a < i3) {
                if (((afh) e.getLayoutParams()).a.m()) {
                    if (view3 == null) {
                        view = view2;
                        i += i4;
                        view2 = view;
                        view3 = e;
                    }
                } else if (this.p.a(e) < c && this.p.b(e) >= b) {
                    return e;
                } else {
                    if (view2 == null) {
                        view = e;
                        e = view3;
                        i += i4;
                        view2 = view;
                        view3 = e;
                    }
                }
            }
            view = view2;
            e = view3;
            i += i4;
            view2 = view;
            view3 = e;
        }
        return view2 != null ? view2 : view3;
    }

    private final View C() {
        return g(0, k());
    }

    private final View D() {
        return g(k() - 1, -1);
    }

    private final View a(int i, int i2, boolean z) {
        int i3;
        y();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.n == 0) {
            return this.c.a(i, i2, i3, 320);
        }
        return this.d.a(i, i2, i3, 320);
    }

    private final View g(int i, int i2) {
        int i3;
        int i4;
        y();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return e(i);
        }
        if (this.p.a(e(i)) < this.p.b()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.n == 0) {
            return this.c.a(i, i2, i3, i4);
        }
        return this.d.a(i, i2, i3, i4);
    }

    @Override // defpackage.afd
    public final View c(int i, afn afn, aft aft) {
        int i2;
        View D;
        View view;
        View B;
        View C;
        w();
        if (k() == 0) {
            return null;
        }
        switch (i) {
            case 1:
                if (this.n != 1) {
                    if (!x()) {
                        i2 = -1;
                        break;
                    } else {
                        i2 = 1;
                        break;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            case 2:
                if (this.n != 1) {
                    if (!x()) {
                        i2 = 1;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                } else {
                    i2 = 1;
                    break;
                }
            case 17:
                if (this.n != 0) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = -1;
                    break;
                }
            case 33:
                if (this.n != 1) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = -1;
                    break;
                }
            case 66:
                if (this.n != 0) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = 1;
                    break;
                }
            case 130:
                if (this.n != 1) {
                    i2 = Integer.MIN_VALUE;
                    break;
                } else {
                    i2 = 1;
                    break;
                }
            default:
                i2 = Integer.MIN_VALUE;
                break;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        y();
        y();
        a(i2, (int) (0.33333334f * ((float) this.p.e())), false, aft);
        this.o.g = Integer.MIN_VALUE;
        this.o.a = false;
        a(afn, this.o, aft, true);
        if (i2 == -1) {
            if (this.q) {
                C = D();
            } else {
                C = C();
            }
            view = C;
        } else {
            if (this.q) {
                D = C();
            } else {
                D = D();
            }
            view = D;
        }
        if (i2 == -1) {
            B = A();
        } else {
            B = B();
        }
        if (!B.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return B;
    }

    @Override // defpackage.afd
    public final boolean g() {
        return this.u == null;
    }

    @Override // defpackage.aif
    public final void a(View view, View view2) {
        a("Cannot drop a view during a scroll or layout calculation");
        y();
        w();
        int a = a(view);
        int a2 = a(view2);
        boolean z = a < a2 ? true : true;
        if (this.q) {
            if (z) {
                f(a2, this.p.c() - (this.p.a(view2) + this.p.e(view)));
            } else {
                f(a2, this.p.c() - this.p.b(view2));
            }
        } else if (z) {
            f(a2, this.p.a(view2));
        } else {
            f(a2, this.p.b(view2) - this.p.e(view));
        }
    }
}
