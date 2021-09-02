package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: aom reason: default package */
final /* synthetic */ class aom implements android.view.View.OnClickListener {
    private final BottomSheetMenuDialogFragment a;

    aom(BottomSheetMenuDialogFragment aol) {
        this.a = aol;
    }

    public final void onClick(android.view.View view) {
        BottomSheetMenuDialogFragment aol = this.a;
        if (!aol.U) {
            aol.U = true;
            int id = view.getId();
            if (id == R.id.my_order_option) {
                defpackage.ajd.a(view);
                aol.a(defpackage.ajr.MY_ORDER, defpackage.bg.F);
            } else if (id == R.id.order_by_due_date_option) {
                defpackage.ajd.a(view);
                aol.a(defpackage.ajr.BY_DUE_DATE, defpackage.bg.G);
            } else if (id == R.id.rename_list_option) {
                defpackage.ajd.a(view);
                aol.d(defpackage.bg.H);
            } else if (id == R.id.delete_list_option) {
                defpackage.ajd.a(view);
                aol.d(defpackage.bg.I);
            } else if (id == R.id.delete_all_completed_tasks_option) {
                defpackage.ajd.a(view);
                aol.d(defpackage.bg.J);
            } else if (id == R.id.search_option) {
                aol.d(defpackage.bg.K);
            } else if (id == R.id.debug_info_option) {
                aol.d(defpackage.bg.L);
            } else if (id == R.id.trigger_notifications_option) {
                aol.d(defpackage.bg.M);
            }
            aol.J.postDelayed(new defpackage.aon(aol), 150);
        }
    }
}
