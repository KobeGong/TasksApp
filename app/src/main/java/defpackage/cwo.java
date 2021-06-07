package defpackage;

import java.util.Arrays;

/* renamed from: cwo  reason: default package */
/* compiled from: PG */
public final class cwo extends cwl {
    private final cwl a;
    private final double b = 0.5d;

    public cwo(cwl cwl) {
        cld.a(true);
        this.a = cwl;
    }

    @Override // defpackage.cwl
    public final int b(int i) {
        int b2 = this.a.b(i);
        if (b2 <= 0) {
            return b2;
        }
        return cub.a(((long) cub.a((long) ((Math.random() - 0.5d) * 2.0d * ((double) b2) * this.b))) + ((long) b2));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 37).append(valueOf).append(".randomized(").append(this.b).append(')').toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cwo)) {
            return false;
        }
        cwo cwo = (cwo) obj;
        if (!this.a.equals(cwo.a) || this.b != cwo.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(this.b)});
    }
}
