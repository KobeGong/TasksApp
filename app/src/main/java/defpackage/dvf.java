package defpackage;

/* renamed from: dvf reason: default package */
/* compiled from: PG */
final class dvf implements defpackage.dzl {
    dvf() {
    }

    private static java.util.concurrent.ScheduledExecutorService b() {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, defpackage.dvc.b("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new java.lang.Class[]{java.lang.Boolean.TYPE}).invoke(newScheduledThreadPool, new java.lang.Object[]{java.lang.Boolean.valueOf(true)});
        } catch (java.lang.NoSuchMethodException e) {
        } catch (java.lang.RuntimeException e2) {
            throw e2;
        } catch (java.lang.Exception e3) {
            throw new java.lang.RuntimeException(e3);
        }
        return newScheduledThreadPool;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        ((java.util.concurrent.ScheduledExecutorService) obj).shutdown();
    }

    public final /* synthetic */ java.lang.Object a() {
        return b();
    }
}
