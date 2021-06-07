package defpackage;

import android.support.v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: agh  reason: default package */
/* compiled from: PG */
public final class agh implements TextView.OnEditorActionListener {
    private final /* synthetic */ SearchView a;

    public agh(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.e();
        return true;
    }
}
