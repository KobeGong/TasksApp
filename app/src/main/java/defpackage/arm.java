package defpackage;

/* renamed from: arm reason: default package */
/* compiled from: PG */
final class arm extends android.support.design.widget.SwipeDismissBehavior {
    private android.view.View g;
    private android.view.View h;
    private final /* synthetic */ defpackage.ard i;

    arm(defpackage.ard ard) {
        this.i = ard;
    }

    public final boolean b(android.view.View view) {
        return view instanceof defpackage.arp;
    }

    /* access modifiers changed from: private */
    public final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, defpackage.arp arp, android.view.MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (coordinatorLayout.a((android.view.View) arp, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    defpackage.arr.a().a(this.i.f);
                    break;
                }
                break;
            case 1:
            case 3:
                defpackage.arr.a().b(this.i.f);
                break;
        }
        return super.a(coordinatorLayout, arp, motionEvent);
    }

    private final boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, defpackage.arp arp) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) arp.getLayoutParams();
        int i2 = marginLayoutParams.bottomMargin;
        int dimensionPixelOffset = arp.getResources().getDimensionPixelOffset(2131689850);
        int dimensionPixelOffset2 = arp.getResources().getDimensionPixelOffset(2131689851);
        if (a(coordinatorLayout, this.h)) {
            dimensionPixelOffset = (coordinatorLayout.getHeight() - this.h.getTop()) + dimensionPixelOffset2;
        } else if (a(coordinatorLayout, this.g)) {
            dimensionPixelOffset += coordinatorLayout.getHeight() - this.g.getTop();
        }
        if (i2 == dimensionPixelOffset) {
            return false;
        }
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        return true;
    }

    private static boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() == coordinatorLayout;
    }

    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i2) {
        a(coordinatorLayout, (defpackage.arp) view);
        return false;
    }

    public final /* synthetic */ boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        return a(coordinatorLayout, (defpackage.arp) view);
    }

    public final /* synthetic */ boolean a_(android.view.View view) {
        int id = view.getId();
        if (id == 2131755013) {
            this.g = view;
            return true;
        } else if (id != 2131755015) {
            return false;
        } else {
            this.h = view;
            return true;
        }
    }
}
