package defpackage;

/* renamed from: cqd reason: default package */
/* compiled from: PG */
public final class cqd {
    private static final java.lang.Object a = new java.lang.Object();
    private static final defpackage.cqg b = new defpackage.cqg(new defpackage.cqh());
    private android.content.Context c;
    private defpackage.cqd d;
    private final java.util.Map e;
    private final java.util.concurrent.CopyOnWriteArrayList f;
    private final java.lang.ThreadLocal g;
    private volatile boolean h;
    private volatile defpackage.cqf i;

    public cqd(android.content.Context context) {
        this(context, 0);
    }

    private cqd(android.content.Context context, byte b2) {
        this.e = java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f = new java.util.concurrent.CopyOnWriteArrayList();
        this.g = new java.lang.ThreadLocal();
        this.i = new defpackage.cqf();
        this.c = context;
        this.d = null;
        context.getClass().getName();
    }

    public cqd() {
        this.e = java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.f = new java.util.concurrent.CopyOnWriteArrayList();
        this.g = new java.lang.ThreadLocal();
        this.i = new defpackage.cqf();
    }

    public final defpackage.cqd a(defpackage.cqi cqi) {
        boolean z = this.h;
        this.f.add(cqi);
        return this;
    }

    public final java.lang.Object a(java.lang.Class cls) {
        defpackage.cky.a((java.lang.Object) cls);
        java.lang.Object c2 = c(cls);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    public final java.util.List b(java.lang.Class cls) {
        defpackage.cky.a((java.lang.Object) cls);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object c2 = c(cls);
        if (c2 != null) {
            arrayList.add(c2);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r7.g.set(java.lang.Boolean.valueOf(false));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object c(java.lang.Class r8) {
        /*
            r7 = this;
            r2 = 1
            r1 = 0
            defpackage.cky.a(r8)
            android.content.Context r0 = r7.c
            if (r0 != 0) goto L_0x0011
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Binder not initialized yet."
            r0.<init>(r1)
            throw r0
        L_0x0011:
            cqf r0 = r7.i
            java.lang.Object r3 = r0.a
            monitor-enter(r3)
            java.util.Map r0 = r7.e     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0026
            java.lang.Object r1 = a     // Catch:{ all -> 0x007a }
            if (r0 == r1) goto L_0x0024
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
        L_0x0023:
            return r0
        L_0x0024:
            r0 = 0
            goto L_0x0022
        L_0x0026:
            java.lang.ThreadLocal r0 = r7.g     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x007d
        L_0x0036:
            if (r2 != 0) goto L_0x0042
            java.lang.ThreadLocal r0 = r7.g     // Catch:{ all -> 0x007a }
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x007a }
            r0.set(r4)     // Catch:{ all -> 0x007a }
        L_0x0042:
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f     // Catch:{ all -> 0x0081 }
            int r4 = r0.size()     // Catch:{ all -> 0x0081 }
        L_0x0048:
            if (r1 >= r4) goto L_0x0093
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.f     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0081 }
            cqi r0 = (defpackage.cqi) r0     // Catch:{ all -> 0x0081 }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0081 }
            r6 = 0
            r5[r6] = r0     // Catch:{ all -> 0x0081 }
            r6 = 1
            r5[r6] = r8     // Catch:{ all -> 0x0081 }
            android.content.Context r5 = r7.c     // Catch:{ all -> 0x007f }
            r0.a(r5, r8, r7)     // Catch:{ all -> 0x007f }
            java.util.Map r0 = r7.e     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r5 = a     // Catch:{ all -> 0x0081 }
            if (r0 == r5) goto L_0x008f
            if (r2 != 0) goto L_0x0078
            java.lang.ThreadLocal r1 = r7.g     // Catch:{ all -> 0x007a }
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x007a }
            r1.set(r2)     // Catch:{ all -> 0x007a }
        L_0x0078:
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            goto L_0x0023
        L_0x007a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            throw r0
        L_0x007d:
            r2 = r1
            goto L_0x0036
        L_0x007f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            if (r2 != 0) goto L_0x008e
            java.lang.ThreadLocal r1 = r7.g     // Catch:{ all -> 0x007a }
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x007a }
            r1.set(r2)     // Catch:{ all -> 0x007a }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x007a }
        L_0x008f:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0048
        L_0x0093:
            if (r2 != 0) goto L_0x009f
            java.lang.ThreadLocal r0 = r7.g     // Catch:{ all -> 0x007a }
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x007a }
            r0.set(r1)     // Catch:{ all -> 0x007a }
        L_0x009f:
            java.util.Map r0 = r7.e     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x00ae
            java.util.Map r1 = r7.e     // Catch:{ all -> 0x007a }
            java.lang.Object r2 = a     // Catch:{ all -> 0x007a }
            r1.put(r8, r2)     // Catch:{ all -> 0x007a }
        L_0x00ae:
            monitor-exit(r3)     // Catch:{ all -> 0x007a }
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqd.c(java.lang.Class):java.lang.Object");
    }

    public static defpackage.cqd a(android.content.Context context) {
        defpackage.cqd cqd;
        boolean z;
        android.content.Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        android.content.Context context2 = context;
        while (true) {
            if (context2 instanceof defpackage.cqe) {
                cqd = ((defpackage.cqe) context2).a();
                if (cqd == null) {
                    java.lang.String valueOf = java.lang.String.valueOf(context2);
                    throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 43).append("BinderContext must not return null Binder: ").append(valueOf).toString());
                }
            } else {
                cqd = null;
            }
            if (cqd != null) {
                return cqd;
            }
            if (context2 == applicationContext) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            if (context2 instanceof android.content.ContextWrapper) {
                context2 = ((android.content.ContextWrapper) context2).getBaseContext();
                if (context2 == null) {
                    throw new java.lang.IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z3) {
                context2 = applicationContext;
            } else {
                context2 = null;
            }
            if (context2 == null) {
                return b.a(applicationContext.getApplicationContext());
            }
            z2 = z3;
        }
    }

    static {
        new defpackage.cqk("debug.binder.verification");
        new defpackage.cqk("debug.binder.strict_mode");
        new defpackage.cqk("test.binder.trace", 0);
        new defpackage.cqk("test.binder.detail_trace", 0);
    }
}
