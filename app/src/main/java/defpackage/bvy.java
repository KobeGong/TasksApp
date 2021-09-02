package defpackage;

/* renamed from: bvy reason: default package */
/* compiled from: PG */
public final class bvy implements defpackage.bvn {
    private final defpackage.cda a;

    bvy(defpackage.cda cda) {
        this.a = cda;
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction());
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bty.a("BootCompletedIntentHandler", "Re-surface notifications due to boot completed event.", new java.lang.Object[0]);
        this.a.a(bvo);
    }
}
