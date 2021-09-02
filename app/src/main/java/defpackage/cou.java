package defpackage;

/* renamed from: cou reason: default package */
/* compiled from: PG */
public final class cou implements defpackage.con {
    public final int a;
    public final defpackage.cpe b;
    public java.lang.String c;

    public cou(int i, defpackage.cpe cpe) {
        this.a = i;
        this.b = cpe;
    }

    public final void a() {
    }

    public final java.lang.String a(defpackage.cop cop) {
        return this.c != null ? this.c : cop.a();
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "UserEvent action: %d%s on: %s ", new java.lang.Object[]{java.lang.Integer.valueOf(this.a), "", this.b.toString()});
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cou)) {
            return false;
        }
        defpackage.cou cou = (defpackage.cou) obj;
        if (this.a != cou.a || !defpackage.cky.a((java.lang.Object) null, (java.lang.Object) null) || !this.b.equals(cou.b) || !defpackage.cky.a((java.lang.Object) this.c, (java.lang.Object) cou.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a + (defpackage.cky.a((java.lang.Object) this.c, defpackage.cky.a((java.lang.Object) null, this.b.hashCode())) * 31);
    }
}
