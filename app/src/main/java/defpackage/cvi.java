package defpackage;

import java.util.logging.Level;

/* renamed from: cvi  reason: default package */
/* compiled from: PG */
public final class cvi extends cvg {
    private final cvq b;

    cvi(String str, String str2, boolean z) {
        super(str2);
        this.b = new cvq(str, str2, z);
    }

    @Override // defpackage.cup
    public final boolean a(Level level) {
        return true;
    }

    @Override // defpackage.cup
    public final void a(cuo cuo) {
        this.b.a(cuo);
    }
}
