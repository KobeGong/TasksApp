package defpackage;

/* renamed from: ctw  reason: default package */
/* compiled from: PG */
public final class ctw extends Exception {
    ctw(Throwable th, cud cud, StackTraceElement[] stackTraceElementArr) {
        super(cud.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
