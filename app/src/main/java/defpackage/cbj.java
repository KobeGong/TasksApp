package defpackage;

/* renamed from: cbj reason: default package */
/* compiled from: PG */
public final class cbj {
    public android.content.Context a;
    public defpackage.buc b;

    public final void a(defpackage.ni niVar, defpackage.buv buv) {
        java.lang.String b2 = b(buv);
        if (!android.text.TextUtils.isEmpty(b2)) {
            defpackage.bty.d("NotificationChannelHelperImpl", "Setting channel Id: '%s'", b2);
            niVar.s = b2;
        }
    }

    public final java.util.Set a() {
        if (!defpackage.bwj.c()) {
            return java.util.Collections.emptySet();
        }
        defpackage.qt qtVar = new defpackage.qt();
        for (android.app.NotificationChannel id : ((android.app.NotificationManager) this.a.getSystemService("notification")).getNotificationChannels()) {
            qtVar.add(id.getId());
        }
        return qtVar;
    }

    public final boolean a(defpackage.buv buv) {
        if (!defpackage.bwj.a(this.a)) {
            return true;
        }
        java.lang.String b2 = b(buv);
        return !android.text.TextUtils.isEmpty(b2) && ((android.app.NotificationManager) this.a.getSystemService("notification")).getNotificationChannel(b2).getImportance() > 0;
    }

    private final java.lang.String b(defpackage.buv buv) {
        defpackage.dfq dfq;
        java.util.Set a2 = a();
        defpackage.dfn g = buv.g();
        if (g.n == null) {
            dfq = defpackage.dfq.c;
        } else {
            dfq = g.n;
        }
        java.lang.String str = dfq.b;
        if (!android.text.TextUtils.isEmpty(str) && a2.contains(str)) {
            return str;
        }
        java.lang.String k = this.b.f().k();
        if (!android.text.TextUtils.isEmpty(k) && a2.contains(k)) {
            return k;
        }
        defpackage.bty.e("NotificationChannelHelperImpl", "Did not find the intended channel '%s' or the default channel '%s'", str, k);
        return null;
    }
}
