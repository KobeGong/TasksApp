package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: dvf  reason: default package */
/* compiled from: PG */
final class dvf implements dzl {
    dvf() {
    }

    private static ScheduledExecutorService b() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, dvc.b("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, true);
        } catch (NoSuchMethodException e) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
        return newScheduledThreadPool;
    }

    @Override // defpackage.dzl
    public final /* synthetic */ void a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // defpackage.dzl
    public final /* synthetic */ Object a() {
        return b();
    }
}
