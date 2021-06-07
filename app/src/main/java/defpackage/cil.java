package defpackage;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Process;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: cil  reason: default package */
/* compiled from: PG */
public final class cil implements Runnable {
    private final /* synthetic */ eeo a = null;
    private final /* synthetic */ String b = null;
    private final /* synthetic */ int c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ String e;
    private final /* synthetic */ cik f;

    cil(cik cik, int i, String str) {
        this.f = cik;
        this.c = i;
        this.d = false;
        this.e = str;
    }

    public final void run() {
        if (this.f.f) {
            System.gc();
            System.runFinalization();
            System.gc();
        }
        if (this.f.d) {
            cik cik = this.f;
            int i = this.c;
            String str = this.e;
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = cnx.a(cik.a).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = cik.a.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Build.VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        efx efx = new efx();
                        efx.a = cnt.a(i, runningAppProcessInfo.pid, runningAppProcessInfo.processName, cik.a, str, cik.g);
                        cik.a(null, false, efx, null);
                    }
                }
                return;
            }
            return;
        }
        cik cik2 = this.f;
        int i2 = this.c;
        String str2 = this.e;
        efx efx2 = new efx();
        efx2.a = cnt.a(i2, Process.myPid(), null, cik2.a, str2, cik2.g);
        cik2.a(null, false, efx2, null);
    }
}
