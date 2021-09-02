package defpackage;

/* renamed from: bks reason: default package */
/* compiled from: PG */
public class bks {
    public static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();
    private static android.net.Uri b = android.net.Uri.parse("content://com.google.android.gsf.gservices");
    private static android.net.Uri c = android.net.Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final java.util.regex.Pattern d = java.util.regex.Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static java.util.HashMap f;
    private static java.util.HashMap g = new java.util.HashMap();
    private static java.util.HashMap h = new java.util.HashMap();
    private static java.util.HashMap i = new java.util.HashMap();
    private static java.util.HashMap j = new java.util.HashMap();
    private static java.lang.Object k;
    private static boolean l;
    private static java.lang.String[] m = new java.lang.String[0];

    private static void a(android.content.ContentResolver contentResolver) {
        if (f == null) {
            a.set(false);
            f = new java.util.HashMap();
            k = new java.lang.Object();
            l = false;
            contentResolver.registerContentObserver(b, true, new defpackage.bkt());
        } else if (a.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            k = new java.lang.Object();
            l = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (l == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (f.isEmpty() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        f.putAll(a(r9, m));
        l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (f.containsKey(r10) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        r0 = (java.lang.String) f.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r2 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r9, java.lang.String r10) {
        /*
            r3 = 0
            r8 = 1
            r2 = 0
            java.lang.Class<bks> r1 = defpackage.bks.class
            monitor-enter(r1)
            a(r9)     // Catch:{ all -> 0x005d }
            java.lang.Object r6 = k     // Catch:{ all -> 0x005d }
            java.util.HashMap r0 = f     // Catch:{ all -> 0x005d }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0020
            java.util.HashMap r0 = f     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x001e
            r2 = r0
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
        L_0x001f:
            return r2
        L_0x0020:
            java.lang.String[] r4 = m     // Catch:{ all -> 0x005d }
            int r5 = r4.length     // Catch:{ all -> 0x005d }
            r0 = r3
        L_0x0024:
            if (r0 >= r5) goto L_0x0065
            r7 = r4[r0]     // Catch:{ all -> 0x005d }
            boolean r7 = r10.startsWith(r7)     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0062
            boolean r0 = l     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap r0 = f     // Catch:{ all -> 0x005d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0060
        L_0x003a:
            java.lang.String[] r0 = m     // Catch:{ all -> 0x005d }
            java.util.HashMap r3 = f     // Catch:{ all -> 0x005d }
            java.util.Map r0 = a(r9, r0)     // Catch:{ all -> 0x005d }
            r3.putAll(r0)     // Catch:{ all -> 0x005d }
            r0 = 1
            l = r0     // Catch:{ all -> 0x005d }
            java.util.HashMap r0 = f     // Catch:{ all -> 0x005d }
            boolean r0 = r0.containsKey(r10)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0060
            java.util.HashMap r0 = f     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x005b
            r2 = r0
        L_0x005b:
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            goto L_0x001f
        L_0x005d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            throw r0
        L_0x0060:
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            goto L_0x001f
        L_0x0062:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0065:
            monitor-exit(r1)     // Catch:{ all -> 0x005d }
            android.net.Uri r1 = b
            java.lang.String[] r4 = new java.lang.String[r8]
            r4[r3] = r10
            r0 = r9
            r3 = r2
            r5 = r2
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L_0x007b
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x00a0 }
            if (r0 != 0) goto L_0x0085
        L_0x007b:
            r0 = 0
            a(r6, r10, r0)     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x001f
            r1.close()
            goto L_0x001f
        L_0x0085:
            r0 = 1
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x0094
            r3 = 0
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0094
            r0 = r2
        L_0x0094:
            a(r6, r10, r0)     // Catch:{ all -> 0x00a0 }
            if (r0 == 0) goto L_0x009a
            r2 = r0
        L_0x009a:
            if (r1 == 0) goto L_0x001f
            r1.close()
            goto L_0x001f
        L_0x00a0:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a6
            r1.close()
        L_0x00a6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bks.a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    private static void a(java.lang.Object obj, java.lang.String str, java.lang.String str2) {
        synchronized (defpackage.bks.class) {
            if (obj == k) {
                f.put(str, str2);
            }
        }
    }

    public static long b(android.content.ContentResolver contentResolver, java.lang.String str) {
        java.lang.Long l2;
        long j2;
        java.lang.Object b2 = b(contentResolver);
        java.lang.Long l3 = (java.lang.Long) a(i, str, (java.lang.Object) java.lang.Long.valueOf(0));
        if (l3 != null) {
            return l3.longValue();
        }
        java.lang.String a2 = a(contentResolver, str);
        if (a2 == null) {
            l2 = l3;
            j2 = 0;
        } else {
            try {
                long parseLong = java.lang.Long.parseLong(a2);
                l2 = java.lang.Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (java.lang.NumberFormatException e2) {
                l2 = l3;
                j2 = 0;
            }
        }
        a(b2, i, str, l2);
        return j2;
    }

    public static boolean c(android.content.ContentResolver contentResolver, java.lang.String str) {
        java.lang.Boolean bool;
        boolean z;
        java.lang.Object b2 = b(contentResolver);
        java.lang.Boolean bool2 = (java.lang.Boolean) a(g, str, (java.lang.Object) java.lang.Boolean.valueOf(false));
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        java.lang.String a2 = a(contentResolver, str);
        if (a2 == null || a2.equals("")) {
            bool = bool2;
            z = false;
        } else if (d.matcher(a2).matches()) {
            bool = java.lang.Boolean.valueOf(true);
            z = true;
        } else if (e.matcher(a2).matches()) {
            bool = java.lang.Boolean.valueOf(false);
            z = false;
        } else {
            android.util.Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            bool = bool2;
            z = false;
        }
        a(b2, g, str, bool);
        return z;
    }

    private static java.util.Map a(android.content.ContentResolver contentResolver, java.lang.String... strArr) {
        android.database.Cursor query = contentResolver.query(c, null, null, strArr, null);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    private static java.lang.Object b(android.content.ContentResolver contentResolver) {
        java.lang.Object obj;
        synchronized (defpackage.bks.class) {
            a(contentResolver);
            obj = k;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.Class<bks> r1 = defpackage.bks.class
            monitor-enter(r1)
            boolean r0 = r2.containsKey(r3)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
        L_0x0010:
            return r0
        L_0x0011:
            r0 = r4
            goto L_0x000f
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            r0 = 0
            goto L_0x0010
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bks.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    private static void a(java.lang.Object obj, java.util.HashMap hashMap, java.lang.String str, java.lang.Object obj2) {
        synchronized (defpackage.bks.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }
}
