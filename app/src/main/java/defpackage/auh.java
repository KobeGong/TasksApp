package defpackage;

/* renamed from: auh reason: default package */
/* compiled from: PG */
final class auh extends defpackage.aie implements android.view.View.OnTouchListener {
    public final BaseTaskAdapter a;
    private final android.os.Vibrator b;
    private final float c;
    private final defpackage.att d;
    private int e = 0;
    private float f;
    private RecyclerViewHolder g;
    private RecyclerViewHolder h;
    private boolean i;
    private java.util.Set j;

    public auh(BaseTaskAdapter atg, android.os.Vibrator vibrator, float f2, defpackage.att att) {
        this.a = atg;
        this.b = vibrator;
        this.c = f2;
        this.d = att;
    }

    public final int a(RecyclerViewHolder afv) {
        int i2;
        boolean z = true;
        int i3 = 0;
        BaseTaskAdapter atg = this.a;
        if (afv.d() < atg.getCount() && atg.b()) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        BaseTaskAdapter atg2 = this.a;
        int d2 = afv.d();
        if (d2 >= atg2.getCount() || !atg2.h(d2)) {
            z = false;
        }
        if (z) {
            i3 = 32;
            if (defpackage.crk.a.a()) {
                i3 = 48;
            }
        }
        return defpackage.ahy.b(i2, i3);
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return true;
    }

    public final void a(RecyclerViewHolder afv, int i2) {
        defpackage.dca dca;
        defpackage.dmk a2;
        defpackage.dmk dmk;
        defpackage.dih dih;
        defpackage.dca dca2;
        defpackage.dih dih2;
        boolean z = false;
        int d2 = afv.d();
        if (i2 == 16) {
            BaseTaskAdapter atg = this.a;
            defpackage.cld.a(d2 < atg.getCount());
            defpackage.dby g2 = atg.g(d2);
            if (g2 == null) {
                defpackage.azb.a("Failed to find task", new java.lang.Object[0]);
                return;
            }
            atg.a = g2.d;
            defpackage.dby g3 = atg.g(d2);
            if (g3.e == null) {
                dca = defpackage.dca.g;
            } else {
                dca = g3.e;
            }
            if (dca.d != null) {
                z = true;
            }
            if (!z) {
                a2 = defpackage.ajd.a(defpackage.auz.a());
            } else if (dca.d == null) {
                a2 = defpackage.dmk.d;
            } else {
                a2 = dca.d;
            }
            java.util.Calendar a3 = defpackage.bdk.a();
            if (defpackage.ajd.b(a2).before(a3)) {
                dmk = defpackage.ajd.a(a3.getTimeInMillis());
            } else {
                dmk = a2;
            }
            defpackage.dii dii = (defpackage.dii) dmk.a(defpackage.bg.ao);
            dii.a((defpackage.dih) dmk);
            defpackage.dii g4 = dii.g(dmk.c + 1);
            if (g4.b) {
                dih = g4.a;
            } else {
                defpackage.dih dih3 = g4.a;
                defpackage.djz.a.a((java.lang.Object) dih3).c(dih3);
                g4.b = true;
                dih = g4.a;
            }
            defpackage.dih dih4 = dih;
            if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.dmk dmk2 = (defpackage.dmk) dih4;
            if (atg.f != null) {
                defpackage.atl atl = atg.f;
                java.lang.String str = g3.d;
                TasksFragment.N().b(atl.a.X, str, dmk2);
                defpackage.aju.a().a(str);
            }
            defpackage.dii dii2 = (defpackage.dii) g3.a(defpackage.bg.ao);
            dii2.a((defpackage.dih) g3);
            defpackage.dii dii3 = dii2;
            if (g3.e == null) {
                dca2 = defpackage.dca.g;
            } else {
                dca2 = g3.e;
            }
            defpackage.dii dii4 = (defpackage.dii) dca2.a(defpackage.bg.ao);
            dii4.a((defpackage.dih) dca2);
            defpackage.dii g5 = dii3.g(dii4.a(dmk2));
            if (g5.b) {
                dih2 = g5.a;
            } else {
                defpackage.dih dih5 = g5.a;
                defpackage.djz.a.a((java.lang.Object) dih5).c(dih5);
                g5.b = true;
                dih2 = g5.a;
            }
            defpackage.dih dih6 = dih2;
            if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            atg.c((defpackage.dby) dih6);
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        if (i2 == 32 && this.j != null) {
            hashSet.addAll(this.j);
        }
        hashSet.add(java.lang.Integer.valueOf(d2));
        defpackage.att att = this.d;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) afv.itemView.getParent();
        defpackage.atu atu = new defpackage.atu();
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = recyclerView.getChildAt(i3);
            if (hashSet.contains(java.lang.Integer.valueOf(android.support.v7.widget.RecyclerView.d(childAt)))) {
                android.support.v7.widget.RecyclerView.a(childAt, att.b);
                atu.a.add(android.util.Pair.create(java.lang.Integer.valueOf(att.b.top), java.lang.Integer.valueOf(att.b.bottom)));
            }
        }
        if (!atu.a.isEmpty()) {
            atu.b = defpackage.auz.a();
            att.a.add(atu);
        }
        BaseTaskAdapter atg2 = this.a;
        if (d2 < atg2.getCount()) {
            z = true;
        }
        defpackage.cld.a(z);
        atg2.a(d2, true);
    }

    public final void b(RecyclerViewHolder afv, int i2) {
        int i3 = 0;
        if (this.e == 2 && i2 != 2 && (this.a instanceof defpackage.atv)) {
            this.g.itemView.post(new defpackage.aui(this, this.g.d()));
        }
        if (i2 == 0) {
            this.g = null;
            this.i = false;
            this.h = null;
        } else if (i2 == 2 && (this.a instanceof defpackage.atv)) {
            this.f = Float.MIN_VALUE;
            this.g = afv;
            this.i = ((defpackage.atv) this.a).k(afv.d());
            defpackage.atv atv = (defpackage.atv) this.a;
            int d2 = afv.d();
            defpackage.dby g2 = atv.g(d2);
            if (g2 != null) {
                atv.p = defpackage.atw.a(g2.d, d2);
                i3 = atv.b(d2, true);
            }
            ((defpackage.atx) afv).c(i3);
        } else if (i2 == 1) {
            this.h = afv;
            this.j = this.a.f(afv.d());
        }
        this.e = i2;
        super.b(afv, i2);
    }

    public final boolean a(RecyclerViewHolder afv, RecyclerViewHolder afv2) {
        if (!(this.a instanceof defpackage.atv)) {
            return false;
        }
        boolean a2 = ((defpackage.atv) this.a).a(afv.d(), afv2.d(), this.i, (defpackage.atx) this.g);
        if (!a2) {
            return a2;
        }
        a(20);
        return a2;
    }

    public final void b(android.support.v7.widget.RecyclerView recyclerView, RecyclerViewHolder afv) {
        super.b(recyclerView, afv);
        defpackage.atx atx = (defpackage.atx) afv;
        int d2 = atx.d();
        boolean z = (this.a instanceof defpackage.atv) && d2 >= 0 && ((defpackage.atv) this.a).k(d2);
        ViewCompat.b(atx.itemView, 0.0f);
        atx.s.animate().cancel();
        atx.s.setTranslationX(0.0f);
        atx.b(z);
        atx.r.animate().alpha(0.0f).withEndAction(new defpackage.aue(atx)).start();
        atx.v();
        int childCount = recyclerView.getChildCount();
        int d3 = this.h == null ? -1 : this.h.d();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
            if ((a2 instanceof defpackage.atx) && (this.h == null || !(this.j == null || this.j.contains(java.lang.Integer.valueOf(a2.d())) || a2.d() == d3))) {
                ((defpackage.atx) a2).v();
            }
        }
    }

    public final void a(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView, RecyclerViewHolder afv, float f2, float f3, int i2, boolean z) {
        if (i2 == 1) {
            defpackage.atx atx = (defpackage.atx) afv;
            ViewCompat.setElevation(atx.itemView, 0.0f);
            float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, java.lang.Math.abs(f2 / (((float) atx.itemView.getWidth()) * 0.3f))));
            atx.a(max);
            if (afv.d() >= 0) {
                boolean z2 = ViewCompat.a.j(recyclerView) == 0;
                if (!defpackage.crk.a.a() || ((f2 >= 0.0f && z2) || (f2 < 0.0f && !z2))) {
                    a(recyclerView, this.j, f2, max);
                } else {
                    a(recyclerView, this.j, 0.0f, 0.0f);
                }
            }
        }
        super.a(canvas, recyclerView, afv, f2, f3, i2, z);
    }

    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float f2;
        if (this.e == 2 && (this.a instanceof defpackage.atv)) {
            boolean z = defpackage.qq.a(java.util.Locale.getDefault()) == 1;
            if (this.f == Float.MIN_VALUE) {
                this.f = motionEvent.getX();
                if (this.i) {
                    if (z) {
                        f2 = this.f + (this.c * 2.0f);
                    } else {
                        f2 = this.f - (this.c * 2.0f);
                    }
                    this.f = f2;
                }
            } else {
                boolean z2 = z ? motionEvent.getX() < this.f - this.c : motionEvent.getX() > this.f + this.c;
                if (!this.i && z2) {
                    this.i = true;
                    if (((defpackage.atv) this.a).a(this.g.d(), this.g.d(), this.i, (defpackage.atx) this.g)) {
                        a(1);
                    }
                } else if (this.i && !z2) {
                    this.i = false;
                    if (((defpackage.atv) this.a).a(this.g.d(), this.g.d(), this.i, (defpackage.atx) this.g)) {
                        a(1);
                    }
                }
            }
        }
        return false;
    }

    private static void a(android.support.v7.widget.RecyclerView recyclerView, java.util.Set set, float f2, float f3) {
        if (set != null && !set.isEmpty()) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = recyclerView.getChildAt(i2);
                RecyclerViewHolder a2 = recyclerView.a(childAt);
                if (set.contains(java.lang.Integer.valueOf(a2.d()))) {
                    ((defpackage.atx) a2).a(f3);
                    childAt.setTranslationX(f2);
                }
            }
        }
    }

    private final void a(int i2) {
        if (this.b == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.b.vibrate(android.os.VibrationEffect.createOneShot((long) i2, i2 * 12));
        } else {
            this.b.vibrate((long) i2);
        }
    }
}
