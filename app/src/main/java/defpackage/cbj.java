package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* renamed from: cbj  reason: default package */
/* compiled from: PG */
public final class cbj {
    public Context a;
    public buc b;

    public final void a(ni niVar, buv buv) {
        String b2 = b(buv);
        if (!TextUtils.isEmpty(b2)) {
            bty.d("NotificationChannelHelperImpl", "Setting channel Id: '%s'", b2);
            niVar.s = b2;
        }
    }

    public final Set a() {
        if (!bwj.c()) {
            return Collections.emptySet();
        }
        qt qtVar = new qt();
        for (NotificationChannel notificationChannel : ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
            qtVar.add(notificationChannel.getId());
        }
        return qtVar;
    }

    public final boolean a(buv buv) {
        if (!bwj.a(this.a)) {
            return true;
        }
        String b2 = b(buv);
        if (TextUtils.isEmpty(b2) || ((NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(b2).getImportance() <= 0) {
            return false;
        }
        return true;
    }

    private final String b(buv buv) {
        dfq dfq;
        Set a2 = a();
        dfn g = buv.g();
        if (g.n == null) {
            dfq = dfq.c;
        } else {
            dfq = g.n;
        }
        String str = dfq.b;
        if (!TextUtils.isEmpty(str) && a2.contains(str)) {
            return str;
        }
        String k = this.b.f().k();
        if (!TextUtils.isEmpty(k) && a2.contains(k)) {
            return k;
        }
        bty.e("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s'", str, k);
        return null;
    }
}
