package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;

/* renamed from: bwi  reason: default package */
public final /* synthetic */ class bwi implements Runnable {
    private final bwg a;
    private final PersistableBundle b;
    private final int c;
    private final String d;
    private final JobService e;
    private final JobParameters f;

    public bwi(bwh bwh, bwg bwg, PersistableBundle persistableBundle, int i, String str, JobService jobService, JobParameters jobParameters) {
        this.a = bwg;
        this.b = persistableBundle;
        this.c = i;
        this.d = str;
        this.e = jobService;
        this.f = jobParameters;
    }

    public final void run() {
        boolean z = true;
        boolean z2 = false;
        bwg bwg = this.a;
        PersistableBundle persistableBundle = this.b;
        int i = this.c;
        String str = this.d;
        JobService jobService = this.e;
        JobParameters jobParameters = this.f;
        try {
            btl a2 = bwg.a(new Bundle(persistableBundle));
            switch (a2.a().ordinal()) {
                case 1:
                    bty.b("ScheduledTaskServiceHandler", a2.b(), "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                    break;
                case 2:
                    bty.b("ScheduledTaskServiceHandler", a2.b(), "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                    z = z2;
                    break;
                default:
                    bty.a("ScheduledTaskServiceHandler", "Job finished with SUCCESS code. Job ID: '%d', key: '%s'", Integer.valueOf(i), str);
                    z = z2;
                    break;
            }
        } finally {
            jobService.jobFinished(jobParameters, z2);
        }
    }
}
