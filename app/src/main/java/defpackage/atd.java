package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.google.android.apps.tasks.ui.components.CheckOptionItem;

/* renamed from: atd  reason: default package */
/* compiled from: PG */
public final class atd extends gu {
    private LinearLayout U;

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.task_list_selector_bottom_sheet_fragment, viewGroup, false);
        this.U = (LinearLayout) inflate.findViewById(R.id.options_container);
        return inflate;
    }

    @Override // defpackage.lb, defpackage.lc
    public final void c(Bundle bundle) {
        dcd dcd;
        super.c(bundle);
        anc c = any.get().c();
        if (c == null) {
            a(true);
            azb.a("SyncEngine not yet initialized", new Object[0]);
            return;
        }
        Bundle bundle2 = this.i;
        String string = bundle2 != null ? bundle2.getString("selectedTaskList") : null;
        for (dcb dcb : c.d()) {
            CheckOptionItem checkOptionItem = new CheckOptionItem(i());
            checkOptionItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            if (dcb.c == null) {
                dcd = dcd.c;
            } else {
                dcd = dcb.c;
            }
            checkOptionItem.a(dcd.a);
            if (dcb.b.equals(string)) {
                checkOptionItem.a(true);
            }
            this.U.addView(checkOptionItem);
            checkOptionItem.setOnClickListener(new ate(this, dcb));
        }
    }
}
