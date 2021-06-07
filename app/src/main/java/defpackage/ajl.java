package defpackage;

/* renamed from: ajl  reason: default package */
/* compiled from: PG */
public final class ajl extends ajp {
    private final dcb a;
    private final int b;

    public ajl(dcb dcb, int i) {
        if (dcb == null) {
            throw new NullPointerException("Null destinationList");
        }
        this.a = dcb;
        this.b = i;
    }

    @Override // defpackage.ajp
    public final dcb a() {
        return this.a;
    }

    @Override // defpackage.ajp
    public final int b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 69).append("TaskDeleteAfterMoveData{destinationList=").append(valueOf).append(", movedTaskCount=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajp)) {
            return false;
        }
        ajp ajp = (ajp) obj;
        return this.a.equals(ajp.a()) && this.b == ajp.b();
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
