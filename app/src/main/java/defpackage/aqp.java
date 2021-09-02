package defpackage;

/* renamed from: aqp reason: default package */
final /* synthetic */ class aqp implements java.lang.Runnable {
    private final defpackage.aql a;
    private final defpackage.cyi b;

    aqp(defpackage.aql aql, defpackage.cyi cyi) {
        this.a = aql;
        this.b = cyi;
    }

    public final void run() {
        defpackage.aql aql = this.a;
        defpackage.cyi cyi = this.b;
        if (defpackage.ajd.a((java.util.concurrent.Future) cyi)) {
            defpackage.czq czq = (defpackage.czq) defpackage.cyd.c(cyi);
            com.google.android.apps.tasks.common.TaskApplication.getApplication().b = czq;
            aql.a(czq);
        }
    }
}
