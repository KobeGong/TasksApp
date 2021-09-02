package com.google.android.apps.tasks.features.chime;

/* compiled from: PG */
public class GcmListenerService extends defpackage.bhg {
    public final void a(android.os.Bundle bundle) {
        defpackage.dfy dfy;
        defpackage.dch dch;
        boolean z = false;
        defpackage.dfm a = a(bundle.getString("casp"));
        if (a != null) {
            if (a.c == null) {
                dfy = defpackage.dfy.m;
            } else {
                dfy = a.c;
            }
            if (dfy != null) {
                java.lang.String str = dfy.e;
                char c = 65535;
                switch (str.hashCode()) {
                    case 1469540231:
                        if (str.equals("trigger_incremental_sync")) {
                            c = 0;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        defpackage.dbq a2 = a(dfy);
                        if (a2 != null) {
                            if (a2.a != null) {
                                z = true;
                            }
                            if (z) {
                                if (a2.a == null) {
                                    dch = defpackage.dch.b;
                                } else {
                                    dch = a2.a;
                                }
                                defpackage.akf.a().a(getApplicationContext(), a.b, dch.a);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private static defpackage.dbq a(defpackage.dfy dfy) {
        defpackage.dgu dgu;
        try {
            if (dfy.j == null) {
                dgu = defpackage.dgu.b;
            } else {
                dgu = dfy.j;
            }
            return (defpackage.dbq) defpackage.dih.a((defpackage.dih) defpackage.dbq.b, dgu.a);
        } catch (defpackage.dir e) {
            defpackage.azb.a("Failed to parse PushNotificationPayload proto", new java.lang.Object[0]);
            return null;
        }
    }

    private static defpackage.dfm a(java.lang.String str) {
        byte[] bArr;
        try {
            bArr = android.util.Base64.decode(str, 1);
        } catch (java.lang.IllegalArgumentException e) {
            defpackage.azb.a("Failed to decode AndroidPayload", new java.lang.Object[0]);
            bArr = null;
        }
        try {
            return (defpackage.dfm) defpackage.dih.a((defpackage.dih) defpackage.dfm.e, bArr);
        } catch (defpackage.dir e2) {
            defpackage.azb.a("Failed to parse AndroidPayload proto", new java.lang.Object[0]);
            return null;
        }
    }
}
