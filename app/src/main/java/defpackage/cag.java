package defpackage;

/* renamed from: cag reason: default package */
/* compiled from: PG */
public final class cag implements defpackage.cac {
    public android.content.Context a;
    public defpackage.cae b;
    public defpackage.buu c;
    public defpackage.dml d;
    public defpackage.dml e;
    public defpackage.dml f;
    public defpackage.dml g;
    public defpackage.dml h;
    public defpackage.dml i;
    public defpackage.dml j;
    public defpackage.dml k;
    public defpackage.dml l;

    cag() {
    }

    public final defpackage.btl a(defpackage.bul bul, java.lang.String str) {
        boolean z;
        defpackage.cky.c();
        defpackage.cld.a(bul != null);
        if (!android.text.TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        defpackage.cld.a(((java.util.Map) this.d.a()).containsKey(str));
        java.lang.String b2 = bul.b();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        defpackage.cax cax = (defpackage.cax) this.h.a();
        try {
            this.b.a(bul, 1, "RPC_STORE_TARGET", bundle);
            return defpackage.btl.a;
        } catch (defpackage.cad e2) {
            defpackage.bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_STORE_TARGET");
            return cax.a(bundle);
        }
    }

    public final void a(defpackage.bul bul, long j2, java.lang.String str) {
        boolean z;
        defpackage.cky.c();
        defpackage.cld.a(bul != null);
        if (!android.text.TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        defpackage.cld.a(((java.util.Map) this.d.a()).containsKey(str));
        java.lang.String b2 = bul.b();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j2);
        defpackage.caq caq = (defpackage.caq) this.f.a();
        if (!defpackage.bwj.a(this.a)) {
            defpackage.bty.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_UPDATED_THREADS");
            caq.a(bundle);
            return;
        }
        try {
            this.b.a(bul, 2, "RPC_FETCH_UPDATED_THREADS", bundle);
        } catch (defpackage.cad e2) {
            defpackage.bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_UPDATED_THREADS");
            caq.a(bundle);
        }
    }

    public final void b(defpackage.bul bul, java.lang.String str) {
        boolean z;
        defpackage.cky.c();
        defpackage.cld.a(bul != null);
        if (!android.text.TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        defpackage.cld.a(((java.util.Map) this.d.a()).containsKey(str));
        java.lang.String b2 = bul.b();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0);
        defpackage.cao cao = (defpackage.cao) this.e.a();
        if (!defpackage.bwj.a(this.a)) {
            defpackage.bty.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_LATEST_THREADS");
            cao.a(bundle);
            return;
        }
        try {
            this.b.a(bul, 2, "RPC_FETCH_LATEST_THREADS", bundle);
        } catch (defpackage.cad e2) {
            defpackage.bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_LATEST_THREADS");
            cao.a(bundle);
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<dfj>, for r11v0, types: [java.util.List, java.util.List<dfj>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bul r9, int r10, java.util.List<defpackage.dfj> r11, java.lang.String r12) {
        /*
            r8 = this;
            r1 = 1
            r2 = 0
            defpackage.cky.c()
            if (r9 == 0) goto L_0x0064
            r0 = r1
        L_0x0008:
            defpackage.cld.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0066
            r0 = r1
        L_0x0012:
            defpackage.cld.a(r0)
            dml r0 = r8.d
            java.lang.Object r0 = r0.a()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r12)
            defpackage.cld.a(r0)
            if (r11 == 0) goto L_0x0068
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0068
            r0 = r1
        L_0x002d:
            defpackage.cld.a(r0)
            java.lang.String r3 = r9.b()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "com.google.android.libraries.notifications.ACCOUNT_NAME"
            r4.putString(r0, r3)
            java.lang.String r0 = "com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK"
            r4.putInt(r0, r10)
            java.lang.String r0 = "com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK"
            r4.putString(r0, r12)
            int r5 = r10 + 100
            java.util.Iterator r6 = r11.iterator()
        L_0x004e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r6.next()
            dfj r0 = (defpackage.dfj) r0
            buu r7 = r8.c
            byte[] r0 = r0.b()
            r7.a(r3, r5, r0)
            goto L_0x004e
        L_0x0064:
            r0 = r2
            goto L_0x0008
        L_0x0066:
            r0 = r2
            goto L_0x0012
        L_0x0068:
            r0 = r2
            goto L_0x002d
        L_0x006a:
            dml r0 = r8.i
            java.lang.Object r0 = r0.a()
            caz r0 = (defpackage.caz) r0
            cae r3 = r8.b     // Catch:{ cad -> 0x007a }
            java.lang.String r6 = "RPC_UPDATE_THREAD_STATE"
            r3.a(r9, r5, r6, r4)     // Catch:{ cad -> 0x007a }
        L_0x0079:
            return
        L_0x007a:
            r3 = move-exception
            java.lang.String r3 = "ChimeScheduledRpcHelperImpl"
            java.lang.String r5 = "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r6 = "RPC_UPDATE_THREAD_STATE"
            r1[r2] = r6
            defpackage.bty.b(r3, r5, r1)
            r0.a(r4)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cag.a(bul, int, java.util.List, java.lang.String):void");
    }

    static {
        java.nio.charset.Charset.forName("UTF-8");
    }
}
