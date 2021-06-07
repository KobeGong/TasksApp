package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: cyd  reason: default package */
/* compiled from: PG */
public final class cyd extends cub {
    public static Object b(Future future) {
        cld.a(future.isDone(), "Future was expected to be done: %s", future);
        return cub.a(future);
    }

    public static Object c(Future future) {
        cld.a(future);
        try {
            return cub.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new avl((Error) cause);
            }
            throw new cyz(cause);
        }
    }
}
