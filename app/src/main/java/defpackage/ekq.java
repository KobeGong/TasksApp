package defpackage;

/* renamed from: ekq reason: default package */
/* compiled from: PG */
public final class ekq extends defpackage.ejg {
    private final java.util.List a;
    private final int b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.util.concurrent.atomic.AtomicLong e;
    private final defpackage.ejh f;

    public ekq(java.util.List list, int i, java.lang.String str, java.util.List list2, java.lang.String str2, long j) {
        this.a = java.util.Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.f = new defpackage.ejh(java.util.Collections.unmodifiableList(list2));
        this.d = str2;
        this.e = new java.util.concurrent.atomic.AtomicLong(j);
    }

    public final int a() {
        return this.b;
    }

    public final java.util.List b() {
        return this.f.a;
    }

    public final java.util.Map c() {
        defpackage.ejh ejh = this.f;
        if (ejh.b != null) {
            return ejh.b;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(java.lang.String.CASE_INSENSITIVE_ORDER);
        for (java.util.Map.Entry entry : ejh.a) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((java.util.Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((java.lang.String) entry.getValue());
            treeMap.put((java.lang.String) entry.getKey(), java.util.Collections.unmodifiableList(arrayList));
        }
        ejh.b = java.util.Collections.unmodifiableMap(treeMap);
        return ejh.b;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", new java.lang.Object[]{java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), (java.lang.String) this.a.get(this.a.size() - 1), this.a.toString(), java.lang.Integer.valueOf(a()), this.c, b().toString(), java.lang.Boolean.valueOf(false), d(), null, java.lang.Long.valueOf(this.e.get())});
    }

    public final void a(long j) {
        this.e.set(j);
    }
}
