package defpackage;

/* renamed from: blg reason: default package */
/* compiled from: PG */
public final class blg extends defpackage.bkw implements java.lang.Cloneable {
    private byte[] c;
    private java.lang.String d;
    private byte[][] e;

    public blg() {
        this.c = defpackage.bld.e;
        this.d = "";
        this.e = defpackage.bld.d;
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final defpackage.blg clone() {
        try {
            defpackage.blg blg = (defpackage.blg) super.clone();
            if (this.e != null && this.e.length > 0) {
                blg.e = (byte[][]) this.e.clone();
            }
            return blg;
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.blg)) {
            return false;
        }
        defpackage.blg blg = (defpackage.blg) obj;
        if (!java.util.Arrays.equals(this.c, blg.c)) {
            return false;
        }
        if (this.d == null) {
            if (blg.d != null) {
                return false;
            }
        } else if (!this.d.equals(blg.d)) {
            return false;
        }
        if (!defpackage.bla.a(this.e, blg.e)) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(blg.a);
        }
        if (blg.a == null || blg.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((this.d == null ? 0 : this.d.hashCode()) + ((((getClass().getName().hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.c)) * 31)) * 31) + defpackage.bla.a(this.e)) * 31) + 1237) * 31;
        if (this.a != null && !this.a.a()) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public final void a(defpackage.bku bku) {
        if (!java.util.Arrays.equals(this.c, defpackage.bld.e)) {
            bku.a(1, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (byte[] bArr : this.e) {
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
    public final int a() {
        int a = super.a();
        if (!java.util.Arrays.equals(this.c, defpackage.bld.e)) {
            a += defpackage.bku.b(1, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.e) {
                if (bArr != null) {
                    i2++;
                    i += defpackage.bku.a(bArr);
                }
            }
            a = a + i + (i2 * 1);
        }
        if (this.d == null || this.d.equals("")) {
            return a;
        }
        return a + defpackage.bku.b(4, this.d);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.blg) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.blg) clone();
    }
}
