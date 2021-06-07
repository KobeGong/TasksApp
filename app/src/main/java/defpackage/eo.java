package defpackage;

import android.os.Build;
import android.support.design.chip.Chip;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.tasks.R;
import java.util.List;

/* renamed from: eo  reason: default package */
/* compiled from: PG */
public final class eo extends up {
    private final /* synthetic */ Chip f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.up
    public final int a(float f2, float f3) {
        if (!this.f.c() || !this.f.d().contains(f2, f3)) {
            return -1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.up
    public final void a(List list) {
        if (this.f.c()) {
            list.add(0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.up
    public final void a(tl tlVar) {
        if (this.f.c()) {
            tlVar.b(this.f.getContext().getString(R.string.mtrl_chip_close_icon_content_description));
            tlVar.b(this.f.e());
            tm tmVar = tm.a;
            if (Build.VERSION.SDK_INT >= 21) {
                tlVar.a.addAction((AccessibilityNodeInfo.AccessibilityAction) tmVar.b);
            }
            tlVar.c(this.f.isEnabled());
            return;
        }
        tlVar.b("");
        tlVar.b(Chip.a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.up
    public final void b(tl tlVar) {
        CharSequence charSequence;
        tlVar.a(this.f.b != null && this.f.b.n);
        tlVar.a(Chip.class.getName());
        if (this.f.b != null) {
            charSequence = this.f.b.g;
        } else {
            charSequence = "";
        }
        tlVar.b(charSequence);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.up
    public final boolean a(int i, int i2) {
        if (i2 == 16 && i == 0) {
            return this.f.b();
        }
        return false;
    }
}
