package defpackage;

/* renamed from: dkb reason: default package */
/* compiled from: PG */
public final class dkb implements defpackage.djm {
    public final defpackage.djo a;
    public final java.lang.String b;
    public final java.lang.Object[] c;
    private final int d;

    public dkb(defpackage.djo djo, java.lang.String str, java.lang.Object[] objArr) {
        this.a = djo;
        this.b = str;
        this.c = objArr;
        int i = 1;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        while (true) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i = i3;
            } else {
                this.d = (charAt2 << i2) | c2;
                return;
            }
        }
    }

    public final defpackage.djo c() {
        return this.a;
    }

    public final int a() {
        return (this.d & 1) == 1 ? defpackage.bg.ar : defpackage.bg.as;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
