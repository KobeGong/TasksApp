package defpackage;

import android.widget.ImageView;
import com.google.android.apps.tasks.R;

/* access modifiers changed from: package-private */
/* renamed from: atj  reason: default package */
/* compiled from: PG */
public final class atj {
    public final /* synthetic */ atg a;

    public final void a(boolean z) {
        int i;
        ImageView imageView = this.a.k;
        if (z) {
            i = R.drawable.quantum_ic_stat_1_grey600_24;
        } else {
            i = R.drawable.quantum_ic_stat_minus_1_grey600_24;
        }
        imageView.setImageResource(i);
        atg atg = this.a;
        atg.j.setAccessibilityDelegate(new ati(atg));
    }

    atj(atg atg) {
        this.a = atg;
    }
}
