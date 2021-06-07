package defpackage;

import android.support.design.internal.CheckableImageButton;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: ev  reason: default package */
/* compiled from: PG */
public final class ev extends rn {
    private final /* synthetic */ CheckableImageButton b;

    public ev(CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    @Override // defpackage.rn
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.isChecked());
    }

    @Override // defpackage.rn
    public final void a(View view, tl tlVar) {
        super.a(view, tlVar);
        tlVar.a(true);
        tlVar.a.setChecked(this.b.isChecked());
    }
}
