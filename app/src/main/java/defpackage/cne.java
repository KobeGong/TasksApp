package defpackage;

import java.util.Arrays;

/* renamed from: cne  reason: default package */
/* compiled from: PG */
public final class cne {
    public static final int[] a = {5, 11, 23, 47, 97, 197, 397, 797, 1597, 3203, 6421, 12853, 25717, 51437, 102877, 205759, 411527, 823117, 1646237, 3292489, 6584983, 13169977, 26339969, 52679969, 105359939, 210719881, 421439783, 842879579, 1685759167, 2147483629};
    public final int b;
    public int[] c;
    public int[] d;
    private int e;
    private int f;

    static int a(int i) {
        return (i << 1) - (i << 8);
    }

    public cne() {
        this((byte) 0);
    }

    private cne(byte b2) {
        this.b = -1;
        a();
    }

    public final void a() {
        this.e = 0;
        this.c = new int[a[this.e]];
        this.d = new int[a[this.e]];
        Arrays.fill(this.d, this.b);
    }

    public final int a(int i, int i2) {
        boolean z = true;
        cky.a(i2 != this.b, "Cannot add emptyValue to map");
        int d2 = d(i);
        if (this.d[d2] != this.b) {
            return this.d[d2];
        }
        this.c[d2] = i;
        this.f++;
        this.d[d2] = i2;
        if (this.f > this.c.length / 2) {
            if (this.e < a.length - 1) {
                int[] iArr = this.c;
                int[] iArr2 = this.d;
                this.e++;
                this.c = new int[a[this.e]];
                this.d = new int[a[this.e]];
                Arrays.fill(this.d, this.b);
                int i3 = this.f;
                int length = iArr.length;
                this.f = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    if (iArr2[i4] != this.b) {
                        a(iArr[i4], iArr2[i4]);
                    }
                }
                if (i3 != this.f) {
                    z = false;
                }
                cky.b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return this.b;
    }

    public final int b(int i) {
        return this.d[d(i)];
    }

    private final int d(int i) {
        int length = this.c.length;
        int a2 = (a(i) & Integer.MAX_VALUE) % length;
        while (this.d[a2] != this.b && this.c[a2] != i) {
            a2++;
            if (a2 >= length) {
                a2 = 0;
            }
        }
        return a2;
    }

    public final boolean c(int i) {
        return b(i) != this.b;
    }
}
