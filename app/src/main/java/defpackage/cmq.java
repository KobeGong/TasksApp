package defpackage;

import android.content.Context;

/* renamed from: cmq  reason: default package */
/* compiled from: PG */
public final class cmq implements clt {
    private final Context a;
    private final cmn b = new cmn();

    public cmq(Context context) {
        this.a = context;
    }

    @Override // defpackage.clt
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.b.a(this.a, "primes::shutdown_primes", false));
    }
}
