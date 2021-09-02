package defpackage;

/* renamed from: ctw reason: default package */
/* compiled from: PG */
public final class ctw extends java.lang.Exception {
    ctw(java.lang.Throwable th, defpackage.cud cud, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(cud.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final java.lang.Throwable fillInStackTrace() {
        return this;
    }
}
