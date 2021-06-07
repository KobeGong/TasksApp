package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bwk  reason: default package */
/* compiled from: PG */
public final class bwk {
    public Context a;
    public crv b;

    bwk() {
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((buv) it.next()).a());
        }
        return TextUtils.join(", ", arrayList);
    }
}
