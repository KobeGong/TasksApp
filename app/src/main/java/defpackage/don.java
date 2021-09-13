package defpackage;

/* renamed from: don reason: default package */
/* compiled from: PG */
public final class don {
    public static final defpackage.don a = new defpackage.don(null, defpackage.dpw.b, false);
    public final defpackage.dop b;
    public final defpackage.dnm c = null;
    public final defpackage.dpw d;
    public final boolean e;

    private don(defpackage.dop dop, defpackage.dpw dpw, boolean z) {
        this.b = dop;
        this.d = (defpackage.dpw) defpackage.cld.a((java.lang.Object) dpw, (java.lang.Object) "status");
        this.e = z;
    }

    public static defpackage.don a(defpackage.dop dop) {
        return new defpackage.don((defpackage.dop) defpackage.cld.a((java.lang.Object) dop, (java.lang.Object) "subchannel"), defpackage.dpw.b, false);
    }

    public static defpackage.don a(defpackage.dpw dpw) {
        boolean z;
        if (!dpw.a()) {
            z = true;
        } else {
            z = false;
        }
        defpackage.cld.a(z, (java.lang.Object) "error status shouldn't be OK");
        return new defpackage.don(null, dpw, false);
    }

    public static defpackage.don b(defpackage.dpw dpw) {
        defpackage.cld.a(!dpw.a(), (java.lang.Object) "drop status shouldn't be OK");
        return new defpackage.don(null, dpw, true);
    }

    public final java.lang.String toString() {
        return defpackage.cky.b((java.lang.Object) this).a("subchannel", (java.lang.Object) this.b).a("streamTracerFactory", (java.lang.Object) null).a("status", (java.lang.Object) this.d).a("drop", this.e).toString();
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.b, this.d, null, java.lang.Boolean.valueOf(this.e)});
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.don)) {
            return false;
        }
        defpackage.don don = (defpackage.don) obj;
        if (!defpackage.cru.equals(this.b, don.b) || !defpackage.cru.equals(this.d, don.d) || !defpackage.cru.equals(null, null) || this.e != don.e) {
            return false;
        }
        return true;
    }
}
