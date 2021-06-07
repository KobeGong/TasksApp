package defpackage;

import com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cga  reason: default package */
public final /* synthetic */ class cga implements Runnable {
    private final BottomDrawerBehavior a;
    private final GoogleMaterialBottomDrawer b;
    private final int c;

    public cga(BottomDrawerBehavior bottomDrawerBehavior, GoogleMaterialBottomDrawer googleMaterialBottomDrawer, int i) {
        this.a = bottomDrawerBehavior;
        this.b = googleMaterialBottomDrawer;
        this.c = i;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
