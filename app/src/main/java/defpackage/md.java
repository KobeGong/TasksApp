package defpackage;

/* renamed from: md reason: default package */
/* compiled from: PG */
final class md implements defpackage.mc {
    private final java.lang.String a = null;
    private final int b;
    private final int c;
    private final /* synthetic */ FragmentManagerImpl d;

    md(FragmentManagerImpl lpVar, int i, int i2) {
        this.d = lpVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (this.d.g != null && this.b < 0) {
            FragmentManagerImpl lpVar = this.d.g.v;
            if (lpVar != null && lpVar.d()) {
                return false;
            }
        }
        return this.d.a(arrayList, arrayList2, (java.lang.String) null, this.b, this.c);
    }
}
