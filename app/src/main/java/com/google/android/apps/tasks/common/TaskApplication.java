package com.google.android.apps.tasks.common;

import java.util.concurrent.Executors;

/* compiled from: PG */
public class TaskApplication extends defpackage.dmo implements defpackage.ajg {
    private static TaskApplication g;
    public defpackage.cyl executor = defpackage.cub.a(Executors.newFixedThreadPool(5, defpackage.ajd.c("shared-pool-%d")));
    public defpackage.czq b;
    public boolean c = false;
    public defpackage.cdj d;
    public defpackage.cdw e;
    private defpackage.akp h;
    private final defpackage.cym i;

    public TaskApplication() {
        super(0);
        defpackage.cym cyo;
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(defpackage.ajd.c("scheduler-%d"));
        if (newSingleThreadScheduledExecutor instanceof defpackage.cym) {
            cyo = (defpackage.cym) newSingleThreadScheduledExecutor;
        } else {
            cyo = new defpackage.cyo(newSingleThreadScheduledExecutor);
        }
        this.i = cyo;
    }

    /* access modifiers changed from: protected */
    public final defpackage.dmm a() {
        defpackage.aiv aiv = new defpackage.aiv();
        aiv.a = (defpackage.aii) defpackage.dgv.a(new defpackage.aii(this));
        aiv.d = (defpackage.cdz) defpackage.dgv.a(new defpackage.cdz());
        if (aiv.a == null) {
            throw new java.lang.IllegalStateException(defpackage.aii.class.getCanonicalName().concat(" must be set"));
        }
        if (aiv.b == null) {
            aiv.b = new defpackage.brf();
        }
        if (aiv.c == null) {
            aiv.c = new defpackage.bwj();
        }
        if (aiv.d != null) {
            return new defpackage.ait(aiv);
        }
        throw new java.lang.IllegalStateException(defpackage.cdz.class.getCanonicalName().concat(" must be set"));
    }

    public static TaskApplication getApplication() {
        if (g != null) {
            return g;
        }
        throw new java.lang.RuntimeException("Application not yet created (onCreate not yet called)");
    }

    public void onCreate() {
        boolean z;
        super.onCreate();
        g = this;
        defpackage.aiw.a(this);
        defpackage.crv a2 = defpackage.ako.a();
        if (a2.a()) {
            this.h = (defpackage.akp) a2.b();
            defpackage.cjg a3 = defpackage.cjg.a(defpackage.cjn.a(this, new defpackage.cjw(this.h, new defpackage.coi(this, new defpackage.bqn(0), new defpackage.bqy(), new defpackage.bqk(), "TASKS_ANDROID_PRIMES"), this)));
            a3.a.d();
            a3.a.e();
        }
        defpackage.crv a4 = defpackage.ajt.a();
        if (a4.a()) {
            ((defpackage.ajy) a4.b()).a(this, this.executor);
        }
        if (!(defpackage.any.a != null)) {
            z = defpackage.any.a == null;
            defpackage.cld.b(z);
            defpackage.any.a = new defpackage.any(getApplicationContext(), c(), defpackage.cub.a(Executors.newFixedThreadPool(5, defpackage.ajd.c("slow-pool-%d"))), d(), new defpackage.aoa(getApplicationContext(), d()));
        } else {
            defpackage.azb.b("SyncEngineProvider already initialized. This should only be possible in tests.", new java.lang.Object[0]);
        }
        defpackage.aka.a().b();
        defpackage.alj.a().b();
        java.lang.String str = "1000131241323";
        defpackage.cyl cyl = this.executor;
        defpackage.cym cym = this.i;
        defpackage.any a5 = defpackage.any.get();
        defpackage.bxy bxy = new defpackage.bxy();
        if (this == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        bxy.a = this;
        defpackage.bud bud = new defpackage.bud(0);
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        java.lang.String str3 = android.os.Build.MODEL;
        java.lang.String sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str3).length()).append(str2).append(" ").append(str3).toString();
        if (sb == null) {
            throw new java.lang.NullPointerException("Null deviceName");
        }
        bud.e = sb;
        java.lang.Long l = defpackage.btj.a;
        if (l == null) {
            throw new java.lang.NullPointerException("Null registrationStalenessTimeMs");
        }
        bud.f = l;
        bud.g = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        bud.h = java.lang.Boolean.valueOf(false);
        bud.b = str;
        bud.a = "tasks";
        defpackage.bue bue = defpackage.bue.PRODUCTION;
        if (bue == null) {
            throw new java.lang.NullPointerException("Null environment");
        }
        bud.c = bue;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(111000000);
        if (valueOf == null) {
            throw new java.lang.NullPointerException("Null jobSchedulerAllowedIDsRange");
        }
        bud.i = valueOf;
        defpackage.bug bug = new defpackage.bug();
        bug.c = java.lang.Boolean.valueOf(true);
        bug.d = java.lang.Boolean.valueOf(true);
        bug.e = java.lang.Boolean.valueOf(true);
        bug.f = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        bug.g = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(2130837663);
        if (valueOf2 == null) {
            throw new java.lang.NullPointerException("Null iconResourceId");
        }
        bug.a = valueOf2;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(2131951686);
        if (valueOf3 == null) {
            throw new java.lang.NullPointerException("Null appNameResourceId");
        }
        bug.b = valueOf3;
        bug.h = getString(2131951763);
        java.lang.String str4 = "";
        if (bug.a == null) {
            str4 = str4.concat(" iconResourceId");
        }
        if (bug.b == null) {
            str4 = str4.concat(" appNameResourceId");
        }
        if (bug.c == null) {
            str4 = str4.concat(" soundEnabled");
        }
        if (bug.d == null) {
            str4 = str4.concat(" vibrationEnabled");
        }
        if (bug.e == null) {
            str4 = str4.concat(" lightsEnabled");
        }
        if (!str4.isEmpty()) {
            java.lang.String str5 = "Missing required properties:";
            java.lang.String valueOf4 = str4;
            throw new java.lang.IllegalStateException(valueOf4.length() != 0 ? str5.concat(valueOf4) : str5);
        }
        bud.d = new defpackage.bub(bug.a, bug.b, bug.c.booleanValue(), bug.d.booleanValue(), bug.e.booleanValue(), bug.f, bug.g, bug.h);
        java.lang.String str6 = "";
        if (bud.a == null) {
            str6 = str6.concat(" clientId");
        }
        if (bud.b == null) {
            str6 = str6.concat(" gcmSenderProjectId");
        }
        if (bud.c == null) {
            str6 = str6.concat(" environment");
        }
        if (bud.e == null) {
            str6 = str6.concat(" deviceName");
        }
        if (bud.f == null) {
            str6 = str6.concat(" registrationStalenessTimeMs");
        }
        if (bud.h == null) {
            str6 = str6.concat(" tracingEnabled");
        }
        if (bud.i == null) {
            str6 = str6.concat(" jobSchedulerAllowedIDsRange");
        }
        if (!str6.isEmpty()) {
            java.lang.String str7 = "Missing required properties:";
            java.lang.String valueOf5 = str6;
            throw new java.lang.IllegalStateException(valueOf5.length() != 0 ? str7.concat(valueOf5) : str7);
        }
        bxy.b = new defpackage.bua(bud.a, bud.b, bud.c, bud.d, bud.e, bud.f, bud.g, bud.h.booleanValue(), bud.i);
        java.lang.String str8 = "";
        if (bxy.a == null) {
            str8 = str8.concat(" context");
        }
        if (bxy.b == null) {
            str8 = str8.concat(" chimeConfig");
        }
        if (!str8.isEmpty()) {
            java.lang.String str9 = "Missing required properties:";
            java.lang.String valueOf6 = str8;
            throw new java.lang.IllegalStateException(valueOf6.length() != 0 ? str9.concat(valueOf6) : str9);
        }
        defpackage.bwj.a(new defpackage.bxw(bxy.a, bxy.b));
        defpackage.akf a6 = defpackage.akf.a();
        a6.a = cym;
        a6.b = a5;
        cyl.execute(new defpackage.akb(this));
    }

    public final defpackage.cyl c() {
        return this.executor;
    }

    public final defpackage.cym d() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachBaseContext(android.content.Context r15) {
        /*
            r14 = this;
            r4 = 0
            super.attachBaseContext(r15)
            boolean r2 = defpackage.hx.b
            if (r2 != 0) goto L_0x000e
            android.content.pm.ApplicationInfo r3 = defpackage.hx.a(r14)     // Catch:{ Exception -> 0x0021 }
            if (r3 != 0) goto L_0x000f
        L_0x000e:
            return
        L_0x000f:
            java.util.Set r6 = defpackage.hx.a     // Catch:{ Exception -> 0x0021 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r2 = r3.sourceDir     // Catch:{ all -> 0x001e }
            java.util.Set r5 = defpackage.hx.a     // Catch:{ all -> 0x001e }
            boolean r5 = r5.contains(r2)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x0048
            monitor-exit(r6)     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x001e:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x001e }
            throw r2     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Multidex installation failure"
            android.util.Log.e(r3, r4, r2)
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Multi dex installation failed ("
            r4.<init>(r5)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ")."
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x0048:
            java.util.Set r5 = defpackage.hx.a     // Catch:{ all -> 0x001e }
            r5.add(r2)     // Catch:{ all -> 0x001e }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001e }
            r5 = 20
            if (r2 <= r5) goto L_0x007f
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x001e }
            java.lang.String r7 = "MultiDex is not guaranteed to work in SDK version "
            r5.<init>(r7)     // Catch:{ all -> 0x001e }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001e }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r7 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\""
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r7 = "java.vm.version"
            java.lang.String r7 = java.lang.System.getProperty(r7)     // Catch:{ all -> 0x001e }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r7 = "\""
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x001e }
            android.util.Log.w(r2, r5)     // Catch:{ all -> 0x001e }
        L_0x007f:
            java.lang.ClassLoader r5 = r14.getClassLoader()     // Catch:{ RuntimeException -> 0x008e }
            if (r5 != 0) goto L_0x0099
            java.lang.String r2 = "MultiDex"
            java.lang.String r3 = "Context class loader is null. Must be running in test mode. Skip patching."
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x001e }
            monitor-exit(r6)     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x008e:
            r2 = move-exception
            java.lang.String r3 = "MultiDex"
            java.lang.String r4 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching."
            android.util.Log.w(r3, r4, r2)     // Catch:{ all -> 0x001e }
            monitor-exit(r6)     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x0099:
            java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x01ac }
            java.io.File r2 = r14.getFilesDir()     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = "secondary-dexes"
            r7.<init>(r2, r8)     // Catch:{ Throwable -> 0x01ac }
            boolean r2 = r7.isDirectory()     // Catch:{ Throwable -> 0x01ac }
            if (r2 == 0) goto L_0x00e2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = "Clearing old secondary dex dir ("
            r2.<init>(r8)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = r7.getPath()     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r2 = r2.append(r8)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = ")."
            r2.append(r8)     // Catch:{ Throwable -> 0x01ac }
            java.io.File[] r8 = r7.listFiles()     // Catch:{ Throwable -> 0x01ac }
            if (r8 != 0) goto L_0x015a
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r9 = "Failed to list secondary dex dir content ("
            r8.<init>(r9)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r7 = r7.getPath()     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = ")."
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01ac }
            android.util.Log.w(r2, r7)     // Catch:{ Throwable -> 0x01ac }
        L_0x00e2:
            java.io.File r2 = defpackage.hx.a(r14, r3)     // Catch:{ all -> 0x001e }
            java.util.List r7 = defpackage.gm.a(r14, r3, r2)     // Catch:{ all -> 0x001e }
            boolean r3 = r7.isEmpty()     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0203
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001e }
            r8 = 19
            if (r3 < r8) goto L_0x021c
            java.lang.String r3 = "pathList"
            java.lang.reflect.Field r3 = defpackage.hx.a(r5, r3)     // Catch:{ all -> 0x001e }
            java.lang.Object r8 = r3.get(r5)     // Catch:{ all -> 0x001e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x001e }
            r3.<init>()     // Catch:{ all -> 0x001e }
            java.lang.String r5 = "dexElements"
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x001e }
            r9.<init>(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r7 = "makeDexElements"
            r10 = 3
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ all -> 0x001e }
            r11 = 0
            java.lang.Class<java.util.ArrayList> r12 = java.util.ArrayList.class
            r10[r11] = r12     // Catch:{ all -> 0x001e }
            r11 = 1
            java.lang.Class<java.io.File> r12 = java.io.File.class
            r10[r11] = r12     // Catch:{ all -> 0x001e }
            r11 = 2
            java.lang.Class<java.util.ArrayList> r12 = java.util.ArrayList.class
            r10[r11] = r12     // Catch:{ all -> 0x001e }
            java.lang.reflect.Method r7 = defpackage.hx.a(r8, r7, r10)     // Catch:{ all -> 0x001e }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x001e }
            r11 = 0
            r10[r11] = r9     // Catch:{ all -> 0x001e }
            r9 = 1
            r10[r9] = r2     // Catch:{ all -> 0x001e }
            r2 = 2
            r10[r2] = r3     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = r7.invoke(r8, r10)     // Catch:{ all -> 0x001e }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x001e }
            defpackage.hx.a(r8, r5, r2)     // Catch:{ all -> 0x001e }
            int r2 = r3.size()     // Catch:{ all -> 0x001e }
            if (r2 <= 0) goto L_0x0203
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x001e }
            r2 = r0
            int r7 = r2.size()     // Catch:{ all -> 0x001e }
            r5 = r4
        L_0x0148:
            if (r5 >= r7) goto L_0x01e6
            java.lang.Object r4 = r2.get(r5)     // Catch:{ all -> 0x001e }
            int r5 = r5 + 1
            java.io.IOException r4 = (java.io.IOException) r4     // Catch:{ all -> 0x001e }
            java.lang.String r9 = "MultiDex"
            java.lang.String r10 = "Exception in makeDexElement"
            android.util.Log.w(r9, r10, r4)     // Catch:{ all -> 0x001e }
            goto L_0x0148
        L_0x015a:
            int r9 = r8.length     // Catch:{ Throwable -> 0x01ac }
            r2 = r4
        L_0x015c:
            if (r2 >= r9) goto L_0x01b6
            r10 = r8[r2]     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r12 = "Trying to delete old file "
            r11.<init>(r12)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r12 = r10.getPath()     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r12 = " of size "
            java.lang.StringBuilder r11 = r11.append(r12)     // Catch:{ Throwable -> 0x01ac }
            long r12 = r10.length()     // Catch:{ Throwable -> 0x01ac }
            r11.append(r12)     // Catch:{ Throwable -> 0x01ac }
            boolean r11 = r10.delete()     // Catch:{ Throwable -> 0x01ac }
            if (r11 != 0) goto L_0x019d
            java.lang.String r11 = "MultiDex"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r13 = "Failed to delete old file "
            r12.<init>(r13)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r10 = r10.getPath()     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r10 = r12.append(r10)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r10 = r10.toString()     // Catch:{ Throwable -> 0x01ac }
            android.util.Log.w(r11, r10)     // Catch:{ Throwable -> 0x01ac }
        L_0x019a:
            int r2 = r2 + 1
            goto L_0x015c
        L_0x019d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r12 = "Deleted old file "
            r11.<init>(r12)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r10 = r10.getPath()     // Catch:{ Throwable -> 0x01ac }
            r11.append(r10)     // Catch:{ Throwable -> 0x01ac }
            goto L_0x019a
        L_0x01ac:
            r2 = move-exception
            java.lang.String r7 = "MultiDex"
            java.lang.String r8 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning."
            android.util.Log.w(r7, r8, r2)     // Catch:{ all -> 0x001e }
            goto L_0x00e2
        L_0x01b6:
            boolean r2 = r7.delete()     // Catch:{ Throwable -> 0x01ac }
            if (r2 != 0) goto L_0x01d6
            java.lang.String r2 = "MultiDex"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r9 = "Failed to delete secondary dex dir "
            r8.<init>(r9)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r7 = r7.getPath()     // Catch:{ Throwable -> 0x01ac }
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x01ac }
            android.util.Log.w(r2, r7)     // Catch:{ Throwable -> 0x01ac }
            goto L_0x00e2
        L_0x01d6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r8 = "Deleted old secondary dex dir "
            r2.<init>(r8)     // Catch:{ Throwable -> 0x01ac }
            java.lang.String r7 = r7.getPath()     // Catch:{ Throwable -> 0x01ac }
            r2.append(r7)     // Catch:{ Throwable -> 0x01ac }
            goto L_0x00e2
        L_0x01e6:
            java.lang.String r2 = "dexElementsSuppressedExceptions"
            java.lang.reflect.Field r5 = defpackage.hx.a(r8, r2)     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = r5.get(r8)     // Catch:{ all -> 0x001e }
            java.io.IOException[] r2 = (java.io.IOException[]) r2     // Catch:{ all -> 0x001e }
            if (r2 != 0) goto L_0x0206
            int r2 = r3.size()     // Catch:{ all -> 0x001e }
            java.io.IOException[] r2 = new java.io.IOException[r2]     // Catch:{ all -> 0x001e }
            java.lang.Object[] r2 = r3.toArray(r2)     // Catch:{ all -> 0x001e }
            java.io.IOException[] r2 = (java.io.IOException[]) r2     // Catch:{ all -> 0x001e }
        L_0x0200:
            r5.set(r8, r2)     // Catch:{ all -> 0x001e }
        L_0x0203:
            monitor-exit(r6)     // Catch:{ all -> 0x001e }
            goto L_0x000e
        L_0x0206:
            int r4 = r3.size()     // Catch:{ all -> 0x001e }
            int r7 = r2.length     // Catch:{ all -> 0x001e }
            int r4 = r4 + r7
            java.io.IOException[] r4 = new java.io.IOException[r4]     // Catch:{ all -> 0x001e }
            r3.toArray(r4)     // Catch:{ all -> 0x001e }
            r7 = 0
            int r3 = r3.size()     // Catch:{ all -> 0x001e }
            int r9 = r2.length     // Catch:{ all -> 0x001e }
            java.lang.System.arraycopy(r2, r7, r4, r3, r9)     // Catch:{ all -> 0x001e }
            r2 = r4
            goto L_0x0200
        L_0x021c:
            java.lang.String r3 = "pathList"
            java.lang.reflect.Field r3 = defpackage.hx.a(r5, r3)     // Catch:{ all -> 0x001e }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r4 = "dexElements"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x001e }
            r5.<init>(r7)     // Catch:{ all -> 0x001e }
            java.lang.String r7 = "makeDexElements"
            r8 = 2
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x001e }
            r9 = 0
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            r8[r9] = r10     // Catch:{ all -> 0x001e }
            r9 = 1
            java.lang.Class<java.io.File> r10 = java.io.File.class
            r8[r9] = r10     // Catch:{ all -> 0x001e }
            java.lang.reflect.Method r7 = defpackage.hx.a(r3, r7, r8)     // Catch:{ all -> 0x001e }
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x001e }
            r9 = 0
            r8[r9] = r5     // Catch:{ all -> 0x001e }
            r5 = 1
            r8[r5] = r2     // Catch:{ all -> 0x001e }
            java.lang.Object r2 = r7.invoke(r3, r8)     // Catch:{ all -> 0x001e }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x001e }
            defpackage.hx.a(r3, r4, r2)     // Catch:{ all -> 0x001e }
            goto L_0x0203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.tasks.common.TaskApplication.attachBaseContext(android.content.Context):void");
    }
}
