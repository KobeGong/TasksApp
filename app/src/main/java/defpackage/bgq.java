package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import java.io.File;
import java.util.List;

/* renamed from: bgq  reason: default package */
/* compiled from: PG */
final class bgq extends bgi {
    private /* synthetic */ bgj e;
    private /* synthetic */ Context f;
    private /* synthetic */ long g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bgq(ayp ayp, bgj bgj, Context context, long j) {
        super(ayp);
        this.e = bgj;
        this.f = context;
        this.g = j;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bca
    public final /* synthetic */ void a(ayg ayg) {
        ApplicationErrorReport.CrashInfo crashInfo;
        ErrorReport errorReport;
        bjh bjh = (bjh) ayg;
        if (this.e != null) {
            azb azb = this.e.n;
        }
        bgj bgj = this.e;
        bji bji = (bji) bjh.o();
        File cacheDir = bjh.d.getCacheDir();
        ErrorReport errorReport2 = new ErrorReport();
        if (bgj == null) {
            errorReport = errorReport2;
        } else {
            if (bgj.b != null && bgj.b.size() > 0) {
                errorReport2.d = bgj.b;
            }
            if (!TextUtils.isEmpty(bgj.a)) {
                errorReport2.c = bgj.a;
            }
            if (!TextUtils.isEmpty(bgj.c)) {
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
            if (!TextUtils.isEmpty(bgj.e)) {
                errorReport2.l = bgj.e;
            }
            if (!TextUtils.isEmpty(bgj.g)) {
                errorReport2.a.packageName = bgj.g;
            }
            if (bgj.m != null) {
                errorReport2.t = bgj.m;
            }
            if (cacheDir != null) {
                if (bgj.f != null) {
                    errorReport2.m = bgj.f;
                    BitmapTeleporter bitmapTeleporter = errorReport2.m;
                    if (cacheDir == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    bitmapTeleporter.a = cacheDir;
                }
                List list = bgj.h;
                if (!(list == null || list.size() == 0)) {
                    bjh.a(list, cacheDir);
                    errorReport2.n = (bgl[]) bgj.h.toArray(new bgl[bgj.h.size()]);
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
        a((ayw) Status.a);
    }
}
