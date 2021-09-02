package defpackage;

@android.annotation.TargetApi(26)
/* renamed from: cky reason: default package */
/* compiled from: PG */
public class cky {
    private static volatile java.lang.Thread a;
    private static volatile android.os.Handler b;

    cky() {
    }

    private static boolean a(java.lang.Number number) {
        return number == null || number.longValue() <= 0;
    }

    public static boolean a(defpackage.edu edu) {
        return a((java.lang.Number) edu.a);
    }

    private static boolean a(defpackage.egb egb) {
        return (egb.a == null || egb.a.intValue() == 0) && (egb.b == null || egb.b.longValue() == 0);
    }

    public static boolean a(defpackage.efk efk) {
        return a((java.lang.Number) efk.a) && a((java.lang.Number) efk.b) && a((java.lang.Number) efk.e) && a((java.lang.Number) efk.d) && a((java.lang.Number) efk.c) && a((java.lang.Number) efk.f);
    }

    public static boolean a(defpackage.eeu eeu) {
        return eeu.b == null;
    }

    public static boolean a(defpackage.efo efo) {
        return a((java.lang.Number) efo.a) && a((java.lang.Number) efo.b);
    }

    public static java.lang.Long a(java.lang.Long l, java.lang.Long l2) {
        if (l == null || l2 == null) {
            return l;
        }
        long longValue = l.longValue() - l2.longValue();
        if (longValue == 0) {
            return null;
        }
        return java.lang.Long.valueOf(longValue);
    }

    public static java.lang.Integer a(java.lang.Integer num, java.lang.Integer num2) {
        if (num == null || num2 == null) {
            return num;
        }
        int intValue = num.intValue() - num2.intValue();
        if (intValue == 0) {
            return null;
        }
        return java.lang.Integer.valueOf(intValue);
    }

    public static defpackage.eed a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        defpackage.eed eed = new defpackage.eed();
        eed.b = str;
        return eed;
    }

    public static defpackage.egb a(java.lang.String str, android.os.health.TimerStat timerStat) {
        defpackage.egb egb = new defpackage.egb();
        egb.a = java.lang.Integer.valueOf(timerStat.getCount());
        if (egb.a.intValue() < 0) {
            egb.a = java.lang.Integer.valueOf(0);
        }
        egb.b = java.lang.Long.valueOf(timerStat.getTime());
        egb.c = a(str);
        if (a(egb)) {
            return null;
        }
        return egb;
    }

    public static defpackage.egb a(defpackage.egb egb, defpackage.egb egb2) {
        if (egb == null || egb2 == null) {
            return egb;
        }
        defpackage.egb egb3 = new defpackage.egb();
        egb3.c = egb.c;
        egb3.a = java.lang.Integer.valueOf(egb.a.intValue() - egb2.a.intValue());
        egb3.b = java.lang.Long.valueOf(egb.b.longValue() - egb2.b.longValue());
        if (a(egb3)) {
            return null;
        }
        return egb3;
    }

    public static java.lang.Integer a(java.lang.Long l) {
        if (l == null) {
            return null;
        }
        return java.lang.Integer.valueOf(l.intValue());
    }

    public static defpackage.egb[] a(defpackage.egb[] egbArr, defpackage.egb[] egbArr2) {
        return (defpackage.egb[]) defpackage.cmj.a.a((defpackage.dmf[]) egbArr, (defpackage.dmf[]) egbArr2);
    }

    public static java.lang.Long a(android.os.health.HealthStats healthStats, int i) {
        java.lang.Long l;
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            l = null;
        } else {
            l = java.lang.Long.valueOf(healthStats.getMeasurement(i));
        }
        if (a((java.lang.Number) l)) {
            return null;
        }
        return l;
    }

    public static defpackage.egb b(android.os.health.HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return a((java.lang.String) null, healthStats.getTimer(i));
    }

    public static defpackage.egb[] c(android.os.health.HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimers(i)) {
            return null;
        }
        return (defpackage.egb[]) defpackage.cmj.a.a(healthStats.getTimers(i));
    }

    public static java.util.Map d(android.os.health.HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasStats(i)) {
            return null;
        }
        return healthStats.getStats(i);
    }

    public static defpackage.cki a(android.content.Context context, defpackage.cki cki) {
        defpackage.cmn cmn = new defpackage.cmn();
        java.lang.String packageName = context.getPackageName();
        boolean a2 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 32).append("primes:").append(packageName).append(":enable_leak_detection_v2").toString(), cki.b);
        boolean a3 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 29).append("primes:").append(packageName).append(":enable_leak_detection").toString(), cki.a);
        boolean a4 = cmn.a(context, "primes:disable_memory_summary_metrics", cki.c);
        boolean a5 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 33).append("primes:").append(packageName).append(":enable_battery_experiment").toString(), cki.d);
        boolean a6 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_magic_eye_log").toString(), cki.e);
        boolean a7 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 34).append("primes:").append(packageName).append(":enable_persist_crash_stats").toString(), cki.f);
        boolean a8 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_startup_trace").toString(), cki.g);
        boolean a9 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 36).append("primes:").append(packageName).append(":enable_url_auto_sanitization").toString(), cki.h);
        boolean a10 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 32).append("primes:").append(packageName).append(":enable_primes_for_primes").toString(), cki.i);
        boolean a11 = cmn.a(context, new java.lang.StringBuilder(java.lang.String.valueOf(packageName).length() + 27).append("primes:").append(packageName).append(":enable_primes_trace").toString(), cki.j);
        defpackage.ckj ckj = new defpackage.ckj();
        ckj.a = a3;
        ckj.b = a2;
        ckj.c = a4;
        ckj.d = a5;
        ckj.e = a6;
        ckj.f = a7;
        ckj.g = a8;
        ckj.h = a9;
        ckj.i = a10;
        ckj.j = a11;
        return ckj.a();
    }

    public static boolean a(defpackage.cmx cmx) {
        return (cmx instanceof defpackage.cmw) && (((defpackage.cmw) cmx).a.j & 2) != 0;
    }

    public static long a(java.io.File[] fileArr) {
        long j = 0;
        try {
            int length = fileArr.length;
            long j2 = 0;
            int i = 0;
            while (i < length) {
                try {
                    java.io.File file = fileArr[i];
                    if (!a(file)) {
                        if (file.isFile()) {
                            j2 += file.length();
                        } else if (file.isDirectory()) {
                            j2 += a(file.listFiles());
                        } else {
                            defpackage.cdm.a(5, "DirStatsCapture", "not a link / dir / regular file: %s", file);
                        }
                    }
                    i++;
                } catch (java.io.IOException e) {
                    java.lang.Throwable th = e;
                    j = j2;
                    e = th;
                    defpackage.cdm.b("DirStatsCapture", "failure computing subtree size", e, new java.lang.Object[0]);
                    return j;
                } catch (java.lang.SecurityException e2) {
                    java.lang.Throwable th2 = e2;
                    j = j2;
                    e = th2;
                    defpackage.cdm.b("DirStatsCapture", "failure computing subtree size", e, new java.lang.Object[0]);
                    return j;
                }
            }
            return j2;
        } catch (java.io.IOException | java.lang.SecurityException e3) {
            e = e3;
            defpackage.cdm.b("DirStatsCapture", "failure computing subtree size", e, new java.lang.Object[0]);
            return j;
        }
    }

    public static boolean a(java.io.File file) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return java.nio.file.Files.isSymbolicLink(file.toPath());
        }
        try {
            java.io.File file2 = new java.io.File(file.getParentFile().getCanonicalFile(), file.getName());
            if (file2.getCanonicalFile().equals(file2.getAbsoluteFile())) {
                return false;
            }
            return true;
        } catch (java.io.IOException e) {
            defpackage.cdm.a(5, "DirStatsCapture", "Could not check symlink for file: %s, assuming symlink.", file);
            return true;
        }
    }

    public static defpackage.eew[] a(android.content.Context context, int i, java.util.regex.Pattern... patternArr) {
        java.io.File file;
        c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            file = new java.io.File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            defpackage.cdm.a(5, "DirStatsCapture", "Failed to use package manager getting data directory from context instead.", new java.lang.Object[0]);
            java.io.File filesDir = context.getFilesDir();
            if (filesDir != null) {
                file = filesDir.getParentFile();
            } else {
                file = null;
            }
        }
        if (file == null) {
            return null;
        }
        try {
            defpackage.cnr cnr = new defpackage.cnr(file, arrayList, i, patternArr);
            cnr.a(new defpackage.cns(cnr));
            if (arrayList.isEmpty()) {
                return null;
            }
            return (defpackage.eew[]) arrayList.toArray(new defpackage.eew[0]);
        } catch (java.lang.Exception e2) {
            java.lang.String str = "DirStatsCapture";
            java.lang.String valueOf = java.lang.String.valueOf(e2);
            defpackage.cdm.a(5, str, new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 29).append("Failed to retrieve DirStats: ").append(valueOf).toString(), new java.lang.Object[0]);
            return null;
        }
    }

    public static int a(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.getType();
                }
            }
        } catch (java.lang.SecurityException e) {
            defpackage.cdm.a(5, "NetworkCapture", "Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml", new java.lang.Object[0]);
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        defpackage.cdm.c("PackageStatsO", "queryStatsForPackage() call failed", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.PackageStats b(android.content.Context r15) {
        /*
            r2 = 0
            r14 = 0
            c()
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r0 = r15.getSystemService(r0)
            android.os.storage.StorageManager r0 = (android.os.storage.StorageManager) r0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "PackageStatsO"
            java.lang.String r1 = "StorageManager is not available"
            java.lang.Object[] r3 = new java.lang.Object[r14]
            defpackage.cdm.a(r0, r1, r3)
            r0 = r2
        L_0x0019:
            return r0
        L_0x001a:
            java.lang.Class<android.app.usage.StorageStatsManager> r1 = android.app.usage.StorageStatsManager.class
            java.lang.Object r1 = r15.getSystemService(r1)     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            android.app.usage.StorageStatsManager r1 = (android.app.usage.StorageStatsManager) r1     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            java.lang.String r4 = r15.getPackageName()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            android.content.pm.PackageStats r3 = new android.content.pm.PackageStats     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            java.util.List r0 = r0.getStorageVolumes()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
        L_0x0033:
            boolean r0 = r5.hasNext()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r5.next()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            android.os.storage.StorageVolume r0 = (android.os.storage.StorageVolume) r0     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            java.lang.String r6 = r0.getState()     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            java.lang.String r7 = "mounted"
            boolean r6 = r6.equals(r7)     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            if (r6 == 0) goto L_0x0033
            java.util.UUID r0 = a(r0)     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            if (r0 == 0) goto L_0x0033
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            android.app.usage.StorageStats r6 = r1.queryStatsForPackage(r0, r4, r6)     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            java.util.UUID r7 = android.os.storage.StorageManager.UUID_DEFAULT     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            boolean r0 = r7.equals(r0)     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            if (r0 == 0) goto L_0x009a
            long r8 = r3.codeSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r6.getAppBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r8 + r10
            r3.codeSize = r8     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r3.dataSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r6.getDataBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r12 = r6.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r10 - r12
            long r8 = r8 + r10
            r3.dataSize = r8     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r3.cacheSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r6 = r6.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r6 = r6 + r8
            r3.cacheSize = r6     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            goto L_0x0033
        L_0x0082:
            r0 = move-exception
        L_0x0083:
            java.lang.String r6 = "PackageStatsO"
            java.lang.String r7 = "queryStatsForPackage() call failed"
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            defpackage.cdm.c(r6, r7, r0, r8)     // Catch:{ RuntimeException -> 0x008e, Error -> 0x00c1 }
            goto L_0x0033
        L_0x008e:
            r0 = move-exception
        L_0x008f:
            java.lang.String r1 = "PackageStatsO"
            java.lang.String r3 = "StorageStatsManager is not available"
            java.lang.Object[] r4 = new java.lang.Object[r14]
            defpackage.cdm.b(r1, r3, r0, r4)
            r0 = r2
            goto L_0x0019
        L_0x009a:
            long r8 = r3.externalCodeSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r6.getAppBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r8 + r10
            r3.externalCodeSize = r8     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r3.externalDataSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r6.getDataBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r12 = r6.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r10 = r10 - r12
            long r8 = r8 + r10
            r3.externalDataSize = r8     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r8 = r3.externalCacheSize     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r6 = r6.getCacheBytes()     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            long r6 = r6 + r8
            r3.externalCacheSize = r6     // Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bc, RuntimeException -> 0x00c3, Error -> 0x00c1 }
            goto L_0x0033
        L_0x00bc:
            r0 = move-exception
            goto L_0x0083
        L_0x00be:
            r0 = r3
            goto L_0x0019
        L_0x00c1:
            r0 = move-exception
            goto L_0x008f
        L_0x00c3:
            r0 = move-exception
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cky.b(android.content.Context):android.content.pm.PackageStats");
    }

    private static java.util.UUID a(android.os.storage.StorageVolume storageVolume) {
        java.lang.String uuid = storageVolume.getUuid();
        try {
            defpackage.cdm.a(3, "PackageStatsO", "UUID for %s", uuid);
            return uuid == null ? android.os.storage.StorageManager.UUID_DEFAULT : java.util.UUID.fromString(uuid);
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.cdm.a("PackageStatsO", "Invalid UUID format: '%s'", uuid);
            return null;
        }
    }

    public static defpackage.edf a(java.lang.String str, android.content.Context context) {
        defpackage.edf edf = new defpackage.edf();
        edf.a = java.lang.Long.valueOf(android.os.Process.getElapsedCpuTime());
        edf.b = java.lang.Boolean.valueOf(defpackage.cnx.b(context));
        edf.c = java.lang.Integer.valueOf(java.lang.Thread.activeCount());
        if (str != null) {
            edf.d = str;
        }
        return edf;
    }

    public static java.lang.Long c(android.content.Context context) {
        java.lang.Object obj;
        try {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong(context.getResources().getString(2131951806)));
            } catch (java.lang.NumberFormatException e) {
                java.lang.String str = "PrimesVersion";
                java.lang.String str2 = "Couldn't parse Primes version number from ";
                java.lang.String valueOf = java.lang.String.valueOf(obj);
                defpackage.cdm.a(5, str, valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2), new java.lang.Object[0]);
                return null;
            }
        } catch (android.content.res.Resources.NotFoundException e2) {
            defpackage.cdm.a(5, "PrimesVersion", "Primes version number string not found", new java.lang.Object[0]);
        }
    }

    public static defpackage.cpc a(android.view.View view, defpackage.cpc cpc) {
        if (view instanceof defpackage.cpf) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(view.getClass().getName()).concat(" implements VisualElementProvider; this metadata should be added to the result of VisualElementProvider.getVisualElement()."));
        }
        view.setTag(2131755012, cpc);
        return cpc;
    }

    public static defpackage.cpc a(android.view.View view) {
        if (view instanceof defpackage.cpf) {
            return ((defpackage.cpf) view).a();
        }
        return (defpackage.cpc) view.getTag(2131755012);
    }

    public static boolean b(android.view.View view) {
        return a(view) != null;
    }

    public static void a(android.app.Activity activity, defpackage.cpg cpg) {
        a(activity.findViewById(16908290), new defpackage.cpc(cpg));
    }

    public static java.util.ArrayList a(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("\n");
        java.util.ArrayList arrayList = new java.util.ArrayList(split.length);
        for (java.lang.String str3 : split) {
            int indexOf = str3.indexOf(32);
            java.lang.String[] split2 = str3.substring(0, indexOf).split(":");
            boolean z = split2.length == 2 && indexOf > 0;
            java.lang.String str4 = "Invalid license meta-data line:\n";
            java.lang.String valueOf = java.lang.String.valueOf(str3);
            b(z, (java.lang.Object) valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
            arrayList.add(new defpackage.cpq(str3.substring(indexOf + 1), java.lang.Long.parseLong(split2[0]), java.lang.Integer.parseInt(split2[1]), str2));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, long j, int i) {
        android.content.res.Resources resources = context.getApplicationContext().getResources();
        return a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(2131755014))), j, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d A[SYNTHETIC, Splitter:B:21:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6, java.lang.String r7, long r8, int r10) {
        /*
            r0 = 0
            java.util.jar.JarFile r1 = new java.util.jar.JarFile     // Catch:{ IOException -> 0x001e, all -> 0x0035 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x001e, all -> 0x0035 }
            java.util.jar.JarEntry r2 = r1.getJarEntry(r6)     // Catch:{ IOException -> 0x003a }
            if (r2 != 0) goto L_0x0010
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x000f:
            return r0
        L_0x0010:
            java.io.InputStream r0 = r1.getInputStream(r2)     // Catch:{ IOException -> 0x003a }
            java.lang.String r0 = a(r0, r8, r10)     // Catch:{ IOException -> 0x003a }
            r1.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x000f
        L_0x001c:
            r1 = move-exception
            goto L_0x000f
        L_0x001e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0022:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Failed to read license text."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002a }
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0030:
            throw r0
        L_0x0031:
            r1 = move-exception
            goto L_0x000f
        L_0x0033:
            r1 = move-exception
            goto L_0x0030
        L_0x0035:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x002b
        L_0x003a:
            r0 = move-exception
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cky.a(java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    private static java.lang.String a(java.io.InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, java.lang.Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (java.io.UnsupportedEncodingException e) {
                throw new java.lang.RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static void a(java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        java.nio.channels.FileChannel channel = new java.io.RandomAccessFile(str, "rw").getChannel();
        try {
            channel.write(byteBuffer);
            byteBuffer.position(0);
        } finally {
            channel.close();
        }
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int a(java.lang.Object obj, int i) {
        return (obj == null ? 0 : obj.hashCode()) + (i * 31);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void a(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void b(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }

    public static java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException();
    }

    public static java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(java.lang.String.valueOf(obj2));
    }

    public static int a(int i, int i2) {
        java.lang.String a2;
        java.lang.String str = "index";
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a2 = a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("negative size: " + i2);
        } else {
            a2 = a("%s (%s) must be less than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(a2);
    }

    public static java.lang.String a(java.lang.String str, java.lang.Object... objArr) {
        int i = 0;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            sb.append(valueOf.substring(i2, indexOf));
            int i3 = i + 1;
            sb.append(objArr[i]);
            int i4 = i3;
            i2 = indexOf + 2;
            i = i4;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            int i5 = i + 1;
            sb.append(objArr[i]);
            while (true) {
                int i6 = i5;
                if (i6 >= objArr.length) {
                    break;
                }
                sb.append(", ");
                i5 = i6 + 1;
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean a() {
        if (a == null) {
            a = android.os.Looper.getMainLooper().getThread();
        }
        return java.lang.Thread.currentThread() == a;
    }

    public static void b() {
        if (!a()) {
            throw new java.lang.RuntimeException("Must be called on the UI thread");
        }
    }

    public static void c() {
        if (a()) {
            throw new java.lang.RuntimeException("Must be called on a background thread");
        }
    }

    public static android.os.Handler d() {
        if (b == null) {
            b = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        return b;
    }

    public static void a(java.lang.Runnable runnable) {
        d().post(runnable);
    }

    public static java.lang.String b(java.lang.String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return java.lang.String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static defpackage.crs b(java.lang.Object obj) {
        return new defpackage.crs(obj.getClass().getSimpleName());
    }

    public static void a(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new defpackage.csg(defpackage.cld.a(str, obj));
        }
    }

    public static void c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            java.lang.String valueOf = java.lang.String.valueOf(obj2);
            throw new java.lang.NullPointerException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 24).append("null key in entry: null=").append(valueOf).toString());
        } else if (obj2 == null) {
            java.lang.String valueOf2 = java.lang.String.valueOf(obj);
            throw new java.lang.NullPointerException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 26).append("null value in entry: ").append(valueOf2).append("=null").toString());
        }
    }

    public static int a(int i, java.lang.String str) {
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 40).append(str).append(" cannot be negative but was: ").append(i).toString());
    }

    public static int a(int i) {
        return (int) (461845907 * ((long) java.lang.Integer.rotateLeft((int) (((long) i) * -862048943), 15)));
    }

    public static boolean a(java.util.Collection collection, java.util.Iterator it) {
        defpackage.cld.a((java.lang.Object) collection);
        defpackage.cld.a((java.lang.Object) it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static java.util.ArrayList a(java.lang.Iterable iterable) {
        defpackage.cld.a((java.lang.Object) iterable);
        if (iterable instanceof java.util.Collection) {
            return new java.util.ArrayList((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a((java.util.Collection) arrayList, it);
        return arrayList;
    }

    public static java.util.ArrayList b(int i) {
        a(i, "arraySize");
        return new java.util.ArrayList(defpackage.cub.a(5 + ((long) i) + ((long) (i / 10))));
    }

    public static java.lang.Object[] a(java.lang.Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            b(objArr[i], i);
        }
        return objArr;
    }

    public static java.lang.Object b(java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index " + i);
    }

    public static int a(java.util.Set set) {
        int i;
        int i2 = 0;
        for (java.lang.Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    public static boolean a(java.util.Set set, java.lang.Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set2 = (java.util.Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException e) {
            return false;
        }
    }
}
