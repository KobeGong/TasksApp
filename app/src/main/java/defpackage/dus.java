package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: dus  reason: default package */
/* compiled from: PG */
final class dus {
    public final List a;
    public final List b;
    public final List c;

    dus(List list, List list2, List list3) {
        this.a = Collections.unmodifiableList((List) cld.a(list, "addresses"));
        this.b = Collections.unmodifiableList((List) cld.a(list2, "txtRecords"));
        this.c = Collections.unmodifiableList((List) cld.a(list3, "balancerAddresses"));
    }
}
