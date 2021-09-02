package defpackage;

/* renamed from: cgf reason: default package */
public final /* synthetic */ class cgf implements java.lang.Runnable {
    private final com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer a;
    private final java.lang.Runnable b;

    public cgf(com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer, java.lang.Runnable runnable) {
        this.a = googleMaterialBottomDrawer;
        this.b = runnable;
    }

    public final void run() {
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.a;
        java.lang.Runnable runnable = this.b;
        android.view.ViewGroup.LayoutParams layoutParams = googleMaterialBottomDrawer.getLayoutParams();
        if (!(layoutParams instanceof defpackage.ha)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        defpackage.gx gxVar = ((defpackage.ha) layoutParams).a;
        if (!(gxVar instanceof com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior)) {
            throw new java.lang.IllegalArgumentException("The view is not associated with BottomDrawerBehavior");
        }
        googleMaterialBottomDrawer.c = (com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior) gxVar;
        googleMaterialBottomDrawer.c.b(5);
        googleMaterialBottomDrawer.c.h = googleMaterialBottomDrawer.h;
        googleMaterialBottomDrawer.a(googleMaterialBottomDrawer.c.c);
        googleMaterialBottomDrawer.e.setOnClickListener(new defpackage.cgh(googleMaterialBottomDrawer));
        runnable.run();
    }
}
