package defpackage;

import android.os.Build;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cgc  reason: default package */
/* compiled from: PG */
public final class cgc {
    public int a;
    public final /* synthetic */ GoogleMaterialBottomDrawer b;

    cgc() {
    }

    public final void a(float f) {
        if (this.b.d != null) {
            for (int size = this.b.d.size() - 1; size >= 0; size--) {
                ((cgi) this.b.d.get(size)).a(f);
            }
        }
        this.b.a((1.0f - f) * this.b.a, (int) (250.0f + (5.0f * f)));
        if (Build.VERSION.SDK_INT >= 21) {
            GoogleMaterialBottomDrawer googleMaterialBottomDrawer = this.b;
            sn.a(googleMaterialBottomDrawer, sn.a.k(googleMaterialBottomDrawer), (int) (((float) this.b.b) * f), sn.a.l(googleMaterialBottomDrawer), this.b.getPaddingBottom());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public cgc(GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this();
        this.b = googleMaterialBottomDrawer;
        this.a = 5;
    }
}
