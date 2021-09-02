package defpackage;

/* renamed from: bww reason: default package */
/* compiled from: PG */
public final class bww implements java.lang.Runnable {
    private final /* synthetic */ java.lang.Runnable a;
    private final /* synthetic */ android.content.Context b;

    public bww(java.lang.Runnable runnable, android.content.Context context) {
        this.a = runnable;
        this.b = context;
    }

    public final void run() {
        com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService.a.add(this.a);
        android.content.Intent intent = new android.content.Intent(this.b, com.google.android.libraries.notifications.executor.impl.basic.ChimeExecutorApiService.class);
        intent.setAction("ACTION_NEW_TASK");
        this.b.startService(intent);
    }
}
