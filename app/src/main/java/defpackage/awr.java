package defpackage;

import android.os.Bundle;
import android.os.IBinder;

/* access modifiers changed from: package-private */
/* renamed from: awr  reason: default package */
/* compiled from: PG */
public final class awr implements avd {
    private /* synthetic */ String a;
    private /* synthetic */ Bundle b;

    awr(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.avd
    public final /* synthetic */ Object a(IBinder iBinder) {
        Bundle bundle = (Bundle) avc.a(bkq.a(iBinder).a(this.a, this.b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new ava(string);
    }
}
