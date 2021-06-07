package com.google.android.apps.tasks.features.chime;

import android.os.Bundle;
import android.util.Base64;

/* compiled from: PG */
public class GcmListenerService extends bhg {
    @Override // defpackage.bhg
    public final void a(Bundle bundle) {
        dfy dfy;
        dch dch;
        boolean z = false;
        dfm a = a(bundle.getString("casp"));
        if (a != null) {
            if (a.c == null) {
                dfy = dfy.m;
            } else {
                dfy = a.c;
            }
            if (dfy != null) {
                String str = dfy.e;
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
                        dbq a2 = a(dfy);
                        if (a2 != null) {
                            if (a2.a != null) {
                                z = true;
                            }
                            if (z) {
                                if (a2.a == null) {
                                    dch = dch.b;
                                } else {
                                    dch = a2.a;
                                }
                                akf.a().a(getApplicationContext(), a.b, dch.a);
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

    private static dbq a(dfy dfy) {
        dgu dgu;
        try {
            if (dfy.j == null) {
                dgu = dgu.b;
            } else {
                dgu = dfy.j;
            }
            return (dbq) dih.a(dbq.b, dgu.a);
        } catch (dir e) {
            azb.a("Failed to parse PushNotificationPayload proto", new Object[0]);
            return null;
        }
    }

    private static dfm a(String str) {
        byte[] bArr;
        try {
            bArr = Base64.decode(str, 1);
        } catch (IllegalArgumentException e) {
            azb.a("Failed to decode AndroidPayload", new Object[0]);
            bArr = null;
        }
        try {
            return (dfm) dih.a(dfm.e, bArr);
        } catch (dir e2) {
            azb.a("Failed to parse AndroidPayload proto", new Object[0]);
            return null;
        }
    }
}
