package com.google.android.apps.tasks.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.google.android.apps.tasks.R;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
public class TaskApplication extends dmo implements ajg {
    private static TaskApplication g;
    public cyl a = cub.a(Executors.newFixedThreadPool(5, ajd.c("shared-pool-%d")));
    public czq b;
    public boolean c;
    public cdj d;
    public cdw e;
    private akp h;
    private final cym i;

    public TaskApplication() {
        super((byte) 0);
        cym cyo;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ajd.c("scheduler-%d"));
        if (newSingleThreadScheduledExecutor instanceof cym) {
            cyo = (cym) newSingleThreadScheduledExecutor;
        } else {
            cyo = new cyo(newSingleThreadScheduledExecutor);
        }
        this.i = cyo;
        this.c = false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dmo
    public final dmm a() {
        aiv aiv = new aiv();
        aiv.a = (aii) dgv.a(new aii(this));
        aiv.d = (cdz) dgv.a(new cdz());
        if (aiv.a == null) {
            throw new IllegalStateException(String.valueOf(aii.class.getCanonicalName()).concat(" must be set"));
        }
        if (aiv.b == null) {
            aiv.b = new brf();
        }
        if (aiv.c == null) {
            aiv.c = new bwj();
        }
        if (aiv.d != null) {
            return new ait(aiv);
        }
        throw new IllegalStateException(String.valueOf(cdz.class.getCanonicalName()).concat(" must be set"));
    }

    public static TaskApplication b() {
        if (g != null) {
            return g;
        }
        throw new RuntimeException("Application not yet created (onCreate not yet called)");
    }

    @Override // defpackage.dmo
    public void onCreate() {
        boolean z;
        super.onCreate();
        g = this;
        aiw.a(this);
        crv a2 = ako.a();
        if (a2.a()) {
            this.h = (akp) a2.b();
            cjg a3 = cjg.a(cjn.a(this, new cjw(this.h, new coi(this, new bqn((byte) 0), new bqy(), new bqk(), "TASKS_ANDROID_PRIMES"), this)));
            a3.a.d();
            a3.a.e();
        }
        crv a4 = ajt.a();
        if (a4.a()) {
            ((ajy) a4.b()).a(this, this.a);
        }
        if (!(any.a != null)) {
            if (any.a == null) {
                z = true;
            } else {
                z = false;
            }
            cld.b(z);
            any.a = new any(getApplicationContext(), c(), cub.a(Executors.newFixedThreadPool(5, ajd.c("slow-pool-%d"))), d(), new aoa(getApplicationContext(), d()));
        } else {
            azb.b("SyncEngineProvider already initialized. This should only be possible in tests.", new Object[0]);
        }
        aka.a().b();
        alj.a().b();
        cyl cyl = this.a;
        cym cym = this.i;
        any a5 = any.a();
        bxy bxy = new bxy();
        if (this == null) {
            throw new NullPointerException("Null context");
        }
        bxy.a = this;
        bud bud = new bud((byte) 0);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
        if (sb == null) {
            throw new NullPointerException("Null deviceName");
        }
        bud.e = sb;
        Long l = btj.a;
        if (l == null) {
            throw new NullPointerException("Null registrationStalenessTimeMs");
        }
        bud.f = l;
        bud.g = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
        bud.h = false;
        bud.b = "1000131241323";
        bud.a = "tasks";
        bue bue = bue.PRODUCTION;
        if (bue == null) {
            throw new NullPointerException("Null environment");
        }
        bud.c = bue;
        if (111000000 == null) {
            throw new NullPointerException("Null jobSchedulerAllowedIDsRange");
        }
        bud.i = 111000000;
        bug bug = new bug();
        bug.c = true;
        bug.d = true;
        bug.e = true;
        bug.f = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
        bug.g = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
        Integer valueOf = Integer.valueOf((int) R.drawable.quantum_ic_check_circle_white_48);
        if (valueOf == null) {
            throw new NullPointerException("Null iconResourceId");
        }
        bug.a = valueOf;
        Integer valueOf2 = Integer.valueOf((int) R.string.app_name);
        if (valueOf2 == null) {
            throw new NullPointerException("Null appNameResourceId");
        }
        bug.b = valueOf2;
        bug.h = getString(R.string.notification_channel_default);
        String str3 = "";
        if (bug.a == null) {
            str3 = String.valueOf(str3).concat(" iconResourceId");
        }
        if (bug.b == null) {
            str3 = String.valueOf(str3).concat(" appNameResourceId");
        }
        if (bug.c == null) {
            str3 = String.valueOf(str3).concat(" soundEnabled");
        }
        if (bug.d == null) {
            str3 = String.valueOf(str3).concat(" vibrationEnabled");
        }
        if (bug.e == null) {
            str3 = String.valueOf(str3).concat(" lightsEnabled");
        }
        if (!str3.isEmpty()) {
            String valueOf3 = String.valueOf(str3);
            throw new IllegalStateException(valueOf3.length() != 0 ? "Missing required properties:".concat(valueOf3) : new String("Missing required properties:"));
        }
        bud.d = new bub(bug.a, bug.b, bug.c.booleanValue(), bug.d.booleanValue(), bug.e.booleanValue(), bug.f, bug.g, bug.h);
        String str4 = "";
        if (bud.a == null) {
            str4 = String.valueOf(str4).concat(" clientId");
        }
        if (bud.b == null) {
            str4 = String.valueOf(str4).concat(" gcmSenderProjectId");
        }
        if (bud.c == null) {
            str4 = String.valueOf(str4).concat(" environment");
        }
        if (bud.e == null) {
            str4 = String.valueOf(str4).concat(" deviceName");
        }
        if (bud.f == null) {
            str4 = String.valueOf(str4).concat(" registrationStalenessTimeMs");
        }
        if (bud.h == null) {
            str4 = String.valueOf(str4).concat(" tracingEnabled");
        }
        if (bud.i == null) {
            str4 = String.valueOf(str4).concat(" jobSchedulerAllowedIDsRange");
        }
        if (!str4.isEmpty()) {
            String valueOf4 = String.valueOf(str4);
            throw new IllegalStateException(valueOf4.length() != 0 ? "Missing required properties:".concat(valueOf4) : new String("Missing required properties:"));
        }
        bxy.b = new bua(bud.a, bud.b, bud.c, bud.d, bud.e, bud.f, bud.g, bud.h.booleanValue(), bud.i);
        String str5 = "";
        if (bxy.a == null) {
            str5 = String.valueOf(str5).concat(" context");
        }
        if (bxy.b == null) {
            str5 = String.valueOf(str5).concat(" chimeConfig");
        }
        if (!str5.isEmpty()) {
            String valueOf5 = String.valueOf(str5);
            throw new IllegalStateException(valueOf5.length() != 0 ? "Missing required properties:".concat(valueOf5) : new String("Missing required properties:"));
        }
        bwj.a(new bxw(bxy.a, bxy.b));
        akf a6 = akf.a();
        a6.a = cym;
        a6.b = a5;
        cyl.execute(new akb(this));
    }

    @Override // defpackage.ajg
    public final cyl c() {
        return this.a;
    }

    @Override // defpackage.ajg
    public final cym d() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        IOException[] iOExceptionArr;
        super.attachBaseContext(context);
        if (!hx.b) {
            try {
                ApplicationInfo a2 = hx.a(this);
                if (a2 != null) {
                    synchronized (hx.a) {
                        String str = a2.sourceDir;
                        if (!hx.a.contains(str)) {
                            hx.a.add(str);
                            if (Build.VERSION.SDK_INT > 20) {
                                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                            }
                            try {
                                ClassLoader classLoader = getClassLoader();
                                if (classLoader == null) {
                                    Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                                    return;
                                }
                                try {
                                    File file = new File(getFilesDir(), "secondary-dexes");
                                    if (file.isDirectory()) {
                                        new StringBuilder("Clearing old secondary dex dir (").append(file.getPath()).append(").");
                                        File[] listFiles = file.listFiles();
                                        if (listFiles == null) {
                                            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                                        } else {
                                            for (File file2 : listFiles) {
                                                new StringBuilder("Trying to delete old file ").append(file2.getPath()).append(" of size ").append(file2.length());
                                                if (!file2.delete()) {
                                                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                                                } else {
                                                    new StringBuilder("Deleted old file ").append(file2.getPath());
                                                }
                                            }
                                            if (!file.delete()) {
                                                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
                                            } else {
                                                new StringBuilder("Deleted old secondary dex dir ").append(file.getPath());
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                                }
                                File a3 = hx.a(this, a2);
                                List a4 = gm.a(this, a2, a3);
                                if (!a4.isEmpty()) {
                                    if (Build.VERSION.SDK_INT >= 19) {
                                        Object obj = hx.a(classLoader, "pathList").get(classLoader);
                                        ArrayList arrayList = new ArrayList();
                                        hx.a(obj, "dexElements", (Object[]) hx.a(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new ArrayList(a4), a3, arrayList));
                                        if (arrayList.size() > 0) {
                                            ArrayList arrayList2 = arrayList;
                                            int size = arrayList2.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj2 = arrayList2.get(i2);
                                                i2++;
                                                Log.w("MultiDex", "Exception in makeDexElement", (IOException) obj2);
                                            }
                                            Field a5 = hx.a(obj, "dexElementsSuppressedExceptions");
                                            IOException[] iOExceptionArr2 = (IOException[]) a5.get(obj);
                                            if (iOExceptionArr2 == null) {
                                                iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                                            } else {
                                                IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                                                arrayList.toArray(iOExceptionArr3);
                                                System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                                                iOExceptionArr = iOExceptionArr3;
                                            }
                                            a5.set(obj, iOExceptionArr);
                                        }
                                    } else {
                                        Object obj3 = hx.a(classLoader, "pathList").get(classLoader);
                                        hx.a(obj3, "dexElements", (Object[]) hx.a(obj3, "makeDexElements", ArrayList.class, File.class).invoke(obj3, new ArrayList(a4), a3));
                                    }
                                }
                            } catch (RuntimeException e2) {
                                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e2);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                Log.e("MultiDex", "Multidex installation failure", e3);
                throw new RuntimeException("Multi dex installation failed (" + e3.getMessage() + ").");
            }
        }
    }
}
