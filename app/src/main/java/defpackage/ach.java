package defpackage;

/* renamed from: ach reason: default package */
/* compiled from: PG */
final class ach implements android.widget.PopupWindow.OnDismissListener {
    private final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener a;
    private final /* synthetic */ defpackage.ace b;

    ach(defpackage.ace ace, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.b = ace;
        this.a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        android.view.ViewTreeObserver viewTreeObserver = this.b.d.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
