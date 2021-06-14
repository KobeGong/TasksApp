package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: afn  reason: default package */
/* compiled from: PG */
public final class afn {
    public final ArrayList a = new ArrayList();
    public ArrayList b = null;
    public final ArrayList c = new ArrayList();
    public final List d = Collections.unmodifiableList(this.a);
    public final /* synthetic */ RecyclerView e;
    private int f = 2;
    private int g = 2;
    private afl h;

    public afn(RecyclerView recyclerView) {
        this.e = recyclerView;
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final void b() {
        this.g = (this.e.layoutManager != null ? this.e.layoutManager.h : 0) + this.f;
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.g; size--) {
            a(size);
        }
    }

    /* access modifiers changed from: package-private */
    public final ViewHolder a(int i, long j) {
        boolean z;
        boolean z2;
        afh afh;
        RecyclerView f2;
        View view;
        boolean z3;
        ViewHolder afv;
        int size;
        int a2;
        if (i < 0 || i >= this.e.D.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.e.D.a() + this.e.a());
        }
        boolean z4 = false;
        ViewHolder afv2 = null;
        if (this.e.D.g) {
            if (this.b == null || (size = this.b.size()) == 0) {
                afv2 = null;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        ViewHolder afv3 = (ViewHolder) this.b.get(i2);
                        if (!afv3.g() && afv3.c() == i) {
                            afv3.b(32);
                            afv2 = afv3;
                            break;
                        }
                        i2++;
                    } else {
                        if (this.e.adapter.mHasStableIds && (a2 = this.e.f.a(i, 0)) > 0 && a2 < this.e.adapter.getCount()) {
                            long a3 = this.e.adapter.getItemId(a2);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    break;
                                }
                                ViewHolder afv4 = (ViewHolder) this.b.get(i3);
                                if (!afv4.g() && afv4.e == a3) {
                                    afv4.b(32);
                                    afv2 = afv4;
                                    break;
                                }
                                i3++;
                            }
                        }
                        afv2 = null;
                    }
                }
            }
            z4 = afv2 != null;
        }
        if (afv2 == null) {
            int size2 = this.a.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    acm acm = this.e.g;
                    int size3 = acm.c.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            view = null;
                            break;
                        }
                        View view2 = (View) acm.c.get(i5);
                        ViewHolder c2 = RecyclerView.c(view2);
                        if (c2.c() == i && !c2.j() && !c2.m()) {
                            view = view2;
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = this.c.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                afv2 = null;
                                break;
                            }
                            ViewHolder afv5 = (ViewHolder) this.c.get(i6);
                            if (!afv5.j() && afv5.c() == i) {
                                this.c.remove(i6);
                                afv2 = afv5;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        ViewHolder c3 = RecyclerView.c(view);
                        acm acm2 = this.e.g;
                        int a4 = acm2.a.a(view);
                        if (a4 < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        } else if (!acm2.b.c(a4)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        } else {
                            acm2.b.b(a4);
                            acm2.b(view);
                            int c4 = this.e.g.c(view);
                            if (c4 == -1) {
                                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + c3 + this.e.a());
                            }
                            this.e.g.d(c4);
                            c(view);
                            c3.b(8224);
                            afv2 = c3;
                        }
                    }
                } else {
                    afv = (ViewHolder) this.a.get(i4);
                    if (afv.g() || afv.c() != i || afv.j() || (!this.e.D.g && afv.m())) {
                        i4++;
                    }
                }
            }
            afv.b(32);
            afv2 = afv;
            if (afv2 != null) {
                if (afv2.m()) {
                    z3 = this.e.D.g;
                } else if (afv2.c < 0 || afv2.c >= this.e.adapter.getCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + afv2 + this.e.a());
                } else if (!this.e.D.g && this.e.adapter.getItemViewType(afv2.c) != afv2.f) {
                    z3 = false;
                } else if (!this.e.adapter.mHasStableIds || afv2.e == this.e.adapter.getItemId(afv2.c)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    afv2.b(4);
                    if (afv2.e()) {
                        this.e.removeDetachedView(afv2.a, false);
                        afv2.f();
                    } else if (afv2.g()) {
                        afv2.h();
                    }
                    a(afv2);
                    afv2 = null;
                } else {
                    z4 = true;
                }
            }
        }
        if (afv2 == null) {
            int a5 = this.e.f.a(i, 0);
            if (a5 < 0 || a5 >= this.e.adapter.getCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + a5 + ").state:" + this.e.D.a() + this.e.a());
            }
            int b2 = this.e.adapter.getItemViewType(a5);
            if (this.e.adapter.mHasStableIds) {
                long a6 = this.e.adapter.getItemId(a5);
                int size5 = this.a.size() - 1;
                while (true) {
                    if (size5 >= 0) {
                        ViewHolder afv6 = (ViewHolder) this.a.get(size5);
                        if (afv6.e == a6 && !afv6.g()) {
                            if (b2 == afv6.f) {
                                afv6.b(32);
                                if (afv6.m() && !this.e.D.g) {
                                    afv6.a(2, 14);
                                }
                                afv2 = afv6;
                            } else {
                                this.a.remove(size5);
                                this.e.removeDetachedView(afv6.a, false);
                                b(afv6.a);
                            }
                        }
                        size5--;
                    } else {
                        int size6 = this.c.size() - 1;
                        while (true) {
                            if (size6 < 0) {
                                break;
                            }
                            ViewHolder afv7 = (ViewHolder) this.c.get(size6);
                            if (afv7.e != a6) {
                                size6--;
                            } else if (b2 == afv7.f) {
                                this.c.remove(size6);
                                afv2 = afv7;
                            } else {
                                a(size6);
                            }
                        }
                        afv2 = null;
                    }
                }
                if (afv2 != null) {
                    afv2.c = a5;
                    z4 = true;
                }
            }
            if (afv2 == null) {
                afm afm = (afm) d().a.get(b2);
                if (afm == null || afm.a.isEmpty()) {
                    afv2 = null;
                } else {
                    ArrayList arrayList = afm.a;
                    afv2 = (ViewHolder) arrayList.remove(arrayList.size() - 1);
                }
                if (afv2 != null) {
                    afv2.q();
                    if (RecyclerView.a && (afv2.a instanceof ViewGroup)) {
                        a((ViewGroup) afv2.a, false);
                    }
                }
            }
            if (afv2 == null) {
                long o = RecyclerView.o();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.h.a(b2).c;
                    if (!(j2 == 0 || j2 + o < j)) {
                        return null;
                    }
                }
                afv2 = this.e.adapter.createViewHolder(this.e, b2);
                if (RecyclerView.d && (f2 = RecyclerView.f(afv2.a)) != null) {
                    afv2.b = new WeakReference(f2);
                }
                long o2 = RecyclerView.o();
                afm a7 = this.h.a(b2);
                a7.c = afl.a(a7.c, o2 - o);
            }
        }
        if (z4 && !this.e.D.g && afv2.a(8192)) {
            afv2.a(0, 8192);
            if (this.e.D.j) {
                aey.d(afv2);
                aey aey = this.e.z;
                aft aft = this.e.D;
                afv2.p();
                afb afb = new afb();
                View view3 = afv2.a;
                afb.a = view3.getLeft();
                afb.b = view3.getTop();
                view3.getRight();
                view3.getBottom();
                this.e.a(afv2, afb);
            }
        }
        if (this.e.D.g && afv2.l()) {
            afv2.g = i;
            z2 = false;
        } else if (!afv2.l() || afv2.k() || afv2.j()) {
            int a8 = this.e.f.a(i, 0);
            afv2.o = this.e;
            int i7 = afv2.f;
            long o3 = RecyclerView.o();
            if (j != Long.MAX_VALUE) {
                long j3 = this.h.a(i7).d;
                if (!(j3 == 0 || j3 + o3 < j)) {
                    z = false;
                    z2 = z;
                }
            }
            Adapter aet = this.e.adapter;
            afv2.c = a8;
            if (aet.mHasStableIds) {
                afv2.e = aet.getItemId(a8);
            }
            afv2.a(1, 519);
            jd.c("RV OnBindView");
            afv2.p();
            aet.onBindViewHolder(afv2, a8);
            afv2.o();
            ViewGroup.LayoutParams layoutParams = afv2.a.getLayoutParams();
            if (layoutParams instanceof afh) {
                ((afh) layoutParams).c = true;
            }
            jd.b();
            long o4 = RecyclerView.o() - o3;
            afm a9 = this.h.a(afv2.f);
            a9.d = afl.a(a9.d, o4);
            if (this.e.j()) {
                View view4 = afv2.a;
                if (sn.a.d(view4) == 0) {
                    sn.a(view4, 1);
                }
                if (!sn.a(view4)) {
                    afv2.b(16384);
                    sn.a(view4, this.e.J.c);
                }
            }
            if (this.e.D.g) {
                afv2.g = i;
            }
            z = true;
            z2 = z;
        } else {
            z2 = false;
        }
        ViewGroup.LayoutParams layoutParams2 = afv2.a.getLayoutParams();
        if (layoutParams2 == null) {
            afh = (afh) this.e.generateDefaultLayoutParams();
            afv2.a.setLayoutParams(afh);
        } else if (!this.e.checkLayoutParams(layoutParams2)) {
            afh = (afh) this.e.generateLayoutParams(layoutParams2);
            afv2.a.setLayoutParams(afh);
        } else {
            afh = (afh) layoutParams2;
        }
        afh.a = afv2;
        afh.d = z4 && z2;
        return afv2;
    }

    private final void a(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void a(View view) {
        ViewHolder c2 = RecyclerView.c(view);
        if (c2.n()) {
            this.e.removeDetachedView(view, false);
        }
        if (c2.e()) {
            c2.f();
        } else if (c2.g()) {
            c2.h();
        }
        a(c2);
    }

    public final void c() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            a(size);
        }
        this.c.clear();
        if (RecyclerView.d) {
            this.e.C.a();
        }
    }

    public final void a(int i) {
        a((ViewHolder) this.c.get(i), true);
        this.c.remove(i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(ViewHolder r7) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afn.a(afv):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewHolder afv, boolean z) {
        RecyclerView.b(afv);
        if (afv.a(16384)) {
            afv.a(0, 16384);
            sn.a(afv.a, (rn) null);
        }
        if (z) {
            afo afo = this.e.m;
            if (this.e.adapter != null) {
                this.e.adapter.a(afv);
            }
            if (this.e.D != null) {
                this.e.h.d(afv);
            }
        }
        afv.o = null;
        afl d2 = d();
        int i = afv.f;
        ArrayList arrayList = d2.a(i).a;
        if (((afm) d2.a.get(i)).b > arrayList.size()) {
            afv.q();
            arrayList.add(afv);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(View view) {
        ViewHolder c2 = RecyclerView.c(view);
        c2.k = null;
        c2.l = false;
        c2.h();
        a(c2);
    }

    /* access modifiers changed from: package-private */
    public final void c(View view) {
        ViewHolder c2 = RecyclerView.c(view);
        if (!c2.a(12) && c2.s()) {
            RecyclerView recyclerView = this.e;
            if (!(recyclerView.z == null || recyclerView.z.a(c2, c2.p()))) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                c2.a(this, true);
                this.b.add(c2);
                return;
            }
        }
        if (!c2.j() || c2.m() || this.e.adapter.mHasStableIds) {
            c2.a(this, false);
            this.a.add(c2);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.e.a());
    }

    public final void b(ViewHolder afv) {
        if (afv.l) {
            this.b.remove(afv);
        } else {
            this.a.remove(afv);
        }
        afv.k = null;
        afv.l = false;
        afv.h();
    }

    public final afl d() {
        if (this.h == null) {
            this.h = new afl();
        }
        return this.h;
    }
}
