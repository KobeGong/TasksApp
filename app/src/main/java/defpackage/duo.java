package defpackage;

/* renamed from: duo reason: default package */
/* compiled from: PG */
final class duo extends defpackage.dup {
    private final defpackage.dup a;
    private final defpackage.dup b;

    duo(defpackage.dup dup, defpackage.dup dup2) {
        this.a = dup;
        this.b = dup2;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.dus a(java.lang.String str) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3 = this.a.a(str).a;
        java.util.List emptyList = java.util.Collections.emptyList();
        java.util.List emptyList2 = java.util.Collections.emptyList();
        try {
            defpackage.dus a2 = this.b.a(str);
            list2 = a2.b;
            try {
                list = a2.c;
            } catch (Throwable th) {
                th = th;
                emptyList = list2;
                defpackage.dum.a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.DnsNameResolver$CompositeResolver", "resolve", "Failed to resolve TXT results", th);
                list = emptyList2;
                list2 = emptyList;
                return new defpackage.dus(list3, list2, list);
            }
        } catch (Throwable th2) {
            th = th2;
            defpackage.dum.a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.DnsNameResolver$CompositeResolver", "resolve", "Failed to resolve TXT results", th);
            list = emptyList2;
            list2 = emptyList;
            return new defpackage.dus(list3, list2, list);
        }
        return new defpackage.dus(list3, list2, list);
    }
}
