package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.apps.tasks.common.TaskApplication;
import com.google.android.apps.tasks.ui.components.CheckOptionItem;

/* renamed from: aol  reason: default package */
/* compiled from: PG */
public final class aol extends gu {
    public boolean U;
    private ajr orderType;
    private CheckOptionItem menuMyOrder;
    private CheckOptionItem menuDateOrder;
    private View Y;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.bottom_sheet_menu, viewGroup, false);
        this.menuMyOrder = (CheckOptionItem) inflate.findViewById(com.google.android.apps.tasks.R.id.my_order_option);
        this.menuDateOrder = (CheckOptionItem) inflate.findViewById(com.google.android.apps.tasks.R.id.order_by_due_date_option);
        aom aom = new aom(this);
        this.menuMyOrder.setOnClickListener(aom);
        this.menuDateOrder.setOnClickListener(aom);
        cky.a((View) this.menuMyOrder, new cpc(dck.h));
        cky.a((View) this.menuDateOrder, new cpc(dck.f));
        this.orderType = null;
        if (this.i != null) {
            String string = this.i.getString("taskOrder");
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.orderType = ajr.valueOf(string);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(string);
                    azb.a(valueOf.length() != 0 ? "Wrong task order passed as argument: ".concat(valueOf) : new String("Wrong task order passed as argument: "), (Throwable) e, new String[0]);
                }
            }
        }
        if (this.orderType == null) {
            this.orderType = ajr.MY_ORDER;
        }
        CheckOptionItem checkOptionItem = this.menuMyOrder;
        z = this.orderType == ajr.MY_ORDER;
        checkOptionItem.a(z);
        CheckOptionItem checkOptionItem2 = this.menuDateOrder;
        if (this.orderType == ajr.BY_DUE_DATE) {
            z2 = true;
        } else {
            z2 = false;
        }
        checkOptionItem2.a(z2);
        a(inflate, (int) com.google.android.apps.tasks.R.id.rename_list_option, dck.d, aom);
        View a = a(inflate, (int) com.google.android.apps.tasks.R.id.delete_list_option, dck.c, aom);
        String string2 = this.i.getString("selectedTaskList");
        if (TextUtils.isEmpty(string2) || ajd.a(string2)) {
            z3 = false;
        }
        a.setEnabled(z3);
        this.Y = a(inflate, (int) com.google.android.apps.tasks.R.id.delete_all_completed_tasks_option, dck.b, aom);
        this.Y.setEnabled(this.i.getBoolean("hasCompletedTasks", false));
        View a2 = a(inflate, (int) com.google.android.apps.tasks.R.id.search_option, (cpg) null, aom);
        if (!crk.a.a()) {
            a2.setVisibility(8);
        }
        TextView textView = (TextView) inflate.findViewById(com.google.android.apps.tasks.R.id.debug_info_option);
        textView.setOnClickListener(aom);
        TextView textView2 = (TextView) inflate.findViewById(com.google.android.apps.tasks.R.id.trigger_notifications_option);
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
        if (this.menuMyOrder != null) {
            this.menuMyOrder.setEnabled(z);
            this.menuDateOrder.setEnabled(z);
        }
    }

    @Override // defpackage.lb, defpackage.lc
    public final void d(Bundle bundle) {
        super.d(bundle);
        bundle.putBoolean("contentVisible", this.menuDateOrder.isEnabled());
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
        cky.a((Activity) getActivity(), dck.g);
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        if (getActivity() instanceof aop) {
            ((aop) getActivity()).b_(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ajr type, int i) {
        if (this.orderType != type) {
            d(i);
        }
    }
}
