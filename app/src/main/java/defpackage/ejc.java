package defpackage;

/* renamed from: ejc reason: default package */
/* compiled from: PG */
public abstract class ejc {
    private final java.util.concurrent.Executor a;

    public ejc(java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.IllegalStateException("Executor must not be null");
        }
        this.a = executor;
    }

    public abstract void a(defpackage.ejb ejb);

    public java.util.concurrent.Executor a() {
        return this.a;
    }
}
