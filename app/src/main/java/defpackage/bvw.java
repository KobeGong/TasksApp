package defpackage;

/* renamed from: bvw reason: default package */
/* compiled from: PG */
public final class bvw implements defpackage.bvn {
    private final defpackage.cbw a;
    private final defpackage.cda b;

    bvw(defpackage.cbw cbw, defpackage.cda cda) {
        this.a = cbw;
        this.b = cda;
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction());
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bty.a("AppUpdatedIntentHandler", "Re-surface notifications and sync registrations due to app update.", new java.lang.Object[0]);
        this.b.a(bvo);
        this.a.a();
    }
}
