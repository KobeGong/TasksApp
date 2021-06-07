package defpackage;

/* renamed from: ajz  reason: default package */
public final /* synthetic */ class ajz implements brd {
    public static final brd a = new ajz();

    private ajz() {
    }

    @Override // defpackage.brd
    public final void a(brc brc) {
        bre bre = (bre) brc;
        if (!bre.b()) {
            azb.b("Unable to log analytics events: %s", bre.c());
        }
    }
}
