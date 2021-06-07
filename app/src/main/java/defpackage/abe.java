package defpackage;

/* renamed from: abe  reason: default package */
/* compiled from: PG */
public final class abe {
    public int a;
    public int b;
    public Object c;
    public int d;

    abe(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
        switch (this.a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                str = "??";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
        }
        return append.append(str).append(",s:").append(this.b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abe abe = (abe) obj;
        if (this.a != abe.a) {
            return false;
        }
        if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == abe.b && this.b == abe.d) {
            return true;
        }
        if (this.d != abe.d) {
            return false;
        }
        if (this.b != abe.b) {
            return false;
        }
        return this.c != null ? this.c.equals(abe.c) : abe.c == null;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
