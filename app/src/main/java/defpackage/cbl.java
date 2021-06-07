package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.text.Html;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: cbl  reason: default package */
/* compiled from: PG */
public final class cbl {
    private final Context a;
    private final crv b;
    private final crv c;
    private final cbk d;
    private final bux e;
    private final cbj f;
    private final ccu g;
    private final bya h;

    public final void a(bul bul, buv buv, boolean z, boolean z2, bvo bvo) {
        boolean z3;
        bty.a("SystemTrayManagerImpl", "Updating notification", new Object[0]);
        String b2 = bul != null ? bul.b() : null;
        if (!z) {
            List a2 = this.e.a(b2, buv.a());
            if (a2.isEmpty() || ((buv) a2.get(0)).e().longValue() < buv.e().longValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", buv.a());
                return;
            }
        }
        if (!this.f.a(buv)) {
            this.h.a(ddi.BAD_CHANNEL).a(bul).a(buv).a();
            bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", buv.a());
        } else if (!nm.a(this.a).a()) {
            this.h.a(ddi.USER_BLOCKED).a(bul).a(buv).a();
            bty.a("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", buv.a());
        } else {
            String a3 = a(bul, buv.a());
            ni a4 = this.d.a.a(a3, bul, buv, z2, bvo);
            if (a4 != null) {
                if (this.b.a()) {
                    ((cbt) this.b.b()).a();
                }
                a(bul, buv, a3, a4, z, z2);
            }
        }
    }

    public final synchronized void a(bul bul, List list) {
        String b2 = bul != null ? bul.b() : null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nm.a(this.a).a(a(bul, (String) it.next()));
        }
        String[] strArr = (String[]) list.toArray(new String[0]);
        List<buv> a2 = this.e.a(b2, strArr);
        this.e.b(b2, strArr);
        HashSet hashSet = new HashSet();
        for (buv buv : a2) {
            String k = buv.k();
            if (hashSet.add(k)) {
                a(b(bul, k), k, bul, true);
            }
        }
    }

    public final synchronized void a(bul bul) {
        String b2 = bul != null ? bul.b() : null;
        List<buv> a2 = this.e.a(b2);
        this.e.b(b2);
        HashSet<String> hashSet = new HashSet();
        for (buv buv : a2) {
            hashSet.add(buv.k());
            nm.a(this.a).a(a(bul, buv.a()));
        }
        for (String str : hashSet) {
            nm.a(this.a).a(b(bul, str));
        }
    }

    public cbl(Context context, crv crv, crv crv2, cbk cbk, bux bux, cbj cbj, ccu ccu, bya bya) {
        this.a = context;
        this.b = crv;
        this.c = crv2;
        this.d = cbk;
        this.e = bux;
        this.f = cbj;
        this.g = ccu;
        this.h = bya;
    }

    private final synchronized void a(bul bul, buv buv, String str, ni niVar, boolean z, boolean z2) {
        int a2 = this.e.a(bul != null ? bul.b() : null, buv);
        if (z || a2 == bg.U || a2 == bg.V) {
            String b2 = b(bul, buv.k());
            if (a(b2, buv.k(), bul, z2 || (a2 != bg.U && !z))) {
                niVar.l = false;
                niVar.k = b2;
            }
            nm.a(this.a).a(str, niVar.b());
            this.h.a(ddr.SHOWN).a(bul).a(buv).a();
            if (this.c.a()) {
                Arrays.asList(buv);
                ((cbu) this.c.b()).a();
            }
            if (buv.l().longValue() > 0) {
                long convert = TimeUnit.MILLISECONDS.convert(buv.l().longValue(), TimeUnit.MICROSECONDS);
                AlarmManager alarmManager = (AlarmManager) this.a.getSystemService("alarm");
                ccu ccu = this.g;
                alarmManager.set(1, convert, PendingIntent.getBroadcast(ccu.a, ccu.a(str, "com.google.android.libraries.notifications.NOTIFICATION_EXPIRED"), ccu.a("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED", ccu.b.f().j(), bul, Arrays.asList(buv), 12), 134217728));
            }
        }
    }

    private final boolean a(String str, String str2, bul bul, boolean z) {
        ni niVar;
        if (!bwj.d() && "chime_default_group".equals(str2)) {
            return false;
        }
        List<buv> a2 = this.e.a(bul != null ? bul.b() : null, "group_id=?", new String[]{str2});
        ArrayList arrayList = new ArrayList();
        for (buv buv : a2) {
            if (this.f.a(buv)) {
                arrayList.add(buv);
            }
        }
        if (arrayList.isEmpty()) {
            nm.a(this.a).a(str);
            return false;
        }
        cbk cbk = this.d;
        if (bwj.d()) {
            cbm cbm = cbk.a;
            cld.a(true);
            cld.a(!arrayList.isEmpty());
            buf f2 = cbm.b.f();
            ni niVar2 = new ni(cbm.a, (byte) 0);
            niVar2.t = 2;
            ni a3 = niVar2.a(f2.a().intValue());
            if (bul != null) {
                a3.c(bul.b());
            }
            if (f2.c() != null) {
                a3.p = cbm.a.getResources().getColor(f2.c().intValue());
            }
            cbm.d.a(a3, (buv) arrayList.get(0));
            cbm.a(a3, f2, bul, arrayList.size());
            a3.f = cbm.c.a(str, bul, arrayList);
            a3.a(cbm.c.b(str, bul, arrayList));
            niVar = a3;
        } else if (arrayList.size() == 1) {
            niVar = cbk.a.a(str, bul, (buv) arrayList.get(0), z, bvo.c());
        } else {
            cbm cbm2 = cbk.a;
            cld.a(true);
            cld.a(arrayList.size() >= 2);
            buf f3 = cbm2.b.f();
            nj njVar = new nj();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                dfn g2 = ((buv) obj).g();
                njVar.a(Html.fromHtml(cbm2.a.getString(R.string.combined_notification_text, g2.b, g2.c)));
            }
            ni a4 = new ni(cbm2.a, (byte) 0).a(cbm2.a.getString(f3.b().intValue())).b(cbm2.a.getResources().getQuantityString(R.plurals.public_notification_text, arrayList.size(), Integer.valueOf(arrayList.size()))).a(f3.a().intValue()).a(njVar);
            if (bul != null) {
                a4.c(bul.b());
            }
            if (f3.c() != null) {
                a4.p = cbm2.a.getResources().getColor(f3.c().intValue());
            }
            cbm.a(a4, f3, ((buv) arrayList.get(0)).g(), z);
            cbm2.a(a4, f3, bul, arrayList.size());
            a4.f = cbm2.c.a(str, bul, arrayList);
            a4.a(cbm2.c.b(str, bul, arrayList));
            niVar = a4;
        }
        if (this.b.a()) {
            ((cbt) this.b.b()).c();
        }
        niVar.l = true;
        niVar.k = str;
        nm.a(this.a).a(str, niVar.b());
        return true;
    }

    private static String a(bul bul, String str) {
        String c2 = bul == null ? "Anonymous" : bul.c();
        return new StringBuilder(String.valueOf(c2).length() + 2 + String.valueOf(str).length()).append(c2).append("::").append(str).toString();
    }

    private static String b(bul bul, String str) {
        String c2 = bul == null ? "Anonymous" : bul.c();
        return new StringBuilder(String.valueOf(c2).length() + 11 + String.valueOf(str).length()).append(c2).append("::SUMMARY::").append(str).toString();
    }
}
