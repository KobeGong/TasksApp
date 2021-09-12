package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.google.android.apps.tasks.R;

/* renamed from: akt reason: default package */
/* compiled from: PG */
public final class akt extends RecyclerViewAdapter {
    public java.util.List a;
    public defpackage.aku b;

    public akt() {
        setHasStableIds();
    }

    public final long getItemId(int i) {
        defpackage.akz akz = (defpackage.akz) this.a.get(i);
        return (long) java.util.Arrays.hashCode(new java.lang.Object[]{akz.a().b, akz.b().d});
    }

    public final RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        defpackage.akv akv = new defpackage.akv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_result, viewGroup, false));
        akv.p = new defpackage.aky(this);
        return akv;
    }

    public final void onBindViewHolder(RecyclerViewHolder afv, int i) {
        defpackage.dca dca;
        defpackage.dca dca2;
        defpackage.dca dca3;
        float f;
        defpackage.dca dca4;
        boolean z;
        defpackage.dcd dcd;
        defpackage.dca dca5;
        defpackage.dmk dmk;
        java.lang.String string;
        java.lang.String quantityString;
        defpackage.akv akv = (defpackage.akv) afv;
        defpackage.akz akz = (defpackage.akz) this.a.get(i);
        android.widget.TextView textView = akv.r;
        defpackage.dby b2 = akz.b();
        if (b2.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = b2.e;
        }
        textView.setText(dca.b);
        defpackage.dby b3 = akz.b();
        if (b3.e == null) {
            dca2 = defpackage.dca.g;
        } else {
            dca2 = b3.e;
        }
        if (android.text.TextUtils.isEmpty(dca2.c)) {
            akv.s.setText("");
            akv.s.setVisibility(8);
        } else {
            android.widget.TextView textView2 = akv.s;
            defpackage.dby b4 = akz.b();
            if (b4.e == null) {
                dca3 = defpackage.dca.g;
            } else {
                dca3 = b4.e;
            }
            textView2.setText(dca3.c);
            akv.s.setVisibility(0);
        }
        com.google.android.apps.tasks.ui.components.FancyCheckboxView fancyCheckboxView = akv.v;
        if (defpackage.ajd.a(akz.b())) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fancyCheckboxView.a(f);
        akv.u.setVisibility(8);
        defpackage.dby b5 = akz.b();
        if (b5.e == null) {
            dca4 = defpackage.dca.g;
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
            android.widget.TextView textView3 = akv.t;
            defpackage.dby b6 = akz.b();
            if (b6.e == null) {
                dca5 = defpackage.dca.g;
            } else {
                dca5 = b6.e;
            }
            if (dca5.d == null) {
                dmk = defpackage.dmk.d;
            } else {
                dmk = dca5.d;
            }
            java.util.Calendar b7 = defpackage.ajd.b(dmk);
            long a2 = (long) defpackage.ajd.a(b7, defpackage.akv.t());
            if (a2 < 0) {
                long j = -a2;
                if (j < 7) {
                    quantityString = akv.itemView.getResources().getQuantityString(2131886087, (int) j, new java.lang.Object[]{java.lang.Integer.valueOf((int) j)});
                } else {
                    int i2 = ((int) j) / 7;
                    quantityString = akv.itemView.getResources().getQuantityString(2131886088, i2, new java.lang.Object[]{java.lang.Integer.valueOf(i2)});
                }
                string = defpackage.akv.a(akv.itemView.getContext(), quantityString, "^1", 2131624499);
            } else if (a2 == 0) {
                string = defpackage.akv.a(akv.itemView.getContext(), akv.itemView.getContext().getString(2131951819), "^1", 2131624497);
            } else if (a2 == 1) {
                string = akv.itemView.getContext().getString(2131951820);
            } else {
                string = akv.itemView.getContext().getString(2131951818, new java.lang.Object[]{java.lang.Long.valueOf(b7.getTimeInMillis())});
            }
            textView3.setText(android.text.Html.fromHtml(string));
        } else {
            akv.t.setVisibility(8);
        }
        android.widget.TextView textView4 = akv.q;
        defpackage.dcb a3 = akz.a();
        if (a3.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = a3.c;
        }
        textView4.setText(dcd.a);
    }

    public final int getItemCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.size();
    }
}
