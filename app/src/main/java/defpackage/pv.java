package defpackage;

import android.os.Handler;

/* access modifiers changed from: package-private */
/* renamed from: pv  reason: default package */
/* compiled from: PG */
public final class pv implements qg {
    private final /* synthetic */ op a;
    private final /* synthetic */ Handler b;

    pv(op opVar, Handler handler) {
        this.a = opVar;
        this.b = handler;
    }

    @Override // defpackage.qg
    public final /* synthetic */ void a(Object obj) {
        qa qaVar = (qa) obj;
        if (qaVar == null) {
            this.a.a(1, this.b);
        } else if (qaVar.b == 0) {
            this.a.a(qaVar.a, this.b);
        } else {
            this.a.a(qaVar.b, this.b);
        }
    }
}
