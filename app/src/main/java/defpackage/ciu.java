package defpackage;

/* renamed from: ciu reason: default package */
/* compiled from: PG */
final class ciu implements java.lang.Runnable {
    private final /* synthetic */ defpackage.cir a;
    private final /* synthetic */ defpackage.cit b;

    ciu(defpackage.cit cit, defpackage.cir cir) {
        this.b = cit;
        this.a = cir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            cit r3 = r13.b
            cir r1 = r13.a
            android.app.Application r0 = r3.a
            r2 = 0
            edf r2 = defpackage.cky.a(r2, r0)
            r1.j = r2
            int r0 = defpackage.cky.a(r0)
            r1.k = r0
            r0 = 0
            java.lang.Object r4 = r3.d
            monitor-enter(r4)
            java.util.List r2 = r3.g     // Catch:{ all -> 0x01c8 }
            r2.add(r1)     // Catch:{ all -> 0x01c8 }
            java.util.List r1 = r3.g     // Catch:{ all -> 0x01c8 }
            int r1 = r1.size()     // Catch:{ all -> 0x01c8 }
            int r2 = r3.e     // Catch:{ all -> 0x01c8 }
            if (r1 < r2) goto L_0x0254
            java.util.List r0 = r3.g     // Catch:{ all -> 0x01c8 }
            java.util.List r1 = r3.g     // Catch:{ all -> 0x01c8 }
            int r1 = r1.size()     // Catch:{ all -> 0x01c8 }
            cir[] r1 = new defpackage.cir[r1]     // Catch:{ all -> 0x01c8 }
            java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ all -> 0x01c8 }
            cir[] r0 = (defpackage.cir[]) r0     // Catch:{ all -> 0x01c8 }
            java.util.List r1 = r3.g     // Catch:{ all -> 0x01c8 }
            r1.clear()     // Catch:{ all -> 0x01c8 }
            r2 = r0
        L_0x003c:
            monitor-exit(r4)     // Catch:{ all -> 0x01c8 }
            if (r2 == 0) goto L_0x0253
            cis r4 = r3.h
            boolean r5 = r3.f
            efx r6 = new efx
            r6.<init>()
            ees r7 = new ees
            r7.<init>()
            r6.f = r7
            int r0 = r2.length
            eer[] r0 = new defpackage.eer[r0]
            r7.a = r0
            r0 = 0
            r1 = r0
        L_0x0056:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x0250
            eer[] r0 = r7.a
            eer r8 = new eer
            r8.<init>()
            r0[r1] = r8
            r0 = r2[r1]
            int r0 = r0.e
            if (r0 <= 0) goto L_0x0076
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.g = r8
        L_0x0076:
            r0 = r2[r1]
            int r0 = r0.d
            if (r0 <= 0) goto L_0x008a
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.f = r8
        L_0x008a:
            r0 = r2[r1]
            long r8 = r0.c
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            long r8 = r8.c
            int r8 = (int) r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.c = r8
        L_0x00a3:
            r0 = r2[r1]
            long r8 = r0.b
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            long r8 = r8.b
            int r8 = (int) r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.d = r8
        L_0x00bc:
            r0 = r2[r1]
            int r0 = r0.h
            if (r0 < 0) goto L_0x00d0
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.e = r8
        L_0x00d0:
            r0 = r2[r1]
            java.lang.String r0 = r0.i
            if (r0 == 0) goto L_0x00e9
            eer[] r0 = r7.a
            r8 = r0[r1]
            r0 = r2[r1]
            java.lang.String r0 = r0.i
            if (r0 == 0) goto L_0x00e6
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x01cb
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            r8.a = r0
        L_0x00e9:
            eer[] r0 = r7.a
            r8 = r0[r1]
            r0 = r2[r1]
            java.lang.String r0 = r0.g
            if (r0 == 0) goto L_0x00f9
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x01ef
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r8.h = r0
            r0 = r2[r1]
            java.lang.String r0 = r0.f
            if (r0 == 0) goto L_0x0156
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            java.lang.String r8 = r8.f
            java.lang.String r8 = defpackage.cis.a(r8)
            r0.u = r8
            if (r5 == 0) goto L_0x0237
            r0 = r2[r1]
            java.lang.String r8 = r0.f
            java.util.Set r0 = defpackage.cis.a
            java.util.Iterator r9 = r0.iterator()
        L_0x011c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x011c
            r0 = 1
        L_0x012f:
            if (r0 == 0) goto L_0x0237
            r0 = 1
        L_0x0132:
            if (r0 == 0) goto L_0x023d
            r0 = r2[r1]
            java.lang.String r0 = r0.f
            cly r8 = r4.d
            r9 = 1
            java.lang.String r0 = defpackage.cis.a(r0, r8, r9)
            eer[] r8 = r7.a
            r8 = r8[r1]
            java.util.regex.Pattern r9 = defpackage.cis.c
            java.util.regex.Matcher r0 = r9.matcher(r0)
            boolean r9 = r0.matches()
            if (r9 == 0) goto L_0x023a
            r9 = 2
            java.lang.String r0 = r0.group(r9)
        L_0x0154:
            r8.s = r0
        L_0x0156:
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            edf r8 = r8.j
            r0.i = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            eeq r8 = new eeq
            r8.<init>()
            r0.l = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            eeq r0 = r0.l
            r8 = r2[r1]
            int r8 = r8.k
            r0.a = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = 0
            r0.m = r8
            r0 = r2[r1]
            long r8 = r0.a
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0196
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            long r8 = r8.a
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.n = r8
        L_0x0196:
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.n
            r0.o = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.l
            r0.p = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            int r8 = r8.m
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.q = r8
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.r = r8
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0056
        L_0x01c8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c8 }
            throw r0
        L_0x01cb:
            java.util.regex.Pattern r9 = defpackage.cis.b
            java.util.regex.Matcher r9 = r9.matcher(r0)
            boolean r10 = r9.find()
            if (r10 == 0) goto L_0x01de
            r0 = 0
            java.lang.String r0 = r9.group(r0)
            goto L_0x00e7
        L_0x01de:
            java.lang.String r9 = "NetworkCollector"
            java.lang.String r10 = "contentType extraction failed for %s, skipping logging path"
            r11 = 1
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r12 = 0
            r11[r12] = r0
            r0 = 5
            defpackage.cdm.a(r0, r9, r10, r11)
            r0 = 0
            goto L_0x00e7
        L_0x01ef:
            java.lang.String r9 = "http/1.1"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x01fa
            r0 = 1
            goto L_0x00fa
        L_0x01fa:
            java.lang.String r9 = "spdy/2"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0205
            r0 = 2
            goto L_0x00fa
        L_0x0205:
            java.lang.String r9 = "spdy/3"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x0210
            r0 = 3
            goto L_0x00fa
        L_0x0210:
            java.lang.String r9 = "spdy/3.1"
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L_0x021b
            r0 = 4
            goto L_0x00fa
        L_0x021b:
            java.lang.String r9 = "h2"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L_0x0226
            r0 = 5
            goto L_0x00fa
        L_0x0226:
            java.lang.String r9 = "quic/1+spdy/3"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0231
            r0 = 6
            goto L_0x00fa
        L_0x0231:
            r0 = 0
            goto L_0x00fa
        L_0x0234:
            r0 = 0
            goto L_0x012f
        L_0x0237:
            r0 = 0
            goto L_0x0132
        L_0x023a:
            r0 = 0
            goto L_0x0154
        L_0x023d:
            eer[] r0 = r7.a
            r0 = r0[r1]
            r8 = r2[r1]
            java.lang.String r8 = r8.f
            cly r9 = r4.d
            r10 = 0
            java.lang.String r8 = defpackage.cis.a(r8, r9, r10)
            r0.b = r8
            goto L_0x0156
        L_0x0250:
            r3.a(r6)
        L_0x0253:
            return
        L_0x0254:
            r2 = r0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciu.run():void");
    }
}
