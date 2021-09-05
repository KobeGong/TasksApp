package defpackage;

/* renamed from: gv reason: default package */
/* compiled from: PG */
public final class gv implements OnApplyWindowInsetsListener {
    private final /* synthetic */ android.support.design.widget.CoordinatorLayout a;

    public gv(android.support.design.widget.CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat tkVar) {
        WindowInsetsCompat tkVar2;
        boolean z = true;
        int i = 0;
        android.support.design.widget.CoordinatorLayout coordinatorLayout = this.a;
        if (defpackage.jd.a((java.lang.Object) coordinatorLayout.b, (java.lang.Object) tkVar)) {
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
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if (ViewCompat.a.h(childAt) && ((defpackage.ha) childAt.getLayoutParams()).a != null && tkVar2.e()) {
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
