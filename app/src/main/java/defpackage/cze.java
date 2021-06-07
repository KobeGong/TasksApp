package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: cze  reason: default package */
/* compiled from: PG */
final class cze extends czb {
    private final czc a = new czc();

    cze() {
    }

    @Override // defpackage.czb
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.a.a(th, true).add(th2);
        }
    }

    @Override // defpackage.czb
    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    @Override // defpackage.czb
    public final void a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }

    @Override // defpackage.czb
    public final void a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (Throwable th2 : a2) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
