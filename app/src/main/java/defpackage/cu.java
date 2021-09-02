package defpackage;

/* renamed from: cu reason: default package */
/* compiled from: PG */
public final class cu {
    public int a = 0;
    public int b = 1;
    private long c = 0;
    private long d = 300;
    private android.animation.TimeInterpolator e = null;

    public cu(long j, long j2, android.animation.TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    private final android.animation.TimeInterpolator a() {
        return this.e != null ? this.e : defpackage.cs.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.cu cuVar = (defpackage.cu) obj;
        if (this.c == cuVar.c && this.d == cuVar.d && this.a == cuVar.a && this.b == cuVar.b) {
            return a().getClass().equals(cuVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((int) (this.c ^ (this.c >>> 32))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(10);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.c);
        sb.append(" duration: ");
        sb.append(this.d);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.a);
        sb.append(" repeatMode: ");
        sb.append(this.b);
        sb.append("}\n");
        return sb.toString();
    }
}
