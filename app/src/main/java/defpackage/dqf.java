package defpackage;

/* renamed from: dqf reason: default package */
/* compiled from: PG */
final class dqf {
    private final java.lang.Class a;
    private final java.lang.reflect.Constructor b;
    private final java.lang.reflect.Method c = this.a.getMethod("getScopes", new java.lang.Class[0]);
    private final java.lang.reflect.Method d = this.a.getMethod("getClientId", new java.lang.Class[0]);
    private final java.lang.reflect.Method e = this.a.getMethod("getClientEmail", new java.lang.Class[0]);
    private final java.lang.reflect.Method f = this.a.getMethod("getPrivateKey", new java.lang.Class[0]);
    private final java.lang.reflect.Method g = this.a.getMethod("getPrivateKeyId", new java.lang.Class[0]);

    public dqf(java.lang.Class cls, java.lang.ClassLoader classLoader) {
        this.a = cls.asSubclass(defpackage.crd.class);
        this.b = java.lang.Class.forName("com.google.auth.oauth2.ServiceAccountJwtAccessCredentials", false, classLoader).asSubclass(defpackage.crd.class).getConstructor(new java.lang.Class[]{java.lang.String.class, java.lang.String.class, java.security.PrivateKey.class, java.lang.String.class});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00a5, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00a7, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x00ab, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00ac, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x00b0, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x00b1, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x00b6, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x00b7, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0061, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0062, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0076, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0077, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x007b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x007d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x007f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0081, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0083, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0085, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0087, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0089, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x008b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x008d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x008f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0091, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0093, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0095, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0097, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0099, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x009b, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x009d, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x009f, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x00a1, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00a3, code lost:
        r6 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ab A[ExcHandler: IllegalAccessException (e java.lang.IllegalAccessException), Splitter:B:3:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.crd a(defpackage.crd r9) {
        /*
            r8 = this;
            java.lang.Class r1 = r8.a
            boolean r1 = r1.isInstance(r9)
            if (r1 != 0) goto L_0x000a
            r1 = r9
        L_0x0009:
            return r1
        L_0x000a:
            java.lang.Class r1 = r8.a     // Catch:{ IllegalAccessException -> 0x00ab, InvocationTargetException -> 0x00b0, InstantiationException -> 0x0061 }
            java.lang.Object r1 = r1.cast(r9)     // Catch:{ IllegalAccessException -> 0x00ab, InvocationTargetException -> 0x00b3, InstantiationException -> 0x0073 }
            crd r1 = (defpackage.crd) r1     // Catch:{ IllegalAccessException -> 0x00ab, InvocationTargetException -> 0x00b6, InstantiationException -> 0x0076 }
            java.lang.reflect.Method r2 = r8.c     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00b9, InstantiationException -> 0x0079 }
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00bb, InstantiationException -> 0x007b }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00bd, InstantiationException -> 0x007d }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00bf, InstantiationException -> 0x007f }
            int r2 = r2.size()     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00c1, InstantiationException -> 0x0081 }
            if (r2 != 0) goto L_0x0009
            java.lang.reflect.Constructor r2 = r8.b     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00c3, InstantiationException -> 0x0083 }
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00c5, InstantiationException -> 0x0085 }
            r4 = 0
            java.lang.reflect.Method r5 = r8.d     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00c7, InstantiationException -> 0x0087 }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00c9, InstantiationException -> 0x0089 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00cb, InstantiationException -> 0x008b }
            r3[r4] = r5     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00cd, InstantiationException -> 0x008d }
            r4 = 1
            java.lang.reflect.Method r5 = r8.e     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00cf, InstantiationException -> 0x008f }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00d1, InstantiationException -> 0x0091 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00d3, InstantiationException -> 0x0093 }
            r3[r4] = r5     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00d5, InstantiationException -> 0x0095 }
            r4 = 2
            java.lang.reflect.Method r5 = r8.f     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00d7, InstantiationException -> 0x0097 }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00d9, InstantiationException -> 0x0099 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00db, InstantiationException -> 0x009b }
            r3[r4] = r5     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00dd, InstantiationException -> 0x009d }
            r4 = 3
            java.lang.reflect.Method r5 = r8.g     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00df, InstantiationException -> 0x009f }
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00e1, InstantiationException -> 0x00a1 }
            java.lang.Object r5 = r5.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00a3 }
            r3[r4] = r5     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00e6, InstantiationException -> 0x00a5 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00e9, InstantiationException -> 0x00a7 }
            r0 = r2
            crd r0 = (defpackage.crd) r0     // Catch:{ IllegalAccessException -> 0x00ae, InvocationTargetException -> 0x00ec, InstantiationException -> 0x00a9 }
            r1 = r0
            goto L_0x0009
        L_0x0061:
            r6 = move-exception
            r1 = r9
        L_0x0063:
            r7 = r1
            java.util.logging.Logger r1 = defpackage.dqe.c
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r3 = "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper"
            java.lang.String r4 = "tryServiceAccountToJwt"
            java.lang.String r5 = "Failed converting service account credential to JWT. This is unexpected"
            r1.logp(r2, r3, r4, r5, r6)
            r1 = r7
            goto L_0x0009
        L_0x0073:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x0076:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x0079:
            r6 = move-exception
            goto L_0x0063
        L_0x007b:
            r6 = move-exception
            goto L_0x0063
        L_0x007d:
            r6 = move-exception
            goto L_0x0063
        L_0x007f:
            r6 = move-exception
            goto L_0x0063
        L_0x0081:
            r6 = move-exception
            goto L_0x0063
        L_0x0083:
            r6 = move-exception
            goto L_0x0063
        L_0x0085:
            r6 = move-exception
            goto L_0x0063
        L_0x0087:
            r6 = move-exception
            goto L_0x0063
        L_0x0089:
            r6 = move-exception
            goto L_0x0063
        L_0x008b:
            r6 = move-exception
            goto L_0x0063
        L_0x008d:
            r6 = move-exception
            goto L_0x0063
        L_0x008f:
            r6 = move-exception
            goto L_0x0063
        L_0x0091:
            r6 = move-exception
            goto L_0x0063
        L_0x0093:
            r6 = move-exception
            goto L_0x0063
        L_0x0095:
            r6 = move-exception
            goto L_0x0063
        L_0x0097:
            r6 = move-exception
            goto L_0x0063
        L_0x0099:
            r6 = move-exception
            goto L_0x0063
        L_0x009b:
            r6 = move-exception
            goto L_0x0063
        L_0x009d:
            r6 = move-exception
            goto L_0x0063
        L_0x009f:
            r6 = move-exception
            goto L_0x0063
        L_0x00a1:
            r6 = move-exception
            goto L_0x0063
        L_0x00a3:
            r6 = move-exception
            goto L_0x0063
        L_0x00a5:
            r6 = move-exception
            goto L_0x0063
        L_0x00a7:
            r6 = move-exception
            goto L_0x0063
        L_0x00a9:
            r6 = move-exception
            goto L_0x0063
        L_0x00ab:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x00ae:
            r6 = move-exception
            goto L_0x0063
        L_0x00b0:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x00b3:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x00b6:
            r6 = move-exception
            r1 = r9
            goto L_0x0063
        L_0x00b9:
            r6 = move-exception
            goto L_0x0063
        L_0x00bb:
            r6 = move-exception
            goto L_0x0063
        L_0x00bd:
            r6 = move-exception
            goto L_0x0063
        L_0x00bf:
            r6 = move-exception
            goto L_0x0063
        L_0x00c1:
            r6 = move-exception
            goto L_0x0063
        L_0x00c3:
            r6 = move-exception
            goto L_0x0063
        L_0x00c5:
            r6 = move-exception
            goto L_0x0063
        L_0x00c7:
            r6 = move-exception
            goto L_0x0063
        L_0x00c9:
            r6 = move-exception
            goto L_0x0063
        L_0x00cb:
            r6 = move-exception
            goto L_0x0063
        L_0x00cd:
            r6 = move-exception
            goto L_0x0063
        L_0x00cf:
            r6 = move-exception
            goto L_0x0063
        L_0x00d1:
            r6 = move-exception
            goto L_0x0063
        L_0x00d3:
            r6 = move-exception
            goto L_0x0063
        L_0x00d5:
            r6 = move-exception
            goto L_0x0063
        L_0x00d7:
            r6 = move-exception
            goto L_0x0063
        L_0x00d9:
            r6 = move-exception
            goto L_0x0063
        L_0x00db:
            r6 = move-exception
            goto L_0x0063
        L_0x00dd:
            r6 = move-exception
            goto L_0x0063
        L_0x00df:
            r6 = move-exception
            goto L_0x0063
        L_0x00e1:
            r6 = move-exception
            goto L_0x0063
        L_0x00e3:
            r6 = move-exception
            goto L_0x0063
        L_0x00e6:
            r6 = move-exception
            goto L_0x0063
        L_0x00e9:
            r6 = move-exception
            goto L_0x0063
        L_0x00ec:
            r6 = move-exception
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqf.a(crd):crd");
    }
}
