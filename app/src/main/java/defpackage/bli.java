package defpackage;

/* renamed from: bli reason: default package */
/* compiled from: PG */
public final class bli extends defpackage.bkw implements java.lang.Cloneable {
    private static volatile defpackage.bli[] c;
    private java.lang.String d;
    private java.lang.String e;

    public static defpackage.bli[] e() {
        if (c == null) {
            synchronized (defpackage.bla.a) {
                if (c == null) {
                    c = new defpackage.bli[0];
                }
            }
        }
        return c;
    }

    public bli() {
        this.d = "";
        this.e = "";
        this.a = null;
        this.b = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final defpackage.bli clone() {
        try {
            return (defpackage.bli) super.clone();
        } catch (java.lang.CloneNotSupportedException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.bli)) {
            return false;
        }
        defpackage.bli bli = (defpackage.bli) obj;
        if (this.d == null) {
            if (bli.d != null) {
                return false;
            }
        } else if (!this.d.equals(bli.d)) {
            return false;
        }
        if (this.e == null) {
            if (bli.e != null) {
                return false;
            }
        } else if (!this.e.equals(bli.e)) {
            return false;
        }
        if (this.a != null && !this.a.a()) {
            return this.a.equals(bli.a);
        }
        if (bli.a == null || bli.a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31)) * 31;
        if (this.a != null && !this.a.a()) {
            i = this.a.hashCode();
        }
        return hashCode + i;
    }

    public final void a(defpackage.bku bku) {
        if (this.d != null && !this.d.equals("")) {
            bku.a(1, this.d);
        }
        if (this.e != null && !this.e.equals("")) {
            bku.a(2, this.e);
        }
        super.a(bku);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        int a = super.a();
        if (this.d != null && !this.d.equals("")) {
            a += defpackage.bku.b(1, this.d);
        }
        if (this.e == null || this.e.equals("")) {
            return a;
        }
        return a + defpackage.bku.b(2, this.e);
    }

    public final /* synthetic */ defpackage.bkw b() {
        return (defpackage.bli) clone();
    }

    public final /* synthetic */ defpackage.blb c() {
        return (defpackage.bli) clone();
    }
}
