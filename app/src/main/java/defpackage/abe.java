package defpackage;

/* renamed from: abe reason: default package */
/* compiled from: PG */
public final class abe {
    public int a;
    public int b;
    public java.lang.Object c;
    public int d;

    abe(int i, int i2, int i3, java.lang.Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this))).append("[");
        switch (this.a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
            default:
                str = "??";
                break;
        }
        return append.append(str).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.abe abe = (defpackage.abe) obj;
        if (this.a != abe.a) {
            return false;
        }
        if (this.a == 8 && java.lang.Math.abs(this.d - this.b) == 1 && this.d == abe.b && this.b == abe.d) {
            return true;
        }
        if (this.d != abe.d) {
            return false;
        }
        if (this.b != abe.b) {
            return false;
        }
        if (this.c != null) {
            if (!this.c.equals(abe.c)) {
                return false;
            }
            return true;
        } else if (abe.c != null) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
