package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: czf  reason: default package */
/* compiled from: PG */
final class czf extends czb {
    czf() {
    }

    @Override // defpackage.czb
    public final void a(Throwable th, Throwable th2) {
    }

    @Override // defpackage.czb
    public final void a(Throwable th) {
        th.printStackTrace();
    }

    @Override // defpackage.czb
    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }

    @Override // defpackage.czb
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
