package defpackage;

/* renamed from: eg reason: default package */
/* compiled from: PG */
final class eg extends defpackage.rn {
    private final /* synthetic */ defpackage.ee b;

    eg(defpackage.ee eeVar) {
        this.b = eeVar;
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        super.a(view, tlVar);
        if (this.b.a) {
            tlVar.a(1048576);
            tlVar.d(true);
            return;
        }
        tlVar.d(false);
    }

    public final boolean a(android.view.View view, int i, android.os.Bundle bundle) {
        if (i != 1048576 || !this.b.a) {
            return super.a(view, i, bundle);
        }
        this.b.cancel();
        return true;
    }
}
