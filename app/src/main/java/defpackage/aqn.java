package defpackage;

/* renamed from: aqn reason: default package */
public final /* synthetic */ class aqn implements java.lang.Runnable {
    private final defpackage.aql a;
    private final defpackage.air b;

    public aqn(defpackage.aql aql, defpackage.air air) {
        this.a = aql;
        this.b = air;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r3 = 2131951844(0x7f1300e4, float:1.9540114E38)
            r1 = 1
            r2 = 0
            aql r4 = r8.a
            air r0 = r8.b
            boolean r5 = r4.r()
            if (r5 != 0) goto L_0x003c
            java.lang.Throwable r5 = r0.a()
            boolean r6 = r5 instanceof defpackage.ami
            if (r6 == 0) goto L_0x003d
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = r4.s
            if (r0 == 0) goto L_0x0023
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = r4.s
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0035
        L_0x0023:
            android.view.View r0 = r4.m()
            r1 = 2131951760(0x7f130090, float:1.9539944E38)
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(r0, r1, r2)
            r4.s = r0
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = r4.s
            r0.a()
        L_0x0035:
            aiq r0 = defpackage.aiq.a()
            r0.b()
        L_0x003c:
            return
        L_0x003d:
            boolean r5 = r4.a(r5)
            if (r5 != 0) goto L_0x003c
            java.lang.String r5 = "Unable to resolve a background error"
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r2] = r0
            defpackage.azb.b(r5, r6)
            boolean r5 = r0.b()
            if (r5 != 0) goto L_0x00e7
            java.lang.Throwable r0 = r0.a()
        L_0x0056:
            if (r0 == 0) goto L_0x008d
            boolean r5 = r0 instanceof defpackage.dqb
            if (r5 == 0) goto L_0x0088
            dqb r0 = (defpackage.dqb) r0
        L_0x005e:
            if (r0 == 0) goto L_0x00f0
            dpw r5 = r0.a
            dpx r5 = r5.l
            int r5 = r5.ordinal()
            switch(r5) {
                case 3: goto L_0x00c6;
                case 4: goto L_0x006b;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00c6;
                case 7: goto L_0x008f;
                default: goto L_0x006b;
            }
        L_0x006b:
            r0 = r2
            r1 = r3
        L_0x006d:
            if (r0 == 0) goto L_0x00cc
            any r0 = defpackage.any.a()
            anc r0 = r0.c()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x00cc
            aiq r0 = defpackage.aiq.a()
            r0.b()
            r4.j()
            goto L_0x003c
        L_0x0088:
            java.lang.Throwable r0 = r0.getCause()
            goto L_0x0056
        L_0x008d:
            r0 = 0
            goto L_0x005e
        L_0x008f:
            czy r0 = defpackage.ajd.a(r0)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r0
            int r3 = r0.a
            r3 = r3 & 1
            if (r3 != r1) goto L_0x00b5
            int r0 = r0.d
            czz r0 = defpackage.czz.a(r0)
            if (r0 == 0) goto L_0x00b5
        L_0x00a7:
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00bf;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            r0 = 2131951802(0x7f1300ba, float:1.9540029E38)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006d
        L_0x00b5:
            czz r0 = defpackage.czz.UNKNOWN
            goto L_0x00a7
        L_0x00b8:
            r0 = 2131951715(0x7f130063, float:1.9539852E38)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006d
        L_0x00bf:
            r0 = 2131951681(0x7f130041, float:1.9539783E38)
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006d
        L_0x00c6:
            r0 = 2131951790(0x7f1300ae, float:1.9540004E38)
            r1 = r0
            r0 = r2
            goto L_0x006d
        L_0x00cc:
            android.view.View r0 = r4.m()
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = com.google.android.apps.tasks.ui.components.snackbar.Snackbar.a(r0, r1, r2)
            r4.s = r0
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = r4.s
            ara r1 = new ara
            r1.<init>()
            r0.a(r1)
            com.google.android.apps.tasks.ui.components.snackbar.Snackbar r0 = r4.s
            r0.a()
            goto L_0x003c
        L_0x00e7:
            aiq r0 = defpackage.aiq.a()
            r0.b()
            goto L_0x003c
        L_0x00f0:
            r0 = r2
            r1 = r3
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqn.run():void");
    }
}
