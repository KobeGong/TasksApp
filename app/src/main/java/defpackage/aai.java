package defpackage;

/* renamed from: aai reason: default package */
/* compiled from: PG */
public final class aai extends defpackage.aah {
    public aai(android.support.v7.widget.ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public final void getOutline(android.graphics.Outline outline) {
        if (this.a.e) {
            if (this.a.d != null) {
                this.a.d.getOutline(outline);
            }
        } else if (this.a.b != null) {
            this.a.b.getOutline(outline);
        }
    }
}
