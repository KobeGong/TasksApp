package defpackage;

/* renamed from: bo reason: default package */
/* compiled from: PG */
public final class bo {
    public final defpackage.bp a;
    public final int b;
    public final char c;
    public short d;
    public int e;

    bo(defpackage.bp bpVar, int i, int i2, int i3) {
        this.a = bpVar;
        this.b = i;
        this.c = (char) i2;
        this.d = (short) i3;
    }

    public final int a() {
        return this.b + this.c;
    }

    public final defpackage.bn b() {
        defpackage.bp bpVar = this.a;
        if (bpVar == defpackage.bp.ARG_START || bpVar == defpackage.bp.ARG_LIMIT) {
            return defpackage.bl.f[this.d];
        }
        return defpackage.bn.NONE;
    }

    public final java.lang.String toString() {
        java.lang.String name = (this.a == defpackage.bp.ARG_START || this.a == defpackage.bp.ARG_LIMIT) ? b().name() : java.lang.Integer.toString(this.d);
        java.lang.String name2 = this.a.name();
        return new java.lang.StringBuilder(java.lang.String.valueOf(name2).length() + 14 + java.lang.String.valueOf(name).length()).append(name2).append("(").append(name).append(")@").append(this.b).toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.bo boVar = (defpackage.bo) obj;
        if (this.a.equals(boVar.a) && this.b == boVar.b && this.c == boVar.c && this.d == boVar.d && this.e == boVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 37) + this.b) * 37) + this.c) * 37) + this.d;
    }
}
