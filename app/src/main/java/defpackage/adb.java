package defpackage;

/* renamed from: adb reason: default package */
/* compiled from: PG */
final class adb {
    public RecyclerViewHolder a;
    public RecyclerViewHolder b;
    public int c;
    public int d;
    public int e;
    public int f;

    private adb(RecyclerViewHolder afv, RecyclerViewHolder afv2) {
        this.a = afv;
        this.b = afv2;
    }

    adb(RecyclerViewHolder afv, RecyclerViewHolder afv2, int i, int i2, int i3, int i4) {
        this(afv, afv2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final java.lang.String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
