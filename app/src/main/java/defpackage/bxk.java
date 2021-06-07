package defpackage;

import android.content.Context;

/* renamed from: bxk  reason: default package */
/* compiled from: PG */
public final class bxk {
    public static volatile bxl a = null;

    public static bxl a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof cqb) {
            return (bxl) ((cqb) applicationContext).a();
        }
        if (applicationContext instanceof aik) {
            return (bxl) ((aik) applicationContext).a();
        }
        cld.b(a != null, "Unable to get ChimeComponent from host app.");
        return a;
    }
}
