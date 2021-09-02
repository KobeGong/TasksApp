package defpackage;

/* renamed from: cyd reason: default package */
/* compiled from: PG */
public final class cyd extends defpackage.cub {
    public static java.lang.Object b(java.util.concurrent.Future future) {
        defpackage.cld.a(future.isDone(), "Future was expected to be done: %s", (java.lang.Object) future);
        return defpackage.cub.a(future);
    }

    public static java.lang.Object c(java.util.concurrent.Future future) {
        defpackage.cld.a((java.lang.Object) future);
        try {
            return defpackage.cub.a(future);
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause instanceof java.lang.Error) {
                throw new defpackage.avl((java.lang.Error) cause);
            }
            throw new defpackage.cyz(cause);
        }
    }
}
