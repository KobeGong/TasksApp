package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Iterator;

import defpackage.bty;
import defpackage.bwg;
import defpackage.bwh;
import defpackage.bwi;
import defpackage.bws;
import defpackage.bxk;

@TargetApi(21)
/* compiled from: PG */
public final class ScheduledTaskService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        bwg bwg;
        Context applicationContext = getApplicationContext();
        bxk.a(applicationContext).a();
        new bws();
        bwh b = bxk.a(applicationContext).b();
        int jobId = jobParameters.getJobId();
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            bty.e("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
        String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
        if (!TextUtils.isEmpty(string)) {
            Iterator it = b.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bwg bwg2 = (bwg) it.next();
                if (string.equals(bwg2.a())) {
                    bwg = bwg2;
                    break;
                }
            }
        }
        bwg = null;
        if (bwg == null) {
            bty.e("ScheduledTaskServiceHandler", "ScheduledTaskHandler NOT found. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
            return false;
        }
        bty.a("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
        b.b.a(new bwi(b, bwg, extras, jobId, string, this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        bxk.a(getApplicationContext()).b();
        return true;
    }
}
