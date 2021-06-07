package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: cnt  reason: default package */
/* compiled from: PG */
public final class cnt {
    private static volatile boolean a;
    private static Method b;

    private static Method a() {
        if (!a) {
            synchronized (cnt.class) {
                if (!a) {
                    try {
                        b = Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE);
                    } catch (NoSuchMethodException e) {
                        cdm.a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", e, new Object[0]);
                    } catch (Error | Exception e2) {
                        cdm.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    }
                    a = true;
                }
            }
        }
        return b;
    }

    private static int a(Debug.MemoryInfo memoryInfo) {
        Method a2 = a();
        if (a2 != null) {
            try {
                return ((Integer) a2.invoke(memoryInfo, 14)).intValue();
            } catch (Error | Exception e) {
                b = null;
                cdm.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
            }
        }
        return -1;
    }

    private cnt() {
    }

    public static een a(int i, int i2, String str, Context context, String str2, boolean z) {
        cky.c();
        cky.a((Object) context);
        een een = new een();
        een.a = new eem();
        Debug.MemoryInfo[] processMemoryInfo = cnx.a(context).getProcessMemoryInfo(new int[]{i2});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        cnx.a(context).getMemoryInfo(memoryInfo);
        een.a.a = a(processMemoryInfo[0], memoryInfo, z);
        een.b = new efl();
        een.b.a = cky.a(str, context);
        een.d = new edz();
        een.d.a = Boolean.valueOf(cnx.c(context));
        een.c = i;
        een.e = str2;
        return een;
    }

    private static ede a(Debug.MemoryInfo memoryInfo, ActivityManager.MemoryInfo memoryInfo2, boolean z) {
        int a2;
        ede ede = new ede();
        ede.a = Integer.valueOf(memoryInfo.dalvikPss);
        ede.b = Integer.valueOf(memoryInfo.nativePss);
        ede.c = Integer.valueOf(memoryInfo.otherPss);
        ede.d = Integer.valueOf(memoryInfo.dalvikPrivateDirty);
        ede.e = Integer.valueOf(memoryInfo.nativePrivateDirty);
        ede.f = Integer.valueOf(memoryInfo.otherPrivateDirty);
        ede.g = Integer.valueOf(memoryInfo.getTotalPss());
        if (Build.VERSION.SDK_INT >= 19) {
            ede.h = Integer.valueOf(memoryInfo.getTotalPrivateClean());
            ede.l = Integer.valueOf(memoryInfo.getTotalSwappablePss());
        }
        ede.i = Integer.valueOf(memoryInfo.getTotalSharedDirty());
        if (Build.VERSION.SDK_INT >= 19 && (a2 = a(memoryInfo)) != -1) {
            ede.m = Integer.valueOf(a2);
        }
        if (Build.VERSION.SDK_INT >= 23 && !z) {
            try {
                Map<String, String> memoryStats = memoryInfo.getMemoryStats();
                ede.o = a(memoryStats.get("summary.code"));
                ede.p = a(memoryStats.get("summary.stack"));
                ede.q = a(memoryStats.get("summary.graphics"));
                ede.s = a(memoryStats.get("summary.system"));
                ede.n = a(memoryStats.get("summary.java-heap"));
                ede.r = a(memoryStats.get("summary.private-other"));
            } catch (NumberFormatException e) {
                cdm.a("PrimesMemoryCapture", "failed to collect memory summary stats", new Object[0]);
            }
        }
        ede.t = Integer.valueOf((int) (memoryInfo2.availMem >> 10));
        ede.u = Integer.valueOf((int) (memoryInfo2.totalMem >> 20));
        return ede;
    }

    private static Integer a(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }
}
