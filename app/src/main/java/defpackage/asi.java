package defpackage;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.design.chip.Chip;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.tasks.R;

/* renamed from: asi  reason: default package */
/* compiled from: PG */
public final class asi extends arb implements DatePickerDialog.OnDateSetListener, atf {
    public String U;
    public dcb V;
    public String W;
    private EditText X;
    private TextView Y;
    private Chip Z;
    public Button a;
    private dmk aa;
    private View ab;
    private EditText ac;
    private TextView ad;
    private View ae;
    private boolean af;
    private dby ag;
    private dcb ah;
    private final alu ai = new asv(this);
    public LinearLayout b;

    public static asi a(String str, String str2, boolean z, int i) {
        asi asi = new asi();
        Bundle bundle = new Bundle();
        bundle.putString("list id", str);
        bundle.putString("task id", str2);
        bundle.putBoolean("start_in_edit_mode", z);
        bundle.putInt("title offset", i);
        asi.e(bundle);
        return asi;
    }

    public final void a(boolean z) {
        if (this.ag != null) {
            dcb dcb = this.V;
            if (this.ag != null) {
                T();
                U();
                for (int i = 0; i < this.b.getChildCount(); i++) {
                    b((atb) this.b.getChildAt(i));
                }
                if (dcb != null) {
                    String str = dcb.b;
                    if (!this.U.equals(str)) {
                        this.W = any.a().c().a(this.U, this.W, str, z);
                        this.U = str;
                        this.ag = any.a().c().a(this.U, this.W);
                    }
                }
            }
            this.ag = null;
        }
    }

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.edit_task_fragment, (ViewGroup) null);
        this.X = (EditText) inflate.findViewById(R.id.edit_title);
        this.ab = inflate.findViewById(R.id.edit_due_date_container);
        this.Y = (TextView) inflate.findViewById(R.id.edit_due_date_empty);
        this.ac = (EditText) inflate.findViewById(R.id.edit_details);
        this.Y = (TextView) inflate.findViewById(R.id.edit_due_date_empty);
        this.Z = (Chip) inflate.findViewById(R.id.edit_due_date_chip);
        this.ad = (TextView) inflate.findViewById(R.id.edit_list);
        this.a = (Button) inflate.findViewById(R.id.edit_subtasks_add);
        this.ae = inflate.findViewById(R.id.edit_subtasks_container);
        this.b = (LinearLayout) inflate.findViewById(R.id.edit_subtasks_list);
        this.X.setOnFocusChangeListener(new asj(this));
        this.ac.setOnFocusChangeListener(new ask(this));
        this.ab.setOnClickListener(new asn(this));
        this.Z.setOnClickListener(new aso(this));
        this.Z.c = new asp(this);
        this.ad.setOnClickListener(new asq(this));
        this.a.setOnClickListener(new asr(this));
        if (bundle == null) {
            bundle = this.i;
        }
        if (bundle != null && TextUtils.isEmpty(this.W)) {
            this.U = bundle.getString("list id");
            this.W = bundle.getString("task id");
            this.af = bundle.getBoolean("start_in_edit_mode");
        }
        sn.a(this.X, "taskTitleTransition");
        a(new ass(this));
        return inflate;
    }

    @Override // defpackage.lc
    public final void a(Context context) {
        super.a(context);
        cky.a((Activity) j(), dck.a);
    }

    @Override // defpackage.lc
    public final void s() {
        super.s();
        if (j() != null) {
            cos.a(j()).b.a(j().findViewById(16908290));
        }
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        aju.a().b(this.W);
        if (this.af && this.ag != null && !ajd.a(this.ag)) {
            b((View) this.X);
        }
        alq.a().b(this.ai);
        alq.a().a(this.ai);
    }

    @Override // defpackage.lc
    public final void d(Bundle bundle) {
        super.d(bundle);
        bundle.putString("task id", this.W);
        bundle.putString("list id", this.U);
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        dih dih;
        dii g = ((dii) dmk.d.a(bg.ao)).e(i).f(i2 + 1).g(i3);
        if (g.b) {
            dih = g.a;
        } else {
            dih dih2 = g.a;
            djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        this.aa = (dmk) dih3;
        W();
        S();
    }

    @Override // defpackage.atf
    public final void a(dcb dcb) {
        dcd dcd;
        this.V = dcb;
        TextView textView = this.ad;
        if (dcb.c == null) {
            dcd = dcd.c;
        } else {
            dcd = dcb.c;
        }
        textView.setText(dcd.a);
        this.ad.setContentDescription(V());
    }

    @Override // defpackage.lc
    public final void f() {
        bdk.a((View) this.X, false);
        alq.a().b(this.ai);
        super.f();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asi.c():void");
    }

    /* access modifiers changed from: package-private */
    public final void N() {
        int i;
        boolean z = this.b.getChildCount() > 0;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
        Resources k = k();
        if (z) {
            i = R.dimen.edit_task_add_subtask_button_start_spacing;
        } else {
            i = R.dimen.edit_task_add_subtask_button_start_spacing_when_no_subtasks;
        }
        int dimensionPixelOffset = k.getDimensionPixelOffset(i);
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(dimensionPixelOffset);
        } else {
            marginLayoutParams.leftMargin = dimensionPixelOffset;
        }
    }

    private final String V() {
        dcd dcd;
        int size = any.a().c().d().size();
        dcb dcb = this.ah;
        if (dcb.c == null) {
            dcd = dcd.c;
        } else {
            dcd = dcb.c;
        }
        return a(R.string.a11y_list_selector, dcd.a, Integer.valueOf(size));
    }

    /* access modifiers changed from: package-private */
    public final atb a(dby dby) {
        int dimensionPixelOffset;
        dca dca;
        atb atb = new atb(this.b.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.b.getChildCount() == 0) {
            dimensionPixelOffset = k().getDimensionPixelOffset(R.dimen.edit_task_subtask_top_spacing_first);
        } else {
            dimensionPixelOffset = k().getDimensionPixelOffset(R.dimen.edit_task_subtask_top_spacing);
        }
        layoutParams.topMargin = dimensionPixelOffset;
        layoutParams.bottomMargin = k().getDimensionPixelOffset(R.dimen.edit_task_subtask_bottom_spacing);
        atb.setLayoutParams(layoutParams);
        atb.a(dby);
        this.b.addView(atb);
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        String str = dca.b;
        if (TextUtils.isEmpty(str.trim())) {
            str = a(R.string.task_no_title);
        }
        String a2 = a(R.string.a11y_subtask);
        atb.setContentDescription(new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(str).length()).append(a2).append(", ").append(str).toString());
        atb.setAccessibilityDelegate(new ata(this));
        atb.c.setOnClickListener(new ast(this, atb));
        atb.a.setOnClickListener(new asu(this, atb));
        atb.e = new asl(this, atb);
        return atb;
    }

    /* access modifiers changed from: package-private */
    public final void a(atb atb) {
        int childCount = this.b.getChildCount();
        if (childCount > 1) {
            int indexOfChild = this.b.indexOfChild(atb);
            if (childCount > indexOfChild + 1) {
                ((atb) this.b.getChildAt(indexOfChild + 1)).a();
            } else {
                ((atb) this.b.getChildAt(indexOfChild - 1)).a();
            }
        }
        this.b.removeView(atb);
        N();
    }

    private final void W() {
        this.Z.a(a(R.string.task_selected_due_date, ajd.b(this.aa).getTime()));
        this.Z.setVisibility(0);
        this.Y.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public final void Q() {
        aqj.a(this.aa).a(this.t, "datePicker");
    }

    /* access modifiers changed from: package-private */
    public final void R() {
        this.aa = null;
        this.Z.setVisibility(4);
        this.Y.setVisibility(0);
        this.Z.a("");
    }

    /* access modifiers changed from: package-private */
    public final void S() {
        dca dca;
        dmk dmk;
        dmk dmk2;
        dca dca2;
        dih dih;
        dca dca3;
        dih dih2;
        dby dby = this.ag;
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d == null) {
            dmk = dmk.d;
        } else {
            dmk = dca.d;
        }
        if (this.aa == null) {
            dmk2 = dmk.d;
        } else {
            dmk2 = this.aa;
        }
        if (!dmk.equals(dmk2)) {
            if (this.aa == null) {
                dby dby2 = this.ag;
                dii dii = (dii) dby2.a(bg.ao);
                dii.a((dih) dby2);
                dii dii2 = dii;
                dby dby3 = this.ag;
                if (dby3.e == null) {
                    dca3 = dca.g;
                } else {
                    dca3 = dby3.e;
                }
                dii dii3 = (dii) dca3.a(bg.ao);
                dii3.a((dih) dca3);
                dii g = dii2.g(dii3.g());
                if (g.b) {
                    dih2 = g.a;
                } else {
                    dih dih3 = g.a;
                    djz.a.a(dih3).c(dih3);
                    g.b = true;
                    dih2 = g.a;
                }
                dih dih4 = dih2;
                if (!dih.a(dih4, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                this.ag = (dby) dih4;
            } else {
                dby dby4 = this.ag;
                dii dii4 = (dii) dby4.a(bg.ao);
                dii4.a((dih) dby4);
                dii dii5 = dii4;
                dby dby5 = this.ag;
                if (dby5.e == null) {
                    dca2 = dca.g;
                } else {
                    dca2 = dby5.e;
                }
                dii dii6 = (dii) dca2.a(bg.ao);
                dii6.a((dih) dca2);
                dii g2 = dii5.g(dii6.a(dmk2));
                if (g2.b) {
                    dih = g2.a;
                } else {
                    dih dih5 = g2.a;
                    djz.a.a(dih5).c(dih5);
                    g2.b = true;
                    dih = g2.a;
                }
                dih dih6 = dih;
                if (!dih.a(dih6, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                this.ag = (dby) dih6;
            }
            any.a().c().a(this.U, this.W, this.aa);
            aju.a().a(this.W);
        }
    }

    /* access modifiers changed from: package-private */
    public final void T() {
        this.ag = a(this.X.getText().toString(), this.ag);
    }

    /* access modifiers changed from: package-private */
    public final void b(atb atb) {
        atb.a(a(atb.b.getText().toString(), atb.d));
    }

    private final dby a(String str, dby dby) {
        dca dca;
        String trim;
        dca dca2;
        dih dih;
        if (dby == null) {
            return null;
        }
        if (dby.e == null) {
            dca = dca.g;
        } else {
            dca = dby.e;
        }
        String str2 = dca.b;
        if (str2 == null) {
            trim = "";
        } else {
            trim = str2.trim();
        }
        String trim2 = str.trim();
        if (trim.equals(trim2)) {
            return dby;
        }
        dii dii = (dii) dby.a(bg.ao);
        dii.a((dih) dby);
        dii dii2 = dii;
        if (dby.e == null) {
            dca2 = dca.g;
        } else {
            dca2 = dby.e;
        }
        dii dii3 = (dii) dca2.a(bg.ao);
        dii3.a((dih) dca2);
        dii g = dii2.g(dii3.f(trim2));
        if (g.b) {
            dih = g.a;
        } else {
            dih dih2 = g.a;
            djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        dih dih3 = dih;
        if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dby dby2 = (dby) dih3;
        any.a().c().a(this.U, dby.d, trim2);
        aju.a().a(dby.d);
        return dby2;
    }

    /* access modifiers changed from: package-private */
    public final void U() {
        dca dca;
        String trim;
        dca dca2;
        dih dih;
        if (this.ag != null) {
            dby dby = this.ag;
            if (dby.e == null) {
                dca = dca.g;
            } else {
                dca = dby.e;
            }
            String str = dca.c;
            if (str == null) {
                trim = "";
            } else {
                trim = str.trim();
            }
            String trim2 = this.ac.getText().toString().trim();
            if (!trim.equals(trim2)) {
                dby dby2 = this.ag;
                dii dii = (dii) dby2.a(bg.ao);
                dii.a((dih) dby2);
                dii dii2 = dii;
                dby dby3 = this.ag;
                if (dby3.e == null) {
                    dca2 = dca.g;
                } else {
                    dca2 = dby3.e;
                }
                dii dii3 = (dii) dca2.a(bg.ao);
                dii3.a((dih) dca2);
                dii g = dii2.g(dii3.g(trim2));
                if (g.b) {
                    dih = g.a;
                } else {
                    dih dih2 = g.a;
                    djz.a.a(dih2).c(dih2);
                    g.b = true;
                    dih = g.a;
                }
                dih dih3 = dih;
                if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                this.ag = (dby) dih3;
                any.a().c().b(this.U, this.W, trim2);
                aju.a().a(this.W);
            }
        }
    }
}
