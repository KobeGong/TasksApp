package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acs  reason: default package */
/* compiled from: PG */
public class acs extends agp {
    private static TimeInterpolator m;
    public ArrayList a = new ArrayList();
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public ArrayList g = new ArrayList();
    private ArrayList n = new ArrayList();
    private ArrayList o = new ArrayList();
    private ArrayList p = new ArrayList();
    private ArrayList q = new ArrayList();

    @Override // defpackage.aey
    public final void a() {
        long j;
        long j2;
        long j3;
        boolean z = !this.n.isEmpty();
        boolean z2 = !this.p.isEmpty();
        boolean z3 = !this.q.isEmpty();
        boolean z4 = !this.o.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ViewHolder afv = (ViewHolder) obj;
                View view = afv.a;
                ViewPropertyAnimator animate = view.animate();
                this.f.add(afv);
                animate.setDuration(this.j).alpha(0.0f).setListener(new acw(this, afv, animate, view)).start();
            }
            this.n.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.p);
                this.b.add(arrayList2);
                this.p.clear();
                act act = new act(this, arrayList2);
                if (z) {
                    sn.a(((adc) arrayList2.get(0)).a.a, act, this.j);
                } else {
                    act.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.q);
                this.c.add(arrayList3);
                this.q.clear();
                acu acu = new acu(this, arrayList3);
                if (z) {
                    sn.a(((adb) arrayList3.get(0)).a.a, acu, this.j);
                } else {
                    acu.run();
                }
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.o);
                this.a.add(arrayList4);
                this.o.clear();
                acv acv = new acv(this, arrayList4);
                if (z || z2 || z3) {
                    if (z) {
                        j = this.j;
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = this.k;
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = this.l;
                    } else {
                        j3 = 0;
                    }
                    sn.a(((ViewHolder) arrayList4.get(0)).a, acv, j + Math.max(j2, j3));
                    return;
                }
                acv.run();
            }
        }
    }

    @Override // defpackage.agp
    public final boolean a(ViewHolder afv) {
        g(afv);
        this.n.add(afv);
        return true;
    }

    @Override // defpackage.agp
    public final boolean b(ViewHolder afv) {
        g(afv);
        afv.a.setAlpha(0.0f);
        this.o.add(afv);
        return true;
    }

    @Override // defpackage.agp
    public final boolean a(ViewHolder afv, int i, int i2, int i3, int i4) {
        View view = afv.a;
        int translationX = i + ((int) afv.a.getTranslationX());
        int translationY = i2 + ((int) afv.a.getTranslationY());
        g(afv);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            e(afv);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.p.add(new adc(afv, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.agp
    public final boolean a(ViewHolder afv, ViewHolder afv2, int i, int i2, int i3, int i4) {
        if (afv == afv2) {
            return a(afv, i, i2, i3, i4);
        }
        float translationX = afv.a.getTranslationX();
        float translationY = afv.a.getTranslationY();
        float alpha = afv.a.getAlpha();
        g(afv);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        afv.a.setTranslationX(translationX);
        afv.a.setTranslationY(translationY);
        afv.a.setAlpha(alpha);
        if (afv2 != null) {
            g(afv2);
            afv2.a.setTranslationX((float) (-i5));
            afv2.a.setTranslationY((float) (-i6));
            afv2.a.setAlpha(0.0f);
        }
        this.q.add(new adb(afv, afv2, i, i2, i3, i4));
        return true;
    }

    private final void a(List list, ViewHolder afv) {
        for (int size = list.size() - 1; size >= 0; size--) {
            adb adb = (adb) list.get(size);
            if (a(adb, afv) && adb.a == null && adb.b == null) {
                list.remove(adb);
            }
        }
    }

    private final void a(adb adb) {
        if (adb.a != null) {
            a(adb, adb.a);
        }
        if (adb.b != null) {
            a(adb, adb.b);
        }
    }

    private final boolean a(adb adb, ViewHolder afv) {
        if (adb.b == afv) {
            adb.b = null;
        } else if (adb.a != afv) {
            return false;
        } else {
            adb.a = null;
        }
        afv.a.setAlpha(1.0f);
        afv.a.setTranslationX(0.0f);
        afv.a.setTranslationY(0.0f);
        e(afv);
        return true;
    }

    @Override // defpackage.aey
    public final void c(ViewHolder afv) {
        View view = afv.a;
        view.animate().cancel();
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (((adc) this.p.get(size)).a == afv) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                e(afv);
                this.p.remove(size);
            }
        }
        a(this.q, afv);
        if (this.n.remove(afv)) {
            view.setAlpha(1.0f);
            e(afv);
        }
        if (this.o.remove(afv)) {
            view.setAlpha(1.0f);
            e(afv);
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            a(arrayList, afv);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        for (int size3 = this.b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((adc) arrayList2.get(size4)).a == afv) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    e(afv);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(afv)) {
                view.setAlpha(1.0f);
                e(afv);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
        this.f.remove(afv);
        this.d.remove(afv);
        this.g.remove(afv);
        this.e.remove(afv);
        c();
    }

    private final void g(ViewHolder afv) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        afv.a.animate().setInterpolator(m);
        c(afv);
    }

    @Override // defpackage.aey
    public final boolean b() {
        return !this.o.isEmpty() || !this.q.isEmpty() || !this.p.isEmpty() || !this.n.isEmpty() || !this.e.isEmpty() || !this.f.isEmpty() || !this.d.isEmpty() || !this.g.isEmpty() || !this.b.isEmpty() || !this.a.isEmpty() || !this.c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!b()) {
            e();
        }
    }

    @Override // defpackage.aey
    public final void d() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            adc adc = (adc) this.p.get(size);
            View view = adc.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            e(adc.a);
            this.p.remove(size);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            e((ViewHolder) this.n.get(size2));
            this.n.remove(size2);
        }
        for (int size3 = this.o.size() - 1; size3 >= 0; size3--) {
            ViewHolder afv = (ViewHolder) this.o.get(size3);
            afv.a.setAlpha(1.0f);
            e(afv);
            this.o.remove(size3);
        }
        for (int size4 = this.q.size() - 1; size4 >= 0; size4--) {
            a((adb) this.q.get(size4));
        }
        this.q.clear();
        if (b()) {
            for (int size5 = this.b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    adc adc2 = (adc) arrayList.get(size6);
                    View view2 = adc2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    e(adc2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    ViewHolder afv2 = (ViewHolder) arrayList2.get(size8);
                    afv2.a.setAlpha(1.0f);
                    e(afv2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a((adb) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
            a(this.f);
            a(this.e);
            a(this.d);
            a(this.g);
            e();
        }
    }

    private static void a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((ViewHolder) list.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.aey
    public final boolean a(ViewHolder afv, List list) {
        return !list.isEmpty() || super.a(afv, list);
    }
}
