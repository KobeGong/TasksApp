package defpackage;

/* renamed from: afn reason: default package */
/* compiled from: PG */
public final class afn {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public java.util.ArrayList<RecyclerViewHolder> mChangedScrap = null;
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.List d = java.util.Collections.unmodifiableList(this.a);
    public final /* synthetic */ android.support.v7.widget.RecyclerView recyclerView;
    private int f = 2;
    private int g = 2;
    private defpackage.afl h;

    public afn(android.support.v7.widget.RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void a() {
        this.a.clear();
        c();
    }

    public final void b() {
        this.g = (this.recyclerView.mLayout != null ? this.recyclerView.mLayout.h : 0) + this.f;
        for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.g; size--) {
            a(size);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final RecyclerViewHolder a(int r11, long r12) {
            r10 = this;
            if (r11 < 0) goto L_0x000c
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            int r0 = r0.a()
            if (r11 < r0) goto L_0x0047
        L_0x000c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid item position "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = "). Item count:"
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v7.widget.RecyclerView r2 = r10.e
            aft r2 = r2.D
            int r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v7.widget.RecyclerView r2 = r10.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0047:
            r1 = 0
            r2 = 0
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0063
            java.util.ArrayList r0 = r10.b
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r0 = r10.b
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0118
        L_0x005d:
            r0 = 0
            r2 = r0
        L_0x005f:
            if (r2 == 0) goto L_0x0189
            r0 = 1
        L_0x0062:
            r1 = r0
        L_0x0063:
            if (r2 != 0) goto L_0x00c6
            java.util.ArrayList r0 = r10.a
            int r3 = r0.size()
            r0 = 0
            r2 = r0
        L_0x006d:
            if (r2 >= r3) goto L_0x0191
            java.util.ArrayList r0 = r10.a
            java.lang.Object r0 = r0.get(r2)
            afv r0 = (defpackage.afv) r0
            boolean r4 = r0.g()
            if (r4 != 0) goto L_0x018c
            int r4 = r0.c()
            if (r4 != r11) goto L_0x018c
            boolean r4 = r0.j()
            if (r4 != 0) goto L_0x018c
            android.support.v7.widget.RecyclerView r4 = r10.e
            aft r4 = r4.D
            boolean r4 = r4.g
            if (r4 != 0) goto L_0x0097
            boolean r4 = r0.m()
            if (r4 != 0) goto L_0x018c
        L_0x0097:
            r2 = 32
            r0.b(r2)
            r2 = r0
        L_0x009d:
            if (r2 == 0) goto L_0x00c6
            boolean r0 = r2.m()
            if (r0 == 0) goto L_0x027b
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.g
        L_0x00ab:
            if (r0 != 0) goto L_0x02ec
            r0 = 4
            r2.b(r0)
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x02e1
            android.support.v7.widget.RecyclerView r0 = r10.e
            android.view.View r3 = r2.a
            r4 = 0
            r0.removeDetachedView(r3, r4)
            r2.f()
        L_0x00c2:
            r10.a(r2)
            r2 = 0
        L_0x00c6:
            if (r2 != 0) goto L_0x042b
            android.support.v7.widget.RecyclerView r0 = r10.e
            aeo r0 = r0.f
            r3 = 0
            int r3 = r0.a(r11, r3)
            if (r3 < 0) goto L_0x00dd
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            int r0 = r0.a()
            if (r3 < r0) goto L_0x02ef
        L_0x00dd:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistency detected. Invalid item position "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = "(offset:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = ").state:"
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v7.widget.RecyclerView r2 = r10.e
            aft r2 = r2.D
            int r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v7.widget.RecyclerView r2 = r10.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0118:
            r0 = 0
            r1 = r0
        L_0x011a:
            if (r1 >= r2) goto L_0x013c
            java.util.ArrayList r0 = r10.b
            java.lang.Object r0 = r0.get(r1)
            afv r0 = (defpackage.afv) r0
            boolean r3 = r0.g()
            if (r3 != 0) goto L_0x0138
            int r3 = r0.c()
            if (r3 != r11) goto L_0x0138
            r1 = 32
            r0.b(r1)
            r2 = r0
            goto L_0x005f
        L_0x0138:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x011a
        L_0x013c:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0185
            android.support.v7.widget.RecyclerView r0 = r10.e
            aeo r0 = r0.f
            r1 = 0
            int r0 = r0.a(r11, r1)
            if (r0 <= 0) goto L_0x0185
            android.support.v7.widget.RecyclerView r1 = r10.e
            aet r1 = r1.k
            int r1 = r1.a()
            if (r0 >= r1) goto L_0x0185
            android.support.v7.widget.RecyclerView r1 = r10.e
            aet r1 = r1.k
            long r4 = r1.a(r0)
            r0 = 0
            r1 = r0
        L_0x0163:
            if (r1 >= r2) goto L_0x0185
            java.util.ArrayList r0 = r10.b
            java.lang.Object r0 = r0.get(r1)
            afv r0 = (defpackage.afv) r0
            boolean r3 = r0.g()
            if (r3 != 0) goto L_0x0181
            long r6 = r0.e
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0181
            r1 = 32
            r0.b(r1)
            r2 = r0
            goto L_0x005f
        L_0x0181:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0163
        L_0x0185:
            r0 = 0
            r2 = r0
            goto L_0x005f
        L_0x0189:
            r0 = 0
            goto L_0x0062
        L_0x018c:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x006d
        L_0x0191:
            android.support.v7.widget.RecyclerView r0 = r10.e
            acm r3 = r0.g
            java.util.List r0 = r3.c
            int r4 = r0.size()
            r0 = 0
            r2 = r0
        L_0x019d:
            if (r2 >= r4) goto L_0x01e9
            java.util.List r0 = r3.c
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            afv r5 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(r0)
            int r6 = r5.c()
            if (r6 != r11) goto L_0x01e5
            boolean r6 = r5.j()
            if (r6 != 0) goto L_0x01e5
            boolean r5 = r5.m()
            if (r5 != 0) goto L_0x01e5
            r2 = r0
        L_0x01be:
            if (r2 == 0) goto L_0x024d
            afv r0 = android.support.v7.widget.RecyclerView.c(r2)
            android.support.v7.widget.RecyclerView r3 = r10.e
            acm r3 = r3.g
            aco r4 = r3.a
            int r4 = r4.a(r2)
            if (r4 >= 0) goto L_0x01ec
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e5:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x019d
        L_0x01e9:
            r0 = 0
            r2 = r0
            goto L_0x01be
        L_0x01ec:
            acn r5 = r3.b
            boolean r5 = r5.c(r4)
            if (r5 != 0) goto L_0x0209
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0209:
            acn r5 = r3.b
            r5.b(r4)
            r3.b(r2)
            android.support.v7.widget.RecyclerView r3 = r10.e
            acm r3 = r3.g
            int r3 = r3.c(r2)
            r4 = -1
            if (r3 != r4) goto L_0x023b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            android.support.v7.widget.RecyclerView r2 = r10.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x023b:
            android.support.v7.widget.RecyclerView r4 = r10.e
            acm r4 = r4.g
            r4.d(r3)
            r10.c(r2)
            r2 = 8224(0x2020, float:1.1524E-41)
            r0.b(r2)
            r2 = r0
            goto L_0x009d
        L_0x024d:
            java.util.ArrayList r0 = r10.c
            int r3 = r0.size()
            r0 = 0
            r2 = r0
        L_0x0255:
            if (r2 >= r3) goto L_0x0277
            java.util.ArrayList r0 = r10.c
            java.lang.Object r0 = r0.get(r2)
            afv r0 = (defpackage.afv) r0
            boolean r4 = r0.j()
            if (r4 != 0) goto L_0x0273
            int r4 = r0.c()
            if (r4 != r11) goto L_0x0273
            java.util.ArrayList r3 = r10.c
            r3.remove(r2)
            r2 = r0
            goto L_0x009d
        L_0x0273:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0255
        L_0x0277:
            r0 = 0
            r2 = r0
            goto L_0x009d
        L_0x027b:
            int r0 = r2.c
            if (r0 < 0) goto L_0x028b
            int r0 = r2.c
            android.support.v7.widget.RecyclerView r3 = r10.e
            aet r3 = r3.k
            int r3 = r3.a()
            if (r0 < r3) goto L_0x02aa
        L_0x028b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            android.support.v7.widget.RecyclerView r2 = r10.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02aa:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x02c3
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            int r3 = r2.c
            int r0 = r0.b(r3)
            int r3 = r2.f
            if (r0 == r3) goto L_0x02c3
            r0 = 0
            goto L_0x00ab
        L_0x02c3:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x02de
            long r4 = r2.e
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            int r3 = r2.c
            long r6 = r0.a(r3)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02de
            r0 = 0
            goto L_0x00ab
        L_0x02de:
            r0 = 1
            goto L_0x00ab
        L_0x02e1:
            boolean r0 = r2.g()
            if (r0 == 0) goto L_0x00c2
            r2.h()
            goto L_0x00c2
        L_0x02ec:
            r1 = 1
            goto L_0x00c6
        L_0x02ef:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            int r4 = r0.b(r3)
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0349
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            long r6 = r0.a(r3)
            java.util.ArrayList r0 = r10.a
            int r0 = r0.size()
            int r0 = r0 + -1
            r2 = r0
        L_0x0310:
            if (r2 < 0) goto L_0x03c5
            java.util.ArrayList r0 = r10.a
            java.lang.Object r0 = r0.get(r2)
            afv r0 = (defpackage.afv) r0
            long r8 = r0.e
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x03c0
            boolean r5 = r0.g()
            if (r5 != 0) goto L_0x03c0
            int r5 = r0.f
            if (r4 != r5) goto L_0x03ae
            r2 = 32
            r0.b(r2)
            boolean r2 = r0.m()
            if (r2 == 0) goto L_0x0343
            android.support.v7.widget.RecyclerView r2 = r10.e
            aft r2 = r2.D
            boolean r2 = r2.g
            if (r2 != 0) goto L_0x0343
            r2 = 2
            r5 = 14
            r0.a(r2, r5)
        L_0x0343:
            r2 = r0
        L_0x0344:
            if (r2 == 0) goto L_0x0349
            r2.c = r3
            r1 = 1
        L_0x0349:
            if (r2 != 0) goto L_0x0387
            afl r0 = r10.d()
            android.util.SparseArray r0 = r0.a
            java.lang.Object r0 = r0.get(r4)
            afm r0 = (defpackage.afm) r0
            if (r0 == 0) goto L_0x03f5
            java.util.ArrayList r2 = r0.a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x03f5
            java.util.ArrayList r0 = r0.a
            int r2 = r0.size()
            int r2 = r2 + -1
            java.lang.Object r0 = r0.remove(r2)
            afv r0 = (defpackage.afv) r0
            r2 = r0
        L_0x0370:
            if (r2 == 0) goto L_0x0387
            r2.q()
            boolean r0 = android.support.v7.widget.RecyclerView.a
            if (r0 == 0) goto L_0x0387
            android.view.View r0 = r2.a
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0387
            android.view.View r0 = r2.a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 0
            r10.a(r0, r3)
        L_0x0387:
            if (r2 != 0) goto L_0x042b
            long r6 = android.support.v7.widget.RecyclerView.o()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x03fa
            afl r0 = r10.h
            afm r0 = r0.a(r4)
            long r2 = r0.c
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x03a9
            long r2 = r2 + r6
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x03f8
        L_0x03a9:
            r0 = 1
        L_0x03aa:
            if (r0 != 0) goto L_0x03fa
            r0 = 0
        L_0x03ad:
            return r0
        L_0x03ae:
            java.util.ArrayList r5 = r10.a
            r5.remove(r2)
            android.support.v7.widget.RecyclerView r5 = r10.e
            android.view.View r8 = r0.a
            r9 = 0
            r5.removeDetachedView(r8, r9)
            android.view.View r0 = r0.a
            r10.b(r0)
        L_0x03c0:
            int r0 = r2 + -1
            r2 = r0
            goto L_0x0310
        L_0x03c5:
            java.util.ArrayList r0 = r10.c
            int r0 = r0.size()
            int r0 = r0 + -1
            r2 = r0
        L_0x03ce:
            if (r2 < 0) goto L_0x03ed
            java.util.ArrayList r0 = r10.c
            java.lang.Object r0 = r0.get(r2)
            afv r0 = (defpackage.afv) r0
            long r8 = r0.e
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x03f1
            int r5 = r0.f
            if (r4 != r5) goto L_0x03ea
            java.util.ArrayList r5 = r10.c
            r5.remove(r2)
            r2 = r0
            goto L_0x0344
        L_0x03ea:
            r10.a(r2)
        L_0x03ed:
            r0 = 0
            r2 = r0
            goto L_0x0344
        L_0x03f1:
            int r0 = r2 + -1
            r2 = r0
            goto L_0x03ce
        L_0x03f5:
            r2 = 0
            goto L_0x0370
        L_0x03f8:
            r0 = 0
            goto L_0x03aa
        L_0x03fa:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            android.support.v7.widget.RecyclerView r2 = r10.e
            afv r2 = r0.b(r2, r4)
            boolean r0 = android.support.v7.widget.RecyclerView.d
            if (r0 == 0) goto L_0x0417
            android.view.View r0 = r2.a
            android.support.v7.widget.RecyclerView r0 = android.support.v7.widget.RecyclerView.f(r0)
            if (r0 == 0) goto L_0x0417
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.b = r3
        L_0x0417:
            long r8 = android.support.v7.widget.RecyclerView.o()
            afl r0 = r10.h
            long r6 = r8 - r6
            afm r0 = r0.a(r4)
            long r4 = r0.c
            long r4 = defpackage.afl.a(r4, r6)
            r0.c = r4
        L_0x042b:
            r3 = r1
            if (r3 == 0) goto L_0x0478
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x0478
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L_0x0478
            r0 = 0
            r1 = 8192(0x2000, float:1.14794E-41)
            r2.a(r0, r1)
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0478
            defpackage.aey.d(r2)
            android.support.v7.widget.RecyclerView r0 = r10.e
            aey r0 = r0.z
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            r2.p()
            afb r0 = new afb
            r0.<init>()
            android.view.View r1 = r2.a
            int r4 = r1.getLeft()
            r0.a = r4
            int r4 = r1.getTop()
            r0.b = r4
            r1.getRight()
            r1.getBottom()
            android.support.v7.widget.RecyclerView r1 = r10.e
            r1.a(r2, r0)
        L_0x0478:
            r0 = 0
            android.support.v7.widget.RecyclerView r1 = r10.e
            aft r1 = r1.D
            boolean r1 = r1.g
            if (r1 == 0) goto L_0x04ab
            boolean r1 = r2.l()
            if (r1 == 0) goto L_0x04ab
            r2.g = r11
            r1 = r0
        L_0x048a:
            android.view.View r0 = r2.a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0576
            android.support.v7.widget.RecyclerView r0 = r10.e
            android.view.ViewGroup$LayoutParams r0 = r0.generateDefaultLayoutParams()
            afh r0 = (defpackage.afh) r0
            android.view.View r4 = r2.a
            r4.setLayoutParams(r0)
        L_0x049f:
            r0.a = r2
            if (r3 == 0) goto L_0x0591
            if (r1 == 0) goto L_0x0591
            r1 = 1
        L_0x04a6:
            r0.d = r1
            r0 = r2
            goto L_0x03ad
        L_0x04ab:
            boolean r1 = r2.l()
            if (r1 == 0) goto L_0x04bd
            boolean r1 = r2.k()
            if (r1 != 0) goto L_0x04bd
            boolean r1 = r2.j()
            if (r1 == 0) goto L_0x0594
        L_0x04bd:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aeo r0 = r0.f
            r1 = 0
            int r1 = r0.a(r11, r1)
            android.support.v7.widget.RecyclerView r0 = r10.e
            r2.o = r0
            int r0 = r2.f
            long r4 = android.support.v7.widget.RecyclerView.o()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x04f4
            afl r6 = r10.h
            afm r0 = r6.a(r0)
            long r6 = r0.d
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x04ec
            long r6 = r6 + r4
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x04f2
        L_0x04ec:
            r0 = 1
        L_0x04ed:
            if (r0 != 0) goto L_0x04f4
            r0 = 0
        L_0x04f0:
            r1 = r0
            goto L_0x048a
        L_0x04f2:
            r0 = 0
            goto L_0x04ed
        L_0x04f4:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aet r0 = r0.k
            r2.c = r1
            boolean r6 = r0.e
            if (r6 == 0) goto L_0x0504
            long r6 = r0.a(r1)
            r2.e = r6
        L_0x0504:
            r6 = 1
            r7 = 519(0x207, float:7.27E-43)
            r2.a(r6, r7)
            java.lang.String r6 = "RV OnBindView"
            defpackage.jd.c(r6)
            r2.p()
            r0.a(r2, r1)
            r2.o()
            android.view.View r0 = r2.a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof defpackage.afh
            if (r1 == 0) goto L_0x0527
            afh r0 = (defpackage.afh) r0
            r1 = 1
            r0.c = r1
        L_0x0527:
            defpackage.jd.b()
            long r0 = android.support.v7.widget.RecyclerView.o()
            afl r6 = r10.h
            int r7 = r2.f
            long r0 = r0 - r4
            afm r4 = r6.a(r7)
            long r6 = r4.d
            long r0 = defpackage.afl.a(r6, r0)
            r4.d = r0
            android.support.v7.widget.RecyclerView r0 = r10.e
            boolean r0 = r0.j()
            if (r0 == 0) goto L_0x0569
            android.view.View r0 = r2.a
            sw r1 = defpackage.sn.a
            int r1 = r1.d(r0)
            if (r1 != 0) goto L_0x0555
            r1 = 1
            defpackage.sn.a(r0, r1)
        L_0x0555:
            boolean r1 = defpackage.sn.a(r0)
            if (r1 != 0) goto L_0x0569
            r1 = 16384(0x4000, float:2.2959E-41)
            r2.b(r1)
            android.support.v7.widget.RecyclerView r1 = r10.e
            afw r1 = r1.J
            rn r1 = r1.c
            defpackage.sn.a(r0, r1)
        L_0x0569:
            android.support.v7.widget.RecyclerView r0 = r10.e
            aft r0 = r0.D
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x0573
            r2.g = r11
        L_0x0573:
            r0 = 1
            goto L_0x04f0
        L_0x0576:
            android.support.v7.widget.RecyclerView r4 = r10.e
            boolean r4 = r4.checkLayoutParams(r0)
            if (r4 != 0) goto L_0x058d
            android.support.v7.widget.RecyclerView r4 = r10.e
            android.view.ViewGroup$LayoutParams r0 = r4.generateLayoutParams(r0)
            afh r0 = (defpackage.afh) r0
            android.view.View r4 = r2.a
            r4.setLayoutParams(r0)
            goto L_0x049f
        L_0x058d:
            afh r0 = (defpackage.afh) r0
            goto L_0x049f
        L_0x0591:
            r1 = 0
            goto L_0x04a6
        L_0x0594:
            r1 = r0
            goto L_0x048a
    }

    private final void a(android.view.ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt, true);
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

    public final void a(android.view.View view) {
        RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
        if (c2.isTmpDetached()) {
            this.recyclerView.removeDetachedView(view, false);
        }
        if (c2.isScrap()) {
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
        if (android.support.v7.widget.RecyclerView.d) {
            this.recyclerView.C.a();
        }
    }

    public final void a(int i) {
        a((RecyclerViewHolder) this.c.get(i), true);
        this.c.remove(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(RecyclerViewHolder r7) {
            r6 = this;
            r1 = 1
            r2 = 0
            boolean r0 = r7.e()
            if (r0 != 0) goto L_0x0010
            android.view.View r0 = r7.a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0048
        L_0x0010:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
            r0.<init>(r4)
            boolean r4 = r7.e()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = " isAttached:"
            java.lang.StringBuilder r4 = r0.append(r4)
            android.view.View r0 = r7.a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0046
            r0 = r1
        L_0x0030:
            java.lang.StringBuilder r0 = r4.append(r0)
            android.support.v7.widget.RecyclerView r1 = r6.e
            java.lang.String r1 = r1.a()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L_0x0046:
            r0 = r2
            goto L_0x0030
        L_0x0048:
            boolean r0 = r7.n()
            if (r0 == 0) goto L_0x006d
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            android.support.v7.widget.RecyclerView r2 = r6.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006d:
            boolean r0 = r7.b()
            if (r0 == 0) goto L_0x008e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r1.<init>(r2)
            android.support.v7.widget.RecyclerView r2 = r6.e
            java.lang.String r2 = r2.a()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008e:
            int r0 = r7.j
            r0 = r0 & 16
            if (r0 != 0) goto L_0x00fd
            android.view.View r0 = r7.a
            sw r3 = defpackage.sn.a
            boolean r0 = r3.b(r0)
            if (r0 == 0) goto L_0x00fd
            r3 = r1
        L_0x009f:
            android.support.v7.widget.RecyclerView r0 = r6.e
            aet r0 = r0.k
            if (r0 == 0) goto L_0x00ab
            if (r3 == 0) goto L_0x00ab
            android.support.v7.widget.RecyclerView r0 = r6.e
            aet r0 = r0.k
        L_0x00ab:
            boolean r0 = r7.r()
            if (r0 == 0) goto L_0x0120
            int r0 = r6.g
            if (r0 <= 0) goto L_0x011e
            r0 = 526(0x20e, float:7.37E-43)
            boolean r0 = r7.a(r0)
            if (r0 != 0) goto L_0x011e
            java.util.ArrayList r0 = r6.c
            int r0 = r0.size()
            int r4 = r6.g
            if (r0 < r4) goto L_0x00ce
            if (r0 <= 0) goto L_0x00ce
            r6.a(r2)
            int r0 = r0 + -1
        L_0x00ce:
            boolean r4 = android.support.v7.widget.RecyclerView.d
            if (r4 == 0) goto L_0x0101
            if (r0 <= 0) goto L_0x0101
            android.support.v7.widget.RecyclerView r4 = r6.e
            afg r4 = r4.C
            int r5 = r7.c
            boolean r4 = r4.a(r5)
            if (r4 != 0) goto L_0x0101
            int r0 = r0 + -1
            r4 = r0
        L_0x00e3:
            if (r4 < 0) goto L_0x00ff
            java.util.ArrayList r0 = r6.c
            java.lang.Object r0 = r0.get(r4)
            afv r0 = (defpackage.afv) r0
            int r0 = r0.c
            android.support.v7.widget.RecyclerView r5 = r6.e
            afg r5 = r5.C
            boolean r0 = r5.a(r0)
            if (r0 == 0) goto L_0x00ff
            int r0 = r4 + -1
            r4 = r0
            goto L_0x00e3
        L_0x00fd:
            r3 = r2
            goto L_0x009f
        L_0x00ff:
            int r0 = r4 + 1
        L_0x0101:
            java.util.ArrayList r4 = r6.c
            r4.add(r0, r7)
            r0 = r1
        L_0x0107:
            if (r0 != 0) goto L_0x010d
            r6.a(r7, r1)
            r2 = r1
        L_0x010d:
            android.support.v7.widget.RecyclerView r1 = r6.e
            aho r1 = r1.h
            r1.d(r7)
            if (r0 != 0) goto L_0x011d
            if (r2 != 0) goto L_0x011d
            if (r3 == 0) goto L_0x011d
            r0 = 0
            r7.o = r0
        L_0x011d:
            return
        L_0x011e:
            r0 = r2
            goto L_0x0107
        L_0x0120:
            r0 = r2
            goto L_0x010d
    }

    /* access modifiers changed from: 0000 */
    public final void a(RecyclerViewHolder afv, boolean z) {
        android.support.v7.widget.RecyclerView.b(afv);
        if (afv.hasAnyOfTheFlags(16384)) {
            afv.a(0, 16384);
            ViewCompat.a(afv.itemView, (defpackage.rn) null);
        }
        if (z) {
            defpackage.afo afo = this.recyclerView.m;
            if (this.recyclerView.adapter != null) {
                this.recyclerView.adapter.a(afv);
            }
            if (this.recyclerView.D != null) {
                this.recyclerView.h.d(afv);
            }
        }
        afv.o = null;
        defpackage.afl d2 = d();
        int i = afv.f;
        java.util.ArrayList arrayList = d2.a(i).a;
        if (((defpackage.afm) d2.a.get(i)).b > arrayList.size()) {
            afv.q();
            arrayList.add(afv);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(android.view.View view) {
        RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
        c2.k = null;
        c2.l = false;
        c2.h();
        a(c2);
    }

    /* access modifiers changed from: 0000 */
    public final void scrapView(android.view.View view) {
        RecyclerViewHolder c2 = android.support.v7.widget.RecyclerView.getChildViewHolderInt(view);
        if (!c2.hasAnyOfTheFlags(12) && c2.s()) {
            android.support.v7.widget.RecyclerView recyclerView = this.recyclerView;
            if (!(recyclerView.z == null || recyclerView.z.a(c2, c2.p()))) {
                if (this.mChangedScrap == null) {
                    this.mChangedScrap = new java.util.ArrayList<>();
                }
                c2.a(this, true);
                this.mChangedScrap.add(c2);
                return;
            }
        }
        if (!c2.isInvalid() || c2.isRemoved() || this.recyclerView.adapter.mHasStableIds) {
            c2.a(this, false);
            this.a.add(c2);
            return;
        }
        throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.recyclerView.exceptionLabel());
    }

    public final void b(RecyclerViewHolder afv) {
        if (afv.l) {
            this.mChangedScrap.remove(afv);
        } else {
            this.a.remove(afv);
        }
        afv.k = null;
        afv.l = false;
        afv.h();
    }

    public final defpackage.afl d() {
        if (this.h == null) {
            this.h = new defpackage.afl();
        }
        return this.h;
    }
}
