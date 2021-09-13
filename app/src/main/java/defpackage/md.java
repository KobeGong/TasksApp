package defpackage;

/* renamed from: md reason: default package */
/* compiled from: PG */
final class md implements OpGenerator {
    private final java.lang.String a = null;
    private final int id;
    private final int c;
    private final /* synthetic */ FragmentManagerImpl d;

    md(FragmentManagerImpl lpVar, int id, int i2) {
        this.d = lpVar;
        this.id = id;
        this.c = i2;
    }

    public final boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (this.d.g != null && this.id < 0) {
            FragmentManagerImpl lpVar = this.d.g.v;
            if (lpVar != null && lpVar.d()) {
                return false;
            }
        }
        return this.d.a(arrayList, arrayList2, (java.lang.String) null, this.id, this.c);
    }
}
