package defpackage;

/* renamed from: cai reason: default package */
/* compiled from: PG */
public final class cai implements defpackage.cae {
    private static final java.lang.String c = java.lang.String.format("JobScheduler returned RESULT_FAILURE. Did you forget to add [%s] to your app dependencies?", new java.lang.Object[]{"java/com/google/android/libraries/notifications/entrypoints/scheduled"});
    public android.content.Context a;
    public defpackage.buc b;

    cai() {
    }

    public final void a(defpackage.bul bul, int i, java.lang.String str, android.os.Bundle bundle) {
        long j;
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!defpackage.bwj.e()) {
            throw new defpackage.cad("JobScheduler is not supported before Android L.");
        }
        defpackage.cld.a((java.lang.Object) bundle);
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle(bundle.keySet().size());
        for (java.lang.String str2 : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str2);
            if (obj != null) {
                if (obj instanceof java.lang.Integer) {
                    persistableBundle.putInt(str2, ((java.lang.Integer) obj).intValue());
                } else if (obj instanceof java.lang.Long) {
                    persistableBundle.putLong(str2, ((java.lang.Long) obj).longValue());
                } else if (obj instanceof java.lang.Double) {
                    persistableBundle.putDouble(str2, ((java.lang.Double) obj).doubleValue());
                } else if (obj instanceof java.lang.String) {
                    persistableBundle.putString(str2, (java.lang.String) obj);
                } else {
                    java.lang.String valueOf = java.lang.String.valueOf(obj);
                    throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 92 + java.lang.String.valueOf(valueOf).length()).append("Extra parameter types supported: Integer, Long, Double, String.Error for, key: [").append(str2).append("] value: [").append(valueOf).append("].").toString());
                }
            }
        }
        persistableBundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", str);
        if (bul != null) {
            j = bul.a().longValue();
            defpackage.cld.a(j >= 0);
            if (j <= 998) {
                z2 = true;
            } else {
                z2 = false;
            }
            defpackage.cld.a(z2);
        } else {
            j = 999;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z);
        if (i <= 999) {
            z3 = true;
        }
        defpackage.cld.a(z3);
        if (((android.app.job.JobScheduler) this.a.getSystemService("jobscheduler")).schedule(new android.app.job.JobInfo.Builder(((int) j) + this.b.l().intValue() + (i * 1000), new android.content.ComponentName(this.a, this.b.i())).setExtras(persistableBundle).setRequiredNetworkType(1).build()) == 0) {
            throw new defpackage.cad(c);
        }
    }
}
