package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: ax  reason: default package */
/* compiled from: PG */
public final class ax extends ay {
    public static final long serialVersionUID = 7766999779862263523L;

    ax(az azVar, az azVar2) {
        super(azVar, azVar2);
    }

    @Override // defpackage.az
    public final boolean a(bb bbVar) {
        return this.a.a(bbVar) && this.b.a(bbVar);
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        return new StringBuilder(String.valueOf(obj).length() + 5 + String.valueOf(obj2).length()).append(obj).append(" and ").append(obj2).toString();
    }
}
