package defpackage;

import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tasks.R;
import com.google.android.apps.tasks.ui.components.FancyCheckboxView;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* renamed from: akt  reason: default package */
/* compiled from: PG */
public final class akt extends aet {
    public List a;
    public aku b;

    public akt() {
        c();
    }

    @Override // defpackage.aet
    public final long a(int i) {
        akz akz = (akz) this.a.get(i);
        return (long) Arrays.hashCode(new Object[]{akz.a().b, akz.b().d});
    }

    @Override // defpackage.aet
    public final afv a(ViewGroup viewGroup, int i) {
        akv akv = new akv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result, viewGroup, false));
        akv.p = new aky(this);
        return akv;
    }

    @Override // defpackage.aet
    public final void a(afv afv, int i) {
        dca dca;
        dca dca2;
        dca dca3;
        float f;
        dca dca4;
        boolean z;
        dcd dcd;
        dca dca5;
        dmk dmk;
        String string;
        String quantityString;
        akv akv = (akv) afv;
        akz akz = (akz) this.a.get(i);
        TextView textView = akv.r;
        dby b2 = akz.b();
        if (b2.e == null) {
            dca = dca.g;
        } else {
            dca = b2.e;
        }
        textView.setText(dca.b);
        dby b3 = akz.b();
        if (b3.e == null) {
            dca2 = dca.g;
        } else {
            dca2 = b3.e;
        }
        if (TextUtils.isEmpty(dca2.c)) {
            akv.s.setText("");
            akv.s.setVisibility(8);
        } else {
            TextView textView2 = akv.s;
            dby b4 = akz.b();
            if (b4.e == null) {
                dca3 = dca.g;
            } else {
                dca3 = b4.e;
            }
            textView2.setText(dca3.c);
            akv.s.setVisibility(0);
        }
        FancyCheckboxView fancyCheckboxView = akv.v;
        if (ajd.a(akz.b())) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        akv.u.setVisibility(8);
        dby b5 = akz.b();
        if (b5.e == null) {
            dca4 = dca.g;
        } else {
            dca4 = b5.e;
        }
        if (dca4.d != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            akv.t.setVisibility(0);
            TextView textView3 = akv.t;
            dby b6 = akz.b();
            if (b6.e == null) {
                dca5 = dca.g;
            } else {
                dca5 = b6.e;
            }
            if (dca5.d == null) {
                dmk = dmk.d;
            } else {
                dmk = dca5.d;
            }
            Calendar b7 = ajd.b(dmk);
            long a2 = (long) ajd.a(b7, akv.t());
            if (a2 < 0) {
                long j = -a2;
                if (j < 7) {
                    quantityString = akv.a.getResources().getQuantityString(R.plurals.task_overdue_days, (int) j, Integer.valueOf((int) j));
                } else {
                    int i2 = ((int) j) / 7;
                    quantityString = akv.a.getResources().getQuantityString(R.plurals.task_overdue_weeks, i2, Integer.valueOf(i2));
                }
                string = akv.a(akv.a.getContext(), quantityString, "^1", R.color.task_overdue_date);
            } else if (a2 == 0) {
                string = akv.a(akv.a.getContext(), akv.a.getContext().getString(R.string.task_due_today), "^1", R.color.task_due_today_date);
            } else if (a2 == 1) {
                string = akv.a.getContext().getString(R.string.task_due_tomorrow);
            } else {
                string = akv.a.getContext().getString(R.string.task_due_date, Long.valueOf(b7.getTimeInMillis()));
            }
            textView3.setText(Html.fromHtml(string));
        } else {
            akv.t.setVisibility(8);
        }
        TextView textView4 = akv.q;
        dcb a3 = akz.a();
        if (a3.c == null) {
            dcd = dcd.c;
        } else {
            dcd = a3.c;
        }
        textView4.setText(dcd.a);
    }

    @Override // defpackage.aet
    public final int a() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }
}
