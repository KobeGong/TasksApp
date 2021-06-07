package defpackage;

/* renamed from: nd  reason: default package */
/* compiled from: PG */
public final class nd implements ag {
    public final nb a;
    public boolean b = false;

    nd(oc ocVar, nb nbVar) {
        this.a = nbVar;
    }

    @Override // defpackage.ag
    public final void a(Object obj) {
        this.a.a(obj);
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
