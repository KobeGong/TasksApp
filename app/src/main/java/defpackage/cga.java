package defpackage;

/* renamed from: cga reason: default package */
public final /* synthetic */ class cga implements java.lang.Runnable {
    private final com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior a;
    private final com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer b;
    private final int c;

    public cga(com.google.android.libraries.onegoogle.bottomdrawer.BottomDrawerBehavior bottomDrawerBehavior, com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer, int i) {
        this.a = bottomDrawerBehavior;
        this.b = googleMaterialBottomDrawer;
        this.c = i;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
