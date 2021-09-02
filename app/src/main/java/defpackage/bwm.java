package defpackage;

/* renamed from: bwm reason: default package */
/* compiled from: PG */
public final class bwm implements defpackage.bvn {
    private final defpackage.bup a;
    private final defpackage.bza b;
    private final defpackage.cbb c;
    private final defpackage.bux d;
    private final defpackage.bwk e;
    private final defpackage.cbl f;

    bwm(defpackage.bup bup, defpackage.bza bza, defpackage.cbb cbb, defpackage.bux bux, defpackage.bwk bwk, defpackage.cbl cbl, defpackage.bzd bzd) {
        this.a = bup;
        this.b = bza;
        this.c = cbb;
        this.d = bux;
        this.e = bwk;
        this.f = cbl;
    }

    public final boolean a(android.content.Intent intent) {
        return intent != null && "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }

    public final void a(android.content.Intent intent, defpackage.bvo bvo) {
        defpackage.bul a2;
        defpackage.dfr dfr;
        defpackage.dfl dfl;
        defpackage.dih dih;
        java.lang.String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_NAME");
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.libraries.notifications.THREAD_IDS");
        java.lang.String stringExtra2 = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        int intExtra = intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", 0);
        defpackage.cld.a((java.lang.Object) stringArrayExtra);
        if (stringExtra == null) {
            a2 = null;
        } else {
            try {
                a2 = this.a.a(stringExtra);
            } catch (defpackage.buo e2) {
                defpackage.bty.b("SystemTrayIntentHandler", e2, "Error handling system tray action [%s]", stringExtra2);
                return;
            }
        }
        java.util.List<defpackage.buv> a3 = this.d.a(stringExtra, stringArrayExtra);
        if ((intExtra & 8) > 0) {
            this.f.a(a2, java.util.Arrays.asList(stringArrayExtra));
        }
        if (!a3.isEmpty()) {
            defpackage.bwk bwk = this.e;
            if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(stringExtra2)) {
                defpackage.bty.d("EventCallbackHelper", "Notification clicked for account [%s], on threads [%s]", stringExtra, defpackage.bwk.a((java.util.List) a3));
                if (bwk.b.a()) {
                    ((defpackage.cbu) bwk.b.b()).b();
                } else if (a3.size() == 1) {
                    bwk.a(((defpackage.buv) a3.get(0)).g().g);
                }
            } else if ("com.google.android.libraries.notifications.NOTIFICATION_REMOVED".equals(stringExtra2)) {
                defpackage.bty.d("EventCallbackHelper", "Notification removed for account [%s], on threads [%s]", stringExtra, defpackage.bwk.a((java.util.List) a3));
                if (bwk.b.a()) {
                    ((defpackage.cbu) bwk.b.b()).c();
                }
            } else if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(stringExtra2)) {
                defpackage.bty.d("EventCallbackHelper", "Notification expired for account [%s], on threads [%s]", stringExtra, defpackage.bwk.a((java.util.List) a3));
                if (bwk.b.a()) {
                    ((defpackage.cbu) bwk.b.b()).d();
                }
            } else if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                defpackage.cld.a(a3.size() == 1);
                defpackage.cld.a(stringExtra2.startsWith("com.google.android.libraries.notifications.ACTION_ID:"));
                java.lang.String replaceFirst = stringExtra2.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", "");
                defpackage.dfn g = ((defpackage.buv) a3.get(0)).g();
                if (g.h == null) {
                    dfr = defpackage.dfr.f;
                } else {
                    dfr = g.h;
                }
                java.util.Iterator it = dfr.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dfl = null;
                        break;
                    }
                    defpackage.dfl dfl2 = (defpackage.dfl) it.next();
                    if (replaceFirst.equals(dfl2.d)) {
                        dfl = dfl2;
                        break;
                    }
                }
                defpackage.bty.d("EventCallbackHelper", "Notification action clicked for account [%s], on thread [%s]", stringExtra, ((defpackage.buv) a3.get(0)).a());
                if (bwk.b.a()) {
                    ((defpackage.cbu) bwk.b.b()).e();
                } else {
                    bwk.a(dfl.c);
                }
            }
            if (intExtra == 0) {
                return;
            }
            if (a2 != null) {
                this.c.a.a(a2, defpackage.bzd.a(defpackage.bzd.a(intExtra)), defpackage.buv.a((java.util.List) a3), "UpdateThreadStateCallback");
                return;
            }
            for (defpackage.buv buv : a3) {
                if (!android.text.TextUtils.isEmpty(buv.j())) {
                    defpackage.bza bza = this.b;
                    java.lang.String j = buv.j();
                    defpackage.dii dii = (defpackage.dii) defpackage.deu.d.a(defpackage.bg.ao);
                    dii.b();
                    defpackage.deu deu = (defpackage.deu) dii.a;
                    if (j == null) {
                        throw new java.lang.NullPointerException();
                    }
                    deu.a |= 1;
                    deu.b = j;
                    defpackage.dgm a4 = defpackage.bzd.a(intExtra);
                    dii.b();
                    defpackage.deu deu2 = (defpackage.deu) dii.a;
                    if (a4 == null) {
                        throw new java.lang.NullPointerException();
                    }
                    deu2.c = a4;
                    deu2.a |= 2;
                    if (dii.b) {
                        dih = dii.a;
                    } else {
                        defpackage.dih dih2 = dii.a;
                        defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                        dii.b = true;
                        dih = dii.a;
                    }
                    defpackage.dih dih3 = dih;
                    if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                        throw new defpackage.dkw();
                    }
                    bza.a.a.a("/v1/updatethreadstatebytoken", null, (defpackage.deu) dih3, defpackage.dev.a);
                }
            }
        }
    }
}
