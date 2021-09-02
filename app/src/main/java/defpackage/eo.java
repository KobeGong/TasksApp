package defpackage;

/* renamed from: eo reason: default package */
/* compiled from: PG */
public final class eo extends defpackage.up {
    private final /* synthetic */ android.support.design.chip.Chip f;

    public eo(android.support.design.chip.Chip chip, android.support.design.chip.Chip chip2) {
        this.f = chip;
        super(chip2);
    }

    /* access modifiers changed from: protected */
    public final int a(float f2, float f3) {
        if (!this.f.c() || !this.f.d().contains(f2, f3)) {
            return -1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void a(java.util.List list) {
        if (this.f.c()) {
            list.add(java.lang.Integer.valueOf(0));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(defpackage.tl tlVar) {
        if (this.f.c()) {
            tlVar.b((java.lang.CharSequence) this.f.getContext().getString(2131951753));
            tlVar.b(this.f.e());
            defpackage.tm tmVar = defpackage.tm.a;
            if (android.os.Build.VERSION.SDK_INT >= 21) {
                tlVar.a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) tmVar.b);
            }
            tlVar.c(this.f.isEnabled());
            return;
        }
        tlVar.b((java.lang.CharSequence) "");
        tlVar.b(android.support.design.chip.Chip.a);
    }

    /* access modifiers changed from: protected */
    public final void b(defpackage.tl tlVar) {
        java.lang.CharSequence charSequence;
        tlVar.a(this.f.b != null && this.f.b.n);
        tlVar.a((java.lang.CharSequence) android.support.design.chip.Chip.class.getName());
        if (this.f.b != null) {
            charSequence = this.f.b.g;
        } else {
            charSequence = "";
        }
        tlVar.b(charSequence);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, int i2) {
        if (i2 == 16 && i == 0) {
            return this.f.b();
        }
        return false;
    }
}
