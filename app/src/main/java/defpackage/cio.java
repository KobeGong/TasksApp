package defpackage;

/* renamed from: cio  reason: default package */
/* compiled from: PG */
final class cio implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ efx c;
    private final /* synthetic */ eeo d;
    private final /* synthetic */ cin e;

    cio(cin cin, String str, boolean z, efx efx, eeo eeo) {
        this.e = cin;
        this.a = str;
        this.b = z;
        this.c = efx;
        this.d = eeo;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
