package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dwu  reason: default package */
/* compiled from: PG */
public final class dwu implements Runnable {
    public boolean a;
    private final /* synthetic */ dwf b;

    dwu(dwf dwf) {
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
