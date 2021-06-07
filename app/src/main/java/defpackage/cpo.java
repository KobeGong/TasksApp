package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: cpo  reason: default package */
/* compiled from: PG */
public final class cpo {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static int b = -1;

    static void a(cpn cpn) {
        if (cky.a()) {
            a.add(cpn);
            if (b != -1) {
                cpn.a(b);
                return;
            }
            return;
        }
        cky.a((Runnable) new cpp(cpn));
    }
}
