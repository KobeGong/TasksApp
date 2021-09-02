package defpackage;

/* renamed from: bwo reason: default package */
/* compiled from: PG */
public final class bwo implements defpackage.bvn {
    public defpackage.cbw a;

    bwo() {
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction());
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bty.a("TimezoneChangedIntentHandler", "Syncing registration statuses due to timezone change.", new java.lang.Object[0]);
        this.a.a();
    }
}
