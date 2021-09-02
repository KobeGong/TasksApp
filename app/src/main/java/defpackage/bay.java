package defpackage;

/* renamed from: bay reason: default package */
/* compiled from: PG */
public final class bay extends android.app.Fragment implements defpackage.bax {
    private static java.util.WeakHashMap a = new java.util.WeakHashMap();
    private java.util.Map b = new defpackage.qr();
    /* access modifiers changed from: private */
    public int c = 0;
    /* access modifiers changed from: private */
    public android.os.Bundle d;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bay a(android.app.Activity r3) {
        /*
            java.util.WeakHashMap r0 = a
            java.lang.Object r0 = r0.get(r3)
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get()
            bay r0 = (defpackage.bay) r0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return r0
        L_0x0013:
            android.app.FragmentManager r0 = r3.getFragmentManager()     // Catch:{ ClassCastException -> 0x0048 }
            java.lang.String r1 = "LifecycleFragmentImpl"
            android.app.Fragment r0 = r0.findFragmentByTag(r1)     // Catch:{ ClassCastException -> 0x0048 }
            bay r0 = (defpackage.bay) r0     // Catch:{ ClassCastException -> 0x0048 }
            if (r0 == 0) goto L_0x0027
            boolean r1 = r0.isRemoving()
            if (r1 == 0) goto L_0x003d
        L_0x0027:
            bay r0 = new bay
            r0.<init>()
            android.app.FragmentManager r1 = r3.getFragmentManager()
            android.app.FragmentTransaction r1 = r1.beginTransaction()
            java.lang.String r2 = "LifecycleFragmentImpl"
            android.app.FragmentTransaction r1 = r1.add(r0, r2)
            r1.commitAllowingStateLoss()
        L_0x003d:
            java.util.WeakHashMap r1 = a
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.put(r3, r2)
            goto L_0x0012
        L_0x0048:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bay.a(android.app.Activity):bay");
    }

    public final com.google.android.gms.common.api.internal.LifecycleCallback a(java.lang.String str, java.lang.Class cls) {
        return (com.google.android.gms.common.api.internal.LifecycleCallback) cls.cast(this.b.get(str));
    }

    public final void a(java.lang.String str, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.c > 0) {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.baz(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    public final android.app.Activity g_() {
        return getActivity();
    }

    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.c = 1;
        this.d = bundle;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((java.lang.String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.c = 2;
        for (com.google.android.gms.common.api.internal.LifecycleCallback b2 : this.b.values()) {
            b2.b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.c = 3;
        for (com.google.android.gms.common.api.internal.LifecycleCallback c2 : this.b.values()) {
            c2.c();
        }
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (com.google.android.gms.common.api.internal.LifecycleCallback a2 : this.b.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (java.util.Map.Entry entry : this.b.entrySet()) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                ((com.google.android.gms.common.api.internal.LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((java.lang.String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.c = 4;
        for (com.google.android.gms.common.api.internal.LifecycleCallback d2 : this.b.values()) {
            d2.d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = 5;
        java.util.Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (com.google.android.gms.common.api.internal.LifecycleCallback a2 : this.b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
