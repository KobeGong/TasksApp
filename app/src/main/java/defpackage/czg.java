package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: czg  reason: default package */
/* compiled from: PG */
final class czg extends czb {
    czg() {
    }

    @Override // defpackage.czb
    public final void a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
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
