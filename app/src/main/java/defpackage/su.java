package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: su  reason: default package */
/* compiled from: PG */
final class su implements View.OnApplyWindowInsetsListener {
    private final /* synthetic */ sl a;

    su(sl slVar) {
        this.a = slVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) tk.a(this.a.a(view, tk.a(windowInsets)));
    }
}
