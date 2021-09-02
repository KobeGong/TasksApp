package defpackage;

/* renamed from: anj reason: default package */
final /* synthetic */ class anj implements java.lang.Runnable {
    private final java.util.Map a;
    private final defpackage.dcb b;
    private final defpackage.anu c;

    anj(java.util.Map map, defpackage.dcb dcb, defpackage.anu anu) {
        this.a = map;
        this.b = dcb;
        this.c = anu;
    }

    public final void run() {
        java.util.Map map = this.a;
        defpackage.dcb dcb = this.b;
        try {
            map.put(dcb.b, this.c.b.a(dcb.b));
        } catch (java.lang.Exception e) {
            defpackage.azb.a("Unable to read tasks for list: %s", (java.lang.Throwable) e, dcb.b);
        }
    }
}
