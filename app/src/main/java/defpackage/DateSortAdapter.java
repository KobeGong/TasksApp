package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: atn  reason: default package */
/* compiled from: PG */
public final class DateSortAdapter extends SortableAdapter {
    private final List m = new ArrayList();
    private final List n = new ArrayList();
    private final Map o = new HashMap();

    public DateSortAdapter() {
        c();
    }

    @Override // defpackage.aet, defpackage.atg
    public final long getItemId(int i) {
        if (i >= this.n.size()) {
            return super.getItemId(i);
        }
        atr atr = (atr) this.n.get(i);
        if (atr.a()) {
            return super.getItemId(i);
        }
        return (long) Arrays.hashCode(new Object[]{2, atr.b.name()});
    }

    @Override // defpackage.aet, defpackage.atg
    public final int getItemViewType(int i) {
        if (this.n.size() <= i || ((atr) this.n.get(i)).a()) {
            return super.getItemViewType(i);
        }
        return 2;
    }

    @Override // defpackage.aet
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i <= 0) {
            return super.c(viewGroup, i);
        }
        return new atp(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.task_due_date_header, viewGroup, false));
    }

    @Override // defpackage.atg
    public final Set f(int i) {
        dby g = g(i);
        if (g == null) {
            return Collections.emptySet();
        }
        List<dby> list = (List) this.o.get(g.d);
        if (list == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (dby dby : list) {
            hashSet.add(a(dby));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void a(ajq ajq) {
        dca dca;
        this.o.clear();
        this.m.clear();
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
                ArrayList arrayList = new ArrayList();
                for (dcf dcf2 : dcf.c) {
                    dby dby3 = (dby) linkedHashMap.get(dcf2.b);
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
    @Override // defpackage.atg
    public final int d() {
        return this.n.size();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void b(ViewHolder afv, int i) {
        dca dca;
        boolean z;
        dmk dmk;
        dca dca2;
        atr atr = (atr) this.n.get(i);
        if (atr.a()) {
            ((atx) afv).a(atr.a, f(i).size(), false, false);
            return;
        }
        dby dby = atr.a;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dby dby2 = atr.a;
            if (dby2.e == null) {
                dca2 = dca.g;
            } else {
                dca2 = dby2.e;
            }
            if (dca2.d == null) {
                dmk = dmk.d;
            } else {
                dmk = dca2.d;
            }
        } else {
            dmk = null;
        }
        atp atp = (atp) afv;
        switch (atr.b.ordinal()) {
            case 0:
                atp.p.setText(R.string.due_date_header_overdue);
                atp.p.setTextColor(atp.c(R.color.task_overdue_header));
                return;
            case 1:
                atp.p.setText(R.string.due_date_header_today);
                atp.p.setTextColor(atp.c(R.color.task_due_today_header));
                return;
            case 2:
                atp.p.setText(R.string.due_date_header_tomorrow);
                atp.p.setTextColor(atp.c(R.color.task_due_date_header));
                return;
            case 3:
                if (dmk == null) {
                    atp.p.setText(R.string.due_date_header_later);
                } else {
                    atp.p.setText(atp.p.getContext().getString(R.string.task_due_date, ajd.b(dmk).getTimeInMillis()));
                }
                atp.p.setTextColor(atp.c(R.color.task_due_date_header));
                return;
            default:
                atp.p.setText(R.string.due_date_header_unknown);
                atp.p.setTextColor(atp.c(R.color.task_due_date_header));
                return;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean h(int i) {
        if (i == -1 || i >= this.n.size()) {
            return false;
        }
        return ((atr) this.n.get(i)).a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final dby i(int i) {
        atr atr = (atr) this.n.get(i);
        if (atr.a()) {
            return atr.a;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final int d(String str) {
        int i = 0;
        for (atr atr : this.n) {
            if (atr.a() && atr.a.d.equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void j(int i) {
        dca dca;
        dih dih;
        dca dca2;
        dih dih2;
        dby g = g(i);
        if (g != null) {
            ArrayList arrayList = new ArrayList();
            List<dby> list = (List) this.o.get(g.d);
            this.n.remove(i);
            f(g.d);
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
                dih dih3 = g2.a;
                djz.a.a(dih3).c(dih3);
                g2.b = true;
                dih = g2.a;
            }
            dih dih4 = dih;
            if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            arrayList.add((dby) dih4);
            e(i);
            k(i);
            if (list != null) {
                for (dby dby : list) {
                    int a = a(dby);
                    dby g3 = g(a);
                    this.n.remove(a);
                    dii dii4 = (dii) g3.a(bg.ao);
                    dii4.a((dih) g3);
                    dii dii5 = dii4;
                    if (g3.e == null) {
                        dca2 = dca.g;
                    } else {
                        dca2 = g3.e;
                    }
                    dii dii6 = (dii) dca2.a(bg.ao);
                    dii6.a((dih) dca2);
                    dii g4 = dii5.g(dii6.a(true));
                    if (g4.b) {
                        dih2 = g4.a;
                    } else {
                        dih dih5 = g4.a;
                        djz.a.a(dih5).c(dih5);
                        g4.b = true;
                        dih2 = g4.a;
                    }
                    dih dih6 = dih2;
                    if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                        throw new dkw();
                    }
                    arrayList.add((dby) dih6);
                    e(a);
                    k(a);
                }
            }
            a(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void d(dby dby) {
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
    @Override // defpackage.atg
    public final void c(String str) {
        List<dby> list = (List) this.o.get(str);
        f(str);
        int a = a(str);
        if (a >= 0) {
            this.n.remove(a);
            e(a);
            k(a);
            if (list != null) {
                for (dby dby : list) {
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
    @Override // defpackage.atg
    public final void b(dby dby) {
        this.m.add(0, dby);
        h();
        this.mObservable.b();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final void c(dby dby) {
        dca dca;
        dmk dmk;
        dca dca2;
        dmk dmk2;
        int a = a(this.m, dby.d);
        if (a < 0) {
            Iterator it = this.o.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    List list = (List) it.next();
                    int a2 = a(list, dby.d);
                    if (a2 >= 0) {
                        list.set(a2, dby);
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            this.m.set(a, dby);
        }
        int d = d(dby.d);
        dby g = g(d);
        if (g.e == null) {
            dca = dca.g;
        } else {
            dca = g.e;
        }
        if (dca.d == null) {
            dmk = dmk.d;
        } else {
            dmk = dca.d;
        }
        if (dby.e == null) {
            dca2 = dca.g;
        } else {
            dca2 = dby.e;
        }
        if (dca2.d == null) {
            dmk2 = dmk.d;
        } else {
            dmk2 = dca2.d;
        }
        if (!cru.d(dmk, dmk2)) {
            h();
            this.mObservable.b();
            return;
        }
        this.n.set(d, atr.a(dby));
        c(d);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.atg
    public final boolean e(String str) {
        return this.o.containsKey(str) && !((List) this.o.get(str)).isEmpty();
    }

    private final void f(String str) {
        int a = a(this.m, str);
        if (a < 0) {
            Iterator it = this.o.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    List list = (List) it.next();
                    int a2 = a(list, str);
                    if (a2 >= 0) {
                        list.remove(a2);
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            this.m.remove(a);
        }
        this.o.remove(str);
    }

    private final void k(int i) {
        if (((atr) this.n.get(i - 1)).a()) {
            return;
        }
        if (i >= this.n.size() || !((atr) this.n.get(i)).a()) {
            this.n.remove(i - 1);
            e(i - 1);
        }
    }

    private final void h() {
        dca dca;
        dmk dmk;
        atq atq;
        atq atq2;
        dmk dmk2;
        dmk dmk3 = null;
        this.n.clear();
        int size = this.m.size();
        cky.a(size, "initialArraySize");
        ArrayList arrayList = new ArrayList(size);
        for (dby dby : this.m) {
            arrayList.add(dby);
            List list = (List) this.o.get(dby.d);
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        Collections.sort(arrayList, ato.a);
        Calendar a = bdk.a();
        ArrayList arrayList2 = arrayList;
        int size2 = arrayList2.size();
        int i = 0;
        atq atq3 = null;
        while (i < size2) {
            int i2 = i + 1;
            dby dby2 = (dby) arrayList2.get(i);
            if (dby2.e == null) {
                dca = dca.g;
            } else {
                dca = dby2.e;
            }
            if (dca.d == null) {
                dmk = dmk.d;
            } else {
                dmk = dca.d;
            }
            if (dmk == null || dmk.d.equals(dmk)) {
                atq = atq.NO_DUE_DATE;
            } else {
                Calendar b = ajd.b(dmk);
                if (b.before(a)) {
                    atq = atq.OVERDUE;
                } else if (a.equals(b)) {
                    atq = atq.DUE_TODAY;
                } else {
                    Calendar calendar = (Calendar) a.clone();
                    calendar.add(5, 1);
                    if (calendar.equals(b)) {
                        atq = atq.DUE_TOMORROW;
                    } else {
                        atq = atq.DUE_LATER;
                    }
                }
            }
            if (atq3 != atq || (atq == atq.DUE_LATER && !dmk.equals(dmk3))) {
                this.n.add(new atr(bg.T, dby2, atq));
                atq2 = atq;
                dmk2 = dmk;
            } else {
                dmk2 = dmk3;
                atq2 = atq3;
            }
            this.n.add(atr.a(dby2));
            atq3 = atq2;
            dmk3 = dmk2;
            i = i2;
        }
    }

    static final /* synthetic */ int a(dby dby, dby dby2) {
        dca dca;
        dmk dmk;
        dca dca2;
        dmk dmk2;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d == null) {
            dmk = dmk.d;
        } else {
            dmk = dca.d;
        }
        if (dby2.e == null) {
            dca2 = dca.g;
        } else {
            dca2 = dby2.e;
        }
        if (dca2.d == null) {
            dmk2 = dmk.d;
        } else {
            dmk2 = dca2.d;
        }
        if (dmk.d.equals(dmk) && !dmk.d.equals(dmk2)) {
            return 1;
        }
        if (dmk.d.equals(dmk2) && !dmk.d.equals(dmk)) {
            return -1;
        }
        if (dmk.equals(dmk2)) {
            return 0;
        }
        int compareTo = Integer.valueOf(dmk.a).compareTo(Integer.valueOf(dmk2.a));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Integer.valueOf(dmk.b).compareTo(Integer.valueOf(dmk2.b));
        return compareTo2 != 0 ? compareTo2 : Integer.valueOf(dmk.c).compareTo(Integer.valueOf(dmk2.c));
    }
}
