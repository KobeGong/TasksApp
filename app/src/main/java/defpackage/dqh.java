package defpackage;

import java.net.InetSocketAddress;

/* renamed from: dqh  reason: default package */
/* compiled from: PG */
public final class dqh extends dqv {
    private final eht x;
    private int y = 4194304;

    public static dqh a(String str, eht eht) {
        cld.a(eht, "cronetEngine");
        return new dqh(str, eht);
    }

    private dqh(String str, eht eht) {
        super(InetSocketAddress.createUnresolved(str, 443), dvc.a(str, 443));
        this.x = (eht) cld.a(eht, "cronetEngine");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqv
    public final dtc a() {
        return new dqi(new dqj(this.x), cyn.INSTANCE, this.y, new dzt(this.r.a));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dqv
    public final dmv b() {
        return dmv.a().a(dpg.a, 443).a();
    }
}
