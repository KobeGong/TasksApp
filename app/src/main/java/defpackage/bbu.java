package defpackage;

import java.util.Arrays;

/* renamed from: bbu  reason: default package */
/* compiled from: PG */
public final class bbu {
    public final ayd a;
    private final int b = Arrays.hashCode(new Object[]{this.a, this.c});
    private final aye c;

    public bbu(ayd ayd, aye aye) {
        this.a = ayd;
        this.c = aye;
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbu)) {
            return false;
        }
        bbu bbu = (bbu) obj;
        return azb.a(this.a, bbu.a) && azb.a(this.c, bbu.c);
    }
}
