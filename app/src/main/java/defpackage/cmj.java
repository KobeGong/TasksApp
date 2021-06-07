package defpackage;

import android.os.health.TimerStat;

/* renamed from: cmj  reason: default package */
/* compiled from: PG */
public final class cmj extends cmh {
    public static final cmj a = new cmj();

    private cmj() {
        super(egb.class);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ String a(dmf dmf) {
        egb egb = (egb) dmf;
        String str = egb.c.b;
        if (str != null) {
            return str;
        }
        return Long.toHexString(egb.c.a.longValue());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(dmf dmf, dmf dmf2) {
        return cky.a((egb) dmf, (egb) dmf2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cmh
    public final /* synthetic */ dmf a(String str, Object obj) {
        return cky.a(str, (TimerStat) obj);
    }
}
