package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: dng  reason: default package */
/* compiled from: PG */
public final class dng {
    public static dnc a(dnc dnc, dnf... dnfArr) {
        return a(dnc, Arrays.asList(dnfArr));
    }

    public static dnc a(dnc dnc, List list) {
        cld.a(dnc, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dnc = new dnl(dnc, (dnf) it.next());
        }
        return dnc;
    }

    public static dnf a(dnf dnf, dpd dpd, dpd dpd2) {
        return new dnh(dpd, dpd2, dnf);
    }

    static {
        new dnk();
    }
}
