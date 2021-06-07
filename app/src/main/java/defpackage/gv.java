package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;

/* renamed from: gv  reason: default package */
/* compiled from: PG */
public final class gv implements sl {
    private final /* synthetic */ CoordinatorLayout a;

    public gv(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // defpackage.sl
    public final tk a(View view, tk tkVar) {
        tk tkVar2;
        boolean z = true;
        int i = 0;
        CoordinatorLayout coordinatorLayout = this.a;
        if (jd.a(coordinatorLayout.b, tkVar)) {
            return tkVar;
        }
        coordinatorLayout.b = tkVar;
        coordinatorLayout.c = tkVar != null && tkVar.b() > 0;
        if (coordinatorLayout.c || coordinatorLayout.getBackground() != null) {
            z = false;
        }
        coordinatorLayout.setWillNotDraw(z);
        if (!tkVar.e()) {
            int childCount = coordinatorLayout.getChildCount();
            tkVar2 = tkVar;
            while (i < childCount) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (sn.a.h(childAt) && ((ha) childAt.getLayoutParams()).a != null && tkVar2.e()) {
                    break;
                }
                i++;
                tkVar2 = tkVar2;
            }
        } else {
            tkVar2 = tkVar;
        }
        coordinatorLayout.requestLayout();
        return tkVar2;
    }
}
