package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: ekj  reason: default package */
/* compiled from: PG */
final class ekj implements ThreadFactory {
    public final /* synthetic */ int a;

    ekj(int i) {
        this.a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new ekk(this, runnable));
    }
}
