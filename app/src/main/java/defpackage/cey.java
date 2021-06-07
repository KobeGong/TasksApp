package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.tasks.R;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

/* access modifiers changed from: package-private */
/* renamed from: cey  reason: default package */
/* compiled from: PG */
public final class cey extends xg {
    public GoogleMaterialBottomDrawer a;
    private final cgi b = new cez(this);
    private final rn c = new cfa(this);

    cey(Context context) {
        super(context, R.style.BottomSheetDialog);
        a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.xg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, defpackage.xg
    public final void setContentView(View view) {
        cky.a(view instanceof cff, "Content of dialog must be BaseAccountMenuView");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) View.inflate(getContext(), R.layout.account_menu_dialog, null);
        this.a = (GoogleMaterialBottomDrawer) coordinatorLayout.findViewById(R.id.bottom_drawer);
        this.a.addView(view);
        sn.a(this.a, this.c);
        this.a.a(this.b);
        super.setContentView(coordinatorLayout);
    }

    public final void onAttachedToWindow() {
        if (this.a != null && isShowing()) {
            this.a.a();
        }
    }

    public final void dismiss() {
        if (this.a == null || !this.a.b()) {
            super.dismiss();
        } else {
            this.a.c();
        }
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            return true;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
}
