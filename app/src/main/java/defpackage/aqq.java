package defpackage;

/* renamed from: aqq reason: default package */
final /* synthetic */ class aqq implements java.lang.Runnable {
    private final defpackage.aql a;
    private final defpackage.czq b;

    aqq(defpackage.aql aql, defpackage.czq czq) {
        this.a = aql;
        this.b = czq;
    }

    public final void run() {
        defpackage.czq czq;
        defpackage.aql aql = this.a;
        defpackage.czq czq2 = this.b;
        if (!aql.r()) {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            java.lang.String str = "market://details?id=";
            java.lang.String valueOf = java.lang.String.valueOf(android.net.Uri.encode(aql.getPackageName()));
            intent.setData(android.net.Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str)));
            com.google.android.apps.tasks.common.TaskApplication b2 = com.google.android.apps.tasks.common.TaskApplication.getApplication();
            if (czq2 == defpackage.czq.FORCE) {
                czq = defpackage.czq.FORCE;
            } else {
                czq = defpackage.czq.NONE;
            }
            b2.b = czq;
            switch (czq2.ordinal()) {
                case 1:
                    aql.a(2131951688, intent);
                    return;
                case 2:
                    aql.a(2131951687, intent);
                    return;
                case 3:
                    if (aql.r == null || !aql.r.isShowing()) {
                        defpackage.xk xkVar = new defpackage.xk(aql);
                        xkVar.a(2131951848);
                        xkVar.b(2131951846);
                        xkVar.a(2131951847, (android.content.DialogInterface.OnClickListener) new defpackage.aqs(aql, intent));
                        xkVar.a((android.content.DialogInterface.OnDismissListener) new defpackage.aqt(aql));
                        aql.r = xkVar.a();
                        defpackage.ajd.a(aql.r);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
