package defpackage;

/* renamed from: atn reason: default package */
/* compiled from: PG */
public final class atn extends defpackage.atg {
    private final java.util.List m = new java.util.ArrayList();
    private final java.util.List n = new java.util.ArrayList();
    private final java.util.Map o = new java.util.HashMap();

    public atn() {
        c();
    }

    public final long a(int i) {
        if (i >= this.n.size()) {
            return super.a(i);
        }
        defpackage.atr atr = (defpackage.atr) this.n.get(i);
        if (atr.a()) {
            return super.a(i);
        }
        return (long) java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(2), atr.b.name()});
    }

    public final int b(int i) {
        if (this.n.size() <= i || ((defpackage.atr) this.n.get(i)).a()) {
            return super.b(i);
        }
        return 2;
    }

    public final defpackage.afv a(android.view.ViewGroup viewGroup, int i) {
        if (i <= 0) {
            return super.c(viewGroup, i);
        }
        return new defpackage.atp(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131034211, viewGroup, false));
    }

    public final java.util.Set f(int i) {
        defpackage.dby g = g(i);
        if (g == null) {
            return java.util.Collections.emptySet();
        }
        java.util.List<defpackage.dby> list = (java.util.List) this.o.get(g.d);
        if (list == null) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (defpackage.dby a : list) {
            hashSet.add(java.lang.Integer.valueOf(a(a)));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.ajq ajq) {
        defpackage.dca dca;
        this.o.clear();
        this.m.clear();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (defpackage.dby dby : ajq.a()) {
            if (dby.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = dby.e;
            }
            if (!dca.a) {
                linkedHashMap.put(dby.d, dby);
            }
        }
        for (defpackage.dcf dcf : ajq.b().a) {
            defpackage.dby dby2 = (defpackage.dby) linkedHashMap.get(dcf.b);
            if (dby2 != null) {
                this.m.add(dby2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (defpackage.dcf dcf2 : dcf.c) {
                    defpackage.dby dby3 = (defpackage.dby) linkedHashMap.get(dcf2.b);
                    if (dby3 != null) {
                        arrayList.add(dby3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.o.put(dby2.d, arrayList);
                }
            }
        }
        h();
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return this.n.size();
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.afv afv, int i) {
        defpackage.dca dca;
        boolean z;
        defpackage.dmk dmk;
        defpackage.dca dca2;
        defpackage.atr atr = (defpackage.atr) this.n.get(i);
        if (atr.a()) {
            ((defpackage.atx) afv).a(atr.a, f(i).size(), false, false);
            return;
        }
        defpackage.dby dby = atr.a;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            defpackage.dby dby2 = atr.a;
            if (dby2.e == null) {
                dca2 = defpackage.dca.g;
            } else {
                dca2 = dby2.e;
            }
            if (dca2.d == null) {
                dmk = defpackage.dmk.d;
            } else {
                dmk = dca2.d;
            }
        } else {
            dmk = null;
        }
        defpackage.atp atp = (defpackage.atp) afv;
        switch (atr.b.ordinal()) {
            case 0:
                atp.p.setText(2131951723);
                atp.p.setTextColor(atp.c(2131624500));
                return;
            case 1:
                atp.p.setText(2131951724);
                atp.p.setTextColor(atp.c(2131624498));
                return;
            case 2:
                atp.p.setText(2131951725);
                atp.p.setTextColor(atp.c(2131624496));
                return;
            case 3:
                if (dmk == null) {
                    atp.p.setText(2131951722);
                } else {
                    atp.p.setText(atp.p.getContext().getString(2131951818, new java.lang.Object[]{java.lang.Long.valueOf(defpackage.ajd.b(dmk).getTimeInMillis())}));
                }
                atp.p.setTextColor(atp.c(2131624496));
                return;
            default:
                atp.p.setText(2131951726);
                atp.p.setTextColor(atp.c(2131624496));
                return;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean h(int i) {
        if (i == -1 || i >= this.n.size()) {
            return false;
        }
        return ((defpackage.atr) this.n.get(i)).a();
    }

    /* access modifiers changed from: protected */
    public final defpackage.dby i(int i) {
        defpackage.atr atr = (defpackage.atr) this.n.get(i);
        if (atr.a()) {
            return atr.a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int d(java.lang.String str) {
        int i = 0;
        java.util.Iterator it = this.n.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return -1;
            }
            defpackage.atr atr = (defpackage.atr) it.next();
            if (atr.a() && atr.a.d.equals(str)) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void j(int i) {
        defpackage.dca dca;
        defpackage.dih dih;
        defpackage.dca dca2;
        defpackage.dih dih2;
        defpackage.dby g = g(i);
        if (g != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<defpackage.dby> list = (java.util.List) this.o.get(g.d);
            this.n.remove(i);
            f(g.d);
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
                defpackage.dih dih3 = g2.a;
                defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
                g2.b = true;
                dih = g2.a;
            }
            defpackage.dih dih4 = dih;
            if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            arrayList.add((defpackage.dby) dih4);
            e(i);
            k(i);
            if (list != null) {
                for (defpackage.dby a : list) {
                    int a2 = a(a);
                    defpackage.dby g3 = g(a2);
                    this.n.remove(a2);
                    defpackage.dii dii4 = (defpackage.dii) g3.a(defpackage.bg.ao);
                    dii4.a((defpackage.dih) g3);
                    defpackage.dii dii5 = dii4;
                    if (g3.e == null) {
                        dca2 = defpackage.dca.g;
                    } else {
                        dca2 = g3.e;
                    }
                    defpackage.dii dii6 = (defpackage.dii) dca2.a(defpackage.bg.ao);
                    dii6.a((defpackage.dih) dca2);
                    defpackage.dii g4 = dii5.g(dii6.a(true));
                    if (g4.b) {
                        dih2 = g4.a;
                    } else {
                        defpackage.dih dih5 = g4.a;
                        defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                        g4.b = true;
                        dih2 = g4.a;
                    }
                    defpackage.dih dih6 = dih2;
                    if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    arrayList.add((defpackage.dby) dih6);
                    e(a2);
                    k(a2);
                }
            }
            a((java.util.List) arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public final void d(defpackage.dby dby) {
        this.m.add(dby);
        int size = this.n.size();
        h();
        int a = a(dby);
        int i = 1;
        if (size + 1 < this.n.size()) {
            a--;
            i = 2;
        }
        a(a, i);
    }

    /* access modifiers changed from: protected */
    public final void c(java.lang.String str) {
        java.util.List<defpackage.dby> list = (java.util.List) this.o.get(str);
        f(str);
        int a = a(str);
        if (a >= 0) {
            this.n.remove(a);
            e(a);
            k(a);
            if (list != null) {
                for (defpackage.dby dby : list) {
                    int a2 = a(dby.d);
                    if (a2 >= 0) {
                        this.n.remove(a2);
                        e(a2);
                        k(a2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.dby dby) {
        this.m.add(0, dby);
        h();
        this.d.b();
    }

    /* access modifiers changed from: protected */
    public final void c(defpackage.dby dby) {
        defpackage.dca dca;
        defpackage.dmk dmk;
        defpackage.dca dca2;
        defpackage.dmk dmk2;
        int a = a(this.m, dby.d);
        if (a < 0) {
            java.util.Iterator it = this.o.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.List list = (java.util.List) it.next();
                int a2 = a(list, dby.d);
                if (a2 >= 0) {
                    list.set(a2, dby);
                    break;
                }
            }
        } else {
            this.m.set(a, dby);
        }
        int d = d(dby.d);
        defpackage.dby g = g(d);
        if (g.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = g.e;
        }
        if (dca.d == null) {
            dmk = defpackage.dmk.d;
        } else {
            dmk = dca.d;
        }
        if (dby.e == null) {
            dca2 = defpackage.dca.g;
        } else {
            dca2 = dby.e;
        }
        if (dca2.d == null) {
            dmk2 = defpackage.dmk.d;
        } else {
            dmk2 = dca2.d;
        }
        if (!defpackage.cru.d(dmk, dmk2)) {
            h();
            this.d.b();
            return;
        }
        this.n.set(d, defpackage.atr.a(dby));
        c(d);
    }

    /* access modifiers changed from: protected */
    public final boolean e(java.lang.String str) {
        return this.o.containsKey(str) && !((java.util.List) this.o.get(str)).isEmpty();
    }

    private final void f(java.lang.String str) {
        int a = a(this.m, str);
        if (a < 0) {
            java.util.Iterator it = this.o.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.List list = (java.util.List) it.next();
                int a2 = a(list, str);
                if (a2 >= 0) {
                    list.remove(a2);
                    break;
                }
            }
        } else {
            this.m.remove(a);
        }
        this.o.remove(str);
    }

    private final void k(int i) {
        if (((defpackage.atr) this.n.get(i - 1)).a()) {
            return;
        }
        if (i >= this.n.size() || !((defpackage.atr) this.n.get(i)).a()) {
            this.n.remove(i - 1);
            e(i - 1);
        }
    }

    private final void h() {
        defpackage.dca dca;
        defpackage.dmk dmk;
        defpackage.atq atq;
        defpackage.atq atq2;
        defpackage.dmk dmk2;
        defpackage.dmk dmk3 = null;
        this.n.clear();
        int size = this.m.size();
        defpackage.cky.a(size, "initialArraySize");
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (defpackage.dby dby : this.m) {
            arrayList.add(dby);
            java.util.List list = (java.util.List) this.o.get(dby.d);
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        java.util.Collections.sort(arrayList, defpackage.ato.a);
        java.util.Calendar a = defpackage.bdk.a();
        java.util.ArrayList arrayList2 = arrayList;
        int size2 = arrayList2.size();
        int i = 0;
        defpackage.atq atq3 = null;
        while (i < size2) {
            int i2 = i + 1;
            defpackage.dby dby2 = (defpackage.dby) arrayList2.get(i);
            if (dby2.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = dby2.e;
            }
            if (dca.d == null) {
                dmk = defpackage.dmk.d;
            } else {
                dmk = dca.d;
            }
            if (dmk == null || defpackage.dmk.d.equals(dmk)) {
                atq = defpackage.atq.NO_DUE_DATE;
            } else {
                java.util.Calendar b = defpackage.ajd.b(dmk);
                if (b.before(a)) {
                    atq = defpackage.atq.OVERDUE;
                } else if (a.equals(b)) {
                    atq = defpackage.atq.DUE_TODAY;
                } else {
                    java.util.Calendar calendar = (java.util.Calendar) a.clone();
                    calendar.add(5, 1);
                    if (calendar.equals(b)) {
                        atq = defpackage.atq.DUE_TOMORROW;
                    } else {
                        atq = defpackage.atq.DUE_LATER;
                    }
                }
            }
            if (atq3 != atq || (atq == defpackage.atq.DUE_LATER && !dmk.equals(dmk3))) {
                this.n.add(new defpackage.atr(defpackage.bg.T, dby2, atq));
                atq2 = atq;
                dmk2 = dmk;
            } else {
                dmk2 = dmk3;
                atq2 = atq3;
            }
            this.n.add(defpackage.atr.a(dby2));
            atq3 = atq2;
            dmk3 = dmk2;
            i = i2;
        }
    }

    static final /* synthetic */ int a(defpackage.dby dby, defpackage.dby dby2) {
        defpackage.dca dca;
        defpackage.dmk dmk;
        defpackage.dca dca2;
        defpackage.dmk dmk2;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d == null) {
            dmk = defpackage.dmk.d;
        } else {
            dmk = dca.d;
        }
        if (dby2.e == null) {
            dca2 = defpackage.dca.g;
        } else {
            dca2 = dby2.e;
        }
        if (dca2.d == null) {
            dmk2 = defpackage.dmk.d;
        } else {
            dmk2 = dca2.d;
        }
        if (defpackage.dmk.d.equals(dmk) && !defpackage.dmk.d.equals(dmk2)) {
            return 1;
        }
        if (defpackage.dmk.d.equals(dmk2) && !defpackage.dmk.d.equals(dmk)) {
            return -1;
        }
        if (dmk.equals(dmk2)) {
            return 0;
        }
        int compareTo = java.lang.Integer.valueOf(dmk.a).compareTo(java.lang.Integer.valueOf(dmk2.a));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = java.lang.Integer.valueOf(dmk.b).compareTo(java.lang.Integer.valueOf(dmk2.b));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        return java.lang.Integer.valueOf(dmk.c).compareTo(java.lang.Integer.valueOf(dmk2.c));
    }
}
