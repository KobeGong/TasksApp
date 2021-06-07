package defpackage;

import android.animation.TimeInterpolator;

/* renamed from: cu  reason: default package */
/* compiled from: PG */
public final class cu {
    public int a = 0;
    public int b = 1;
    private long c = 0;
    private long d = 300;
    private TimeInterpolator e = null;

    public cu(long j, long j2, TimeInterpolator timeInterpolator) {
        this.c = j;
        this.d = j2;
        this.e = timeInterpolator;
    }

    private final TimeInterpolator a() {
        return this.e != null ? this.e : cs.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cu cuVar = (cu) obj;
        if (this.c == cuVar.c && this.d == cuVar.d && this.a == cuVar.a && this.b == cuVar.b) {
            return a().getClass().equals(cuVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((int) (this.c ^ (this.c >>> 32))) * 31) + ((int) (this.d ^ (this.d >>> 32)))) * 31) + a().getClass().hashCode()) * 31) + this.a) * 31) + this.b;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.c + " duration: " + this.d + " interpolator: " + a().getClass() + " repeatCount: " + this.a + " repeatMode: " + this.b + "}\n";
    }
}
