package defpackage;

/* renamed from: ajz reason: default package */
public final /* synthetic */ class ajz implements defpackage.brd {
    public static final defpackage.brd a = new defpackage.ajz();

    private ajz() {
    }

    public final void a(defpackage.brc brc) {
        defpackage.bre bre = (defpackage.bre) brc;
        if (!bre.b()) {
            defpackage.azb.b("Unable to log analytics events: %s", bre.c());
        }
    }
}
