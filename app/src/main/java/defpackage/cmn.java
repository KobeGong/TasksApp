package defpackage;

import android.content.Context;

/* renamed from: cmn  reason: default package */
/* compiled from: PG */
public final class cmn {
    private volatile boolean a;

    public final boolean a(Context context, String str, boolean z) {
        if (this.a) {
            return z;
        }
        try {
            return bqb.a(context.getContentResolver(), str, z);
        } catch (SecurityException e) {
            this.a = true;
            cdm.b("GservicesWrapper", "Failed to read GServices.", e, new Object[0]);
            return z;
        }
    }
}
