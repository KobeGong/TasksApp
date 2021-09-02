package defpackage;

/* renamed from: pb reason: default package */
/* compiled from: PG */
class pb implements defpackage.ow {
    pb() {
    }

    private static java.lang.Object a(java.lang.Object[] objArr, int i, defpackage.pe peVar) {
        boolean z;
        int i2;
        java.lang.Object obj;
        int i3 = (i & 1) == 0 ? 400 : 700;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        java.lang.Object obj2 = null;
        int i4 = Integer.MAX_VALUE;
        int length = objArr.length;
        int i5 = 0;
        while (i5 < length) {
            java.lang.Object obj3 = objArr[i5];
            int abs = java.lang.Math.abs(peVar.b(obj3) - i3) << 1;
            if (peVar.a(obj3) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i6 = i2 + abs;
            if (obj2 == null || i4 > i6) {
                i4 = i6;
                obj = obj3;
            } else {
                obj = obj2;
            }
            i5++;
            obj2 = obj;
        }
        return obj2;
    }

    protected static defpackage.pz a(defpackage.pz[] pzVarArr, int i) {
        return (defpackage.pz) a((java.lang.Object[]) pzVarArr, i, (defpackage.pe) new defpackage.pc());
    }

    protected static android.graphics.Typeface a(android.content.Context context, java.io.InputStream inputStream) {
        android.graphics.Typeface typeface = null;
        java.io.File a = defpackage.jd.a(context);
        if (a != null) {
            try {
                if (defpackage.jd.a(a, inputStream)) {
                    typeface = android.graphics.Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (java.lang.RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r5, defpackage.pz[] r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = r6.length
            if (r1 > 0) goto L_0x0005
        L_0x0004:
            return r0
        L_0x0005:
            pz r1 = a(r6, r7)
            android.content.ContentResolver r2 = r5.getContentResolver()     // Catch:{ IOException -> 0x001b, all -> 0x0021 }
            android.net.Uri r1 = r1.a     // Catch:{ IOException -> 0x001b, all -> 0x0021 }
            java.io.InputStream r1 = r2.openInputStream(r1)     // Catch:{ IOException -> 0x001b, all -> 0x0021 }
            android.graphics.Typeface r0 = a(r5, r1)     // Catch:{ IOException -> 0x002b, all -> 0x0029 }
            defpackage.jd.a(r1)
            goto L_0x0004
        L_0x001b:
            r1 = move-exception
            r1 = r0
        L_0x001d:
            defpackage.jd.a(r1)
            goto L_0x0004
        L_0x0021:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0025:
            defpackage.jd.a(r1)
            throw r0
        L_0x0029:
            r0 = move-exception
            goto L_0x0025
        L_0x002b:
            r2 = move-exception
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.a(android.content.Context, pz[], int):android.graphics.Typeface");
    }

    public android.graphics.Typeface a(android.content.Context context, defpackage.om omVar, android.content.res.Resources resources, int i) {
        defpackage.on onVar = (defpackage.on) a((java.lang.Object[]) omVar.a, i, (defpackage.pe) new defpackage.pd());
        if (onVar == null) {
            return null;
        }
        return defpackage.ov.a(context, resources, onVar.f, onVar.a, i);
    }

    public android.graphics.Typeface a(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        android.graphics.Typeface typeface = null;
        java.io.File a = defpackage.jd.a(context);
        if (a != null) {
            try {
                if (defpackage.jd.a(a, resources, i)) {
                    typeface = android.graphics.Typeface.createFromFile(a.getPath());
                    a.delete();
                }
            } catch (java.lang.RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }
}
