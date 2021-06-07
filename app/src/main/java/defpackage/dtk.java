package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dtk  reason: default package */
/* compiled from: PG */
public abstract class dtk implements Runnable {
    private final dns a;

    public dtk(dns dns) {
        this.a = dns;
    }

    public abstract void a();

    public final void run() {
        dns c = this.a.c();
        try {
            a();
        } finally {
            this.a.a(c);
        }
    }
}
