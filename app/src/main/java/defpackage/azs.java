package defpackage;

/* renamed from: azs reason: default package */
/* compiled from: PG */
final class azs extends defpackage.bag {
    private /* synthetic */ defpackage.azk b;
    private /* synthetic */ defpackage.bkk c;

    azs(defpackage.bae bae, defpackage.azk azk, defpackage.bkk bkk) {
        this.b = azk;
        this.c = bkk;
        super(bae);
    }

    public final void a() {
        defpackage.azk azk = this.b;
        defpackage.bkk bkk = this.c;
        if (azk.b(0)) {
            defpackage.axq axq = bkk.a;
            if (axq.b()) {
                defpackage.bed bed = bkk.b;
                defpackage.axq axq2 = bed.a;
                if (!axq2.b()) {
                    java.lang.String valueOf = java.lang.String.valueOf(axq2);
                    android.util.Log.wtf("GoogleApiClientConnecting", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new java.lang.Exception());
                    azk.b(axq2);
                    return;
                }
                azk.f = true;
                azk.g = bed.a();
                azk.h = bed.b;
                azk.i = bed.c;
                azk.e();
            } else if (azk.a(axq)) {
                azk.f();
                azk.e();
            } else {
                azk.b(axq);
            }
        }
    }
}
