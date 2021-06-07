package defpackage;

import android.content.BroadcastReceiver;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bwq  reason: default package */
/* compiled from: PG */
public interface bwq {
    Future a(Callable callable);

    void a(BroadcastReceiver.PendingResult pendingResult, Runnable runnable);

    void a(Runnable runnable);

    void b(Runnable runnable);
}
