package defpackage;

/* renamed from: bo  reason: default package */
/* compiled from: PG */
public final class bo {
    public final bp a;
    public final int b;
    public final char c;
    public short d;
    public int e;

    bo(bp bpVar, int i, int i2, int i3) {
        this.a = bpVar;
        this.b = i;
        this.c = (char) i2;
        this.d = (short) i3;
    }

    public final int a() {
        return this.b + this.c;
    }

    public final bn b() {
        bp bpVar = this.a;
        if (bpVar == bp.ARG_START || bpVar == bp.ARG_LIMIT) {
            return bl.f[this.d];
        }
        return bn.NONE;
    }

    public final String toString() {
        String name = (this.a == bp.ARG_START || this.a == bp.ARG_LIMIT) ? b().name() : Integer.toString(this.d);
        String name2 = this.a.name();
        return new StringBuilder(String.valueOf(name2).length() + 14 + String.valueOf(name).length()).append(name2).append("(").append(name).append(")@").append(this.b).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bo boVar = (bo) obj;
        return this.a.equals(boVar.a) && this.b == boVar.b && this.c == boVar.c && this.d == boVar.d && this.e == boVar.e;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 37) + this.b) * 37) + this.c) * 37) + this.d;
    }
}
