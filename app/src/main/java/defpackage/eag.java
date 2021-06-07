package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: eag  reason: default package */
/* compiled from: PG */
public final class eag implements Executor {
    public static final Logger a = Logger.getLogger(eag.class.getName());
    public final BlockingQueue b = new LinkedBlockingQueue();

    eag() {
    }

    public final void execute(Runnable runnable) {
        this.b.add(runnable);
    }
}
