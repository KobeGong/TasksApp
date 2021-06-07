package defpackage;

import com.google.android.apps.tasks.common.TaskApplication;

/* access modifiers changed from: package-private */
/* renamed from: aqp  reason: default package */
public final /* synthetic */ class aqp implements Runnable {
    private final aql a;
    private final cyi b;

    aqp(aql aql, cyi cyi) {
        this.a = aql;
        this.b = cyi;
    }

    public final void run() {
        aql aql = this.a;
        cyi cyi = this.b;
        if (ajd.a(cyi)) {
            czq czq = (czq) cyd.c(cyi);
            TaskApplication.b().b = czq;
            aql.a(czq);
        }
    }
}
