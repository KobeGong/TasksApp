package defpackage;

/* renamed from: bwe reason: default package */
/* compiled from: PG */
public final class bwe implements defpackage.bvn {
    public defpackage.cbw a;

    bwe() {
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction());
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bty.a("LocaleChangedIntentHandler", "Syncing registration statuses due to Locale change.", new java.lang.Object[0]);
        this.a.a();
    }
}
