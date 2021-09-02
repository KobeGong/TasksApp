package defpackage;

/* renamed from: ajl reason: default package */
/* compiled from: PG */
public final class ajl extends defpackage.ajp {
    private final defpackage.dcb a;
    private final int b;

    public ajl(defpackage.dcb dcb, int i) {
        if (dcb == null) {
            throw new java.lang.NullPointerException("Null destinationList");
        }
        this.a = dcb;
        this.b = i;
    }

    public final defpackage.dcb a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.a);
        return new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 69).append("TaskDeleteAfterMoveData{destinationList=").append(valueOf).append(", movedTaskCount=").append(this.b).append("}").toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajp)) {
            return false;
        }
        defpackage.ajp ajp = (defpackage.ajp) obj;
        if (!this.a.equals(ajp.a()) || this.b != ajp.b()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
