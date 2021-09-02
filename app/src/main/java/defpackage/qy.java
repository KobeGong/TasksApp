package defpackage;

/* renamed from: qy reason: default package */
/* compiled from: PG */
public class qy {
    private final java.util.LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public qy(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        synchronized (this) {
            java.lang.Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            if (r6 != 0) goto L_0x000c
        L_0x0004:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null || value == null"
            r0.<init>(r1)
            throw r0
        L_0x000c:
            monitor-enter(r4)
            int r0 = r4.d     // Catch:{ all -> 0x005f }
            int r0 = r0 + 1
            r4.d = r0     // Catch:{ all -> 0x005f }
            int r0 = r4.b     // Catch:{ all -> 0x005f }
            int r0 = r0 + 1
            r4.b = r0     // Catch:{ all -> 0x005f }
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x005f }
            java.lang.Object r1 = r0.put(r5, r6)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0027
            int r0 = r4.b     // Catch:{ all -> 0x005f }
            int r0 = r0 + -1
            r4.b = r0     // Catch:{ all -> 0x005f }
        L_0x0027:
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            int r2 = r4.c
        L_0x002a:
            monitor-enter(r4)
            int r0 = r4.b     // Catch:{ all -> 0x005c }
            if (r0 < 0) goto L_0x003b
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x005c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0062
            int r0 = r4.b     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0062
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r1.<init>()     // Catch:{ all -> 0x005c }
            java.lang.Class r2 = r4.getClass()     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005c }
            r0.<init>(r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            throw r0
        L_0x0062:
            int r0 = r4.b     // Catch:{ all -> 0x005c }
            if (r0 <= r2) goto L_0x006e
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x005c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0070
        L_0x006e:
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return r1
        L_0x0070:
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x005c }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x005c }
            r0.getValue()     // Catch:{ all -> 0x005c }
            java.util.LinkedHashMap r0 = r4.a     // Catch:{ all -> 0x005c }
            r0.remove(r3)     // Catch:{ all -> 0x005c }
            int r0 = r4.b     // Catch:{ all -> 0x005c }
            int r0 = r0 + -1
            r4.b = r0     // Catch:{ all -> 0x005c }
            int r0 = r4.e     // Catch:{ all -> 0x005c }
            int r0 = r0 + 1
            r4.e = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized java.lang.String toString() {
        java.lang.String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f + this.g;
            if (i2 != 0) {
                i = (this.f * 100) / i2;
            }
            format = java.lang.String.format(java.util.Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new java.lang.Object[]{java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(i)});
        }
        return format;
    }
}
