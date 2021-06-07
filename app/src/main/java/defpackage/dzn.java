package defpackage;

/* renamed from: dzn  reason: default package */
/* compiled from: PG */
public final class dzn implements dxn {
    private final dzl a;

    private dzn(dzl dzl) {
        this.a = dzl;
    }

    public static dzn a(dzl dzl) {
        return new dzn(dzl);
    }

    @Override // defpackage.dxn
    public final Object a() {
        return dzi.a.a(this.a);
    }

    @Override // defpackage.dxn
    public final Object a(Object obj) {
        dzi.a(this.a, obj);
        return null;
    }
}
