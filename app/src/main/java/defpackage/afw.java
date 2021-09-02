package defpackage;

/* renamed from: afw reason: default package */
/* compiled from: PG */
public class afw extends defpackage.rn {
    public final android.support.v7.widget.RecyclerView b;
    public final defpackage.rn c = new defpackage.afx(this);

    public afw(android.support.v7.widget.RecyclerView recyclerView) {
        this.b = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        r3 = r0;
        r0 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.View r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r5 = -1
            r2 = 1
            r1 = 0
            boolean r0 = super.a(r8, r9, r10)
            if (r0 == 0) goto L_0x000b
            r1 = r2
        L_0x000a:
            return r1
        L_0x000b:
            android.support.v7.widget.RecyclerView r0 = r7.b
            boolean r0 = r0.n()
            if (r0 != 0) goto L_0x000a
            android.support.v7.widget.RecyclerView r0 = r7.b
            afd r0 = r0.l
            if (r0 == 0) goto L_0x000a
            android.support.v7.widget.RecyclerView r0 = r7.b
            afd r4 = r0.l
            android.support.v7.widget.RecyclerView r0 = r4.b
            afn r0 = r0.e
            android.support.v7.widget.RecyclerView r0 = r4.b
            aft r0 = r0.D
            android.support.v7.widget.RecyclerView r0 = r4.b
            if (r0 == 0) goto L_0x000a
            switch(r9) {
                case 4096: goto L_0x0067;
                case 8192: goto L_0x0039;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = r1
            r3 = r1
        L_0x002e:
            if (r3 != 0) goto L_0x0032
            if (r0 == 0) goto L_0x000a
        L_0x0032:
            android.support.v7.widget.RecyclerView r1 = r4.b
            r1.a(r0, r3)
            r1 = r2
            goto L_0x000a
        L_0x0039:
            android.support.v7.widget.RecyclerView r0 = r4.b
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L_0x0098
            int r0 = r4.m
            int r3 = r4.m()
            int r0 = r0 - r3
            int r3 = r4.o()
            int r0 = r0 - r3
            int r0 = -r0
        L_0x004e:
            android.support.v7.widget.RecyclerView r3 = r4.b
            boolean r3 = r3.canScrollHorizontally(r5)
            if (r3 == 0) goto L_0x0093
            int r3 = r4.l
            int r5 = r4.l()
            int r3 = r3 - r5
            int r5 = r4.n()
            int r3 = r3 - r5
            int r3 = -r3
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x002e
        L_0x0067:
            android.support.v7.widget.RecyclerView r0 = r4.b
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 == 0) goto L_0x0096
            int r0 = r4.m
            int r3 = r4.m()
            int r0 = r0 - r3
            int r3 = r4.o()
            int r0 = r0 - r3
        L_0x007b:
            android.support.v7.widget.RecyclerView r3 = r4.b
            boolean r3 = r3.canScrollHorizontally(r2)
            if (r3 == 0) goto L_0x0093
            int r3 = r4.l
            int r5 = r4.l()
            int r3 = r3 - r5
            int r5 = r4.n()
            int r3 = r3 - r5
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x002e
        L_0x0093:
            r3 = r0
            r0 = r1
            goto L_0x002e
        L_0x0096:
            r0 = r1
            goto L_0x007b
        L_0x0098:
            r0 = r1
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afw.a(android.view.View, int, android.os.Bundle):boolean");
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        defpackage.tn tnVar;
        int i = 1;
        super.a(view, tlVar);
        tlVar.a((java.lang.CharSequence) android.support.v7.widget.RecyclerView.class.getName());
        if (!this.b.n() && this.b.l != null) {
            defpackage.afd afd = this.b.l;
            defpackage.afn afn = afd.b.e;
            defpackage.aft aft = afd.b.D;
            if (afd.b.canScrollVertically(-1) || afd.b.canScrollHorizontally(-1)) {
                tlVar.a(8192);
                tlVar.a();
            }
            if (afd.b.canScrollVertically(1) || afd.b.canScrollHorizontally(1)) {
                tlVar.a(4096);
                tlVar.a();
            }
            int i2 = (afd.b == null || afd.b.k == null) ? 1 : afd.e() ? afd.b.k.a() : 1;
            if (!(afd.b == null || afd.b.k == null || !afd.d())) {
                i = afd.b.k.a();
            }
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                tnVar = new defpackage.tn(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, 0));
            } else if (android.os.Build.VERSION.SDK_INT >= 19) {
                tnVar = new defpackage.tn(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false));
            } else {
                tnVar = new defpackage.tn(null);
            }
            if (android.os.Build.VERSION.SDK_INT >= 19) {
                tlVar.a.setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) tnVar.a);
            }
        }
    }

    public void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(android.support.v7.widget.RecyclerView.class.getName());
        if ((view instanceof android.support.v7.widget.RecyclerView) && !this.b.n()) {
            android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) view;
            if (recyclerView.l != null) {
                recyclerView.l.a(accessibilityEvent);
            }
        }
    }
}
