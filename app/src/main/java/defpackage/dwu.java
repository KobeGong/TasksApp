package defpackage;

/* renamed from: dwu reason: default package */
/* compiled from: PG */
final class dwu implements java.lang.Runnable {
    public boolean a;
    private final /* synthetic */ defpackage.dwf b;

    dwu(defpackage.dwf dwf) {
        this.b = dwf;
    }

    public final void run() {
        if (!this.a) {
            this.b.Q = null;
            this.b.R = null;
            if (this.b.s != null) {
                this.b.s.c();
            }
        }
    }
}
