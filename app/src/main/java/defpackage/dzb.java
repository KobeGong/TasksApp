package defpackage;

/* renamed from: dzb reason: default package */
/* compiled from: PG */
final class dzb {
    public final int a;
    public final int b;
    public final int c;
    public final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();

    dzb(float f, float f2) {
        this.c = (int) (f2 * 1000.0f);
        this.a = (int) (f * 1000.0f);
        this.b = this.a / 2;
        this.d.set(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dzb)) {
            return false;
        }
        defpackage.dzb dzb = (defpackage.dzb) obj;
        if (this.a == dzb.a && this.c == dzb.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.c)});
    }
}
