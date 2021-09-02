package defpackage;

/* renamed from: ctl reason: default package */
/* compiled from: PG */
public final class ctl extends defpackage.ctj {
    private static final defpackage.cub b = new defpackage.cub(0);

    @java.lang.Deprecated
    public static defpackage.ctl a(java.lang.String str) {
        java.lang.String str2 = "injected class name is empty";
        if (!str.isEmpty()) {
            return new defpackage.ctl(defpackage.cut.a(str.replace('/', '.')));
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    private ctl(defpackage.cup cup) {
        super(cup);
    }

    public final /* synthetic */ defpackage.cua a(java.util.logging.Level level) {
        boolean a = this.a.a(level);
        boolean a2 = defpackage.cut.a(this.a.a(), level, a);
        if (a || a2) {
            return new defpackage.ctk(this, level, a2);
        }
        return b;
    }
}
