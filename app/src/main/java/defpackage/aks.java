package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aks  reason: default package */
/* compiled from: PG */
public final class aks extends akz {
    private final dcb a;
    private final dby b;

    aks(dcb dcb, dby dby) {
        if (dcb == null) {
            throw new NullPointerException("Null taskList");
        }
        this.a = dcb;
        if (dby == null) {
            throw new NullPointerException("Null task");
        }
        this.b = dby;
    }

    @Override // defpackage.akz
    public final dcb a() {
        return this.a;
    }

    @Override // defpackage.akz
    public final dby b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(valueOf2).length()).append("SearchResult{taskList=").append(valueOf).append(", task=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akz)) {
            return false;
        }
        akz akz = (akz) obj;
        return this.a.equals(akz.a()) && this.b.equals(akz.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
