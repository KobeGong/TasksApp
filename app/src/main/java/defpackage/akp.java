package defpackage;

import android.content.Context;

/* renamed from: akp  reason: default package */
/* compiled from: PG */
public final class akp {
    public static boolean a(Context context, String str) {
        try {
            return bqb.a(context.getContentResolver(), str, false);
        } catch (SecurityException e) {
            return false;
        }
    }
}
