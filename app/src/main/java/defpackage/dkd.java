package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: dkd  reason: default package */
/* compiled from: PG */
public final class dkd extends dha {
    public static final int[] c;
    public static final long serialVersionUID = 1;
    public final dha d;
    public final dha e;
    private final int f;
    private final int g;
    private final int h;

    dkd(dha dha, dha dha2) {
        this.d = dha;
        this.e = dha2;
        this.g = dha.a();
        this.f = this.g + dha2.a();
        this.h = Math.max(dha.f(), dha2.f()) + 1;
    }

    static dha a(dha dha, dha dha2) {
        if (dha2.a() == 0) {
            return dha;
        }
        if (dha.a() == 0) {
            return dha2;
        }
        int a = dha2.a() + dha.a();
        if (a < 128) {
            return b(dha, dha2);
        }
        if (dha instanceof dkd) {
            dkd dkd = (dkd) dha;
            if (dkd.e.a() + dha2.a() < 128) {
                return new dkd(dkd.d, b(dkd.e, dha2));
            } else if (dkd.d.f() > dkd.e.f() && dkd.f() > dha2.f()) {
                return new dkd(dkd.d, new dkd(dkd.e, dha2));
            }
        }
        if (a >= c[Math.max(dha.f(), dha2.f()) + 1]) {
            return new dkd(dha, dha2);
        }
        dke dke = new dke();
        dke.a(dha);
        dke.a(dha2);
        dkd dkd2 = (dha) dke.a.pop();
        while (!dke.a.isEmpty()) {
            dkd2 = new dkd((dha) dke.a.pop(), dkd2);
        }
        return dkd2;
    }

    private static dha b(dha dha, dha dha2) {
        int a = dha.a();
        int a2 = dha2.a();
        byte[] bArr = new byte[(a + a2)];
        dha.a(bArr, 0, 0, a);
        dha2.a(bArr, 0, a, a2);
        return dha.a(bArr);
    }

    @Override // defpackage.dha
    public final byte a(int i) {
        b(i, this.f);
        if (i < this.g) {
            return this.d.a(i);
        }
        return this.e.a(i - this.g);
    }

    @Override // defpackage.dha
    public final int a() {
        return this.f;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final int f() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final boolean g() {
        return this.f >= c[this.h];
    }

    @Override // defpackage.dha
    public final dha a(int i, int i2) {
        int c2 = c(i, i2, this.f);
        if (c2 == 0) {
            return dha.a;
        }
        if (c2 == this.f) {
            return this;
        }
        if (i2 <= this.g) {
            return this.d.a(i, i2);
        }
        if (i >= this.g) {
            return this.e.a(i - this.g, i2 - this.g);
        }
        dha dha = this.d;
        return new dkd(dha.a(i, dha.a()), this.e.a(0, i2 - this.g));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void b(byte[] bArr, int i, int i2, int i3) {
        if (i + i3 <= this.g) {
            this.d.b(bArr, i, i2, i3);
        } else if (i >= this.g) {
            this.e.b(bArr, i - this.g, i2, i3);
        } else {
            int i4 = this.g - i;
            this.d.b(bArr, i, i2, i4);
            this.e.b(bArr, 0, i2 + i4, i3 - i4);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dha
    public final void a(dgz dgz) {
        this.d.a(dgz);
        this.e.a(dgz);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final String a(Charset charset) {
        return new String(b(), charset);
    }

    @Override // defpackage.dha
    public final boolean d() {
        if (this.e.a(this.d.a(0, 0, this.g), 0, this.e.a()) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final int a(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.a(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.a(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.a(this.d.a(i, i2, i4), 0, i3 - i4);
    }

    @Override // defpackage.dha
    public final boolean equals(Object obj) {
        boolean a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dha)) {
            return false;
        }
        dha dha = (dha) obj;
        if (this.f != dha.a()) {
            return false;
        }
        if (this.f == 0) {
            return true;
        }
        int i = this.b;
        int i2 = dha.b;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        dkf dkf = new dkf(this);
        dkf dkf2 = new dkf(dha);
        dhg dhg = (dhg) dkf2.next();
        int i3 = 0;
        dhg dhg2 = (dhg) dkf.next();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int a2 = dhg2.a() - i4;
            int a3 = dhg.a() - i3;
            int min = Math.min(a2, a3);
            if (i4 == 0) {
                a = dhg2.a(dhg, i3, min);
            } else {
                a = dhg.a(dhg2, i4, min);
            }
            if (!a) {
                return false;
            }
            int i6 = i5 + min;
            if (i6 < this.f) {
                if (min == a2) {
                    dhg2 = (dhg) dkf.next();
                    i4 = 0;
                } else {
                    i4 += min;
                }
                if (min == a3) {
                    dhg = (dhg) dkf2.next();
                    i3 = 0;
                    i5 = i6;
                } else {
                    i3 += min;
                    i5 = i6;
                }
            } else if (i6 == this.f) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.dha
    public final int b(int i, int i2, int i3) {
        if (i2 + i3 <= this.g) {
            return this.d.b(i, i2, i3);
        }
        if (i2 >= this.g) {
            return this.e.b(i, i2 - this.g, i3);
        }
        int i4 = this.g - i2;
        return this.e.b(this.d.b(i, i2, i4), 0, i3 - i4);
    }

    @Override // defpackage.dha
    public final dhj e() {
        return dhj.a(new dkg(this));
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return dha.a(b());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    static {
        int i = 1;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        c = new int[arrayList.size()];
        for (int i4 = 0; i4 < c.length; i4++) {
            c[i4] = ((Integer) arrayList.get(i4)).intValue();
        }
    }
}
