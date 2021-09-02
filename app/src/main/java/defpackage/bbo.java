package defpackage;

/* renamed from: bbo reason: default package */
/* compiled from: PG */
public final class bbo extends Fragment implements defpackage.bax {
    private static java.util.WeakHashMap a = new java.util.WeakHashMap();
    /* access modifiers changed from: private */
    public int U = 0;
    /* access modifiers changed from: private */
    public android.os.Bundle V;
    private java.util.Map b = new defpackage.qr();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bbo a(FragmentActivity r3) {
        /*
            java.util.WeakHashMap r0 = a
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            bbo r0 = (defpackage.bbo) r0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return r0
        L_0x0013:
            ln r0 = r3.c()     // Catch:{ ClassCastException -> 0x0046 }
            java.lang.String r1 = "SupportLifecycleFragmentImpl"
            lc r0 = r0.a(r1)     // Catch:{ ClassCastException -> 0x0046 }
            bbo r0 = (defpackage.bbo) r0     // Catch:{ ClassCastException -> 0x0046 }
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.n
            if (r1 == 0) goto L_0x003b
        L_0x0025:
            bbo r0 = new bbo
            r0.<init>()
            ln r1 = r3.c()
            mj r1 = r1.a()
            java.lang.String r2 = "SupportLifecycleFragmentImpl"
            mj r1 = r1.a(r0, r2)
            r1.c()
        L_0x003b:
            java.util.WeakHashMap r1 = a
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.put(r3, r2)
            goto L_0x0012
        L_0x0046:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbo.a(lg):bbo");
    }

    public final com.google.android.gms.common.api.internal.LifecycleCallback a(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.b.get(str));
    }

    public final void a(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.U > 0) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.bbp(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    public final void a(android.os.Bundle bundle) {
        super.a(bundle);
        this.U = 1;
        this.V = bundle;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    public final void e() {
        super.e();
        this.U = 2;
        for (com.google.android.gms.common.api.internal.LifecycleCallback b2 : this.b.values()) {
            b2.b();
        }
    }

    public final void s() {
        super.s();
        this.U = 3;
        for (com.google.android.gms.common.api.internal.LifecycleCallback c : this.b.values()) {
            c.c();
        }
    }

    public final void a(int i, int i2, android.content.Intent intent) {
        super.a(i, i2, intent);
        for (com.google.android.gms.common.api.internal.LifecycleCallback a2 : this.b.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void d(android.os.Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            for (java.util.Map.Entry entry : this.b.entrySet()) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
            }
        }
    }

    public final void f() {
        super.f();
        this.U = 4;
        for (com.google.android.gms.common.api.internal.LifecycleCallback d : this.b.values()) {
            d.d();
        }
    }

    public final void u() {
        super.u();
        this.U = 5;
        java.util.Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (com.google.android.gms.common.api.internal.LifecycleCallback a2 : this.b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ android.app.Activity g_() {
        return getActivity();
    }
}
