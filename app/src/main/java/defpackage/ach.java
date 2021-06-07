package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: ach  reason: default package */
/* compiled from: PG */
final class ach implements PopupWindow.OnDismissListener {
    private final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    private final /* synthetic */ ace b;

    ach(ace ace, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = ace;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
