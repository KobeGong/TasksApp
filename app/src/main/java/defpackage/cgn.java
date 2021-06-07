package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import java.util.Iterator;
import java.util.List;

/* renamed from: cgn  reason: default package */
/* compiled from: PG */
final class cgn implements clt {
    private final /* synthetic */ cgm a;

    cgn(cgm cgm) {
        this.a = cgm;
    }

    @Override // defpackage.clt
    public final /* synthetic */ Object a() {
        boolean z;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = cnx.a(this.a.a).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == Process.myPid()) {
                    z = next.importance == 100;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
