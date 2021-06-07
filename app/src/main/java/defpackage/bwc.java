package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: bwc  reason: default package */
/* compiled from: PG */
public final class bwc {
    public static final Set b = EnumSet.of(btk.REGISTERED, btk.PENDING_REGISTRATION, btk.FAILED_REGISTRATION);
    public final bup a;
    private final bqg c;

    public bwc(bqg bqg, bup bup) {
        this.c = bqg;
        this.a = bup;
    }

    public static boolean a(dfm dfm) {
        dgg dgg;
        dfy dfy;
        if (dfm == null) {
            return false;
        }
        if ((dfm.a & 2) == 2) {
            if (dfm.c == null) {
                dfy = dfy.m;
            } else {
                dfy = dfm.c;
            }
            return !TextUtils.isEmpty(dfy.d);
        } else if ((dfm.a & 4) != 4) {
            return false;
        } else {
            if (dfm.d == null) {
                dgg = dgg.d;
            } else {
                dgg = dfm.d;
            }
            dgh a2 = dgh.a(dgg.b);
            if (a2 == null) {
                a2 = dgh.UNKNOWN_INSTRUCTION;
            }
            if (a2 == dgh.SYNC || a2 == dgh.FULL_SYNC) {
                return !TextUtils.isEmpty(dfm.b);
            }
            return false;
        }
    }

    public static dfm a(String str) {
        byte[] bArr;
        if (str == null) {
            return null;
        }
        try {
            bArr = Base64.decode(str, 1);
        } catch (IllegalArgumentException e) {
            bty.b("PayloadUtil", e, "Failed to decode payload string into bytes.", new Object[0]);
            bArr = null;
        }
        if (bArr != null) {
            try {
                return (dfm) dih.a(dfm.e, bArr);
            } catch (dir e2) {
                bty.b("PayloadUtil", e2, "Failed to parse AndroidPayload proto.", new Object[0]);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(bul bul) {
        try {
            this.c.a(bul.b(), "oauth2:https://www.googleapis.com/auth/notifications");
            return true;
        } catch (IOException e) {
            Object[] objArr = new Object[0];
            if (!bty.a(3)) {
                return true;
            }
            bty.f("PayloadUtil", "IOException getting auth token.", objArr);
            return true;
        } catch (Exception e2) {
            bty.b("PayloadUtil", e2, "Error getting auth token.", new Object[0]);
            return false;
        }
    }
}
