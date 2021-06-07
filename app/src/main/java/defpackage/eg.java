package defpackage;

import android.os.Bundle;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: eg  reason: default package */
/* compiled from: PG */
public final class eg extends rn {
    private final /* synthetic */ ee b;

    eg(ee eeVar) {
        this.b = eeVar;
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        super.a(view, tlVar);
        if (this.b.a) {
            tlVar.a(1048576);
            tlVar.d(true);
            return;
        }
        tlVar.d(false);
    }

    @Override // defpackage.rn
    public final boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576 || !this.b.a) {
            return super.a(view, i, bundle);
        }
        this.b.cancel();
        return true;
    }
}
