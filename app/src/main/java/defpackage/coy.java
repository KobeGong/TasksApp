package defpackage;

/* renamed from: coy reason: default package */
/* compiled from: PG */
public final class coy {
    public final defpackage.cop a;
    public final java.util.concurrent.Executor b;
    public final defpackage.bqm c;

    private coy(defpackage.cop cop, defpackage.cov cov, java.util.concurrent.Executor executor) {
        this.a = cop;
        this.b = defpackage.cub.a(executor);
    }

    public coy(defpackage.cop cop, defpackage.cov cov, defpackage.bqm bqm, java.util.concurrent.Executor executor) {
        this(cop, cov, executor);
        this.c = bqm;
    }
}
