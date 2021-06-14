package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: atv  reason: default package */
/* compiled from: PG */
public final class MySortAdapter extends SortableAdapter {
    public final List m = new ArrayList();
    public final Map n = new HashMap();
    public final Map o = new HashMap();
    public atw p;

    public MySortAdapter() {
        c();
    }

    @Override // defpackage.aet
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return super.c(viewGroup, i);
    }

    public final boolean a(int i, int i2, boolean z, atx atx) {
        return a(i, i2, z, atx, true);
    }

    private final boolean a(int i, int i2, boolean z, atx atx, boolean z2) {
        boolean z3;
        if (i < 0 || i2 < 0 || i >= this.m.size() || i2 >= this.m.size()) {
            return false;
        }
        if (i < this.m.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        cld.a(z3);
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
        dby dby = (dby) this.m.remove(i);
        if (!this.n.containsKey(dby.d) || !k(i2)) {
            boolean z4 = !this.n.containsKey(dby.d) && (k(i2) || (i2 > 0 && z));
            this.m.add(i2, dby);
            if (i == i2 && k(i) == z4) {
                return false;
            }
            if (z4) {
                String str = null;
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
                    f = atx.s.getResources().getDimension(R.dimen.task_item_subtask_start_spacing);
                    if (!z4) {
                        f = -f;
                    }
                }
                if (qq.a(Locale.getDefault()) == 1) {
                    f = -f;
                }
                atx.s.animate().translationX(f).setDuration(195).start();
            }
            if (z2) {
                this.mObservable.d(i, i2);
            }
            this.p = atw.a(dby.d, i2);
            return true;
        }
        this.m.add(i, dby);
        return false;
    }

    public final boolean k(int i) {
        dby g = g(i);
        if (g == null) {
            return false;
        }
        return this.o.containsKey(g.d);
    }

    public final boolean l(int i) {
        return i < this.m.size() + -1 && k(i + 1);
    }

    /* access modifiers changed from: package-private */
    public final int b(int i, boolean z) {
        int i2 = 0;
        dby g = g(i);
        if (g != null && !k(i)) {
            int i3 = i + 1;
            while (i3 < this.m.size() && k(i3)) {
                i2++;
                i3++;
            }
            if (i2 > 0) {
                List subList = this.m.subList(i + 1, i + 1 + i2);
                this.n.put(g.d, csp.a((Collection) subList));
                subList.clear();
                if (z) {
                    b(i + 1, i2);
                }
            }
        }
        return i2;
    }

    @Override // defpackage.atg
    public final Set f(int i) {
        if (k(i)) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        int i2 = i + 1;
        while (i2 < this.m.size() && k(i2)) {
            hashSet.add(Integer.valueOf(i2));
            i2++;
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void a(ajq ajq) {
        int a;
        dca dca;
        this.m.clear();
        this.o.clear();
        this.n.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (dby dby : ajq.a()) {
            if (dby.e == null) {
                dca = dca.g;
            } else {
                dca = dby.e;
            }
            if (!dca.a) {
                linkedHashMap.put(dby.d, dby);
            }
        }
        for (dcf dcf : ajq.b().a) {
            dby dby2 = (dby) linkedHashMap.get(dcf.b);
            if (dby2 != null) {
                this.m.add(dby2);
                for (dcf dcf2 : dcf.c) {
                    dby dby3 = (dby) linkedHashMap.get(dcf2.b);
                    if (dby3 != null) {
                        this.m.add(dby3);
                        this.o.put(dcf2.b, dcf.b);
                    }
                }
            }
        }
        if (this.p != null && (a = a(this.p.a())) >= 0) {
            b(a, false);
            a(a, this.p.b(), false, null, false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final int d() {
        return this.m.size();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final int d(String str) {
        return a(this.m, str);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final dby i(int i) {
        return (dby) this.m.get(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void c(dby dby) {
        int a = a(this.m, dby.d);
        if (a >= 0) {
            this.m.set(a, dby);
            c(a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void b(dby dby) {
        boolean z;
        if (!ajd.a(dby)) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        this.m.size();
        this.m.add(0, dby);
        d(0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean h(int i) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void c(String str) {
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
                this.o.remove(((dby) this.m.get(a)).d);
                this.m.remove(a);
                e(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void d(dby dby) {
        this.m.add(0, dby);
        d(0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void j(int i) {
        dca dca;
        dih dih;
        int i2 = i + 1;
        if (!k(i)) {
            while (i2 < this.m.size() && k(i2)) {
                i2++;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            dby g = g(i3);
            dii dii = (dii) g.a(bg.ao);
            dii.a((dih) g);
            dii dii2 = dii;
            if (g.e == null) {
                dca = dca.g;
            } else {
                dca = g.e;
            }
            dii dii3 = (dii) dca.a(bg.ao);
            dii3.a((dih) dca);
            dii g2 = dii2.g(dii3.a(true));
            if (g2.b) {
                dih = g2.a;
            } else {
                dih dih2 = g2.a;
                djz.a.a(dih2).c(dih2);
                g2.b = true;
                dih = g2.a;
            }
            dih dih3 = dih;
            if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            this.m.remove(i3);
            arrayList.add((dby) dih3);
            this.o.remove(g.d);
        }
        b(i, i2 - i);
        Collections.reverse(arrayList);
        a(arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void b(ViewHolder afv, int i) {
        dby g = g(i);
        atx atx = (atx) afv;
        atx.a(g, f(i).size(), this.o.containsKey(g.d), true);
        if (this.n.containsKey(g.d)) {
            atx.c(((List) this.n.get(g.d)).size());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean e(String str) {
        int a = a(str);
        if (a >= 0 && l(a) && !k(a)) {
            return true;
        }
        return false;
    }
}
