package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bxr  reason: default package */
/* compiled from: PG */
public final class bxr implements ecz {
    private final bxm a;

    public bxr(bxm bxm) {
        this.a = bxm;
    }

    public static ExecutorService a(bxm bxm) {
        ExecutorService newFixedThreadPool;
        if (bxm.a.g() != null) {
            newFixedThreadPool = bxm.a.g();
        } else {
            newFixedThreadPool = Executors.newFixedThreadPool(8);
        }
        return (ExecutorService) dgv.a(newFixedThreadPool, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.ecz
    public final /* synthetic */ Object a() {
        return a(this.a);
    }
}
