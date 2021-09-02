package defpackage;

/* renamed from: czg reason: default package */
/* compiled from: PG */
final class czg extends defpackage.czb {
    czg() {
    }

    public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        th.addSuppressed(th2);
    }

    public final void a(java.lang.Throwable th) {
        th.printStackTrace();
    }

    public final void a(java.lang.Throwable th, java.io.PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    public final void a(java.lang.Throwable th, java.io.PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
