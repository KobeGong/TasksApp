package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.tasks.R;
import com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cge  reason: default package */
public final /* synthetic */ class cge implements Runnable {
    private final GoogleMaterialBottomDrawer a;

    public cge(GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this.a = googleMaterialBottomDrawer;
    }

    public final void run() {
        boolean z;
        boolean z2;
        GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.a;
        BottomDrawerBehavior bottomDrawerBehavior = googleMaterialBottomDrawer.c;
        if (!googleMaterialBottomDrawer.getResources().getBoolean(R.bool.bottom_drawer_force_full_screen)) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) googleMaterialBottomDrawer.getContext().getSystemService("accessibility");
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
