package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: byy  reason: default package */
/* compiled from: PG */
public final class byy implements bwg {
    private final buu a;
    private final bup b;
    private final byh c;
    private final cae d;

    byy(buu buu, bup bup, byh byh, cae cae) {
        this.a = buu;
        this.b = bup;
        this.c = byh;
        this.d = cae;
    }

    @Override // defpackage.bwg
    public final String a() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    public final void a(bul bul, Collection collection) {
        cld.a(collection != null && !collection.isEmpty());
        String b2 = bul != null ? bul.b() : null;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.a.a(b2, 5, ((dfy) it.next()).b()));
        }
        try {
            this.d.a(bul, 5, "ON_NOTIFICATION_RECEIVED", bundle);
        } catch (cad e) {
            bty.b("OnNotificationReceivedHandler", "Unable to schedule task for notification received event.", new Object[0]);
            this.a.a(b2, arrayList);
        }
    }

    @Override // defpackage.bwg
    public final btl a(Bundle bundle) {
        bul bul;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        if (!TextUtils.isEmpty(string)) {
            try {
                bul = this.b.a(string);
            } catch (buo e) {
                return btl.a(e);
            }
        } else {
            bul = null;
        }
        List<bus> a2 = this.a.a(string, 5);
        ArrayList arrayList = new ArrayList();
        for (bus bus : a2) {
            try {
                arrayList.add((dfy) dih.a(dfy.m, bus.c()));
            } catch (dir e2) {
                bty.b("OnNotificationReceivedHandler", e2, "Unable to parse FrontendNotificationThread message", new Object[0]);
            }
        }
        this.a.a(string, a2);
        this.c.a(bul, arrayList, bvo.c());
        return btl.a;
    }
}
