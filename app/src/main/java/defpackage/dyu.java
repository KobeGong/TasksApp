package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* access modifiers changed from: package-private */
/* renamed from: dyu  reason: default package */
/* compiled from: PG */
public final class dyu {
    public static final dyu f = new dyu(1, 0.0d, 0.0d, 1.0d, Collections.emptyList());
    public final int a;
    public final double b;
    public final double c;
    public final double d;
    public final Collection e;

    dyu(int i, double d2, double d3, double d4, Collection collection) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        cld.a(i > 0, "maxAttempts");
        this.a = i;
        if (d2 >= 0.0d) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z, "initialBackoffInSeconds");
        this.b = d2;
        if (d3 >= d2) {
            z2 = true;
        } else {
            z2 = false;
        }
        cld.a(z2, "maxBackoffInSeconds should be at least initialBackoffInSeconds");
        this.c = d3;
        cld.a(d4 <= 0.0d ? false : z3, "backoffMultiplier");
        this.d = d4;
        this.e = Collections.unmodifiableSet(new HashSet((Collection) cld.a(collection, "retryableStatusCodes")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyu)) {
            return false;
        }
        dyu dyu = (dyu) obj;
        return this.a == dyu.a && Double.compare(this.d, dyu.d) == 0 && Double.compare(this.b, dyu.b) == 0 && Double.compare(this.c, dyu.c) == 0 && cru.d(this.e, dyu.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), this.e});
    }
}
