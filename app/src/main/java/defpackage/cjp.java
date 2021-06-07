package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cjp  reason: default package */
/* compiled from: PG */
public final class cjp implements clt {
    private final /* synthetic */ cjo a;

    cjp(cjo cjo) {
        this.a = cjo;
    }

    @Override // defpackage.clt
    public final /* synthetic */ Object a() {
        return this.a.a.getSharedPreferences("primes", 0);
    }
}
