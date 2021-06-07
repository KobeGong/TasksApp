package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: cau  reason: default package */
/* compiled from: PG */
public abstract class cau implements bwg {
    public Map d;

    /* access modifiers changed from: package-private */
    public abstract ccr b(Bundle bundle);

    @Override // defpackage.bwg
    public final btl a(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK");
        String string2 = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        ccr b = b(bundle);
        if (b.d() && b.c()) {
            return btl.b(b.b());
        }
        if (TextUtils.isEmpty(string) || !this.d.containsKey(string)) {
            bty.c("ScheduledRpcHandler", "Scheduled RPC callback not found. Callback key: [%s]", string);
        } else {
            bty.c("ScheduledRpcHandler", "Calling scheduled RPC callback. Callback key: [%s]", string);
            caf caf = (caf) this.d.get(string);
            if (b.d()) {
                b.b();
                caf.a(string2);
            } else {
                caf.a(string2, b.a());
            }
        }
        if (b.d()) {
            return btl.a(b.b());
        }
        return btl.a;
    }
}
