package defpackage;

/* renamed from: cqg reason: default package */
/* compiled from: PG */
public final class cqg {
    private volatile defpackage.cqd a;
    private final java.lang.Object b = new java.lang.Object();
    private final defpackage.cqh c;

    cqg(defpackage.cqh cqh) {
        this.c = cqh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        throw new java.lang.IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        throw new java.lang.IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        android.util.Log.w("Binder", "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0063, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[ExcHandler: IllegalAccessException (r0v10 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:10:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[ExcHandler: InstantiationException (r0v9 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:10:0x0017] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cqd a(android.content.Context r6) {
        /*
            r5 = this;
            cqd r0 = r5.a
            if (r0 != 0) goto L_0x0037
            java.lang.Object r2 = r5.b
            monitor-enter(r2)
            cqd r0 = r5.a     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x0036
            cqd r3 = new cqd     // Catch:{ all -> 0x0043 }
            r3.<init>(r6)     // Catch:{ all -> 0x0043 }
            cqh r0 = r5.c     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0034
            r1 = 0
            java.lang.String r0 = "gen_binder.root.RootModule$Generated"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x004f }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x004f }
            cqj r0 = (defpackage.cqj) r0     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x004f }
            java.util.Set r1 = r0.a()     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x004f }
            r3.a(r0)     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x0062 }
            r0.b()     // Catch:{ IllegalAccessException -> 0x003a, InstantiationException -> 0x0046, ClassNotFoundException -> 0x0062 }
            r0 = r1
        L_0x002c:
            cqc r1 = new cqc     // Catch:{ all -> 0x0043 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x0043 }
            r3.a(r1)     // Catch:{ all -> 0x0043 }
        L_0x0034:
            r5.a = r3     // Catch:{ all -> 0x0043 }
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
        L_0x0037:
            cqd r0 = r5.a
            return r0
        L_0x003a:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0043 }
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0
        L_0x0046:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "Failed to instantiate root module gen_binder.root.RootModule$Generated"
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0043 }
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x004f:
            r0 = move-exception
            r0 = r1
        L_0x0051:
            java.lang.String r1 = "Binder"
            r4 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = "Binder"
            java.lang.String r4 = "To use Binder more efficiently, your android_binary target should include \"//java/com/google/android/libraries/stitch/binder:rootmodule\" in srcs."
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0043 }
            goto L_0x002c
        L_0x0062:
            r0 = move-exception
            r0 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqg.a(android.content.Context):cqd");
    }
}
