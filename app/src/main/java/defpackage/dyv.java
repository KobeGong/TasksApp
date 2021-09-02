package defpackage;

/* renamed from: dyv reason: default package */
/* compiled from: PG */
final class dyv {
    public final boolean a;
    public final java.util.List b;
    public final java.util.Collection c;
    public final defpackage.dza d;
    public final boolean e;

    dyv(java.util.List list, java.util.Collection collection, defpackage.dza dza, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.b = list;
        this.c = java.util.Collections.unmodifiableCollection((java.util.Collection) defpackage.cld.a((java.lang.Object) collection, (java.lang.Object) "drainedSubstreams"));
        this.d = dza;
        this.e = z;
        this.a = z2;
        defpackage.cld.b(!z2 || list == null, (java.lang.Object) "passThrough should imply buffer is null");
        if (!z2 || dza != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        defpackage.cld.b(z3, (java.lang.Object) "passThrough should imply winningSubstream != null");
        if (!z2 || ((collection.size() == 1 && collection.contains(dza)) || (collection.size() == 0 && dza.b))) {
            z4 = true;
        } else {
            z4 = false;
        }
        defpackage.cld.b(z4, (java.lang.Object) "passThrough should imply winningSubstream is drained");
        if (!z || dza != null) {
            z5 = true;
        }
        defpackage.cld.b(z5, (java.lang.Object) "cancelled should imply committed");
    }
}
