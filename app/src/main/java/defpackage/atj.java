package defpackage;

import android.widget.ImageView;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: atj  reason: default package */
/* compiled from: PG */
public final class atj {
    public final /* synthetic */ SortableAdapter adapter;

    public final void a(boolean z) {
        int i;
        ImageView imageView = this.adapter.expandView;
        if (z) {
            i = R.drawable.quantum_ic_stat_1_grey600_24;
        } else {
            i = R.drawable.quantum_ic_stat_minus_1_grey600_24;
        }
        imageView.setImageResource(i);
        SortableAdapter atg = this.adapter;
        atg.countVIEW.setAccessibilityDelegate(new ati(atg));
    }

    atj(SortableAdapter atg) {
        this.adapter = atg;
    }
}
