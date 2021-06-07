package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
/* renamed from: dzb  reason: default package */
/* compiled from: PG */
public final class dzb {
    public final int a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger();

    dzb(float f, float f2) {
        this.c = (int) (f2 * 1000.0f);
        this.a = (int) (f * 1000.0f);
        this.b = this.a / 2;
        this.d.set(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzb)) {
            return false;
        }
        dzb dzb = (dzb) obj;
        return this.a == dzb.a && this.c == dzb.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }
}
