package defpackage;

/* renamed from: akk reason: default package */
public final /* synthetic */ class akk implements java.lang.Runnable {
    private final java.util.List a;

    public akk(java.util.List list) {
        this.a = list;
    }

    public final void run() {
        com.google.android.apps.tasks.features.notificationmanager.NotificationManagerImpl.a(this.a);
    }
}
