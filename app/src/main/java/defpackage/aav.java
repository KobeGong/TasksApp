package defpackage;

/* renamed from: aav reason: default package */
/* compiled from: PG */
final class aav implements defpackage.zu {
    private final /* synthetic */ defpackage.aap a;

    aav(defpackage.aap aap) {
        this.a = aap;
    }

    public final boolean a(defpackage.ze zeVar) {
        if (zeVar == null) {
            return false;
        }
        this.a.n = ((defpackage.aad) zeVar).getItem().getItemId();
        defpackage.zu zuVar = this.a.d;
        if (zuVar != null) {
            return zuVar.a(zeVar);
        }
        return false;
    }

    public final void a(defpackage.ze zeVar, boolean z) {
        if (zeVar instanceof defpackage.aad) {
            zeVar.l().b(false);
        }
        defpackage.zu zuVar = this.a.d;
        if (zuVar != null) {
            zuVar.a(zeVar, z);
        }
    }
}
