package com.google.android.libraries.notifications.entrypoints.scheduled;

@android.annotation.TargetApi(21)
/* compiled from: PG */
public final class ScheduledTaskService extends android.app.job.JobService {
    public final boolean onStartJob(android.app.job.JobParameters jobParameters) {
        defpackage.bwg bwg;
        android.content.Context applicationContext = getApplicationContext();
        defpackage.bxk.a(applicationContext).a();
        new defpackage.bws();
        defpackage.bwh b = defpackage.bxk.a(applicationContext).b();
        int jobId = jobParameters.getJobId();
        android.os.PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            defpackage.bty.e("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", java.lang.Integer.valueOf(jobId));
            return false;
        }
        java.lang.String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (!android.text.TextUtils.isEmpty(string)) {
            java.util.Iterator it = b.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                defpackage.bwg bwg2 = (defpackage.bwg) it.next();
                if (string.equals(bwg2.a())) {
                    bwg = bwg2;
                    break;
                }
            }
        }
        bwg = null;
        if (bwg == null) {
            defpackage.bty.e("ScheduledTaskServiceHandler", "ScheduledTaskHandler NOT found. Job ID: '%d', key: '%s'", java.lang.Integer.valueOf(jobId), string);
            return false;
        }
        defpackage.bty.a("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", java.lang.Integer.valueOf(jobId), string);
        b.b.a((java.lang.Runnable) new defpackage.bwi(b, bwg, extras, jobId, string, this, jobParameters));
        return true;
    }

    public final boolean onStopJob(android.app.job.JobParameters jobParameters) {
        defpackage.bxk.a(getApplicationContext()).b();
        return true;
    }
}
