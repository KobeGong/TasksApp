package defpackage;

/* renamed from: cfa reason: default package */
/* compiled from: PG */
final class cfa extends defpackage.rn {
    private final /* synthetic */ defpackage.cey b;

    cfa(defpackage.cey cey) {
        this.b = cey;
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        super.a(view, tlVar);
        tlVar.a(1048576);
        tlVar.d(true);
    }

    public final boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.b.dismiss();
        return true;
    }
}
