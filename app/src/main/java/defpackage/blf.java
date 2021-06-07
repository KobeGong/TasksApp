package defpackage;

/* renamed from: blf  reason: default package */
/* compiled from: PG */
public final class blf extends bkw implements Cloneable {
    private String c = "";
    private String d = "";

    public blf() {
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final blf clone() {
        try {
            return (blf) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blf)) {
            return false;
        }
        blf blf = (blf) obj;
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
        if (this.a == null || this.a.a()) {
            return blf.a == null || blf.a.a();
        }
        return this.a.equals(blf.a);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.c == null ? 0 : this.c.hashCode()) + ((getClass().getName().hashCode() + 527) * 31 * 31)) * 31)) * 31;
        if (this.a != null && !this.a.a()) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    @Override // defpackage.blb, defpackage.bkw
    public final void a(bku bku) {
        if (this.c != null && !this.c.equals("")) {
            bku.a(2, this.c);
        }
        if (this.d != null && !this.d.equals("")) {
            bku.a(3, this.d);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.blb, defpackage.bkw
    public final int a() {
        int a = super.a();
        if (this.c != null && !this.c.equals("")) {
            a += bku.b(2, this.c);
        }
        if (this.d == null || this.d.equals("")) {
            return a;
        }
        return a + bku.b(3, this.d);
    }

    @Override // defpackage.bkw
    public final /* synthetic */ bkw b() {
        return (blf) clone();
    }

    @Override // defpackage.blb, defpackage.bkw
    public final /* synthetic */ blb c() {
        return (blf) clone();
    }
}
