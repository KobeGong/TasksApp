package defpackage;

/* renamed from: agh reason: default package */
/* compiled from: PG */
public final class agh implements android.widget.TextView.OnEditorActionListener {
    private final /* synthetic */ android.support.v7.widget.SearchView a;

    public agh(android.support.v7.widget.SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        this.a.e();
        return true;
    }
}
