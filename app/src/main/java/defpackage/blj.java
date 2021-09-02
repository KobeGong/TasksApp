package defpackage;

/* renamed from: blj reason: default package */
/* compiled from: PG */
public final class blj extends defpackage.bkw implements java.lang.Cloneable {
    private int c;

    public blj() {
        this.c = -1;
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final defpackage.blj clone() {
        try {
            return (defpackage.blj) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.blj)) {
            return false;
        }
        defpackage.blj blj = (defpackage.blj) obj;
        if (this.c != blj.c) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(blj.a);
        }
        if (blj.a == null || blj.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + this.c) * 31 * 31;
        if (this.a == null || this.a.a()) {
            i = 0;
        } else {
            i = this.a.hashCode();
        }
        return i + hashCode;
    }

    public final void a(defpackage.bku bku) {
        if (this.c != -1) {
            bku.a(1, this.c);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        if (this.c == -1) {
            return a;
        }
        int i = this.c;
        return a + defpackage.bku.a(i) + defpackage.bku.c(8);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.blj) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.blj) clone();
    }
}
