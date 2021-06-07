package defpackage;

import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cgg  reason: default package */
public final /* synthetic */ class cgg implements Runnable {
    private final GoogleMaterialBottomDrawer a;

    public cgg(GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this.a = googleMaterialBottomDrawer;
    }

    public final void run() {
        this.a.c.b(5);
    }
}
