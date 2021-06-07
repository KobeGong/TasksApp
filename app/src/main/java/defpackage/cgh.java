package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* renamed from: cgh  reason: default package */
final /* synthetic */ class cgh implements View.OnClickListener {
    private final GoogleMaterialBottomDrawer a;

    cgh(GoogleMaterialBottomDrawer googleMaterialBottomDrawer) {
        this.a = googleMaterialBottomDrawer;
    }

    public final void onClick(View view) {
        this.a.c.b(5);
    }
}
