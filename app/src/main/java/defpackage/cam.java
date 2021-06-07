package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: cam  reason: default package */
/* compiled from: PG */
public final class cam extends cau {
    private static final Charset e = Charset.forName("UTF-8");
    public bza a;
    public buu b;
    public cae c;

    cam() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_DELETE_USER_SUBSCRIPTION";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<bus> a2 = this.b.a(string, 4);
        TreeSet treeSet = new TreeSet();
        for (bus bus : a2) {
            treeSet.add(new String(bus.c(), e));
        }
        ccr b2 = this.a.b(string, new ArrayList(treeSet));
        if (!b2.d() || !b2.c()) {
            this.b.a(string, a2);
        }
        return b2;
    }
}
