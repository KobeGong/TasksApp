package defpackage;

/* renamed from: dtk reason: default package */
/* compiled from: PG */
abstract class dtk implements java.lang.Runnable {
    private final defpackage.dns a;

    public dtk(defpackage.dns dns) {
        this.a = dns;
    }

    public abstract void a();

    public final void run() {
        defpackage.dns c = this.a.c();
        try {
            a();
        } finally {
            this.a.a(c);
        }
    }
}
