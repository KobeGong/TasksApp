package defpackage;

/* renamed from: cnt reason: default package */
/* compiled from: PG */
public final class cnt {
    private static volatile boolean a;
    private static java.lang.reflect.Method b;

    private static java.lang.reflect.Method a() {
        if (!a) {
            synchronized (defpackage.cnt.class) {
                if (!a) {
                    try {
                        b = android.os.Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", new java.lang.Class[]{java.lang.Integer.TYPE});
                    } catch (java.lang.NoSuchMethodException e) {
                        defpackage.cdm.a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", (java.lang.Throwable) e, new java.lang.Object[0]);
                    } catch (java.lang.Error | java.lang.Exception e2) {
                        defpackage.cdm.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new java.lang.Object[0]);
                    }
                    a = true;
                }
            }
        }
        return b;
    }

    private static int a(android.os.Debug.MemoryInfo memoryInfo) {
        java.lang.reflect.Method a2 = a();
        if (a2 != null) {
            try {
                return ((java.lang.Integer) a2.invoke(memoryInfo, new java.lang.Object[]{java.lang.Integer.valueOf(14)})).intValue();
            } catch (java.lang.Error | java.lang.Exception e) {
                b = null;
                defpackage.cdm.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new java.lang.Object[0]);
            }
        }
        return -1;
    }

    private cnt() {
    }

    public static defpackage.een a(int i, int i2, java.lang.String str, android.content.Context context, java.lang.String str2, boolean z) {
        defpackage.cky.c();
        defpackage.cky.a((java.lang.Object) context);
        defpackage.een een = new defpackage.een();
        een.a = new defpackage.eem();
        android.os.Debug.MemoryInfo[] processMemoryInfo = defpackage.cnx.a(context).getProcessMemoryInfo(new int[]{i2});
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        defpackage.cnx.a(context).getMemoryInfo(memoryInfo);
        een.a.a = a(processMemoryInfo[0], memoryInfo, z);
        een.b = new defpackage.efl();
        een.b.a = defpackage.cky.a(str, context);
        een.d = new defpackage.edz();
        een.d.a = java.lang.Boolean.valueOf(defpackage.cnx.c(context));
        een.c = i;
        een.e = str2;
        return een;
    }

    private static defpackage.ede a(android.os.Debug.MemoryInfo memoryInfo, android.app.ActivityManager.MemoryInfo memoryInfo2, boolean z) {
        defpackage.ede ede = new defpackage.ede();
        ede.a = java.lang.Integer.valueOf(memoryInfo.dalvikPss);
        ede.b = java.lang.Integer.valueOf(memoryInfo.nativePss);
        ede.c = java.lang.Integer.valueOf(memoryInfo.otherPss);
        ede.d = java.lang.Integer.valueOf(memoryInfo.dalvikPrivateDirty);
        ede.e = java.lang.Integer.valueOf(memoryInfo.nativePrivateDirty);
        ede.f = java.lang.Integer.valueOf(memoryInfo.otherPrivateDirty);
        ede.g = java.lang.Integer.valueOf(memoryInfo.getTotalPss());
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            ede.h = java.lang.Integer.valueOf(memoryInfo.getTotalPrivateClean());
            ede.l = java.lang.Integer.valueOf(memoryInfo.getTotalSwappablePss());
        }
        ede.i = java.lang.Integer.valueOf(memoryInfo.getTotalSharedDirty());
        if (android.os.Build.VERSION.SDK_INT >= 19) {
            int a2 = a(memoryInfo);
            if (a2 != -1) {
                ede.m = java.lang.Integer.valueOf(a2);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && !z) {
            try {
                java.util.Map memoryStats = memoryInfo.getMemoryStats();
                ede.o = a((java.lang.String) memoryStats.get("summary.code"));
                ede.p = a((java.lang.String) memoryStats.get("summary.stack"));
                ede.q = a((java.lang.String) memoryStats.get("summary.graphics"));
                ede.s = a((java.lang.String) memoryStats.get("summary.system"));
                ede.n = a((java.lang.String) memoryStats.get("summary.java-heap"));
                ede.r = a((java.lang.String) memoryStats.get("summary.private-other"));
            } catch (java.lang.NumberFormatException e) {
                defpackage.cdm.a("PrimesMemoryCapture", "failed to collect memory summary stats", new java.lang.Object[0]);
            }
        }
        ede.t = java.lang.Integer.valueOf((int) (memoryInfo2.availMem >> 10));
        ede.u = java.lang.Integer.valueOf((int) (memoryInfo2.totalMem >> 20));
        return ede;
    }

    private static java.lang.Integer a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
    }
}
