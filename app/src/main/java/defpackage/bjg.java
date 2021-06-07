package defpackage;

import android.content.Context;

/* renamed from: bjg  reason: default package */
/* compiled from: PG */
public final class bjg {
    public static bjg a = new bjg();
    private bjf b = null;

    public final synchronized bjf a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new bjf(context);
        }
        return this.b;
    }
}
