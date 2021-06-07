package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cgf  reason: default package */
public final /* synthetic */ class cgf implements Runnable {
    private final GoogleMaterialBottomDrawer a;
    private final Runnable b;

    public cgf(GoogleMaterialBottomDrawer googleMaterialBottomDrawer, Runnable runnable) {
        this.a = googleMaterialBottomDrawer;
        this.b = runnable;
    }

    public final void run() {
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.a;
        Runnable runnable = this.b;
        ViewGroup.LayoutParams layoutParams = googleMaterialBottomDrawer.getLayoutParams();
        if (!(layoutParams instanceof ha)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        gx gxVar = ((ha) layoutParams).a;
        if (!(gxVar instanceof BottomDrawerBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomDrawerBehavior");
        }
        googleMaterialBottomDrawer.c = (BottomDrawerBehavior) gxVar;
        googleMaterialBottomDrawer.c.b(5);
        googleMaterialBottomDrawer.c.h = googleMaterialBottomDrawer.h;
        googleMaterialBottomDrawer.a(googleMaterialBottomDrawer.c.c);
        googleMaterialBottomDrawer.e.setOnClickListener(new cgh(googleMaterialBottomDrawer));
        runnable.run();
    }
}
