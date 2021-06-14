package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: aav  reason: default package */
/* compiled from: PG */
public final class aav implements zu {
    private final /* synthetic */ aap a;

    aav(aap aap) {
        this.a = aap;
    }

    @Override // defpackage.zu
    public final boolean a(MenuBuilder zeVar) {
        if (zeVar == null) {
            return false;
        }
        this.a.n = ((aad) zeVar).getItem().getItemId();
        zu zuVar = this.a.d;
        if (zuVar != null) {
            return zuVar.a(zeVar);
        }
        return false;
    }

    @Override // defpackage.zu
    public final void a(MenuBuilder zeVar, boolean z) {
        if (zeVar instanceof aad) {
            zeVar.l().b(false);
        }
        zu zuVar = this.a.d;
        if (zuVar != null) {
            zuVar.a(zeVar, z);
        }
    }
}
