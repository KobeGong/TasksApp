package defpackage;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: asg  reason: default package */
/* compiled from: PG */
final class asg extends ee {
    asg(Context context, int i) {
        super(context, i, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ee
    public final void onStart() {
        BottomSheetBehavior bottomSheetBehavior;
        super.onStart();
        View findViewById = findViewById(R.id.design_bottom_sheet);
        if (findViewById != null && (bottomSheetBehavior = (BottomSheetBehavior) ((ha) findViewById.getLayoutParams()).a) != null) {
            bottomSheetBehavior.b(3);
        }
    }
}
