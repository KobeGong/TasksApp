package defpackage;

import java.util.logging.Level;

/* renamed from: cvh  reason: default package */
/* compiled from: PG */
final class cvh implements cuo {
    private final String a;
    private final cuo b;

    cvh(RuntimeException runtimeException, cuo cuo) {
        StringBuilder append = new StringBuilder("LOGGING ERROR: ").append(runtimeException.getMessage()).append("\n  original message: ");
        if (cuo.g() == null) {
            append.append(cuo.i());
        } else {
            append.append(cuo.g().b);
            append.append("\n  original arguments:");
            for (Object obj : cuo.h()) {
                append.append("\n    ").append(cuw.a(obj));
            }
        }
        cur k = cuo.k();
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

    @Override // defpackage.cuo
    public final Level d() {
        return this.b.d().intValue() > Level.WARNING.intValue() ? this.b.d() : Level.WARNING;
    }

    @Override // defpackage.cuo
    public final long e() {
        return this.b.e();
    }

    @Override // defpackage.cuo
    public final ctt f() {
        return this.b.f();
    }

    @Override // defpackage.cuo
    public final cur k() {
        return cur.c;
    }

    @Override // defpackage.cuo
    public final boolean j() {
        return false;
    }

    @Override // defpackage.cuo
    public final cvf g() {
        return null;
    }

    @Override // defpackage.cuo
    public final Object[] h() {
        throw new IllegalStateException();
    }

    @Override // defpackage.cuo
    public final Object i() {
        return this.a;
    }
}
