package defpackage;

/* renamed from: rh  reason: default package */
/* compiled from: PG */
public final class rh extends rg {
    private final Object a = new Object();

    public rh() {
        super(12);
    }

    @Override // defpackage.rg
    public final Object a() {
        Object a2;
        synchronized (this.a) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // defpackage.rg
    public final boolean a(Object obj) {
        boolean a2;
        synchronized (this.a) {
            a2 = super.a(obj);
        }
        return a2;
    }
}
