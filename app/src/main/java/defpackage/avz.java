package defpackage;

/* renamed from: avz  reason: default package */
/* compiled from: PG */
public final class avz {
    private static int b = 31;
    public int a = 1;

    public final avz a(Object obj) {
        this.a = (obj == null ? 0 : obj.hashCode()) + (this.a * b);
        return this;
    }

    public final avz a(boolean z) {
        this.a = (z ? 1 : 0) + (this.a * b);
        return this;
    }
}
