package defpackage;

/* renamed from: cav reason: default package */
/* compiled from: PG */
public final class cav extends defpackage.cau {
    private final defpackage.bza a;
    private final defpackage.buu b;

    cav(defpackage.bza bza, defpackage.buu buu) {
        this.a = bza;
        this.b = buu;
    }

    public final java.lang.String a() {
        return "RPC_SET_USER_PREFERENCE";
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ccr b(android.os.Bundle bundle) {
        defpackage.ccr a2;
        defpackage.dih dih;
        defpackage.deb deb;
        defpackage.btr btr;
        java.lang.String string = bundle.getString("com.google.android.libraries.notifications.ACCOUNT_NAME");
        boolean z = bundle.getInt("com.google.android.libraries.notifications.internal.scheduled.impl.INTENT_EXTRA_INCLUDE_TARGET") == 1;
        java.util.List<defpackage.bus> a3 = this.b.a(string, 6);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (defpackage.bus bus : a3) {
            try {
                defpackage.dez dez = defpackage.dez.d;
                defpackage.dii dii = (defpackage.dii) dez.a(defpackage.bg.ao);
                dii.a((defpackage.dih) dez);
                defpackage.dii dii2 = dii;
                byte[] c = bus.c();
                defpackage.dii dii3 = (defpackage.dii) dii2.a(c, c.length);
                if (dii3.b) {
                    dih = dii3.a;
                } else {
                    defpackage.dih dih2 = dii3.a;
                    defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                    dii3.b = true;
                    dih = dii3.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.dez dez2 = (defpackage.dez) dih3;
                defpackage.btt btt = new defpackage.btt();
                if (dez2.b == null) {
                    deb = defpackage.deb.d;
                } else {
                    deb = dez2.b;
                }
                defpackage.btv btv = new defpackage.btv();
                java.lang.String str = deb.b;
                if (str == null) {
                    throw new java.lang.NullPointerException("Null key");
                }
                btv.a = str;
                btv.b = deb.c;
                java.lang.String str2 = "";
                if (btv.a == null) {
                    str2 = java.lang.String.valueOf(str2).concat(" key");
                }
                if (!str2.isEmpty()) {
                    java.lang.String str3 = "Missing required properties:";
                    java.lang.String valueOf = java.lang.String.valueOf(str2);
                    throw new java.lang.IllegalStateException(valueOf.length() != 0 ? str3.concat(valueOf) : new java.lang.String(str3));
                }
                btt.a = new defpackage.btp(btv.a, btv.b);
                defpackage.dey a4 = defpackage.dey.a(dez2.c);
                if (a4 == null) {
                    a4 = defpackage.dey.NOTIFY_PREFERENCE_UNKNOWN;
                }
                if (a4 == defpackage.dey.NOTIFY) {
                    btr = defpackage.btr.NOTIFY;
                } else if (a4 == defpackage.dey.DROP) {
                    btr = defpackage.btr.DROP;
                } else {
                    btr = defpackage.btr.UNKNOWN_PREFERENCE;
                }
                if (btr == null) {
                    throw new java.lang.NullPointerException("Null preference");
                }
                btt.b = btr;
                java.lang.String str4 = "";
                if (btt.a == null) {
                    str4 = java.lang.String.valueOf(str4).concat(" preferenceKey");
                }
                if (btt.b == null) {
                    str4 = java.lang.String.valueOf(str4).concat(" preference");
                }
                if (!str4.isEmpty()) {
                    java.lang.String str5 = "Missing required properties:";
                    java.lang.String valueOf2 = java.lang.String.valueOf(str4);
                    throw new java.lang.IllegalStateException(valueOf2.length() != 0 ? str5.concat(valueOf2) : new java.lang.String(str5));
                }
                defpackage.bto bto = new defpackage.bto(btt.a, btt.b);
                linkedHashMap.put(bto.a(), bto);
            } catch (defpackage.dir e) {
                defpackage.bty.b("SetUserPreferenceHandler", e, "Failed to parse PreferenceEntry from ChimeTaskData", new java.lang.Object[0]);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.values());
        if (!arrayList.isEmpty()) {
            defpackage.bza bza = this.a;
            defpackage.btx btx = new defpackage.btx();
            btx.a = arrayList;
            java.lang.String str6 = "";
            if (btx.a == null) {
                str6 = java.lang.String.valueOf(str6).concat(" preferenceEntries");
            }
            if (!str6.isEmpty()) {
                java.lang.String str7 = "Missing required properties:";
                java.lang.String valueOf3 = java.lang.String.valueOf(str6);
                throw new java.lang.IllegalStateException(valueOf3.length() != 0 ? str7.concat(valueOf3) : new java.lang.String(str7));
            }
            a2 = bza.a(string, (defpackage.btw) new defpackage.btq(btx.a), z);
        } else {
            defpackage.ccs e2 = defpackage.ccr.e();
            e2.b = new java.lang.IllegalArgumentException("No preferences to set.");
            a2 = e2.a(false).a();
        }
        if (!a2.d() || !a2.c()) {
            this.b.a(string, (java.util.List) a3);
        }
        return a2;
    }
}
