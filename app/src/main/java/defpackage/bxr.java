package defpackage;

/* renamed from: bxr reason: default package */
/* compiled from: PG */
public final class bxr implements defpackage.ecz {
    private final defpackage.bxm a;

    public bxr(defpackage.bxm bxm) {
        this.a = bxm;
    }

    public static java.util.concurrent.ExecutorService a(defpackage.bxm bxm) {
        java.util.concurrent.ExecutorService newFixedThreadPool;
        if (bxm.a.g() != null) {
            newFixedThreadPool = bxm.a.g();
        } else {
            newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(8);
        }
        return (java.util.concurrent.ExecutorService) defpackage.dgv.a((java.lang.Object) newFixedThreadPool, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ java.lang.Object a() {
        return a(this.a);
    }
}
