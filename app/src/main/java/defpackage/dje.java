package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dje  reason: default package */
/* compiled from: PG */
public final class dje implements dki {
    private static final djn b = new djf();
    private final djn a;

    public dje() {
        this(new djg(dig.a, a()));
    }

    private dje(djn djn) {
        this.a = (djn) dim.a((Object) djn, "messageInfoFactory");
    }

    @Override // defpackage.dki
    public final dkh a(Class cls) {
        dkj.a(cls);
        djm b2 = this.a.b(cls);
        if (b2.b()) {
            if (dih.class.isAssignableFrom(cls)) {
                return djs.a(dkj.c, dhz.a, b2.c());
            }
            return djs.a(dkj.a, dhz.a(), b2.c());
        } else if (dih.class.isAssignableFrom(cls)) {
            if (a(b2)) {
                return djr.a(b2, djv.b, dja.b, dkj.c, dhz.a, djl.b);
            }
            return djr.a(b2, djv.b, dja.b, dkj.c, (dhy) null, djl.b);
        } else if (a(b2)) {
            return djr.a(b2, djv.a, dja.a, dkj.a, dhz.a(), djl.a);
        } else {
            return djr.a(b2, djv.a, dja.a, dkj.b, (dhy) null, djl.a);
        }
    }

    private static boolean a(djm djm) {
        return djm.a() == bg.ar;
    }

    private static djn a() {
        try {
            return (djn) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return b;
        }
    }
}
