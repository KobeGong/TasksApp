package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: cav  reason: default package */
/* compiled from: PG */
public final class cav extends cau {
    private final bza a;
    private final buu b;

    cav(bza bza, buu buu) {
        this.a = bza;
        this.b = buu;
    }

    @Override // defpackage.bwg
    public final String a() {
        return "RPC_SET_USER_PREFERENCE";
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cau
    public final ccr b(Bundle bundle) {
        ccr a2;
        dih dih;
        deb deb;
        btr btr;
        String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1;
        List<bus> a3 = this.b.a(string, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (bus bus : a3) {
            try {
                dez dez = dez.d;
                dii dii = (dii) dez.a(bg.ao);
                dii.a((dih) dez);
                byte[] c = bus.c();
                dii dii2 = (dii) dii.a(c, c.length);
                if (dii2.b) {
                    dih = dii2.a;
                } else {
                    dih dih2 = dii2.a;
                    djz.a.a(dih2).c(dih2);
                    dii2.b = true;
                    dih = dii2.a;
                }
                dih dih3 = dih;
                if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                dez dez2 = (dez) dih3;
                btt btt = new btt();
                if (dez2.b == null) {
                    deb = deb.d;
                } else {
                    deb = dez2.b;
                }
                btv btv = new btv();
                String str = deb.b;
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
                btv.a = str;
                btv.b = deb.c;
                String str2 = "";
                if (btv.a == null) {
                    str2 = String.valueOf(str2).concat(" key");
                }
                if (!str2.isEmpty()) {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                btt.a = new btp(btv.a, btv.b);
                dey a4 = dey.a(dez2.c);
                if (a4 == null) {
                    a4 = dey.NOTIFY_PREFERENCE_UNKNOWN;
                }
                if (a4 == dey.NOTIFY) {
                    btr = btr.NOTIFY;
                } else if (a4 == dey.DROP) {
                    btr = btr.DROP;
                } else {
                    btr = btr.UNKNOWN_PREFERENCE;
                }
                if (btr == null) {
                    throw new NullPointerException("Null preference");
                }
                btt.b = btr;
                String str3 = "";
                if (btt.a == null) {
                    str3 = String.valueOf(str3).concat(" preferenceKey");
                }
                if (btt.b == null) {
                    str3 = String.valueOf(str3).concat(" preference");
                }
                if (!str3.isEmpty()) {
                    String valueOf2 = String.valueOf(str3);
                    throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                }
                bto bto = new bto(btt.a, btt.b);
                linkedHashMap.put(bto.a(), bto);
            } catch (dir e) {
                bty.b("SetUserPreferenceHandler", e, "Failed to parse PreferenceEntry from ChimeTaskData", new Object[0]);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            bza bza = this.a;
            btx btx = new btx();
            btx.a = arrayList;
            String str4 = "";
            if (btx.a == null) {
                str4 = String.valueOf(str4).concat(" preferenceEntries");
            }
            if (!str4.isEmpty()) {
                String valueOf3 = String.valueOf(str4);
                throw new IllegalStateException(valueOf3.length() != 0 ? "Missing required properties:".concat(valueOf3) : new String("Missing required properties:"));
            }
            a2 = bza.a(string, new btq(btx.a), z);
        } else {
            ccs e2 = ccr.e();
            e2.b = new IllegalArgumentException("No preferences to set.");
            a2 = e2.a(false).a();
        }
        if (!a2.d() || !a2.c()) {
            this.b.a(string, a3);
        }
        return a2;
    }
}
