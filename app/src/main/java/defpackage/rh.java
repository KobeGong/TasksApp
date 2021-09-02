package defpackage;

/* renamed from: rh reason: default package */
/* compiled from: PG */
public final class rh extends defpackage.rg {
    private final java.lang.Object a = new java.lang.Object();

    public rh() {
        super(12);
    }

    public final java.lang.Object a() {
        java.lang.Object a2;
        synchronized (this.a) {
            a2 = super.a();
        }
        return a2;
    }

    public final boolean a(java.lang.Object obj) {
        boolean a2;
        synchronized (this.a) {
            a2 = super.a(obj);
        }
        return a2;
    }
}
