package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ajq  reason: default package */
/* compiled from: PG */
public abstract class ajq {
    public abstract List a();

    public abstract dce b();

    public abstract long c();

    public static ajq a(List list, dce dce, long j) {
        return new ajm(csp.a((Collection) list), dce, j);
    }

    public static ajq d() {
        return new ajm(Collections.emptyList(), dce.b, 0);
    }
}
