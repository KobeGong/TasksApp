package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;

/* renamed from: cai  reason: default package */
/* compiled from: PG */
public final class cai implements cae {
    private static final String c = String.format("JobScheduler returned RESULT_FAILURE. Did you forget to add [%s] to your app dependencies?", "java/com/google/android/libraries/notifications/entrypoints/scheduled");
    public Context a;
    public buc b;

    cai() {
    }

    @Override // defpackage.cae
    public final void a(bul bul, int i, String str, Bundle bundle) {
        long j;
        boolean z = false;
        if (!bwj.e()) {
            throw new cad("JobScheduler is not supported before Android L.");
        }
        cld.a(bundle);
        PersistableBundle persistableBundle = new PersistableBundle(bundle.keySet().size());
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj != null) {
                if (obj instanceof Integer) {
                    persistableBundle.putInt(str2, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    persistableBundle.putLong(str2, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    persistableBundle.putDouble(str2, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    persistableBundle.putString(str2, (String) obj);
                } else {
                    String valueOf = String.valueOf(obj);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str2).length() + 92 + String.valueOf(valueOf).length()).append("Extra parameter types supported: Integer, Long, Double, String.Error for, key: [").append(str2).append("] value: [").append(valueOf).append("].").toString());
                }
            }
        }
        persistableBundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", str);
        if (bul != null) {
            j = bul.a().longValue();
            cld.a(j >= 0);
            cld.a(j <= 998);
        } else {
            j = 999;
        }
        cld.a(i >= 0);
        if (i <= 999) {
            z = true;
        }
        cld.a(z);
        if (((JobScheduler) this.a.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(((int) j) + this.b.l().intValue() + (i * 1000), new ComponentName(this.a, this.b.i())).setExtras(persistableBundle).setRequiredNetworkType(1).build()) == 0) {
            throw new cad(c);
        }
    }
}
