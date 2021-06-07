package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.common.TaskApplication;
import com.google.android.apps.tasks.ui.components.CheckOptionItem;

/* renamed from: aol  reason: default package */
/* compiled from: PG */
public final class aol extends gu {
    public boolean U;
    private ajr V;
    private CheckOptionItem W;
    private CheckOptionItem X;
    private View Y;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_menu, viewGroup, false);
        this.W = (CheckOptionItem) inflate.findViewById(R.id.my_order_option);
        this.X = (CheckOptionItem) inflate.findViewById(R.id.order_by_due_date_option);
        aom aom = new aom(this);
        this.W.setOnClickListener(aom);
        this.X.setOnClickListener(aom);
        cky.a((View) this.W, new cpc(dck.h));
        cky.a((View) this.X, new cpc(dck.f));
        this.V = null;
        if (this.i != null) {
            String string = this.i.getString("taskOrder");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.V = ajr.a(string);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(string);
                    azb.a(valueOf.length() != 0 ? "Wrong task order passed as argument: ".concat(valueOf) : new String("Wrong task order passed as argument: "), (Throwable) e, new String[0]);
                }
            }
        }
        if (this.V == null) {
            this.V = ajr.MY_ORDER;
        }
        CheckOptionItem checkOptionItem = this.W;
        if (this.V == ajr.MY_ORDER) {
            z = true;
        } else {
            z = false;
        }
        checkOptionItem.a(z);
        CheckOptionItem checkOptionItem2 = this.X;
        if (this.V == ajr.BY_DUE_DATE) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkOptionItem2.a(z2);
        a(inflate, (int) R.id.rename_list_option, dck.d, aom);
        View a = a(inflate, (int) R.id.delete_list_option, dck.c, aom);
        String string2 = this.i.getString("selectedTaskList");
        if (TextUtils.isEmpty(string2) || ajd.a(string2)) {
            z3 = false;
        }
        a.setEnabled(z3);
        this.Y = a(inflate, (int) R.id.delete_all_completed_tasks_option, dck.b, aom);
        this.Y.setEnabled(this.i.getBoolean("hasCompletedTasks", false));
        View a2 = a(inflate, (int) R.id.search_option, (cpg) null, aom);
        if (!crk.a.a()) {
            a2.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.debug_info_option);
        textView.setOnClickListener(aom);
        TextView textView2 = (TextView) inflate.findViewById(R.id.trigger_notifications_option);
        textView2.setOnClickListener(aom);
        TaskApplication.b();
        textView.setVisibility(8);
        textView2.setVisibility(8);
        boolean z4 = this.i.getBoolean("contentVisible");
        if (bundle != null) {
            z4 = bundle.getBoolean("contentVisible", z4);
        }
        c(z4);
        inflate.setAccessibilityDelegate(new aoo(this));
        return inflate;
    }

    public final void c(boolean z) {
        if (this.W != null) {
            this.W.setEnabled(z);
            this.X.setEnabled(z);
        }
    }

    @Override // defpackage.lb, defpackage.lc
    public final void d(Bundle bundle) {
        super.d(bundle);
        bundle.putBoolean("contentVisible", this.X.isEnabled());
    }

    private static View a(View view, int i, cpg cpg, View.OnClickListener onClickListener) {
        TextView textView = (TextView) view.findViewById(i);
        if (cpg != null) {
            cky.a((View) textView, new cpc(cpg));
        }
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    @Override // defpackage.lb, defpackage.lc
    public final void a(Context context) {
        super.a(context);
        cky.a((Activity) j(), dck.g);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        if (j() instanceof aop) {
            ((aop) j()).b_(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ajr ajr, int i) {
        if (this.V != ajr) {
            d(i);
        }
    }
}
