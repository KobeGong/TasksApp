package defpackage;

import com.google.android.apps.tasks.features.notificationmanager.NotificationManagerImpl;
import java.util.List;

/* renamed from: akk  reason: default package */
public final /* synthetic */ class akk implements Runnable {
    private final List a;

    public akk(List list) {
        this.a = list;
    }

    public final void run() {
        NotificationManagerImpl.a(this.a);
    }
}
