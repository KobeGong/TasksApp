package defpackage;

/* renamed from: aav reason: default package */
/* compiled from: PG */
final class aav implements MenuPresenter_Callback {
    private final /* synthetic */ defpackage.aap a;

    aav(defpackage.aap aap) {
        this.a = aap;
    }

    public final boolean a(MenuBuilder zeVar) {
        if (zeVar == null) {
            return false;
        }
        this.a.n = ((SubMenuBuilder) zeVar).getItem().getItemId();
        MenuPresenter_Callback zuVar = this.a.d;
        if (zuVar != null) {
            return zuVar.a(zeVar);
        }
        return false;
    }

    public final void onCloseMenu(MenuBuilder zeVar, boolean z) {
        if (zeVar instanceof SubMenuBuilder) {
            zeVar.l().b(false);
        }
        MenuPresenter_Callback zuVar = this.a.d;
        if (zuVar != null) {
            zuVar.onCloseMenu(zeVar, z);
        }
    }
}
