package defpackage;

/* renamed from: pt reason: default package */
/* compiled from: PG */
public final class pt {
    public static final defpackage.qy a = new defpackage.qy(16);
    public static final java.lang.Object b = new java.lang.Object();
    public static final defpackage.ri c = new defpackage.ri();
    private static final defpackage.qb d = new defpackage.qb("fonts");
    private static final java.util.Comparator e = new defpackage.px();

    static defpackage.qa a(android.content.Context context, defpackage.ps psVar, int i) {
        java.util.List a2;
        android.content.pm.ProviderInfo providerInfo;
        defpackage.py pyVar;
        int i2;
        boolean z;
        int i3 = -3;
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.res.Resources resources = context.getResources();
            java.lang.String str = psVar.a;
            android.content.pm.ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (!resolveContentProvider.packageName.equals(psVar.b)) {
                throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + psVar.b);
            } else {
                android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.content.pm.Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                java.util.Collections.sort(arrayList, e);
                if (psVar.d != null) {
                    a2 = psVar.d;
                } else {
                    a2 = defpackage.jd.a(resources, 0);
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= a2.size()) {
                        providerInfo = null;
                        break;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) a2.get(i4));
                    java.util.Collections.sort(arrayList2, e);
                    if (arrayList.size() == arrayList2.size()) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= arrayList.size()) {
                                z = true;
                                break;
                            } else if (!java.util.Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                z = false;
                                break;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                    i4++;
                }
                if (providerInfo == null) {
                    pyVar = new defpackage.py(1, null);
                } else {
                    pyVar = new defpackage.py(0, a(context, psVar, providerInfo.authority));
                }
                if (pyVar.a == 0) {
                    android.graphics.Typeface a3 = defpackage.ov.a.a(context, pyVar.b, i);
                    if (a3 != null) {
                        i2 = 0;
                    } else {
                        i2 = -3;
                    }
                    return new defpackage.qa(a3, i2);
                }
                if (pyVar.a == 1) {
                    i3 = -2;
                }
                return new defpackage.qa(null, i3);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            return new defpackage.qa(null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        d.a(new defpackage.qd(r4, new android.os.Handler(), new defpackage.pw(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r6, defpackage.ps r7, defpackage.op r8, android.os.Handler r9, boolean r10, int r11, int r12) {
        /*
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.e
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "-"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r3 = r0.toString()
            qy r0 = a
            java.lang.Object r0 = r0.a(r3)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x0029
            r8.a(r0)
        L_0x0029:
            r2 = r0
        L_0x002a:
            return r2
        L_0x002b:
            if (r10 == 0) goto L_0x0048
            r0 = -1
            if (r11 != r0) goto L_0x0048
            qa r0 = a(r6, r7, r12)
            if (r8 == 0) goto L_0x003f
            int r1 = r0.b
            if (r1 != 0) goto L_0x0042
            android.graphics.Typeface r1 = r0.a
            r8.a(r1, r9)
        L_0x003f:
            android.graphics.Typeface r2 = r0.a
            goto L_0x002a
        L_0x0042:
            int r1 = r0.b
            r8.a(r1, r9)
            goto L_0x003f
        L_0x0048:
            pu r4 = new pu
            r4.<init>(r6, r7, r12, r3)
            if (r10 == 0) goto L_0x005a
            qb r0 = d     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.Object r0 = r0.a(r4, r11)     // Catch:{ InterruptedException -> 0x00a6 }
            qa r0 = (defpackage.qa) r0     // Catch:{ InterruptedException -> 0x00a6 }
            android.graphics.Typeface r2 = r0.a     // Catch:{ InterruptedException -> 0x00a6 }
            goto L_0x002a
        L_0x005a:
            if (r8 != 0) goto L_0x007a
            r1 = r2
        L_0x005d:
            java.lang.Object r5 = b
            monitor-enter(r5)
            ri r0 = c     // Catch:{ all -> 0x0077 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0081
            if (r1 == 0) goto L_0x0075
            ri r0 = c     // Catch:{ all -> 0x0077 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0077 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0077 }
            r0.add(r1)     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            goto L_0x002a
        L_0x0077:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x007a:
            pv r0 = new pv
            r0.<init>(r8, r9)
            r1 = r0
            goto L_0x005d
        L_0x0081:
            if (r1 == 0) goto L_0x0090
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0077 }
            r0.<init>()     // Catch:{ all -> 0x0077 }
            r0.add(r1)     // Catch:{ all -> 0x0077 }
            ri r1 = c     // Catch:{ all -> 0x0077 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0077 }
        L_0x0090:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            qb r0 = d
            pw r1 = new pw
            r1.<init>(r3)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            qd r5 = new qd
            r5.<init>(r4, r3, r1)
            r0.a(r5)
            goto L_0x002a
        L_0x00a6:
            r0 = move-exception
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt.a(android.content.Context, ps, op, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static java.util.Map a(android.content.Context context, defpackage.pz[] pzVarArr, android.os.CancellationSignal cancellationSignal) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (defpackage.pz pzVar : pzVarArr) {
            if (pzVar.e == 0) {
                android.net.Uri uri = pzVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, defpackage.jd.a(context, (android.os.CancellationSignal) null, uri));
                }
            }
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.pz[] a(android.content.Context r18, defpackage.ps r19, java.lang.String r20) {
        /*
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            r0 = r20
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r3 = r2.build()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r4 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r4)
            r0 = r20
            android.net.Uri$Builder r2 = r2.authority(r0)
            java.lang.String r4 = "file"
            android.net.Uri$Builder r2 = r2.appendPath(r4)
            android.net.Uri r12 = r2.build()
            r9 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0152 }
            r4 = 16
            if (r2 <= r4) goto L_0x00f3
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ all -> 0x0152 }
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0152 }
            r5 = 0
            java.lang.String r6 = "_id"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 1
            java.lang.String r6 = "file_id"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 2
            java.lang.String r6 = "font_ttc_index"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 3
            java.lang.String r6 = "font_variation_settings"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 4
            java.lang.String r6 = "font_weight"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 5
            java.lang.String r6 = "font_italic"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 6
            java.lang.String r6 = "result_code"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            java.lang.String r5 = "query = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0152 }
            r7 = 0
            r0 = r19
            java.lang.String r8 = r0.c     // Catch:{ all -> 0x0152 }
            r6[r7] = r8     // Catch:{ all -> 0x0152 }
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0152 }
        L_0x0078:
            if (r10 == 0) goto L_0x0142
            int r2 = r10.getCount()     // Catch:{ all -> 0x00eb }
            if (r2 <= 0) goto L_0x0142
            java.lang.String r2 = "result_code"
            int r11 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x00eb }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00eb }
            r2.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "_id"
            int r13 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "file_id"
            int r14 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "font_ttc_index"
            int r15 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "font_weight"
            int r16 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r4 = "font_italic"
            int r17 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x00eb }
        L_0x00a9:
            boolean r4 = r10.moveToNext()     // Catch:{ all -> 0x00eb }
            if (r4 == 0) goto L_0x0143
            r4 = -1
            if (r11 == r4) goto L_0x0130
            int r9 = r10.getInt(r11)     // Catch:{ all -> 0x00eb }
        L_0x00b6:
            r4 = -1
            if (r15 == r4) goto L_0x0132
            int r6 = r10.getInt(r15)     // Catch:{ all -> 0x00eb }
        L_0x00bd:
            r4 = -1
            if (r14 != r4) goto L_0x0134
            long r4 = r10.getLong(r13)     // Catch:{ all -> 0x00eb }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r3, r4)     // Catch:{ all -> 0x00eb }
        L_0x00c8:
            r4 = -1
            r0 = r16
            if (r0 == r4) goto L_0x013d
            r0 = r16
            int r7 = r10.getInt(r0)     // Catch:{ all -> 0x00eb }
        L_0x00d3:
            r4 = -1
            r0 = r17
            if (r0 == r4) goto L_0x0140
            r0 = r17
            int r4 = r10.getInt(r0)     // Catch:{ all -> 0x00eb }
            r8 = 1
            if (r4 != r8) goto L_0x0140
            r8 = 1
        L_0x00e2:
            pz r4 = new pz     // Catch:{ all -> 0x00eb }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00eb }
            r2.add(r4)     // Catch:{ all -> 0x00eb }
            goto L_0x00a9
        L_0x00eb:
            r2 = move-exception
            r3 = r10
        L_0x00ed:
            if (r3 == 0) goto L_0x00f2
            r3.close()
        L_0x00f2:
            throw r2
        L_0x00f3:
            android.content.ContentResolver r2 = r18.getContentResolver()     // Catch:{ all -> 0x0152 }
            r4 = 7
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0152 }
            r5 = 0
            java.lang.String r6 = "_id"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 1
            java.lang.String r6 = "file_id"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 2
            java.lang.String r6 = "font_ttc_index"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 3
            java.lang.String r6 = "font_variation_settings"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 4
            java.lang.String r6 = "font_weight"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 5
            java.lang.String r6 = "font_italic"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            r5 = 6
            java.lang.String r6 = "result_code"
            r4[r5] = r6     // Catch:{ all -> 0x0152 }
            java.lang.String r5 = "query = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0152 }
            r7 = 0
            r0 = r19
            java.lang.String r8 = r0.c     // Catch:{ all -> 0x0152 }
            r6[r7] = r8     // Catch:{ all -> 0x0152 }
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0152 }
            goto L_0x0078
        L_0x0130:
            r9 = 0
            goto L_0x00b6
        L_0x0132:
            r6 = 0
            goto L_0x00bd
        L_0x0134:
            long r4 = r10.getLong(r14)     // Catch:{ all -> 0x00eb }
            android.net.Uri r5 = android.content.ContentUris.withAppendedId(r12, r4)     // Catch:{ all -> 0x00eb }
            goto L_0x00c8
        L_0x013d:
            r7 = 400(0x190, float:5.6E-43)
            goto L_0x00d3
        L_0x0140:
            r8 = 0
            goto L_0x00e2
        L_0x0142:
            r2 = r11
        L_0x0143:
            if (r10 == 0) goto L_0x0148
            r10.close()
        L_0x0148:
            r3 = 0
            pz[] r3 = new defpackage.pz[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            pz[] r2 = (defpackage.pz[]) r2
            return r2
        L_0x0152:
            r2 = move-exception
            r3 = r9
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt.a(android.content.Context, ps, java.lang.String):pz[]");
    }
}
