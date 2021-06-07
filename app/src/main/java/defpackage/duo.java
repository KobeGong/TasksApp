package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* renamed from: duo  reason: default package */
/* compiled from: PG */
final class duo extends dup {
    private final dup a;
    private final dup b;

    duo(dup dup, dup dup2) {
        this.a = dup;
        this.b = dup2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dup
    public final dus a(String str) {
        Throwable th;
        List list;
        List list2;
        List list3 = this.a.a(str).a;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        try {
            dus a2 = this.b.a(str);
            list2 = a2.b;
            try {
                list = a2.c;
            } catch (Throwable th2) {
                th = th2;
                emptyList = list2;
                dum.a.logp(Level.SEVERE, "io.grpc.internal.DnsNameResolver$CompositeResolver", "resolve", "Failed to resolve TXT results", th);
                list = emptyList2;
                list2 = emptyList;
                return new dus(list3, list2, list);
            }
        } catch (Throwable th3) {
            th = th3;
            dum.a.logp(Level.SEVERE, "io.grpc.internal.DnsNameResolver$CompositeResolver", "resolve", "Failed to resolve TXT results", th);
            list = emptyList2;
            list2 = emptyList;
            return new dus(list3, list2, list);
        }
        return new dus(list3, list2, list);
    }
}
