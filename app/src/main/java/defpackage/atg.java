package defpackage;

/* renamed from: atg reason: default package */
/* compiled from: PG */
public abstract class atg extends defpackage.aet {
    private static final long m = ((long) "#jkl;sdf;ksdafhksd#".hashCode());
    private static final long n = ((long) "#jkl;sdf;ksdafhksf#".hashCode());
    public java.lang.String a;
    public final java.util.List b = new java.util.ArrayList();
    public boolean c;
    public defpackage.atl f;
    public defpackage.atj g;
    public android.view.View h;
    public android.view.View i;
    public android.widget.TextView j;
    public android.widget.ImageView k;
    public android.widget.TextView l;
    private boolean o;

    atg() {
    }

    /* access modifiers changed from: protected */
    public abstract void a(defpackage.ajq ajq);

    /* access modifiers changed from: protected */
    public abstract void b(defpackage.afv afv, int i2);

    public abstract void b(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract void c(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract void c(java.lang.String str);

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int d(java.lang.String str);

    /* access modifiers changed from: protected */
    public abstract void d(defpackage.dby dby);

    /* access modifiers changed from: protected */
    public abstract boolean e(java.lang.String str);

    public abstract java.util.Set f(int i2);

    /* access modifiers changed from: protected */
    public abstract boolean h(int i2);

    /* access modifiers changed from: protected */
    public abstract defpackage.dby i(int i2);

    /* access modifiers changed from: protected */
    public abstract void j(int i2);

    public long a(int i2) {
        defpackage.dca dca;
        java.lang.Object valueOf;
        boolean z = true;
        defpackage.dby g2 = g(i2);
        if (g2 != null) {
            if (g2.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = g2.e;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = g2.d;
            objArr[1] = java.lang.Boolean.valueOf(dca.a);
            if (dca.d == null) {
                z = false;
            }
            if (!z) {
                valueOf = java.lang.Boolean.valueOf(false);
            } else if (dca.d == null) {
                valueOf = defpackage.dmk.d;
            } else {
                valueOf = dca.d;
            }
            objArr[2] = valueOf;
            return (long) java.util.Arrays.hashCode(objArr);
        } else if (!this.o || i2 != a() - 1) {
            return m;
        } else {
            return n;
        }
    }

    public final int a() {
        return (this.o ? 1 : 0) + h() + d();
    }

    public final int a(defpackage.dby dby) {
        return a(dby.d);
    }

    public final int a(java.lang.String str) {
        int d = d(str);
        if (d >= 0) {
            return d;
        }
        if (this.c) {
            int a2 = a(this.b, str);
            if (a2 >= 0) {
                return a2 + d() + 1;
            }
        }
        return -1;
    }

    public int b(int i2) {
        if (!this.o || i2 != a() - 1) {
            return -1;
        }
        return 0;
    }

    public final void b(java.lang.String str) {
        int a2 = a(str);
        if (a2 < 0 || a2 >= d()) {
            int a3 = a(this.b, str);
            if (a3 >= 0) {
                this.b.remove(a3);
                if (this.c && !this.b.isEmpty()) {
                    e(a3 + d() + 1);
                } else if (this.c && this.b.isEmpty()) {
                    b(d(), 2);
                } else if (!this.c && this.b.isEmpty()) {
                    e(d());
                }
            }
            f();
        } else {
            c(str);
        }
        g();
    }

    public final void a(defpackage.afv afv, int i2) {
        int d = d();
        if (d == i2) {
            defpackage.atx atx = (defpackage.atx) afv;
            atx.v();
            defpackage.sn.a(atx.a, "");
            if (atx.q.getParent() != null) {
                ((android.widget.FrameLayout) atx.q.getParent()).removeView(atx.q);
            }
            atx.p.removeAllViews();
            atx.p.addView(atx.q);
            atx.t();
            atx.p.setBackground(atx.q.getBackground());
        } else if (i2 > d) {
            defpackage.dby g2 = g(i2);
            if (g2 != null) {
                ((defpackage.atx) afv).a(g2, f(i2).size(), false, true);
            }
        } else {
            b(afv, i2);
        }
    }

    public final void b(defpackage.afv afv) {
        super.b(afv);
        if (afv instanceof defpackage.atx) {
            ((defpackage.atx) afv).v();
        }
    }

    /* access modifiers changed from: protected */
    public final defpackage.dby g(int i2) {
        if (i2 < 0) {
            return null;
        }
        int d = d();
        if (d == i2) {
            return null;
        }
        if (i2 < d) {
            return i(i2);
        }
        if (!this.c) {
            return null;
        }
        int i3 = (i2 - d) - 1;
        if (i3 < this.b.size()) {
            return (defpackage.dby) this.b.get(i3);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.afv c(android.view.ViewGroup viewGroup, int i2) {
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            return new defpackage.atk(from.inflate(2131034213, viewGroup, false));
        }
        defpackage.atx atx = new defpackage.atx((com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout) from.inflate(2131034209, viewGroup, false), this.h, this.l);
        atx.v = new defpackage.aug(this);
        return atx;
    }

    private final int h() {
        int i2 = 0;
        if (!this.b.isEmpty()) {
            i2 = 1;
        }
        if (this.c) {
            return i2 + this.b.size();
        }
        return i2;
    }

    static int a(java.util.List list, java.lang.String str) {
        int i2 = 0;
        java.util.Iterator it = list.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                return -1;
            }
            if (((defpackage.dby) it.next()).d.equals(str)) {
                return i3;
            }
            i2 = i3 + 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(java.util.List list) {
        int i2 = 0;
        if (!list.isEmpty()) {
            boolean isEmpty = this.b.isEmpty();
            this.b.addAll(0, list);
            int d = d();
            if (isEmpty) {
                i2 = 1;
            } else {
                d++;
            }
            if (this.c) {
                i2 += list.size();
            }
            if (i2 > 0) {
                a(d, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, boolean z) {
        defpackage.dca dca;
        defpackage.dih dih;
        boolean z2;
        defpackage.dby g2 = g(i2);
        if (g2 != null) {
            java.lang.String str = g2.d;
            if (z) {
                if (defpackage.ajd.b(g2) && !e(g2.d)) {
                    b(str);
                    z2 = true;
                } else {
                    j(i2);
                    z2 = false;
                }
            } else {
                this.b.remove(g2);
                if (this.b.isEmpty()) {
                    b(i2 - 1, 2);
                } else {
                    e(i2);
                }
                defpackage.dii dii = (defpackage.dii) g2.a(defpackage.bg.ao);
                dii.a((defpackage.dih) g2);
                defpackage.dii dii2 = dii;
                if (g2.e == null) {
                    dca = defpackage.dca.g;
                } else {
                    dca = g2.e;
                }
                defpackage.dii dii3 = (defpackage.dii) dca.a(defpackage.bg.ao);
                dii3.a((defpackage.dih) dca);
                defpackage.dii g3 = dii2.g(dii3.a(z));
                if (g3.b) {
                    dih = g3.a;
                } else {
                    defpackage.dih dih2 = g3.a;
                    defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                    g3.b = true;
                    dih = g3.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                d((defpackage.dby) dih3);
                z2 = false;
            }
            f();
            if (this.f != null) {
                if (z2) {
                    defpackage.atl atl = this.f;
                    TasksFragment.N().a(atl.a.X, str, (java.lang.Object) null);
                    atl.a.c(true);
                } else {
                    TasksFragment.N().a(this.f.a.X, str, z);
                    if (z) {
                        defpackage.aju.a().b(str);
                    }
                }
            }
            g();
        }
    }

    public final void a(boolean z) {
        if (this.c != z) {
            e();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (!this.b.isEmpty()) {
            this.c = !this.c;
            int d = d();
            if (this.c) {
                this.g.a(true);
                a(d + 1, this.b.size());
                if (this.f != null) {
                    this.f.a.recyclerView.c(d + 1);
                }
            } else {
                this.g.a(false);
                b(d + 1, this.b.size());
            }
            g();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        if (this.g != null) {
            defpackage.atj atj = this.g;
            this.b.size();
            atj.a.j.setText(atj.a.h.getResources().getString(2131951713, new java.lang.Object[]{java.lang.Integer.valueOf(atj.a.b.size())}));
            defpackage.atg atg = atj.a;
            atg.j.setAccessibilityDelegate(new defpackage.ati(atg));
        }
    }

    public final void g() {
        boolean z = this.o;
        boolean z2 = d() == 0 && h() > 0 && !this.c;
        if (z != z2) {
            this.o = z2;
            if (this.o) {
                d(a() - 1);
            } else {
                e(a());
            }
        }
    }
}
