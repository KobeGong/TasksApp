package defpackage;

/* renamed from: cze reason: default package */
/* compiled from: PG */
final class cze extends defpackage.czb {
    private final defpackage.czc a = new defpackage.czc();

    cze() {
    }

    public final void a(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th2 == th) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.a.a(th, true).add(th2);
        }
    }

    public final void a(java.lang.Throwable th) {
        th.printStackTrace();
        java.util.List<java.lang.Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (java.lang.Throwable th2 : a2) {
                    java.lang.System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    public final void a(java.lang.Throwable th, java.io.PrintStream printStream) {
        th.printStackTrace(printStream);
        java.util.List<java.lang.Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (java.lang.Throwable th2 : a2) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }

    public final void a(java.lang.Throwable th, java.io.PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        java.util.List<java.lang.Throwable> a2 = this.a.a(th, false);
        if (a2 != null) {
            synchronized (a2) {
                for (java.lang.Throwable th2 : a2) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
