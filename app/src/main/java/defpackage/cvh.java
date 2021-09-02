package defpackage;

/* renamed from: cvh reason: default package */
/* compiled from: PG */
final class cvh implements defpackage.cuo {
    private final java.lang.String a;
    private final defpackage.cuo b;

    cvh(java.lang.RuntimeException runtimeException, defpackage.cuo cuo) {
        java.lang.StringBuilder append = new java.lang.StringBuilder("LOGGING ERROR: ").append(runtimeException.getMessage()).append("\n  original message: ");
        if (cuo.g() == null) {
            append.append(cuo.i());
        } else {
            append.append(cuo.g().b);
            append.append("\n  original arguments:");
            for (java.lang.Object a2 : cuo.h()) {
                append.append("\n    ").append(defpackage.cuw.a(a2));
            }
        }
        defpackage.cur k = cuo.k();
        if (k.a() > 0) {
            append.append("\n  metadata:");
            for (int i = 0; i < k.a(); i++) {
                append.append("\n    ").append(k.a(i)).append(": ").append(k.b(i));
            }
        }
        append.append("\n  level: ").append(cuo.d());
        append.append("\n  timestamp (nanos): ").append(cuo.e());
        append.append("\n  class: ").append(cuo.f().a());
        append.append("\n  method: ").append(cuo.f().b());
        append.append("\n  line number: ").append(cuo.f().c());
        this.a = append.toString();
        this.b = cuo;
    }

    public final java.util.logging.Level d() {
        return this.b.d().intValue() > java.util.logging.Level.WARNING.intValue() ? this.b.d() : java.util.logging.Level.WARNING;
    }

    public final long e() {
        return this.b.e();
    }

    public final defpackage.ctt f() {
        return this.b.f();
    }

    public final defpackage.cur k() {
        return defpackage.cur.c;
    }

    public final boolean j() {
        return false;
    }

    public final defpackage.cvf g() {
        return null;
    }

    public final java.lang.Object[] h() {
        throw new java.lang.IllegalStateException();
    }

    public final java.lang.Object i() {
        return this.a;
    }
}
