package defpackage;

/* renamed from: cau reason: default package */
/* compiled from: PG */
public abstract class cau implements defpackage.bwg {
    public java.util.Map d;

    /* access modifiers changed from: 0000 */
    public abstract defpackage.ccr b(android.os.Bundle bundle);

    public final defpackage.btl a(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK");
        java.lang.String string2 = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        defpackage.ccr b = b(bundle);
        if (b.d() && b.c()) {
            return defpackage.btl.b(b.b());
        }
        if (android.text.TextUtils.isEmpty(string) || !this.d.containsKey(string)) {
            defpackage.bty.c("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", string);
        } else {
            defpackage.bty.c("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", string);
            defpackage.caf caf = (defpackage.caf) this.d.get(string);
            if (b.d()) {
                b.b();
                caf.a(string2);
            } else {
                caf.a(string2, b.a());
            }
        }
        if (b.d()) {
            return defpackage.btl.a(b.b());
        }
        return defpackage.btl.a;
    }
}
