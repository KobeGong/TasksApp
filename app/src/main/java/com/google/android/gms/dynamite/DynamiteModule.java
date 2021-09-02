package com.google.android.gms.dynamite;

/* compiled from: PG */
public final class DynamiteModule {
    public static final defpackage.bfs a = new defpackage.bfx();
    private static java.lang.Boolean b;
    private static defpackage.bgd c;
    private static defpackage.bgf d;
    private static java.lang.String e;
    private static final java.lang.ThreadLocal f = new java.lang.ThreadLocal();
    private static final defpackage.bgb g = new defpackage.bft();
    private final android.content.Context h;

    @com.google.android.gms.common.util.DynamiteApi
    /* compiled from: PG */
    public class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    public static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context context, defpackage.bfs bfs, java.lang.String str) {
        defpackage.bgc a2;
        defpackage.bfp bfp = (defpackage.bfp) f.get();
        defpackage.bfp bfp2 = new defpackage.bfp();
        f.set(bfp2);
        try {
            a2 = bfs.a(context, str, g);
            new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 68 + java.lang.String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a2.a).append(" and remote module ").append(str).append(":").append(a2.b);
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.b == 0))) {
                throw new defpackage.bfr("No acceptable module found. Local version is " + a2.a + " and remote version is " + a2.b + ".");
            } else if (a2.c == -1) {
                com.google.android.gms.dynamite.DynamiteModule b2 = b(context, str);
                if (bfp2.a != null) {
                    bfp2.a.close();
                }
                f.set(bfp);
                return b2;
            } else if (a2.c == 1) {
                com.google.android.gms.dynamite.DynamiteModule a3 = a(context, str, a2.b);
                if (bfp2.a != null) {
                    bfp2.a.close();
                }
                f.set(bfp);
                return a3;
            } else {
                throw new defpackage.bfr("VersionPolicy returned invalid code:" + a2.c);
            }
        } catch (defpackage.bfr e2) {
            java.lang.String str2 = "DynamiteModule";
            java.lang.String str3 = "Failed to load remote module: ";
            java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
            android.util.Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            if (a2.a == 0 || bfs.a(context, str, new defpackage.bfq(a2.a)).c != -1) {
                throw new defpackage.bfr("Remote load failed. No local fallback found.", e2);
            }
            com.google.android.gms.dynamite.DynamiteModule b3 = b(context, str);
            if (bfp2.a != null) {
                bfp2.a.close();
            }
            f.set(bfp);
            return b3;
        } catch (Throwable th) {
            if (bfp2.a != null) {
                bfp2.a.close();
            }
            f.set(bfp);
            throw th;
        }
    }

    public static int a(android.content.Context context, java.lang.String str) {
        try {
            java.lang.String str2 = "com.google.android.gms.dynamite.descriptors.";
            java.lang.String str3 = "ModuleDescriptor";
            java.lang.Class loadClass = context.getApplicationContext().getClassLoader().loadClass(new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length() + java.lang.String.valueOf(str3).length()).append(str2).append(str).append(".").append(str3).toString());
            java.lang.reflect.Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            java.lang.String valueOf = java.lang.String.valueOf(declaredField.get(null));
            android.util.Log.e("DynamiteModule", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 51 + java.lang.String.valueOf(str).length()).append("Module descriptor id '").append(valueOf).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (java.lang.ClassNotFoundException e2) {
            android.util.Log.w("DynamiteModule", new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (java.lang.Exception e3) {
            java.lang.String str4 = "DynamiteModule";
            java.lang.String str5 = "Failed to load module descriptor class: ";
            java.lang.String valueOf2 = java.lang.String.valueOf(e3.getMessage());
            android.util.Log.e(str4, valueOf2.length() != 0 ? str5.concat(valueOf2) : new java.lang.String(str5));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0071=Splitter:B:35:0x0071, B:25:0x0043=Splitter:B:25:0x0043} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)
            java.lang.Boolean r0 = b     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0034
            android.content.Context r0 = r7.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.Class r2 = r0.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            java.lang.String r0 = "sClassLoader"
            java.lang.reflect.Field r3 = r2.getDeclaredField(r0)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            monitor-enter(r2)     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
            r0 = 0
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0046
            java.lang.ClassLoader r3 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r0 != r3) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
        L_0x0032:
            b = r0     // Catch:{ all -> 0x0074 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ed
            int r0 = c(r7, r8, r9)     // Catch:{ bfr -> 0x00ca }
        L_0x003f:
            return r0
        L_0x0040:
            a(r0)     // Catch:{ bfr -> 0x00f3 }
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x0046:
            java.lang.String r0 = "com.google.android.gms"
            android.content.Context r4 = r7.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0061
            r0 = 0
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r3.set(r0, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x0061:
            int r0 = c(r7, r8, r9)     // Catch:{ bfr -> 0x0090 }
            java.lang.String r4 = e     // Catch:{ bfr -> 0x0090 }
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = e     // Catch:{ bfr -> 0x0090 }
            boolean r4 = r4.isEmpty()     // Catch:{ bfr -> 0x0090 }
            if (r4 == 0) goto L_0x0077
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x003f
        L_0x0074:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            bga r4 = new bga     // Catch:{ bfr -> 0x0090 }
            java.lang.String r5 = e     // Catch:{ bfr -> 0x0090 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ bfr -> 0x0090 }
            r4.<init>(r5, r6)     // Catch:{ bfr -> 0x0090 }
            a(r4)     // Catch:{ bfr -> 0x0090 }
            r5 = 0
            r3.set(r5, r4)     // Catch:{ bfr -> 0x0090 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ bfr -> 0x0090 }
            b = r4     // Catch:{ bfr -> 0x0090 }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            monitor-exit(r1)     // Catch:{ all -> 0x0074 }
            goto L_0x003f
        L_0x0090:
            r0 = move-exception
            r0 = 0
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r3.set(r0, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0031
        L_0x009c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ ClassNotFoundException -> 0x009f, IllegalAccessException -> 0x00f8, NoSuchFieldException -> 0x00f6 }
        L_0x009f:
            r0 = move-exception
        L_0x00a0:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            int r3 = r3.length()     // Catch:{ all -> 0x0074 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r4.<init>(r3)     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = "Failed to load module via V2: "
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0074 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0074 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0074 }
            goto L_0x0032
        L_0x00ca:
            r0 = move-exception
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x00e7
            java.lang.String r0 = r2.concat(r0)
        L_0x00e1:
            android.util.Log.w(r1, r0)
            r0 = 0
            goto L_0x003f
        L_0x00e7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x00e1
        L_0x00ed:
            int r0 = b(r7, r8, r9)
            goto L_0x003f
        L_0x00f3:
            r0 = move-exception
            goto L_0x0043
        L_0x00f6:
            r0 = move-exception
            goto L_0x00a0
        L_0x00f8:
            r0 = move-exception
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    private static int b(android.content.Context context, java.lang.String str, boolean z) {
        defpackage.bgd a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            return a2.a(defpackage.bfo.a((java.lang.Object) context), str, z);
        } catch (android.os.RemoteException e2) {
            java.lang.String str2 = "DynamiteModule";
            java.lang.String str3 = "Failed to retrieve remote module version: ";
            java.lang.String valueOf = java.lang.String.valueOf(e2.getMessage());
            android.util.Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r6 = 0
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            if (r9 == 0) goto L_0x0072
            java.lang.String r1 = "api_force_staging"
        L_0x0009:
            java.lang.String r2 = "content://com.google.android.gms.chimera/"
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r3 = r3 + 1
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r3 = r3 + r4
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.lang.StringBuilder r1 = r1.append(r8)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00ac, all -> 0x00a9 }
            if (r1 == 0) goto L_0x0056
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0065 }
            if (r0 != 0) goto L_0x0075
        L_0x0056:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r2 = "Failed to retrieve remote module version."
            android.util.Log.w(r0, r2)     // Catch:{ Exception -> 0x0065 }
            bfr r0 = new bfr     // Catch:{ Exception -> 0x0065 }
            java.lang.String r2 = "Failed to connect to dynamite module ContentResolver."
            r0.<init>(r2)     // Catch:{ Exception -> 0x0065 }
            throw r0     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            boolean r2 = r0 instanceof defpackage.bfr     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x00a1
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            throw r0
        L_0x0072:
            java.lang.String r1 = "api"
            goto L_0x0009
        L_0x0075:
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ Exception -> 0x0065 }
            if (r2 <= 0) goto L_0x0098
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r3 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r3)     // Catch:{ Exception -> 0x0065 }
            r0 = 2
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x009e }
            e = r0     // Catch:{ all -> 0x009e }
            monitor-exit(r3)     // Catch:{ all -> 0x009e }
            java.lang.ThreadLocal r0 = f     // Catch:{ Exception -> 0x0065 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0065 }
            bfp r0 = (defpackage.bfp) r0     // Catch:{ Exception -> 0x0065 }
            if (r0 == 0) goto L_0x0098
            android.database.Cursor r3 = r0.a     // Catch:{ Exception -> 0x0065 }
            if (r3 != 0) goto L_0x0098
            r0.a = r1     // Catch:{ Exception -> 0x0065 }
            r1 = r6
        L_0x0098:
            if (r1 == 0) goto L_0x009d
            r1.close()
        L_0x009d:
            return r2
        L_0x009e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ Exception -> 0x0065 }
        L_0x00a1:
            bfr r2 = new bfr     // Catch:{ all -> 0x006b }
            java.lang.String r3 = "V2 version check failed"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x006b }
            throw r2     // Catch:{ all -> 0x006b }
        L_0x00a9:
            r0 = move-exception
            r1 = r6
            goto L_0x006c
        L_0x00ac:
            r0 = move-exception
            r1 = r6
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    private static com.google.android.gms.dynamite.DynamiteModule b(android.content.Context context, java.lang.String str) {
        java.lang.String str2 = "Selected local version of ";
        java.lang.String valueOf = java.lang.String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new java.lang.String(str2);
        }
        return new com.google.android.gms.dynamite.DynamiteModule(context.getApplicationContext());
    }

    private static com.google.android.gms.dynamite.DynamiteModule a(android.content.Context context, java.lang.String str, int i) {
        java.lang.Boolean bool;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            bool = b;
        }
        if (bool == null) {
            throw new defpackage.bfr("Failed to determine which loading route to use.");
        } else if (bool.booleanValue()) {
            return c(context, str, i);
        } else {
            return b(context, str, i);
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule b(android.content.Context context, java.lang.String str, int i) {
        new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        defpackage.bgd a2 = a(context);
        if (a2 == null) {
            throw new defpackage.bfr("Failed to create IDynamiteLoader.");
        }
        try {
            defpackage.bfl a3 = a2.a(defpackage.bfo.a((java.lang.Object) context), str, i);
            if (defpackage.bfo.a(a3) != null) {
                return new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) defpackage.bfo.a(a3));
            }
            throw new defpackage.bfr("Failed to load remote module.");
        } catch (android.os.RemoteException e2) {
            throw new defpackage.bfr("Failed to load remote module.", e2);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.bgd a(android.content.Context r7) {
        /*
            r3 = 0
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)
            bgd r1 = c     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x000c
            bgd r1 = c     // Catch:{ all -> 0x0035 }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
        L_0x000b:
            return r1
        L_0x000c:
            int r1 = defpackage.axv.a(r7)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0015
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            r1 = r3
            goto L_0x000b
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms"
            r2 = 3
            android.content.Context r1 = r7.createPackageContext(r1, r2)     // Catch:{ Exception -> 0x004e }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x004e }
            java.lang.String r2 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ Exception -> 0x004e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ Exception -> 0x004e }
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ Exception -> 0x004e }
            if (r1 != 0) goto L_0x0038
            r1 = r3
        L_0x002f:
            if (r1 == 0) goto L_0x0068
            c = r1     // Catch:{ Exception -> 0x004e }
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x000b
        L_0x0035:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            throw r1
        L_0x0038:
            java.lang.String r2 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ Exception -> 0x004e }
            boolean r5 = r2 instanceof defpackage.bgd     // Catch:{ Exception -> 0x004e }
            if (r5 == 0) goto L_0x0047
            r0 = r2
            bgd r0 = (defpackage.bgd) r0     // Catch:{ Exception -> 0x004e }
            r1 = r0
            goto L_0x002f
        L_0x0047:
            bge r2 = new bge     // Catch:{ Exception -> 0x004e }
            r2.<init>(r1)     // Catch:{ Exception -> 0x004e }
            r1 = r2
            goto L_0x002f
        L_0x004e:
            r1 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r5 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0035 }
            int r6 = r1.length()     // Catch:{ all -> 0x0035 }
            if (r6 == 0) goto L_0x006b
            java.lang.String r1 = r5.concat(r1)     // Catch:{ all -> 0x0035 }
        L_0x0065:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0035 }
        L_0x0068:
            monitor-exit(r4)     // Catch:{ all -> 0x0035 }
            r1 = r3
            goto L_0x000b
        L_0x006b:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0035 }
            r1.<init>(r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context):bgd");
    }

    private static com.google.android.gms.dynamite.DynamiteModule c(android.content.Context context, java.lang.String str, int i) {
        defpackage.bgf bgf;
        new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i);
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            bgf = d;
        }
        if (bgf == null) {
            throw new defpackage.bfr("DynamiteLoaderV2 was not cached.");
        }
        defpackage.bfp bfp = (defpackage.bfp) f.get();
        if (bfp == null || bfp.a == null) {
            throw new defpackage.bfr("No result cursor");
        }
        android.content.Context a2 = a(context.getApplicationContext(), str, i, bfp.a, bgf);
        if (a2 != null) {
            return new com.google.android.gms.dynamite.DynamiteModule(a2);
        }
        throw new defpackage.bfr("Failed to get module context");
    }

    private static android.content.Context a(android.content.Context context, java.lang.String str, int i, android.database.Cursor cursor, defpackage.bgf bgf) {
        try {
            return (android.content.Context) defpackage.bfo.a(bgf.a(defpackage.bfo.a((java.lang.Object) context), str, i, defpackage.bfo.a((java.lang.Object) cursor)));
        } catch (java.lang.Exception e2) {
            java.lang.String str2 = "DynamiteModule";
            java.lang.String str3 = "Failed to load DynamiteLoader: ";
            java.lang.String valueOf = java.lang.String.valueOf(e2.toString());
            android.util.Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
            return null;
        }
    }

    private static void a(java.lang.ClassLoader classLoader) {
        defpackage.bgf bgg;
        try {
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (iBinder == null) {
                bgg = null;
            } else {
                android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof defpackage.bgf) {
                    bgg = (defpackage.bgf) queryLocalInterface;
                } else {
                    bgg = new defpackage.bgg(iBinder);
                }
            }
            d = bgg;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            throw new defpackage.bfr("Failed to instantiate dynamite loader", e2);
        }
    }

    public final android.os.IBinder a(java.lang.String str) {
        try {
            return (android.os.IBinder) this.h.getClassLoader().loadClass(str).newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e2) {
            java.lang.String str2 = "Failed to instantiate module class: ";
            java.lang.String valueOf = java.lang.String.valueOf(str);
            throw new defpackage.bfr(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), e2);
        }
    }

    private DynamiteModule(android.content.Context context) {
        this.h = (android.content.Context) defpackage.azb.b((java.lang.Object) context);
    }

    static {
        new defpackage.bfu();
        new defpackage.bfv();
        new defpackage.bfw();
        new defpackage.bfy();
        new defpackage.bfz();
    }
}
