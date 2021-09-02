package defpackage;

/* renamed from: blf reason: default package */
/* compiled from: PG */
public final class blf extends defpackage.bkw implements java.lang.Cloneable {
    private java.lang.String c;
    private java.lang.String d;

    public blf() {
        this.c = "";
        this.d = "";
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final defpackage.blf clone() {
        try {
            return (defpackage.blf) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.blf)) {
            return false;
        }
        defpackage.blf blf = (defpackage.blf) obj;
        if (this.c == null) {
            if (blf.c != null) {
                return false;
            }
        } else if (!this.c.equals(blf.c)) {
            return false;
        }
        if (this.d == null) {
            if (blf.d != null) {
                return false;
            }
        } else if (!this.d.equals(blf.d)) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(blf.a);
        }
        if (blf.a == null || blf.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + ((getClass().getName().hashCode() + 527) * 31 * 31)) * 31)) * 31;
        if (this.a != null && !this.a.a()) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public final void a(defpackage.bku bku) {
        if (this.c != null && !this.c.equals("")) {
            bku.a(2, this.c);
        }
        if (this.d != null && !this.d.equals("")) {
            bku.a(3, this.d);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        if (this.c != null && !this.c.equals("")) {
            a += defpackage.bku.b(2, this.c);
        }
        if (this.d == null || this.d.equals("")) {
            return a;
        }
        return a + defpackage.bku.b(3, this.d);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.blf) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.blf) clone();
    }
}
