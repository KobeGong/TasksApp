package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: auh  reason: default package */
/* compiled from: PG */
public final class auh extends aie implements View.OnTouchListener {
    public final SortableAdapter a;
    private final Vibrator b;
    private final float c;
    private final att d;
    private int e = 0;
    private float f;
    private ViewHolder g;
    private ViewHolder h;
    private boolean i;
    private Set j;

    public auh(SortableAdapter atg, Vibrator vibrator, float f2, att att) {
        this.a = atg;
        this.b = vibrator;
        this.c = f2;
        this.d = att;
    }

    @Override // defpackage.ahy, defpackage.aie
    public final int a(ViewHolder afv) {
        int i2;
        boolean z = true;
        int i3 = 0;
        SortableAdapter atg = this.a;
        if (afv.d() < atg.d() && atg.b()) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        SortableAdapter atg2 = this.a;
        int d2 = afv.d();
        if (d2 >= atg2.d() || !atg2.h(d2)) {
            z = false;
        }
        if (z) {
            i3 = 32;
            if (crk.a.a()) {
                i3 = 48;
            }
        }
        return ahy.b(i2, i3);
    }

    @Override // defpackage.ahy
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ahy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ahy
    public final void a(ViewHolder afv, int i2) {
        dca dca;
        dmk a2;
        dmk dmk;
        dih dih;
        dca dca2;
        dih dih2;
        boolean z = false;
        int d2 = afv.d();
        if (i2 == 16) {
            SortableAdapter atg = this.a;
            cld.a(d2 < atg.d());
            dby g2 = atg.g(d2);
            if (g2 == null) {
                azb.a("Failed to find task", new Object[0]);
                return;
            }
            atg.a = g2.d;
            dby g3 = atg.g(d2);
            if (g3.e == null) {
                dca = dca.g;
            } else {
                dca = g3.e;
            }
            if (dca.d != null) {
                z = true;
            }
            if (!z) {
                a2 = ajd.a(auz.a());
            } else if (dca.d == null) {
                a2 = dmk.d;
            } else {
                a2 = dca.d;
            }
            Calendar a3 = bdk.a();
            if (ajd.b(a2).before(a3)) {
                dmk = ajd.a(a3.getTimeInMillis());
            } else {
                dmk = a2;
            }
            dii dii = (dii) dmk.a(bg.ao);
            dii.a((dih) dmk);
            dii g4 = dii.g(dmk.c + 1);
            if (g4.b) {
                dih = g4.a;
            } else {
                dih dih3 = g4.a;
                djz.a.a(dih3).c(dih3);
                g4.b = true;
                dih = g4.a;
            }
            dih dih4 = dih;
            if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            dmk dmk2 = (dmk) dih4;
            if (atg.f != null) {
                atl atl = atg.f;
                String str = g3.d;
                auj.N().b(atl.a.X, str, dmk2);
                aju.a().a(str);
            }
            dii dii2 = (dii) g3.a(bg.ao);
            dii2.a((dih) g3);
            dii dii3 = dii2;
            if (g3.e == null) {
                dca2 = dca.g;
            } else {
                dca2 = g3.e;
            }
            dii dii4 = (dii) dca2.a(bg.ao);
            dii4.a((dih) dca2);
            dii g5 = dii3.g(dii4.a(dmk2));
            if (g5.b) {
                dih2 = g5.a;
            } else {
                dih dih5 = g5.a;
                djz.a.a(dih5).c(dih5);
                g5.b = true;
                dih2 = g5.a;
            }
            dih dih6 = dih2;
            if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            atg.c((dby) dih6);
            return;
        }
        HashSet hashSet = new HashSet();
        if (i2 == 32 && this.j != null) {
            hashSet.addAll(this.j);
        }
        hashSet.add(Integer.valueOf(d2));
        att att = this.d;
        RecyclerView recyclerView = (RecyclerView) afv.a.getParent();
        atu atu = new atu();
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (hashSet.contains(Integer.valueOf(RecyclerView.d(childAt)))) {
                RecyclerView.a(childAt, att.b);
                atu.a.add(Pair.create(Integer.valueOf(att.b.top), Integer.valueOf(att.b.bottom)));
            }
        }
        if (!atu.a.isEmpty()) {
            atu.b = auz.a();
            att.a.add(atu);
        }
        SortableAdapter atg2 = this.a;
        if (d2 < atg2.d()) {
            z = true;
        }
        cld.a(z);
        atg2.a(d2, true);
    }

    @Override // defpackage.ahy
    public final void b(ViewHolder afv, int i2) {
        int i3 = 0;
        if (this.e == 2 && i2 != 2 && (this.a instanceof MySortAdapter)) {
            this.g.a.post(new aui(this, this.g.d()));
        }
        if (i2 == 0) {
            this.g = null;
            this.i = false;
            this.h = null;
        } else if (i2 == 2 && (this.a instanceof MySortAdapter)) {
            this.f = Float.MIN_VALUE;
            this.g = afv;
            this.i = ((MySortAdapter) this.a).k(afv.d());
            MySortAdapter atv = (MySortAdapter) this.a;
            int d2 = afv.d();
            dby g2 = atv.g(d2);
            if (g2 != null) {
                atv.p = atw.a(g2.d, d2);
                i3 = atv.b(d2, true);
            }
            ((atx) afv).c(i3);
        } else if (i2 == 1) {
            this.h = afv;
            this.j = this.a.f(afv.d());
        }
        this.e = i2;
        super.b(afv, i2);
    }

    @Override // defpackage.ahy
    public final boolean a(ViewHolder afv, ViewHolder afv2) {
        if (!(this.a instanceof MySortAdapter)) {
            return false;
        }
        boolean a2 = ((MySortAdapter) this.a).a(afv.d(), afv2.d(), this.i, (atx) this.g);
        if (!a2) {
            return a2;
        }
        a(20);
        return a2;
    }

    @Override // defpackage.ahy
    public final void b(RecyclerView recyclerView, ViewHolder afv) {
        super.b(recyclerView, afv);
        atx atx = (atx) afv;
        int d2 = atx.d();
        boolean z = (this.a instanceof MySortAdapter) && d2 >= 0 && ((MySortAdapter) this.a).k(d2);
        sn.b(atx.a, 0.0f);
        atx.s.animate().cancel();
        atx.s.setTranslationX(0.0f);
        atx.b(z);
        atx.r.animate().alpha(0.0f).withEndAction(new aue(atx)).start();
        atx.v();
        int childCount = recyclerView.getChildCount();
        int d3 = this.h == null ? -1 : this.h.d();
        for (int i2 = 0; i2 < childCount; i2++) {
            ViewHolder a2 = recyclerView.a(recyclerView.getChildAt(i2));
            if ((a2 instanceof atx) && (this.h == null || !(this.j == null || this.j.contains(Integer.valueOf(a2.d())) || a2.d() == d3))) {
                ((atx) a2).v();
            }
        }
    }

    @Override // defpackage.ahy
    public final void a(Canvas canvas, RecyclerView recyclerView, ViewHolder afv, float f2, float f3, int i2, boolean z) {
        if (i2 == 1) {
            atx atx = (atx) afv;
            sn.a(atx.a, 0.0f);
            float max = Math.max(0.0f, Math.min(1.0f, Math.abs(f2 / (((float) atx.a.getWidth()) * 0.3f))));
            atx.a(max);
            if (afv.d() >= 0) {
                boolean z2 = sn.a.j(recyclerView) == 0;
                if (!crk.a.a() || ((f2 >= 0.0f && z2) || (f2 < 0.0f && !z2))) {
                    a(recyclerView, this.j, f2, max);
                } else {
                    a(recyclerView, this.j, 0.0f, 0.0f);
                }
            }
        }
        super.a(canvas, recyclerView, afv, f2, f3, i2, z);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        float f2;
        if (this.e == 2 && (this.a instanceof MySortAdapter)) {
            boolean z2 = qq.a(Locale.getDefault()) == 1;
            if (this.f == Float.MIN_VALUE) {
                this.f = motionEvent.getX();
                if (this.i) {
                    if (z2) {
                        f2 = this.f + (this.c * 2.0f);
                    } else {
                        f2 = this.f - (this.c * 2.0f);
                    }
                    this.f = f2;
                }
            } else {
                if (z2) {
                    z = motionEvent.getX() < this.f - this.c;
                } else {
                    z = motionEvent.getX() > this.f + this.c;
                }
                if (!this.i && z) {
                    this.i = true;
                    if (((MySortAdapter) this.a).a(this.g.d(), this.g.d(), this.i, (atx) this.g)) {
                        a(1);
                    }
                } else if (this.i && !z) {
                    this.i = false;
                    if (((MySortAdapter) this.a).a(this.g.d(), this.g.d(), this.i, (atx) this.g)) {
                        a(1);
                    }
                }
            }
        }
        return false;
    }

    private static void a(RecyclerView recyclerView, Set set, float f2, float f3) {
        if (!(set == null || set.isEmpty())) {
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                ViewHolder a2 = recyclerView.a(childAt);
                if (set.contains(Integer.valueOf(a2.d()))) {
                    ((atx) a2).a(f3);
                    childAt.setTranslationX(f2);
                }
            }
        }
    }

    private final void a(int i2) {
        if (this.b == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.vibrate(VibrationEffect.createOneShot((long) i2, i2 * 12));
        } else {
            this.b.vibrate((long) i2);
        }
    }
}
