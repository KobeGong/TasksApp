package defpackage;

/* renamed from: cgc reason: default package */
/* compiled from: PG */
public final class cgc {
    public int a;
    public final /* synthetic */ com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer b;

    cgc() {
    }

    public final void a(float f) {
        if (this.b.d != null) {
            for (int size = this.b.d.size() - 1; size >= 0; size--) {
                ((defpackage.cgi) this.b.d.get(size)).a(f);
            }
        }
        float f2 = (1.0f - f) * this.b.a;
        this.b.a(f2, (int) (250.0f + (5.0f * f)));
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.b;
            ViewCompat.a(googleMaterialBottomDrawer, ViewCompat.a.k(googleMaterialBottomDrawer), (int) (((float) this.b.b) * f), ViewCompat.a.l(googleMaterialBottomDrawer), this.b.getPaddingBottom());
        }
    }

    public cgc(com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this.b = googleMaterialBottomDrawer;
        this();
        this.a = 5;
    }
}
