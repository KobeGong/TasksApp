package defpackage;

/* renamed from: en reason: default package */
/* compiled from: PG */
public final class en extends android.view.ViewOutlineProvider {
    private final /* synthetic */ android.support.design.chip.Chip a;

    public en(android.support.design.chip.Chip chip) {
        this.a = chip;
    }

    @android.annotation.TargetApi(21)
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        if (this.a.b != null) {
            this.a.b.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
