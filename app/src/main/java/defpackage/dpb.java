package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: dpb  reason: default package */
/* compiled from: PG */
public final class dpb {
    public final dpe a;
    public final String b;
    public final dpd c;
    public final dpd d;
    public final Object e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    dpb(dpe dpe, String str, dpd dpd, dpd dpd2, Object obj, boolean z, boolean z2, boolean z3) {
        new AtomicReferenceArray(1);
        this.a = (dpe) cld.a(dpe, "type");
        this.b = (String) cld.a(str, "fullMethodName");
        this.c = (dpd) cld.a(dpd, "requestMarshaller");
        this.d = (dpd) cld.a(dpd2, "responseMarshaller");
        this.e = obj;
        this.f = z;
        this.g = z2;
        this.h = z3;
        cld.a(!z2 || dpe == dpe.UNARY, "Only unary methods can be specified safe");
    }

    public final InputStream a(Object obj) {
        return this.c.a(obj);
    }

    public static String a(String str, String str2) {
        String str3 = (String) cld.a(str, "fullServiceName");
        String str4 = (String) cld.a(str2, "methodName");
        return new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()).append(str3).append("/").append(str4).toString();
    }

    public static String a(String str) {
        int lastIndexOf = ((String) cld.a(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public final String toString() {
        crs a2 = cky.b(this).a("fullMethodName", this.b).a("type", this.a).a("idempotent", this.f).a("safe", this.g).a("sampledToLocalTracing", this.h).a("requestMarshaller", this.c).a("responseMarshaller", this.d).a("schemaDescriptor", this.e);
        a2.a = true;
        return a2.toString();
    }
}
