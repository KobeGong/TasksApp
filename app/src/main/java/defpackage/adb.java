package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: adb  reason: default package */
/* compiled from: PG */
public final class adb {
    public ViewHolder a;
    public ViewHolder b;
    public int c;
    public int d;
    public int e;
    public int f;

    private adb(ViewHolder afv, ViewHolder afv2) {
        this.a = afv;
        this.b = afv2;
    }

    adb(ViewHolder afv, ViewHolder afv2, int i, int i2, int i3, int i4) {
        this(afv, afv2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
