package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.tasks.R;

/* renamed from: aoo  reason: default package */
/* compiled from: PG */
final class aoo extends View.AccessibilityDelegate {
    private final /* synthetic */ aol a;

    aoo(aol aol) {
        this.a = aol;
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText().add(this.a.k().getString(R.string.a11y_more_options_open));
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }
}
