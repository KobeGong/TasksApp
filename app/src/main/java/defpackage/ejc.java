package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ejc  reason: default package */
/* compiled from: PG */
public abstract class ejc {
    private final Executor a;

    public ejc(Executor executor) {
        if (executor == null) {
            throw new IllegalStateException("Executor must not be null");
        }
        this.a = executor;
    }

    public abstract void a(ejb ejb);

    public Executor a() {
        return this.a;
    }
}
