package defpackage;

/* renamed from: cwo reason: default package */
/* compiled from: PG */
public final class cwo extends defpackage.cwl {
    private final defpackage.cwl a;
    private final double b = 0.5d;

    public cwo(defpackage.cwl cwl) {
        defpackage.cld.a(true);
        this.a = cwl;
    }

    public final int b(int i) {
        int b2 = this.a.b(i);
        if (b2 <= 0) {
            return b2;
        }
        return defpackage.cub.a(((long) defpackage.cub.a((long) ((java.lang.Math.random() - 0.5d) * 2.0d * ((double) b2) * this.b))) + ((long) b2));
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 37).append(valueOf).append(".randomized(").append(this.b).append(')').toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cwo)) {
            return false;
        }
        defpackage.cwo cwo = (defpackage.cwo) obj;
        if (!this.a.equals(cwo.a) || this.b != cwo.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, java.lang.Double.valueOf(this.b)});
    }
}
