package defpackage;

/* renamed from: dkl reason: default package */
/* compiled from: PG */
final class dkl extends defpackage.dkk {
    dkl(int i) {
        super(i, 0);
    }

    public final void a() {
        if (!this.c) {
            if (0 < b()) {
                b(0).getKey();
                throw new java.lang.NoSuchMethodError();
            }
            java.util.Iterator it = c().iterator();
            if (it.hasNext()) {
                ((java.util.Map.Entry) it.next()).getKey();
                throw new java.lang.NoSuchMethodError();
            }
        }
        super.a();
    }
}
