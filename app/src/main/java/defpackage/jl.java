package defpackage;

/* renamed from: jl reason: default package */
/* compiled from: PG */
final class jl implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnPreDrawListener {
    public android.view.ViewGroup a;
    private defpackage.je b;

    jl(defpackage.je jeVar, android.view.ViewGroup viewGroup) {
        this.b = jeVar;
        this.a = viewGroup;
    }

    private final void a() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(android.view.View view) {
    }

    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
        defpackage.jk.b.remove(this.a);
        java.util.ArrayList arrayList = (java.util.ArrayList) defpackage.jk.a().get(this.a);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj = arrayList2.get(i);
                i++;
                ((defpackage.je) obj).e(this.a);
            }
        }
        this.b.a(true);
    }

    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r19 = this;
            r19.a()
            java.util.ArrayList r2 = defpackage.jk.b
            r0 = r19
            android.view.ViewGroup r3 = r0.a
            boolean r2 = r2.remove(r3)
            if (r2 != 0) goto L_0x0011
            r2 = 1
        L_0x0010:
            return r2
        L_0x0011:
            qr r4 = defpackage.jk.a()
            r0 = r19
            android.view.ViewGroup r2 = r0.a
            java.lang.Object r2 = r4.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r3 = 0
            if (r2 != 0) goto L_0x0070
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0 = r19
            android.view.ViewGroup r5 = r0.a
            r4.put(r5, r2)
            r18 = r3
            r3 = r2
            r2 = r18
        L_0x0033:
            r0 = r19
            je r5 = r0.b
            r3.add(r5)
            r0 = r19
            je r3 = r0.b
            jm r5 = new jm
            r0 = r19
            r5.<init>(r0, r4)
            r3.a(r5)
            r0 = r19
            je r3 = r0.b
            r0 = r19
            android.view.ViewGroup r4 = r0.a
            r5 = 0
            r3.a(r4, r5)
            if (r2 == 0) goto L_0x0081
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            r3 = 0
            r4 = r3
        L_0x005e:
            if (r4 >= r5) goto L_0x0081
            java.lang.Object r3 = r2.get(r4)
            int r4 = r4 + 1
            je r3 = (defpackage.je) r3
            r0 = r19
            android.view.ViewGroup r6 = r0.a
            r3.e(r6)
            goto L_0x005e
        L_0x0070:
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x02d4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x0033
        L_0x0081:
            r0 = r19
            je r2 = r0.b
            r0 = r19
            android.view.ViewGroup r3 = r0.a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.i = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.j = r4
            js r10 = r2.e
            js r11 = r2.f
            qr r12 = new qr
            qr r4 = r10.a
            r12.<init>(r4)
            qr r13 = new qr
            qr r4 = r11.a
            r13.<init>(r4)
            r4 = 0
            r8 = r4
        L_0x00ab:
            int[] r4 = r2.h
            int r4 = r4.length
            if (r8 >= r4) goto L_0x0214
            int[] r4 = r2.h
            r4 = r4[r8]
            switch(r4) {
                case 1: goto L_0x00bb;
                case 2: goto L_0x00fa;
                case 3: goto L_0x0150;
                case 4: goto L_0x01a6;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            int r4 = r8 + 1
            r8 = r4
            goto L_0x00ab
        L_0x00bb:
            int r4 = r12.size()
            int r4 = r4 + -1
            r6 = r4
        L_0x00c2:
            if (r6 < 0) goto L_0x00b7
            java.lang.Object r4 = r12.b(r6)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x00f6
            boolean r5 = r2.a(r4)
            if (r5 == 0) goto L_0x00f6
            java.lang.Object r4 = r13.remove(r4)
            jr r4 = (defpackage.jr) r4
            if (r4 == 0) goto L_0x00f6
            android.view.View r5 = r4.b
            if (r5 == 0) goto L_0x00f6
            android.view.View r5 = r4.b
            boolean r5 = r2.a(r5)
            if (r5 == 0) goto L_0x00f6
            java.lang.Object r5 = r12.d(r6)
            jr r5 = (defpackage.jr) r5
            java.util.ArrayList r7 = r2.i
            r7.add(r5)
            java.util.ArrayList r5 = r2.j
            r5.add(r4)
        L_0x00f6:
            int r4 = r6 + -1
            r6 = r4
            goto L_0x00c2
        L_0x00fa:
            qr r14 = r10.d
            qr r15 = r11.d
            int r16 = r14.size()
            r4 = 0
            r9 = r4
        L_0x0104:
            r0 = r16
            if (r9 >= r0) goto L_0x00b7
            java.lang.Object r4 = r14.c(r9)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x014c
            boolean r5 = r2.a(r4)
            if (r5 == 0) goto L_0x014c
            java.lang.Object r5 = r14.b(r9)
            java.lang.Object r5 = r15.get(r5)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x014c
            boolean r6 = r2.a(r5)
            if (r6 == 0) goto L_0x014c
            java.lang.Object r6 = r12.get(r4)
            jr r6 = (defpackage.jr) r6
            java.lang.Object r7 = r13.get(r5)
            jr r7 = (defpackage.jr) r7
            if (r6 == 0) goto L_0x014c
            if (r7 == 0) goto L_0x014c
            java.util.ArrayList r0 = r2.i
            r17 = r0
            r0 = r17
            r0.add(r6)
            java.util.ArrayList r6 = r2.j
            r6.add(r7)
            r12.remove(r4)
            r13.remove(r5)
        L_0x014c:
            int r4 = r9 + 1
            r9 = r4
            goto L_0x0104
        L_0x0150:
            android.util.SparseArray r14 = r10.b
            android.util.SparseArray r15 = r11.b
            int r16 = r14.size()
            r4 = 0
            r9 = r4
        L_0x015a:
            r0 = r16
            if (r9 >= r0) goto L_0x00b7
            java.lang.Object r4 = r14.valueAt(r9)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x01a2
            boolean r5 = r2.a(r4)
            if (r5 == 0) goto L_0x01a2
            int r5 = r14.keyAt(r9)
            java.lang.Object r5 = r15.get(r5)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x01a2
            boolean r6 = r2.a(r5)
            if (r6 == 0) goto L_0x01a2
            java.lang.Object r6 = r12.get(r4)
            jr r6 = (defpackage.jr) r6
            java.lang.Object r7 = r13.get(r5)
            jr r7 = (defpackage.jr) r7
            if (r6 == 0) goto L_0x01a2
            if (r7 == 0) goto L_0x01a2
            java.util.ArrayList r0 = r2.i
            r17 = r0
            r0 = r17
            r0.add(r6)
            java.util.ArrayList r6 = r2.j
            r6.add(r7)
            r12.remove(r4)
            r13.remove(r5)
        L_0x01a2:
            int r4 = r9 + 1
            r9 = r4
            goto L_0x015a
        L_0x01a6:
            qx r14 = r10.c
            qx r15 = r11.c
            int r16 = r14.b()
            r4 = 0
            r9 = r4
        L_0x01b0:
            r0 = r16
            if (r9 >= r0) goto L_0x00b7
            java.lang.Object r4 = r14.b(r9)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x020b
            boolean r5 = r2.a(r4)
            if (r5 == 0) goto L_0x020b
            long r6 = r14.a(r9)
            long[] r5 = r15.c
            int r0 = r15.e
            r17 = r0
            r0 = r17
            int r5 = defpackage.qv.a(r5, r0, r6)
            if (r5 < 0) goto L_0x01dc
            java.lang.Object[] r6 = r15.d
            r6 = r6[r5]
            java.lang.Object r7 = defpackage.qx.a
            if (r6 != r7) goto L_0x020f
        L_0x01dc:
            r5 = 0
        L_0x01dd:
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x020b
            boolean r6 = r2.a(r5)
            if (r6 == 0) goto L_0x020b
            java.lang.Object r6 = r12.get(r4)
            jr r6 = (defpackage.jr) r6
            java.lang.Object r7 = r13.get(r5)
            jr r7 = (defpackage.jr) r7
            if (r6 == 0) goto L_0x020b
            if (r7 == 0) goto L_0x020b
            java.util.ArrayList r0 = r2.i
            r17 = r0
            r0 = r17
            r0.add(r6)
            java.util.ArrayList r6 = r2.j
            r6.add(r7)
            r12.remove(r4)
            r13.remove(r5)
        L_0x020b:
            int r4 = r9 + 1
            r9 = r4
            goto L_0x01b0
        L_0x020f:
            java.lang.Object[] r6 = r15.d
            r5 = r6[r5]
            goto L_0x01dd
        L_0x0214:
            r4 = 0
            r5 = r4
        L_0x0216:
            int r4 = r12.size()
            if (r5 >= r4) goto L_0x0239
            java.lang.Object r4 = r12.c(r5)
            jr r4 = (defpackage.jr) r4
            android.view.View r6 = r4.b
            boolean r6 = r2.a(r6)
            if (r6 == 0) goto L_0x0235
            java.util.ArrayList r6 = r2.i
            r6.add(r4)
            java.util.ArrayList r4 = r2.j
            r6 = 0
            r4.add(r6)
        L_0x0235:
            int r4 = r5 + 1
            r5 = r4
            goto L_0x0216
        L_0x0239:
            r4 = 0
            r5 = r4
        L_0x023b:
            int r4 = r13.size()
            if (r5 >= r4) goto L_0x025e
            java.lang.Object r4 = r13.c(r5)
            jr r4 = (defpackage.jr) r4
            android.view.View r6 = r4.b
            boolean r6 = r2.a(r6)
            if (r6 == 0) goto L_0x025a
            java.util.ArrayList r6 = r2.j
            r6.add(r4)
            java.util.ArrayList r4 = r2.i
            r6 = 0
            r4.add(r6)
        L_0x025a:
            int r4 = r5 + 1
            r5 = r4
            goto L_0x023b
        L_0x025e:
            qr r7 = defpackage.je.b()
            int r4 = r7.size()
            ki r5 = defpackage.kb.a
            kp r8 = r5.a(r3)
            int r4 = r4 + -1
            r6 = r4
        L_0x026f:
            if (r6 < 0) goto L_0x02c3
            java.lang.Object r4 = r7.b(r6)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x02b9
            java.lang.Object r5 = r7.get(r4)
            lo r5 = (defpackage.lo) r5
            if (r5 == 0) goto L_0x02b9
            android.view.View r9 = r5.a
            if (r9 == 0) goto L_0x02b9
            kp r9 = r5.d
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x02b9
            jr r9 = r5.c
            android.view.View r10 = r5.a
            r11 = 1
            jr r11 = r2.a(r10, r11)
            r12 = 1
            jr r10 = r2.b(r10, r12)
            if (r11 != 0) goto L_0x029f
            if (r10 == 0) goto L_0x02bd
        L_0x029f:
            je r5 = r5.e
            boolean r5 = r5.a(r9, r10)
            if (r5 == 0) goto L_0x02bd
            r5 = 1
        L_0x02a8:
            if (r5 == 0) goto L_0x02b9
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x02b6
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x02bf
        L_0x02b6:
            r4.cancel()
        L_0x02b9:
            int r4 = r6 + -1
            r6 = r4
            goto L_0x026f
        L_0x02bd:
            r5 = 0
            goto L_0x02a8
        L_0x02bf:
            r7.remove(r4)
            goto L_0x02b9
        L_0x02c3:
            js r4 = r2.e
            js r5 = r2.f
            java.util.ArrayList r6 = r2.i
            java.util.ArrayList r7 = r2.j
            r2.a(r3, r4, r5, r6, r7)
            r2.c()
            r2 = 1
            goto L_0x0010
        L_0x02d4:
            r18 = r3
            r3 = r2
            r2 = r18
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.onPreDraw():boolean");
    }
}
