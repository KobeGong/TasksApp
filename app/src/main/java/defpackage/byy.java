package defpackage;

/* renamed from: byy reason: default package */
/* compiled from: PG */
public final class byy implements defpackage.bwg {
    private final defpackage.buu a;
    private final defpackage.bup b;
    private final defpackage.byh c;
    private final defpackage.cae d;

    byy(defpackage.buu buu, defpackage.bup bup, defpackage.byh byh, defpackage.cae cae) {
        this.a = buu;
        this.b = bup;
        this.c = byh;
        this.d = cae;
    }

    public final java.lang.String a() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<dfy>, for r10v0, types: [java.util.Collection<dfy>, java.util.Collection] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bul r9, java.util.Collection<defpackage.dfy> r10) {
        /*
            r8 = this;
            r7 = 5
            r1 = 0
            if (r10 == 0) goto L_0x0042
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0042
            r0 = 1
        L_0x000b:
            defpackage.cld.a(r0)
            if (r9 == 0) goto L_0x0044
            java.lang.String r0 = r9.b()
            r2 = r0
        L_0x0015:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "com.google.android.libraries.notifications.ACCOUNT_NAME"
            r3.putString(r0, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r10.iterator()
        L_0x0028:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r5.next()
            dfy r0 = (defpackage.dfy) r0
            buu r6 = r8.a
            byte[] r0 = r0.b()
            bus r0 = r6.a(r2, r7, r0)
            r4.add(r0)
            goto L_0x0028
        L_0x0042:
            r0 = r1
            goto L_0x000b
        L_0x0044:
            r0 = 0
            r2 = r0
            goto L_0x0015
        L_0x0047:
            cae r0 = r8.d     // Catch:{ cad -> 0x0050 }
            r5 = 5
            java.lang.String r6 = "ON_NOTIFICATION_RECEIVED"
            r0.a(r9, r5, r6, r3)     // Catch:{ cad -> 0x0050 }
        L_0x004f:
            return
        L_0x0050:
            r0 = move-exception
            java.lang.String r0 = "OnNotificationReceivedHandler"
            java.lang.String r3 = "Unable to schedule task for notification received event."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            defpackage.bty.b(r0, r3, r1)
            buu r0 = r8.a
            r0.a(r2, r4)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byy.a(bul, java.util.Collection):void");
    }

    public final defpackage.btl a(android.os.Bundle bundle) {
        defpackage.bul bul;
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                bul = this.b.a(string);
            } catch (defpackage.buo e) {
                return defpackage.btl.a(e);
            }
        } else {
            bul = null;
        }
        java.util.List<defpackage.bus> a2 = this.a.a(string, 5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.bus c2 : a2) {
            try {
                arrayList.add((defpackage.dfy) defpackage.dih.a((defpackage.dih) defpackage.dfy.m, c2.c()));
            } catch (defpackage.dir e2) {
                defpackage.bty.b("OnNotificationReceivedHandler", e2, "Unable to parse FrontendNotificationThread message", new java.lang.Object[0]);
            }
        }
        this.a.a(string, (java.util.List) a2);
        this.c.a(bul, arrayList, defpackage.bvo.c());
        return defpackage.btl.a;
    }
}
