package defpackage;

/* renamed from: cqv reason: default package */
/* compiled from: PG */
public final class cqv {
    private static final defpackage.ctl d = defpackage.ctl.a("com/google/android/libraries/toolkit/monogram/impl/MonogramData");
    public final defpackage.cyl a;
    public final java.util.concurrent.atomic.AtomicReference b = new java.util.concurrent.atomic.AtomicReference();
    public boolean c;
    private final android.content.Context e;

    public cqv(android.content.Context context, defpackage.cyl cyl) {
        this.e = context;
        this.a = cyl;
    }

    static defpackage.ri a(defpackage.cyi cyi) {
        try {
            return (defpackage.ri) defpackage.cyd.b(cyi);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ defpackage.ri a() {
        /*
            r11 = this;
            r4 = 0
            r6 = 0
            android.content.Context r0 = r11.e     // Catch:{ IOException -> 0x0082, all -> 0x00ad }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0082, all -> 0x00ad }
            r1 = 2131427330(0x7f0b0002, float:1.8476273E38)
            java.io.InputStream r1 = r0.openRawResource(r1)     // Catch:{ IOException -> 0x0082, all -> 0x00ad }
            dmi r0 = defpackage.dmi.b     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            int r2 = defpackage.bg.aq     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            java.lang.Object r0 = r0.a(r2)     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            djx r0 = (defpackage.djx) r0     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            java.lang.Object r0 = r0.a(r1)     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            dmi r0 = (defpackage.dmi) r0     // Catch:{ IOException -> 0x00d4, all -> 0x00cf }
            defpackage.cwk.a(r1)
        L_0x0022:
            djj r0 = r0.a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            ri r3 = new ri
            int r1 = r0.size()
            r3.<init>(r1, r6)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x0039:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b3
            r2 = r1
        L_0x0058:
            char[] r8 = r1.toCharArray()
            int r9 = r8.length
            r5 = r6
            r0 = r4
        L_0x005f:
            if (r5 >= r9) goto L_0x00ca
            char r10 = r8[r5]
            if (r0 != 0) goto L_0x00bb
            r1 = r3
        L_0x0066:
            java.lang.Character r0 = java.lang.Character.valueOf(r10)
            java.lang.Object r0 = r1.get(r0)
            cqy r0 = (defpackage.cqy) r0
            if (r0 != 0) goto L_0x007e
            cqy r0 = new cqy
            r0.<init>()
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r1.put(r10, r0)
        L_0x007e:
            int r1 = r5 + 1
            r5 = r1
            goto L_0x005f
        L_0x0082:
            r0 = move-exception
            r1 = r0
            r2 = r4
        L_0x0085:
            ctl r0 = d     // Catch:{ all -> 0x00d2 }
            java.util.logging.Level r3 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x00d2 }
            cua r0 = r0.a(r3)     // Catch:{ all -> 0x00d2 }
            cua r0 = (defpackage.cua) r0     // Catch:{ all -> 0x00d2 }
            cua r0 = r0.a(r1)     // Catch:{ all -> 0x00d2 }
            cua r0 = (defpackage.cua) r0     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "com/google/android/libraries/toolkit/monogram/impl/MonogramData"
            java.lang.String r3 = "lambda$createPrefixToMonogramMap$1"
            java.lang.String r5 = "MonogramData.java"
            cua r0 = r0.a(r1, r3, r5)     // Catch:{ all -> 0x00d2 }
            cua r0 = (defpackage.cua) r0     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Error reading config, using defaults."
            r0.a(r1)     // Catch:{ all -> 0x00d2 }
            dmi r0 = defpackage.dmi.b     // Catch:{ all -> 0x00d2 }
            defpackage.cwk.a(r2)
            goto L_0x0022
        L_0x00ad:
            r0 = move-exception
            r2 = r4
        L_0x00af:
            defpackage.cwk.a(r2)
            throw r0
        L_0x00b3:
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r2 = r0
            goto L_0x0058
        L_0x00bb:
            ri r1 = r0.a
            if (r1 != 0) goto L_0x00c6
            ri r1 = new ri
            r1.<init>(r6)
            r0.a = r1
        L_0x00c6:
            ri r0 = r0.a
            r1 = r0
            goto L_0x0066
        L_0x00ca:
            r0.b = r2
            goto L_0x0039
        L_0x00ce:
            return r3
        L_0x00cf:
            r0 = move-exception
            r2 = r1
            goto L_0x00af
        L_0x00d2:
            r0 = move-exception
            goto L_0x00af
        L_0x00d4:
            r0 = move-exception
            r2 = r1
            r1 = r0
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqv.a():ri");
    }
}
