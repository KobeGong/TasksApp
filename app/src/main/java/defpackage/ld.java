package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: ld  reason: default package */
/* compiled from: PG */
public final class ld extends lk {
    private final /* synthetic */ lc a;

    ld(lc lcVar) {
        this.a = lcVar;
    }

    @Override // defpackage.lk
    public final View a(int i) {
        if (this.a.J != null) {
            return this.a.J.findViewById(i);
        }
        throw new IllegalStateException("Fragment does not have a view");
    }

    @Override // defpackage.lk
    public final boolean a() {
        return this.a.J != null;
    }

    @Override // defpackage.lk
    public final lc a(Context context, String str, Bundle bundle) {
        return this.a.u.a(context, str, bundle);
    }
}
