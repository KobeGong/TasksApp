package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dyy  reason: default package */
/* compiled from: PG */
public final class dyy implements Runnable {
    public final /* synthetic */ dyw a;

    dyy(dyw dyw) {
        this.a = dyw;
    }

    public final void run() {
        this.a.b.o = null;
        this.a.b.d.execute(new dyz(this));
    }
}
