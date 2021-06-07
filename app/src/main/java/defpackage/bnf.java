package defpackage;

import android.os.Bundle;
import android.util.Log;

/* renamed from: bnf  reason: default package */
/* compiled from: PG */
public final class bnf extends bnm {
    private final bba a;

    public bnf(bba bba) {
        super((byte) 0);
        this.a = bba;
    }

    public final void a() {
        this.a.b = null;
    }

    @Override // defpackage.bnm
    public final void a(int i, Bundle bundle) {
        if (i != 0) {
            Log.w("PeopleClient", "Non-success data changed callback received.");
            return;
        }
        bba bba = this.a;
        bbd bbd = new bbd(bundle.getString("account"), bundle.getString("pagegaiaid"), bundle.getInt("scope"));
        azb.b(bbd, "Notifier must not be null");
        bba.a.sendMessage(bba.a.obtainMessage(1, bbd));
    }
}
