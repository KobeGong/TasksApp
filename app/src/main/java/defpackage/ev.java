package defpackage;

/* renamed from: ev reason: default package */
/* compiled from: PG */
public final class ev extends defpackage.rn {
    private final /* synthetic */ android.support.design.internal.CheckableImageButton b;

    public ev(android.support.design.internal.CheckableImageButton checkableImageButton) {
        this.b = checkableImageButton;
    }

    public final void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.b.isChecked());
    }

    public final void a(android.view.View view, defpackage.tl tlVar) {
        super.a(view, tlVar);
        tlVar.a(true);
        tlVar.a.setChecked(this.b.isChecked());
    }
}
