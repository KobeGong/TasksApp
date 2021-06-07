package defpackage;

import android.content.Context;

/* renamed from: avt  reason: default package */
/* compiled from: PG */
public final class avt {
    public static bjb a = new bjb("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        avy.a(context).a();
        for (ayp ayp : ayp.a()) {
            ayp.d();
        }
        synchronized (baj.c) {
            if (baj.d != null) {
                baj baj = baj.d;
                baj.f.incrementAndGet();
                baj.g.sendMessageAtFrontOfQueue(baj.g.obtainMessage(10));
            }
        }
    }
}
