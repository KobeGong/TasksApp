package defpackage;

/* renamed from: bwi reason: default package */
public final /* synthetic */ class bwi implements java.lang.Runnable {
    private final defpackage.bwg a;
    private final android.os.PersistableBundle b;
    private final int c;
    private final java.lang.String d;
    private final android.app.job.JobService e;
    private final android.app.job.JobParameters f;

    public bwi(defpackage.bwh bwh, defpackage.bwg bwg, android.os.PersistableBundle persistableBundle, int i, java.lang.String str, android.app.job.JobService jobService, android.app.job.JobParameters jobParameters) {
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
        defpackage.bwg bwg = this.a;
        android.os.PersistableBundle persistableBundle = this.b;
        int i = this.c;
        java.lang.String str = this.d;
        android.app.job.JobService jobService = this.e;
        android.app.job.JobParameters jobParameters = this.f;
        try {
            defpackage.btl a2 = bwg.a(new android.os.Bundle(persistableBundle));
            switch (a2.a().ordinal()) {
                case 1:
                    defpackage.bty.b("ScheduledTaskServiceHandler", a2.b(), "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'", java.lang.Integer.valueOf(i), str);
                    break;
                case 2:
                    defpackage.bty.b("ScheduledTaskServiceHandler", a2.b(), "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'", java.lang.Integer.valueOf(i), str);
                    z = z2;
                    break;
                default:
                    defpackage.bty.a("ScheduledTaskServiceHandler", "Job finished with SUCCESS code. Job ID: '%d', key: '%s'", java.lang.Integer.valueOf(i), str);
                    z = z2;
                    break;
            }
        } finally {
            jobService.jobFinished(jobParameters, z2);
        }
    }
}
