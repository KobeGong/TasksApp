package defpackage;

import java.util.logging.Level;

/* renamed from: ctl  reason: default package */
/* compiled from: PG */
public final class ctl extends ctj {
    private static final cub b = new cub((char) 0);

    @Deprecated
    public static ctl a(String str) {
        if (!str.isEmpty()) {
            return new ctl(cut.a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException("injected class name is empty");
    }

    private ctl(cup cup) {
        super(cup);
    }

    @Override // defpackage.ctj
    public final /* synthetic */ cua a(Level level) {
        boolean a = this.a.a(level);
        boolean a2 = cut.a(this.a.a(), level, a);
        if (a || a2) {
            return new ctk(this, level, a2);
        }
        return b;
    }
}
