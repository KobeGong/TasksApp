package defpackage;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.tasks.R;

/* renamed from: arm  reason: default package */
/* compiled from: PG */
final class arm extends SwipeDismissBehavior {
    private View g;
    private View h;
    private final /* synthetic */ ard i;

    arm(ard ard) {
        this.i = ard;
    }

    @Override // android.support.design.behavior.SwipeDismissBehavior
    public final boolean b(View view) {
        return view instanceof arp;
    }

    /* access modifiers changed from: private */
    public final boolean a(CoordinatorLayout coordinatorLayout, arp arp, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (coordinatorLayout.a(arp, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    arr.a().a(this.i.f);
                    break;
                }
                break;
            case 1:
            case 3:
                arr.a().b(this.i.f);
                break;
        }
        return super.a(coordinatorLayout, (View) arp, motionEvent);
    }

    private final boolean a(CoordinatorLayout coordinatorLayout, arp arp) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) arp.getLayoutParams();
        int i2 = marginLayoutParams.bottomMargin;
        int dimensionPixelOffset = arp.getResources().getDimensionPixelOffset(R.dimen.snackbar_bottom_spacing);
        int dimensionPixelOffset2 = arp.getResources().getDimensionPixelOffset(R.dimen.snackbar_bottom_spacing_with_fab);
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

    private static boolean a(CoordinatorLayout coordinatorLayout, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() == coordinatorLayout;
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
        a(coordinatorLayout, (arp) view);
        return false;
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return a(coordinatorLayout, (arp) view);
    }

    @Override // defpackage.gx
    public final /* synthetic */ boolean a_(View view) {
        int id = view.getId();
        if (id == R.id.bottom_app_bar) {
            this.g = view;
            return true;
        } else if (id != R.id.fab) {
            return false;
        } else {
            this.h = view;
            return true;
        }
    }
}
