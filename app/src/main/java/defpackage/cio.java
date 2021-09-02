package defpackage;

/* renamed from: cio reason: default package */
/* compiled from: PG */
final class cio implements java.lang.Runnable {
    private final /* synthetic */ java.lang.String a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ defpackage.efx c;
    private final /* synthetic */ defpackage.eeo d;
    private final /* synthetic */ defpackage.cin e;

    cio(defpackage.cin cin, java.lang.String str, boolean z, defpackage.efx efx, defpackage.eeo eeo) {
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
