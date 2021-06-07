package defpackage;

/* renamed from: eij  reason: default package */
/* compiled from: PG */
final class eij implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ int b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ eii d;

    eij(eii eii, long j, int i, boolean z) {
        this.d = eii;
        this.a = j;
        this.b = i;
        this.c = z;
    }

    public final void run() {
        this.d.b.b.a(this.a, this.b);
        if (this.c) {
            this.d.b.b.a(this.b);
            this.d.b.b.a(new long[]{this.a});
        }
    }
}
