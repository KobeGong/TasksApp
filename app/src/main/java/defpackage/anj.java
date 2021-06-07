package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: anj  reason: default package */
public final /* synthetic */ class anj implements Runnable {
    private final Map a;
    private final dcb b;
    private final anu c;

    anj(Map map, dcb dcb, anu anu) {
        this.a = map;
        this.b = dcb;
        this.c = anu;
    }

    public final void run() {
        Map map = this.a;
        dcb dcb = this.b;
        try {
            map.put(dcb.b, this.c.b.a(dcb.b));
        } catch (Exception e) {
            azb.a("Unable to read tasks for list: %s", (Throwable) e, dcb.b);
        }
    }
}
