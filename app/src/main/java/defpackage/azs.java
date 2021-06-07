package defpackage;

import android.util.Log;

/* renamed from: azs  reason: default package */
/* compiled from: PG */
final class azs extends bag {
    private /* synthetic */ azk b;
    private /* synthetic */ bkk c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    azs(bae bae, azk azk, bkk bkk) {
        super(bae);
        this.b = azk;
        this.c = bkk;
    }

    @Override // defpackage.bag
    public final void a() {
        azk azk = this.b;
        bkk bkk = this.c;
        if (azk.b(0)) {
            axq axq = bkk.a;
            if (axq.b()) {
                bed bed = bkk.b;
                axq axq2 = bed.a;
                if (!axq2.b()) {
                    String valueOf = String.valueOf(axq2);
                    Log.wtf("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
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
