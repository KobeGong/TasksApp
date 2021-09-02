package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: asg reason: default package */
/* compiled from: PG */
final class asg extends defpackage.ee {
    asg(android.content.Context context, int i) {
        super(context, i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        android.view.View findViewById = findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            android.support.design.widget.BottomSheetBehavior bottomSheetBehavior = (android.support.design.widget.BottomSheetBehavior) ((defpackage.ha) findViewById.getLayoutParams()).a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.b(3);
            }
        }
    }
}
