package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bwm  reason: default package */
/* compiled from: PG */
public final class bwm implements bvn {
    private final bup a;
    private final bza b;
    private final cbb c;
    private final bux d;
    private final bwk e;
    private final cbl f;

    bwm(bup bup, bza bza, cbb cbb, bux bux, bwk bwk, cbl cbl, bzd bzd) {
        this.a = bup;
        this.b = bza;
        this.c = cbb;
        this.d = bux;
        this.e = bwk;
        this.f = cbl;
    }

    @Override // defpackage.bvn
    public final boolean a(Intent intent) {
        return intent != null && "com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction());
    }

    @Override // defpackage.bvn
    public final void a(Intent intent, bvo bvo) {
        bul a2;
        dfr dfr;
        dfl dfl;
        dih dih;
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_NAME");
        String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.libraries.notifications.THREAD_IDS");
        String stringExtra2 = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        int intExtra = intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", 0);
        cld.a(stringArrayExtra);
        if (stringExtra == null) {
            a2 = null;
        } else {
            try {
                a2 = this.a.a(stringExtra);
            } catch (buo e2) {
                bty.b("SystemTrayIntentHandler", e2, "Error handling system tray action [%s]", stringExtra2);
                return;
            }
        }
        List<buv> a3 = this.d.a(stringExtra, stringArrayExtra);
        if ((intExtra & 8) > 0) {
            this.f.a(a2, Arrays.asList(stringArrayExtra));
        }
        if (!a3.isEmpty()) {
            bwk bwk = this.e;
            if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(stringExtra2)) {
                bty.d("EventCallbackHelper", "Notification clicked for account [%s], on threads [%s]", stringExtra, bwk.a(a3));
                if (bwk.b.a()) {
                    ((cbu) bwk.b.b()).b();
                } else if (a3.size() == 1) {
                    bwk.a(((buv) a3.get(0)).g().g);
                }
            } else if ("com.google.android.libraries.notifications.NOTIFICATION_REMOVED".equals(stringExtra2)) {
                bty.d("EventCallbackHelper", "Notification removed for account [%s], on threads [%s]", stringExtra, bwk.a(a3));
                if (bwk.b.a()) {
                    ((cbu) bwk.b.b()).c();
                }
            } else if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(stringExtra2)) {
                bty.d("EventCallbackHelper", "Notification expired for account [%s], on threads [%s]", stringExtra, bwk.a(a3));
                if (bwk.b.a()) {
                    ((cbu) bwk.b.b()).d();
                }
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                cld.a(a3.size() == 1);
                cld.a(stringExtra2.startsWith("com.google.android.libraries.notifications.ACTION_ID:"));
                String replaceFirst = stringExtra2.replaceFirst("com.google.android.libraries.notifications.ACTION_ID:", "");
                dfn g = ((buv) a3.get(0)).g();
                if (g.h == null) {
                    dfr = dfr.f;
                } else {
                    dfr = g.h;
                }
                Iterator it = dfr.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dfl = null;
                        break;
                    }
                    dfl dfl2 = (dfl) it.next();
                    if (replaceFirst.equals(dfl2.d)) {
                        dfl = dfl2;
                        break;
                    }
                }
                bty.d("EventCallbackHelper", "Notification action clicked for account [%s], on thread [%s]", stringExtra, ((buv) a3.get(0)).a());
                if (bwk.b.a()) {
                    ((cbu) bwk.b.b()).e();
                } else {
                    bwk.a(dfl.c);
                }
            }
            if (intExtra == 0) {
                return;
            }
            if (a2 != null) {
                this.c.a.a(a2, bzd.a(bzd.a(intExtra)), buv.a(a3), "UpdateThreadStateCallback");
                return;
            }
            for (buv buv : a3) {
                if (!TextUtils.isEmpty(buv.j())) {
                    bza bza = this.b;
                    String j = buv.j();
                    dii dii = (dii) deu.d.a(bg.ao);
                    dii.b();
                    deu deu = (deu) dii.a;
                    if (j == null) {
                        throw new NullPointerException();
                    }
                    deu.a |= 1;
                    deu.b = j;
                    dgm a4 = bzd.a(intExtra);
                    dii.b();
                    deu deu2 = (deu) dii.a;
                    if (a4 == null) {
                        throw new NullPointerException();
                    }
                    deu2.c = a4;
                    deu2.a |= 2;
                    if (dii.b) {
                        dih = dii.a;
                    } else {
                        dih dih2 = dii.a;
                        djz.a.a(dih2).c(dih2);
                        dii.b = true;
                        dih = dii.a;
                    }
                    dih dih3 = dih;
                    if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                        throw new dkw();
                    }
                    bza.a.a.a("/v1/updatethreadstatebytoken", null, (deu) dih3, dev.a);
                }
            }
        }
    }
}
