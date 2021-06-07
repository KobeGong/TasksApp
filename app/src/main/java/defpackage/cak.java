package defpackage;

import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: cak  reason: default package */
/* compiled from: PG */
public final class cak extends cau {
    private static final Charset e = Charset.forName("UTF-8");
    public bza a;
    public buu b;
    public cae c;

    cak() {
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_CREATE_USER_SUBSCRIPTION";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        List<bus> a2 = this.b.a(string, 3);
        TreeSet treeSet = new TreeSet();
        for (bus bus : a2) {
            treeSet.add(new String(bus.c(), e));
        }
        ccr a3 = this.a.a(string, new ArrayList(treeSet));
        if (!a3.d() || !a3.c()) {
            this.b.a(string, a2);
        }
        return a3;
    }
}
