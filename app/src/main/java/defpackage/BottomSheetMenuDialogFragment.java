package defpackage;

import com.google.android.apps.tasks.ui.components.CheckOptionItem;

/* renamed from: aol reason: default package */
/* compiled from: PG */
/* compiled from: BottomSheetMenuDialogFragment */
public final class BottomSheetMenuDialogFragment extends defpackage.gu {
    public boolean U;
    private defpackage.ajr V;
    private CheckOptionItem myOderOptionView;
    private CheckOptionItem dateOptionView;
    private android.view.View Y;

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        android.view.View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.bottom_sheet_menu, viewGroup, false);
        this.myOderOptionView = inflate.findViewById(com.google.android.apps.tasks.R.id.my_order_option);
        this.dateOptionView = inflate.findViewById(com.google.android.apps.tasks.R.id.order_by_due_date_option);
        defpackage.aom aom = new defpackage.aom(this);
        this.myOderOptionView.setOnClickListener(aom);
        this.dateOptionView.setOnClickListener(aom);
        defpackage.cky.a(this.myOderOptionView, new defpackage.cpc(defpackage.dck.h));
        defpackage.cky.a(this.dateOptionView, new defpackage.cpc(defpackage.dck.f));
        this.V = null;
        if (this.i != null) {
            java.lang.String string = this.i.getString("taskOrder");
            if (!android.text.TextUtils.isEmpty(string)) {
                try {
                    this.V = defpackage.ajr.a(string);
                } catch (java.lang.IllegalArgumentException e) {
                    java.lang.IllegalArgumentException illegalArgumentException = e;
                    java.lang.String str = "Wrong task order passed as argument: ";
                    java.lang.String valueOf = java.lang.String.valueOf(string);
                    defpackage.azb.a(valueOf.length() != 0 ? str.concat(valueOf) : str, illegalArgumentException, new java.lang.String[0]);
                }
            }
        }
        if (this.V == null) {
            this.V = defpackage.ajr.MY_ORDER;
        }
        CheckOptionItem checkOptionItem = this.myOderOptionView;
        z = this.V == ajr.MY_ORDER;
        checkOptionItem.a(z);
        CheckOptionItem checkOptionItem2 = this.dateOptionView;
        z2 = this.V == ajr.BY_DUE_DATE;
        checkOptionItem2.a(z2);
        a(inflate, com.google.android.apps.tasks.R.id.rename_list_option, defpackage.dck.d, aom);
        android.view.View a = a(inflate, com.google.android.apps.tasks.R.id.delete_list_option, defpackage.dck.c, aom);
        java.lang.String string2 = this.i.getString("selectedTaskList");
        if (android.text.TextUtils.isEmpty(string2) || defpackage.ajd.a(string2)) {
            z3 = false;
        }
        a.setEnabled(z3);
        this.Y = a(inflate, com.google.android.apps.tasks.R.id.delete_all_completed_tasks_option, defpackage.dck.b, aom);
        this.Y.setEnabled(this.i.getBoolean("hasCompletedTasks", false));
        android.view.View a2 = a(inflate, com.google.android.apps.tasks.R.id.search_option, null, aom);
        if (!defpackage.crk.a.a()) {
            a2.setVisibility(8);
        }
        android.widget.TextView textView = inflate.findViewById(com.google.android.apps.tasks.R.id.debug_info_option);
        textView.setOnClickListener(aom);
        android.widget.TextView textView2 = inflate.findViewById(com.google.android.apps.tasks.R.id.trigger_notifications_option);
        textView2.setOnClickListener(aom);
        com.google.android.apps.tasks.common.TaskApplication.getApplication();
        textView.setVisibility(8);
        textView2.setVisibility(8);
        boolean z4 = this.i.getBoolean("contentVisible");
        if (bundle != null) {
            z4 = bundle.getBoolean("contentVisible", z4);
        }
        c(z4);
        inflate.setAccessibilityDelegate(new defpackage.aoo(this));
        return inflate;
    }

    public final void c(boolean z) {
        if (this.myOderOptionView != null) {
            this.myOderOptionView.setEnabled(z);
            this.dateOptionView.setEnabled(z);
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("contentVisible", this.dateOptionView.isEnabled());
    }

    private static android.view.View a(android.view.View view, int i, defpackage.cpg cpg, android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = view.findViewById(i);
        if (cpg != null) {
            defpackage.cky.a(textView, new defpackage.cpc(cpg));
        }
        textView.setOnClickListener(onClickListener);
        return textView;
    }

    public final void a(android.content.Context context) {
        super.a(context);
        defpackage.cky.a(getActivity(), defpackage.dck.g);
    }

    /* access modifiers changed from: 0000 */
    public final void d(int i) {
        if (getActivity() instanceof defpackage.aop) {
            ((defpackage.aop) getActivity()).b_(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(defpackage.ajr ajr, int i) {
        if (this.V != ajr) {
            d(i);
        }
    }
}
