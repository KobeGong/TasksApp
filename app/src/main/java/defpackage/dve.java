package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: dve  reason: default package */
/* compiled from: PG */
final class dve implements dzl {
    dve() {
    }

    public final String toString() {
        return "grpc-default-executor";
    }

    @Override // defpackage.dzl
    public final /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override // defpackage.dzl
    public final /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(dvc.b("grpc-default-executor-%d"));
    }
}
