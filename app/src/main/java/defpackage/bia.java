package defpackage;

/* renamed from: bia reason: default package */
/* compiled from: PG */
final class bia implements java.lang.Runnable {
    private /* synthetic */ android.content.Intent a;
    private /* synthetic */ defpackage.bhz b;

    bia(defpackage.bhz bhz, android.content.Intent intent) {
        this.b = bhz;
        this.a = intent;
    }

    public final void run() {
        java.lang.String action = this.a.getAction();
        android.util.Log.w("EnhancedIntentService", new java.lang.StringBuilder(java.lang.String.valueOf(action).length() + 61).append("Service took too long to process intent: ").append(action).append(" App may get closed.").toString());
        this.b.a();
    }
}
