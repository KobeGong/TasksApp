package defpackage;

import android.os.Bundle;
import android.view.View;

/* renamed from: cfa  reason: default package */
/* compiled from: PG */
final class cfa extends rn {
    private final /* synthetic */ cey b;

    cfa(cey cey) {
        this.b = cey;
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        super.a(view, tlVar);
        tlVar.a(1048576);
        tlVar.d(true);
    }

    @Override // defpackage.rn
    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.b.dismiss();
        return true;
    }
}
