package defpackage;

/* renamed from: cge reason: default package */
public final /* synthetic */ class cge implements java.lang.Runnable {
    private final com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer a;

    public cge(com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this.a = googleMaterialBottomDrawer;
    }

    public final void run() {
        boolean z;
        boolean z2;
        com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.a;
        com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior bottomDrawerBehavior = googleMaterialBottomDrawer.c;
        if (!googleMaterialBottomDrawer.getResources().getBoolean(2131558404)) {
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) googleMaterialBottomDrawer.getContext().getSystemService("accessibility");
            if (accessibilityManager == null || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                z = false;
                bottomDrawerBehavior.k = z;
                googleMaterialBottomDrawer.c.b(6);
            }
        }
        z = true;
        bottomDrawerBehavior.k = z;
        googleMaterialBottomDrawer.c.b(6);
    }
}
