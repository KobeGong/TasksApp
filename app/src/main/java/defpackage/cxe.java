package defpackage;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: cxe  reason: default package */
/* compiled from: PG */
public final class cxe {
    public static final cxe a = new cxe(null, null);
    public final Runnable b;
    public final Executor c;
    public cxe next;

    cxe(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
