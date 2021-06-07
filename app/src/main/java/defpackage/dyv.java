package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: dyv  reason: default package */
/* compiled from: PG */
public final class dyv {
    public final boolean a;
    public final List b;
    public final Collection c;
    public final dza d;
    public final boolean e;

    dyv(List list, Collection collection, dza dza, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        this.b = list;
        this.c = Collections.unmodifiableCollection((Collection) cld.a(collection, "drainedSubstreams"));
        this.d = dza;
        this.e = z;
        this.a = z2;
        cld.b(!z2 || list == null, "passThrough should imply buffer is null");
        if (!z2 || dza != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        cld.b(z3, "passThrough should imply winningSubstream != null");
        if (!z2 || ((collection.size() == 1 && collection.contains(dza)) || (collection.size() == 0 && dza.b))) {
            z4 = true;
        } else {
            z4 = false;
        }
        cld.b(z4, "passThrough should imply winningSubstream is drained");
        cld.b((!z || dza != null) ? true : z5, "cancelled should imply committed");
    }
}
