package defpackage;

/* renamed from: dkb  reason: default package */
/* compiled from: PG */
public final class dkb implements djm {
    public final djo a;
    public final String b;
    public final Object[] c;
    private final int d;

    public dkb(djo djo, String str, Object[] objArr) {
        this.a = djo;
        this.b = str;
        this.c = objArr;
        int i = 1;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        while (true) {
            int i4 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i = i4;
            } else {
                this.d = (charAt2 << i3) | i2;
                return;
            }
        }
    }

    @Override // defpackage.djm
    public final djo c() {
        return this.a;
    }

    @Override // defpackage.djm
    public final int a() {
        return (this.d & 1) == 1 ? bg.ar : bg.as;
    }

    @Override // defpackage.djm
    public final boolean b() {
        return (this.d & 2) == 2;
    }
}
