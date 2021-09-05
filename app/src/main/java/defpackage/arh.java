package defpackage;

/* renamed from: arh reason: default package */
/* compiled from: PG */
final class arh implements OnApplyWindowInsetsListener {
    arh() {
    }

    public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat tkVar) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), tkVar.d());
        return tkVar;
    }
}
