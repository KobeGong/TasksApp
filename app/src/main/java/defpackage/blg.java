package defpackage;

import java.util.Arrays;

/* renamed from: blg  reason: default package */
/* compiled from: PG */
public final class blg extends bkw implements Cloneable {
    private byte[] c = bld.e;
    private String d = "";
    private byte[][] e = bld.d;

    public blg() {
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final blg clone() {
        try {
            blg blg = (blg) super.clone();
            if (this.e != null && this.e.length > 0) {
                blg.e = (byte[][]) this.e.clone();
            }
            return blg;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blg)) {
            return false;
        }
        blg blg = (blg) obj;
        if (!Arrays.equals(this.c, blg.c)) {
            return false;
        }
        if (this.d == null) {
            if (blg.d != null) {
                return false;
            }
        } else if (!this.d.equals(blg.d)) {
            return false;
        }
        if (!bla.a(this.e, blg.e)) {
            return false;
        }
        if (this.a == null || this.a.a()) {
            return blg.a == null || blg.a.a();
        }
        return this.a.equals(blg.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.d == null ? 0 : this.d.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.c)) * 31)) * 31) + bla.a(this.e)) * 31) + 1237) * 31;
        if (this.a != null && !this.a.a()) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    @Override // defpackage.blb, defpackage.bkw
    public final void a(bku bku) {
        if (!Arrays.equals(this.c, bld.e)) {
            bku.a(1, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                byte[] bArr = this.e[i];
                if (bArr != null) {
                    bku.a(2, bArr);
                }
            }
        }
        if (this.d != null && !this.d.equals("")) {
            bku.a(4, this.d);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.blb, defpackage.bkw
    public final int a() {
        int a = super.a();
        if (!Arrays.equals(this.c, bld.e)) {
            a += bku.b(1, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.length; i3++) {
                byte[] bArr = this.e[i3];
                if (bArr != null) {
                    i2++;
                    i += bku.a(bArr);
                }
            }
            a = a + i + (i2 * 1);
        }
        if (this.d == null || this.d.equals("")) {
            return a;
        }
        return a + bku.b(4, this.d);
    }

    @Override // defpackage.bkw
    public final /* synthetic */ bkw b() {
        return (blg) clone();
    }

    @Override // defpackage.blb, defpackage.bkw
    public final /* synthetic */ blb c() {
        return (blg) clone();
    }
}
