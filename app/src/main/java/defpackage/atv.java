package defpackage;

/* renamed from: atv reason: default package */
/* compiled from: PG */
public final class atv extends BaseTaskAdapter {
    public final java.util.List m = new java.util.ArrayList();
    public final java.util.Map n = new java.util.HashMap();
    public final java.util.Map o = new java.util.HashMap();
    public defpackage.atw p;

    public atv() {
        setHasStableIds();
    }

    public final RecyclerViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return super.c(viewGroup, i);
    }

    public final boolean a(int i, int i2, boolean z, defpackage.atx atx) {
        return a(i, i2, z, atx, true);
    }

    private final boolean a(int i, int i2, boolean z, defpackage.atx atx, boolean z2) {
        boolean z3;
        if (i < 0 || i2 < 0 || i >= this.m.size() || i2 >= this.m.size()) {
            return false;
        }
        if (i < this.m.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        defpackage.cld.a(z3);
        if (i == i2 && k(i) == z) {
            return true;
        }
        if (i < this.m.size() && i2 >= this.m.size()) {
            return false;
        }
        if (i > this.m.size() && i2 <= this.m.size()) {
            return false;
        }
        if (!k(i) && l(i)) {
            return false;
        }
        defpackage.dby dby = (defpackage.dby) this.m.remove(i);
        if (!this.n.containsKey(dby.d) || !k(i2)) {
            boolean z4 = !this.n.containsKey(dby.d) && (k(i2) || (i2 > 0 && z));
            this.m.add(i2, dby);
            if (i == i2 && k(i) == z4) {
                return false;
            }
            if (z4) {
                java.lang.String str = null;
                int i3 = i2 - 1;
                while (true) {
                    if (i3 < 0) {
                        break;
                    } else if (!k(i3)) {
                        str = g(i3).d;
                        break;
                    } else {
                        i3--;
                    }
                }
                if (str == null) {
                    z4 = false;
                } else {
                    this.o.put(dby.d, str);
                }
            }
            if (!z4) {
                this.o.remove(dby.d);
            }
            if (atx != null) {
                float f = 0.0f;
                if (z4 != atx.A) {
                    f = atx.s.getResources().getDimension(2131689886);
                    if (!z4) {
                        f = -f;
                    }
                }
                if (defpackage.qq.a(java.util.Locale.getDefault()) == 1) {
                    f = -f;
                }
                atx.s.animate().translationX(f).setDuration(195).start();
            }
            if (z2) {
                this.mObservable.d(i, i2);
            }
            this.p = defpackage.atw.a(dby.d, i2);
            return true;
        }
        this.m.add(i, dby);
        return false;
    }

    public final boolean k(int i) {
        defpackage.dby g = g(i);
        if (g == null) {
            return false;
        }
        return this.o.containsKey(g.d);
    }

    public final boolean l(int i) {
        return i < this.m.size() + -1 && k(i + 1);
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i, boolean z) {
        int i2 = 0;
        defpackage.dby g = g(i);
        if (g != null && !k(i)) {
            int i3 = i + 1;
            while (i3 < this.m.size() && k(i3)) {
                i2++;
                i3++;
            }
            if (i2 > 0) {
                java.util.List subList = this.m.subList(i + 1, i + 1 + i2);
                this.n.put(g.d, defpackage.csp.a((java.util.Collection) subList));
                subList.clear();
                if (z) {
                    b(i + 1, i2);
                }
            }
        }
        return i2;
    }

    public final java.util.Set f(int i) {
        if (k(i)) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int i2 = i + 1;
        while (i2 < this.m.size() && k(i2)) {
            hashSet.add(java.lang.Integer.valueOf(i2));
            i2++;
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(AbsTaskListStructure ajq) {
        defpackage.dca dca;
        this.m.clear();
        this.o.clear();
        this.n.clear();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (defpackage.dby dby : ajq.getTasks()) {
            if (dby.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = dby.e;
            }
            if (!dca.a) {
                linkedHashMap.put(dby.d, dby);
            }
        }
        for (defpackage.dcf dcf : ajq.getStructure().a) {
            defpackage.dby dby2 = (defpackage.dby) linkedHashMap.get(dcf.b);
            if (dby2 != null) {
                this.m.add(dby2);
                for (defpackage.dcf dcf2 : dcf.c) {
                    defpackage.dby dby3 = (defpackage.dby) linkedHashMap.get(dcf2.b);
                    if (dby3 != null) {
                        this.m.add(dby3);
                        this.o.put(dcf2.b, dcf.b);
                    }
                }
            }
        }
        if (this.p != null) {
            int a = a(this.p.a());
            if (a >= 0) {
                b(a, false);
                a(a, this.p.b(), false, null, false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getCount() {
        return this.m.size();
    }

    /* access modifiers changed from: protected */
    public final int d(java.lang.String str) {
        return a(this.m, str);
    }

    /* access modifiers changed from: protected */
    public final defpackage.dby i(int i) {
        return (defpackage.dby) this.m.get(i);
    }

    /* access modifiers changed from: protected */
    public final void c(defpackage.dby dby) {
        int a = a(this.m, dby.d);
        if (a >= 0) {
            this.m.set(a, dby);
            c(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.dby dby) {
        boolean z;
        if (!defpackage.ajd.a(dby)) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        this.m.size();
        this.m.add(0, dby);
        d(0);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean h(int i) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void c(java.lang.String str) {
        int a = a(this.m, str);
        if (a >= 0) {
            boolean k = k(a);
            this.m.remove(a);
            e(a);
            if (k) {
                this.o.remove(str);
                return;
            }
            while (a < this.m.size() && k(a)) {
                this.o.remove(((defpackage.dby) this.m.get(a)).d);
                this.m.remove(a);
                e(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void d(defpackage.dby dby) {
        this.m.add(0, dby);
        d(0);
    }

    /* access modifiers changed from: protected */
    public final void j(int i) {
        defpackage.dca dca;
        defpackage.dih dih;
        int i2 = i + 1;
        if (!k(i)) {
            while (i2 < this.m.size() && k(i2)) {
                i2++;
            }
        }
        int i3 = i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i4 = i3 - 1; i4 >= i; i4--) {
            defpackage.dby g = g(i4);
            defpackage.dii dii = (defpackage.dii) g.a(defpackage.bg.ao);
            dii.a((defpackage.dih) g);
            defpackage.dii dii2 = dii;
            if (g.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = g.e;
            }
            defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
            dii3.a((defpackage.dih) dca);
            defpackage.dii g2 = dii2.g(dii3.a(true));
            if (g2.b) {
                dih = g2.a;
            } else {
                defpackage.dih dih2 = g2.a;
                defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                g2.b = true;
                dih = g2.a;
            }
            defpackage.dih dih3 = dih;
            if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dby dby = (defpackage.dby) dih3;
            this.m.remove(i4);
            arrayList.add(dby);
            this.o.remove(g.d);
        }
        b(i, i3 - i);
        java.util.Collections.reverse(arrayList);
        a((java.util.List) arrayList);
    }

    /* access modifiers changed from: protected */
    public final void b(RecyclerViewHolder afv, int i) {
        defpackage.dby g = g(i);
        defpackage.atx atx = (defpackage.atx) afv;
        atx.a(g, f(i).size(), this.o.containsKey(g.d), true);
        if (this.n.containsKey(g.d)) {
            atx.c(((java.util.List) this.n.get(g.d)).size());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean e(java.lang.String str) {
        int a = a(str);
        if (a >= 0 && l(a) && !k(a)) {
            return true;
        }
        return false;
    }
}
