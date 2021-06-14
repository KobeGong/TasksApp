package defpackage;

import android.view.View;

/* renamed from: auu  reason: default package */
/* compiled from: PG */
final class auu extends acs {
    private final /* synthetic */ auj m;

    auu(auj auj) {
        this.m = auj;
    }

    @Override // defpackage.aey, defpackage.agp
    public final boolean b(ViewHolder afv, afb afb, afb afb2) {
        dby g = this.m.taskAdapter.g(afv.d());
        if (g == null || !g.d.equals(this.m.taskAdapter.a)) {
            return super.b(afv, afb, afb2);
        }
        this.m.taskAdapter.a = null;
        View view = afv.a;
        return a(afv, -view.getWidth(), view.getTop(), 0, view.getTop());
    }
}
