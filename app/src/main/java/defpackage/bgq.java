package defpackage;

/* renamed from: bgq reason: default package */
/* compiled from: PG */
final class bgq extends defpackage.bgi {
    private /* synthetic */ defpackage.bgj e;
    private /* synthetic */ android.content.Context f;
    private /* synthetic */ long g;

    bgq(defpackage.ayp ayp, defpackage.bgj bgj, android.content.Context context, long j) {
        this.e = bgj;
        this.f = context;
        this.g = j;
        super(ayp);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(defpackage.ayg ayg) {
        android.app.ApplicationErrorReport.CrashInfo crashInfo;
        com.google.android.gms.feedback.ErrorReport errorReport;
        defpackage.bjh bjh = (defpackage.bjh) ayg;
        if (this.e != null) {
            defpackage.azb azb = this.e.n;
        }
        defpackage.bgj bgj = this.e;
        defpackage.bji bji = (defpackage.bji) bjh.o();
        java.io.File cacheDir = bjh.d.getCacheDir();
        com.google.android.gms.feedback.ErrorReport errorReport2 = new com.google.android.gms.feedback.ErrorReport();
        if (bgj == null) {
            errorReport = errorReport2;
        } else {
            if (bgj.b != null && bgj.b.size() > 0) {
                errorReport2.d = bgj.b;
            }
            if (!android.text.TextUtils.isEmpty(bgj.a)) {
                errorReport2.c = bgj.a;
            }
            if (!android.text.TextUtils.isEmpty(bgj.c)) {
                errorReport2.b = bgj.c;
            }
            if (bgj.d == null) {
                crashInfo = null;
            } else {
                crashInfo = bgj.d.crashInfo;
            }
            if (crashInfo != null) {
                errorReport2.i = crashInfo.throwMethodName;
                errorReport2.g = crashInfo.throwLineNumber;
                errorReport2.h = crashInfo.throwClassName;
                errorReport2.j = crashInfo.stackTrace;
                errorReport2.e = crashInfo.exceptionClassName;
                errorReport2.k = crashInfo.exceptionMessage;
                errorReport2.f = crashInfo.throwFileName;
            }
            if (bgj.j != null) {
                errorReport2.q = bgj.j;
            }
            if (!android.text.TextUtils.isEmpty(bgj.e)) {
                errorReport2.l = bgj.e;
            }
            if (!android.text.TextUtils.isEmpty(bgj.g)) {
                errorReport2.a.packageName = bgj.g;
            }
            if (bgj.m != null) {
                errorReport2.t = bgj.m;
            }
            if (cacheDir != null) {
                if (bgj.f != null) {
                    errorReport2.m = bgj.f;
                    com.google.android.gms.common.data.BitmapTeleporter bitmapTeleporter = errorReport2.m;
                    if (cacheDir == null) {
                        throw new java.lang.NullPointerException("Cannot set null temp directory");
                    }
                    bitmapTeleporter.a = cacheDir;
                }
                java.util.List list = bgj.h;
                if (!(list == null || list.size() == 0)) {
                    defpackage.bjh.a(list, cacheDir);
                    errorReport2.n = (defpackage.bgl[]) bgj.h.toArray(new defpackage.bgl[bgj.h.size()]);
                }
            }
            if (bgj.k != null) {
                errorReport2.r = bgj.k;
            }
            errorReport2.o = bgj.i;
            errorReport2.s = bgj.l;
            errorReport = errorReport2;
        }
        bji.a(errorReport);
        a((defpackage.ayw) com.google.android.gms.common.api.Status.a);
    }
}
