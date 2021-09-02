package defpackage;

/* renamed from: dpb reason: default package */
/* compiled from: PG */
public final class dpb {
    public final defpackage.dpe a;
    public final java.lang.String b;
    public final defpackage.dpd c;
    public final defpackage.dpd d;
    public final java.lang.Object e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    dpb(defpackage.dpe dpe, java.lang.String str, defpackage.dpd dpd, defpackage.dpd dpd2, java.lang.Object obj, boolean z, boolean z2, boolean z3) {
        new java.util.concurrent.atomic.AtomicReferenceArray(1);
        this.a = (defpackage.dpe) defpackage.cld.a((java.lang.Object) dpe, (java.lang.Object) "type");
        this.b = (java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "fullMethodName");
        this.c = (defpackage.dpd) defpackage.cld.a((java.lang.Object) dpd, (java.lang.Object) "requestMarshaller");
        this.d = (defpackage.dpd) defpackage.cld.a((java.lang.Object) dpd2, (java.lang.Object) "responseMarshaller");
        this.e = obj;
        this.f = z;
        this.g = z2;
        this.h = z3;
        defpackage.cld.a(!z2 || dpe == defpackage.dpe.UNARY, (java.lang.Object) "Only unary methods can be specified safe");
    }

    public final java.io.InputStream a(java.lang.Object obj) {
        return this.c.a(obj);
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "fullServiceName");
        java.lang.String str4 = (java.lang.String) defpackage.cld.a((java.lang.Object) str2, (java.lang.Object) "methodName");
        return new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str4).length()).append(str3).append("/").append(str4).toString();
    }

    public static java.lang.String a(java.lang.String str) {
        int lastIndexOf = ((java.lang.String) defpackage.cld.a((java.lang.Object) str, (java.lang.Object) "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public final java.lang.String toString() {
        defpackage.crs a2 = defpackage.cky.b((java.lang.Object) this).a("fullMethodName", (java.lang.Object) this.b).a("type", (java.lang.Object) this.a).a("idempotent", this.f).a("safe", this.g).a("sampledToLocalTracing", this.h).a("requestMarshaller", (java.lang.Object) this.c).a("responseMarshaller", (java.lang.Object) this.d).a("schemaDescriptor", this.e);
        a2.a = true;
        return a2.toString();
    }
}
