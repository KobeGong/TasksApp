package defpackage;

/* renamed from: ahu reason: default package */
/* compiled from: PG */
final class ahu implements java.lang.Runnable {
    private final /* synthetic */ defpackage.aht a;

    ahu(defpackage.aht aht) {
        this.a = aht;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0227, code lost:
        if (r5 <= 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0250, code lost:
        if (r8 <= 0) goto L_0x0252;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            aht r2 = r0.a
            afv r2 = r2.b
            if (r2 == 0) goto L_0x02af
            r0 = r21
            aht r10 = r0.a
            afv r2 = r10.b
            if (r2 == 0) goto L_0x0255
            long r12 = java.lang.System.currentTimeMillis()
            long r2 = r10.x
            r4 = -9223372036854775808
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x01f3
            r6 = 0
        L_0x001e:
            android.support.v7.widget.RecyclerView r2 = r10.o
            afd r4 = r2.l
            android.graphics.Rect r2 = r10.w
            if (r2 != 0) goto L_0x002d
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.w = r2
        L_0x002d:
            r2 = 0
            r3 = 0
            afv r5 = r10.b
            android.view.View r5 = r5.a
            android.graphics.Rect r8 = r10.w
            android.support.v7.widget.RecyclerView r9 = r4.b
            if (r9 != 0) goto L_0x01f9
            r5 = 0
            r9 = 0
            r11 = 0
            r14 = 0
            r8.set(r5, r9, r11, r14)
        L_0x0040:
            boolean r5 = r4.d()
            if (r5 == 0) goto L_0x0229
            float r5 = r10.g
            float r8 = r10.e
            float r5 = r5 + r8
            int r8 = (int) r5
            android.graphics.Rect r5 = r10.w
            int r5 = r5.left
            int r5 = r8 - r5
            android.support.v7.widget.RecyclerView r9 = r10.o
            int r9 = r9.getPaddingLeft()
            int r5 = r5 - r9
            float r9 = r10.e
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0204
            if (r5 >= 0) goto L_0x0204
        L_0x0062:
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x0252
            float r2 = r10.h
            float r4 = r10.f
            float r2 = r2 + r4
            int r2 = (int) r2
            android.graphics.Rect r4 = r10.w
            int r4 = r4.top
            int r4 = r2 - r4
            android.support.v7.widget.RecyclerView r8 = r10.o
            int r8 = r8.getPaddingTop()
            int r8 = r4 - r8
            float r4 = r10.f
            r9 = 0
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x022c
            if (r8 >= 0) goto L_0x022c
        L_0x0085:
            if (r5 == 0) goto L_0x02c8
            ahy r2 = r10.j
            android.support.v7.widget.RecyclerView r3 = r10.o
            afv r4 = r10.b
            android.view.View r4 = r4.a
            int r4 = r4.getWidth()
            android.support.v7.widget.RecyclerView r9 = r10.o
            r9.getWidth()
            int r5 = r2.a(r3, r4, r5, r6)
            r9 = r5
        L_0x009d:
            if (r8 == 0) goto L_0x02c5
            ahy r2 = r10.j
            android.support.v7.widget.RecyclerView r3 = r10.o
            afv r4 = r10.b
            android.view.View r4 = r4.a
            int r4 = r4.getHeight()
            android.support.v7.widget.RecyclerView r5 = r10.o
            r5.getHeight()
            r5 = r8
            int r2 = r2.a(r3, r4, r5, r6)
        L_0x00b5:
            if (r9 != 0) goto L_0x00b9
            if (r2 == 0) goto L_0x0255
        L_0x00b9:
            long r4 = r10.x
            r6 = -9223372036854775808
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x00c3
            r10.x = r12
        L_0x00c3:
            android.support.v7.widget.RecyclerView r3 = r10.o
            r3.scrollBy(r9, r2)
            r2 = 1
        L_0x00c9:
            if (r2 == 0) goto L_0x02af
            r0 = r21
            aht r2 = r0.a
            afv r2 = r2.b
            if (r2 == 0) goto L_0x0295
            r0 = r21
            aht r6 = r0.a
            r0 = r21
            aht r2 = r0.a
            afv r7 = r2.b
            android.support.v7.widget.RecyclerView r2 = r6.o
            boolean r2 = r2.isLayoutRequested()
            if (r2 != 0) goto L_0x0295
            int r2 = r6.k
            r3 = 2
            if (r2 != r3) goto L_0x0295
            defpackage.ahy.f()
            float r2 = r6.g
            float r3 = r6.e
            float r2 = r2 + r3
            int r8 = (int) r2
            float r2 = r6.h
            float r3 = r6.f
            float r2 = r2 + r3
            int r9 = (int) r2
            android.view.View r2 = r7.a
            int r2 = r2.getTop()
            int r2 = r9 - r2
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            android.view.View r3 = r7.a
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x012f
            android.view.View r2 = r7.a
            int r2 = r2.getLeft()
            int r2 = r8 - r2
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            android.view.View r3 = r7.a
            int r3 = r3.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0295
        L_0x012f:
            java.util.List r2 = r6.r
            if (r2 != 0) goto L_0x025c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.r = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.s = r2
        L_0x0141:
            defpackage.ahy.d()
            float r2 = r6.g
            float r3 = r6.e
            float r2 = r2 + r3
            int r10 = java.lang.Math.round(r2)
            float r2 = r6.h
            float r3 = r6.f
            float r2 = r2 + r3
            int r11 = java.lang.Math.round(r2)
            android.view.View r2 = r7.a
            int r2 = r2.getWidth()
            int r12 = r10 + r2
            android.view.View r2 = r7.a
            int r2 = r2.getHeight()
            int r13 = r11 + r2
            int r2 = r10 + r12
            int r14 = r2 / 2
            int r2 = r11 + r13
            int r15 = r2 / 2
            android.support.v7.widget.RecyclerView r2 = r6.o
            afd r0 = r2.l
            r16 = r0
            int r17 = r16.k()
            r2 = 0
            r5 = r2
        L_0x017a:
            r0 = r17
            if (r5 >= r0) goto L_0x027d
            r0 = r16
            android.view.View r2 = r0.e(r5)
            android.view.View r3 = r7.a
            if (r2 == r3) goto L_0x0278
            int r3 = r2.getBottom()
            if (r3 < r11) goto L_0x0278
            int r3 = r2.getTop()
            if (r3 > r13) goto L_0x0278
            int r3 = r2.getRight()
            if (r3 < r10) goto L_0x0278
            int r3 = r2.getLeft()
            if (r3 > r12) goto L_0x0278
            android.support.v7.widget.RecyclerView r3 = r6.o
            afv r18 = r3.a(r2)
            defpackage.ahy.a()
            int r3 = r2.getLeft()
            int r4 = r2.getRight()
            int r3 = r3 + r4
            int r3 = r3 / 2
            int r3 = r14 - r3
            int r3 = java.lang.Math.abs(r3)
            int r4 = r2.getTop()
            int r2 = r2.getBottom()
            int r2 = r2 + r4
            int r2 = r2 / 2
            int r2 = r15 - r2
            int r2 = java.lang.Math.abs(r2)
            int r3 = r3 * r3
            int r2 = r2 * r2
            int r19 = r3 + r2
            r3 = 0
            java.util.List r2 = r6.r
            int r20 = r2.size()
            r2 = 0
            r4 = r3
            r3 = r2
        L_0x01d9:
            r0 = r20
            if (r3 >= r0) goto L_0x0268
            java.util.List r2 = r6.s
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = r19
            if (r0 <= r2) goto L_0x0268
            int r4 = r4 + 1
            int r2 = r3 + 1
            r3 = r2
            goto L_0x01d9
        L_0x01f3:
            long r2 = r10.x
            long r6 = r12 - r2
            goto L_0x001e
        L_0x01f9:
            android.support.v7.widget.RecyclerView r9 = r4.b
            android.graphics.Rect r5 = r9.e(r5)
            r8.set(r5)
            goto L_0x0040
        L_0x0204:
            float r5 = r10.e
            r9 = 0
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x0229
            afv r5 = r10.b
            android.view.View r5 = r5.a
            int r5 = r5.getWidth()
            int r5 = r5 + r8
            android.graphics.Rect r8 = r10.w
            int r8 = r8.right
            int r5 = r5 + r8
            android.support.v7.widget.RecyclerView r8 = r10.o
            int r8 = r8.getWidth()
            android.support.v7.widget.RecyclerView r9 = r10.o
            int r9 = r9.getPaddingRight()
            int r8 = r8 - r9
            int r5 = r5 - r8
            if (r5 > 0) goto L_0x0062
        L_0x0229:
            r5 = r2
            goto L_0x0062
        L_0x022c:
            float r4 = r10.f
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x0252
            afv r4 = r10.b
            android.view.View r4 = r4.a
            int r4 = r4.getHeight()
            int r2 = r2 + r4
            android.graphics.Rect r4 = r10.w
            int r4 = r4.bottom
            int r2 = r2 + r4
            android.support.v7.widget.RecyclerView r4 = r10.o
            int r4 = r4.getHeight()
            android.support.v7.widget.RecyclerView r8 = r10.o
            int r8 = r8.getPaddingBottom()
            int r4 = r4 - r8
            int r8 = r2 - r4
            if (r8 > 0) goto L_0x0085
        L_0x0252:
            r8 = r3
            goto L_0x0085
        L_0x0255:
            r2 = -9223372036854775808
            r10.x = r2
            r2 = 0
            goto L_0x00c9
        L_0x025c:
            java.util.List r2 = r6.r
            r2.clear()
            java.util.List r2 = r6.s
            r2.clear()
            goto L_0x0141
        L_0x0268:
            java.util.List r2 = r6.r
            r0 = r18
            r2.add(r4, r0)
            java.util.List r2 = r6.s
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r2.add(r4, r3)
        L_0x0278:
            int r2 = r5 + 1
            r5 = r2
            goto L_0x017a
        L_0x027d:
            java.util.List r2 = r6.r
            int r3 = r2.size()
            if (r3 == 0) goto L_0x0295
            afv r2 = defpackage.ahy.a(r7, r2, r8, r9)
            if (r2 != 0) goto L_0x02b0
            java.util.List r2 = r6.r
            r2.clear()
            java.util.List r2 = r6.s
            r2.clear()
        L_0x0295:
            r0 = r21
            aht r2 = r0.a
            android.support.v7.widget.RecyclerView r2 = r2.o
            r0 = r21
            aht r3 = r0.a
            java.lang.Runnable r3 = r3.p
            r2.removeCallbacks(r3)
            r0 = r21
            aht r2 = r0.a
            android.support.v7.widget.RecyclerView r2 = r2.o
            r0 = r21
            defpackage.sn.a(r2, r0)
        L_0x02af:
            return
        L_0x02b0:
            int r3 = r2.d()
            r7.d()
            ahy r4 = r6.j
            boolean r4 = r4.a(r7, r2)
            if (r4 == 0) goto L_0x0295
            android.support.v7.widget.RecyclerView r4 = r6.o
            defpackage.ahy.a(r4, r7, r2, r3)
            goto L_0x0295
        L_0x02c5:
            r2 = r8
            goto L_0x00b5
        L_0x02c8:
            r9 = r5
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahu.run():void");
    }
}
