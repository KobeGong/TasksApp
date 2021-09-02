package defpackage;

/* renamed from: dje reason: default package */
/* compiled from: PG */
final class dje implements defpackage.dki {
    private static final defpackage.djn b = new defpackage.djf();
    private final defpackage.djn a;

    public dje() {
        this(new defpackage.djg(defpackage.dig.a, a()));
    }

    private dje(defpackage.djn djn) {
        this.a = (defpackage.djn) defpackage.dim.a((java.lang.Object) djn, "messageInfoFactory");
    }

    public final defpackage.dkh a(java.lang.Class cls) {
        defpackage.dkj.a(cls);
        defpackage.djm b2 = this.a.b(cls);
        if (b2.b()) {
            if (defpackage.dih.class.isAssignableFrom(cls)) {
                return defpackage.djs.a(defpackage.dkj.c, defpackage.dhz.a, b2.c());
            }
            return defpackage.djs.a(defpackage.dkj.a, defpackage.dhz.a(), b2.c());
        } else if (defpackage.dih.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return defpackage.djr.a(b2, defpackage.djv.b, defpackage.dja.b, defpackage.dkj.c, defpackage.dhz.a, defpackage.djl.b);
            }
            return defpackage.djr.a(b2, defpackage.djv.b, defpackage.dja.b, defpackage.dkj.c, (defpackage.dhy) null, defpackage.djl.b);
        } else if (a(b2)) {
            return defpackage.djr.a(b2, defpackage.djv.a, defpackage.dja.a, defpackage.dkj.a, defpackage.dhz.a(), defpackage.djl.a);
        } else {
            return defpackage.djr.a(b2, defpackage.djv.a, defpackage.dja.a, defpackage.dkj.b, (defpackage.dhy) null, defpackage.djl.a);
        }
    }

    private static boolean a(defpackage.djm djm) {
        return djm.a() == defpackage.bg.ar;
    }

    private static defpackage.djn a() {
        try {
            return (defpackage.djn) java.lang.Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            return b;
        }
    }
}
