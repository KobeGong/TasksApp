package defpackage;

/* renamed from: dve reason: default package */
/* compiled from: PG */
final class dve implements defpackage.dzl {
    dve() {
    }

    public final java.lang.String toString() {
        return "grpc-default-executor";
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        ((java.util.concurrent.ExecutorService) obj).shutdown();
    }

    public final /* synthetic */ java.lang.Object a() {
        return java.util.concurrent.Executors.newCachedThreadPool(defpackage.dvc.b("grpc-default-executor-%d"));
    }
}
