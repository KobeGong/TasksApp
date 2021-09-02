package defpackage;

/* renamed from: dhw reason: default package */
/* compiled from: PG */
public class dhw {
    public static final defpackage.dhw a = new defpackage.dhw(0);
    private static volatile boolean b = false;
    private static volatile defpackage.dhw c;
    private final java.util.Map d;

    private static java.lang.Class d() {
        try {
            return java.lang.Class.forName("com.google.protobuf.Extension");
        } catch (java.lang.ClassNotFoundException e) {
            return null;
        }
    }

    public static defpackage.dhw a() {
        return defpackage.dhv.a();
    }

    public static defpackage.dhw b() {
        defpackage.dhw dhw = c;
        if (dhw == null) {
            synchronized (defpackage.dhw.class) {
                dhw = c;
                if (dhw == null) {
                    dhw = defpackage.dhv.b();
                    c = dhw;
                }
            }
        }
        return dhw;
    }

    static defpackage.dhw c() {
        return defpackage.dif.a(defpackage.dhw.class);
    }

    public defpackage.dik a(defpackage.djo djo, int i) {
        return (defpackage.dik) this.d.get(new defpackage.dhx(djo, i));
    }

    dhw() {
        this.d = new java.util.HashMap();
    }

    dhw(byte b2) {
        this.d = java.util.Collections.emptyMap();
    }

    static {
        d();
    }
}
