package defpackage;

/* renamed from: dqh reason: default package */
/* compiled from: PG */
public final class dqh extends defpackage.dqv {
    private final defpackage.eht x;
    private int y = 4194304;

    public static defpackage.dqh a(java.lang.String str, defpackage.eht eht) {
        defpackage.cld.a((java.lang.Object) eht, (java.lang.Object) "cronetEngine");
        return new defpackage.dqh(str, eht);
    }

    private dqh(java.lang.String str, defpackage.eht eht) {
        super(java.net.InetSocketAddress.createUnresolved(str, 443), defpackage.dvc.a(str, 443));
        this.x = (defpackage.eht) defpackage.cld.a((java.lang.Object) eht, (java.lang.Object) "cronetEngine");
    }

    /* access modifiers changed from: protected */
    public final defpackage.dtc a() {
        return new defpackage.dqi(new defpackage.dqj(this.x), defpackage.cyn.a, this.y, new defpackage.dzt(this.r.a));
    }

    /* access modifiers changed from: protected */
    public final defpackage.dmv b() {
        return defpackage.dmv.a().a(defpackage.dpg.a, java.lang.Integer.valueOf(443)).a();
    }
}
