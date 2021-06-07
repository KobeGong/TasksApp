package defpackage;

import android.support.design.internal.NavigationMenuItemView;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: fc  reason: default package */
/* compiled from: PG */
public final class fc implements View.OnClickListener {
    private final /* synthetic */ fb a;

    fc(fb fbVar) {
        this.a = fbVar;
    }

    public final void onClick(View view) {
        this.a.b(true);
        zi ziVar = ((NavigationMenuItemView) view).e;
        boolean a2 = this.a.c.a(ziVar, this.a, 0);
        if (ziVar != null && ziVar.isCheckable() && a2) {
            this.a.e.a(ziVar);
        }
        this.a.b(false);
        this.a.a(false);
    }
}
