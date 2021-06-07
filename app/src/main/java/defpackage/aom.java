package defpackage;

import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: aom  reason: default package */
final /* synthetic */ class aom implements View.OnClickListener {
    private final aol a;

    aom(aol aol) {
        this.a = aol;
    }

    public final void onClick(View view) {
        aol aol = this.a;
        if (!aol.U) {
            aol.U = true;
            int id = view.getId();
            if (id == R.id.my_order_option) {
                ajd.a(view);
                aol.a(ajr.MY_ORDER, bg.F);
            } else if (id == R.id.order_by_due_date_option) {
                ajd.a(view);
                aol.a(ajr.BY_DUE_DATE, bg.G);
            } else if (id == R.id.rename_list_option) {
                ajd.a(view);
                aol.d(bg.H);
            } else if (id == R.id.delete_list_option) {
                ajd.a(view);
                aol.d(bg.I);
            } else if (id == R.id.delete_all_completed_tasks_option) {
                ajd.a(view);
                aol.d(bg.J);
            } else if (id == R.id.search_option) {
                aol.d(bg.K);
            } else if (id == R.id.debug_info_option) {
                aol.d(bg.L);
            } else if (id == R.id.trigger_notifications_option) {
                aol.d(bg.M);
            }
            aol.J.postDelayed(new aon(aol), 150);
        }
    }
}
