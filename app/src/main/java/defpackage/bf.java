package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: bf  reason: default package */
/* compiled from: PG */
public final class bf extends ay {
    public static final long serialVersionUID = 1405488568664762222L;

    bf(az azVar, az azVar2) {
        super(azVar, azVar2);
    }

    @Override // defpackage.az
    public final boolean a(bb bbVar) {
        return this.a.a(bbVar) || this.b.a(bbVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return new StringBuilder(String.valueOf(obj).length() + 4 + String.valueOf(obj2).length()).append(obj).append(" or ").append(obj2).toString();
    }
}
