package defpackage;

/* renamed from: asi reason: default package */
/* compiled from: PG */
/* compiled from: EditTaskFragment */
public final class EditTaskFragment extends defpackage.arb implements android.app.DatePickerDialog.OnDateSetListener, defpackage.atf {
    public String U;
    public defpackage.dcb V;
    public String W;
    private android.widget.EditText X;
    private android.widget.TextView Y;
    private android.support.design.chip.Chip Z;
    public android.widget.Button addSubTask;
    private defpackage.dmk aa;
    private android.view.View ab;
    private android.widget.EditText ac;
    private android.widget.TextView ad;
    private android.view.View ae;
    private boolean af;
    private defpackage.dby ag;
    private defpackage.dcb ah;
    private final defpackage.alu ai = new defpackage.asv(this);
    public android.widget.LinearLayout subTaskList;

    public static EditTaskFragment a(String str, String str2, boolean z, int i) {
        EditTaskFragment asi = new EditTaskFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("list id", str);
        bundle.putString("task id", str2);
        bundle.putBoolean("start_in_edit_mode", z);
        bundle.putInt("title offset", i);
        asi.e(bundle);
        return asi;
    }

    public final void a(boolean z) {
        if (this.ag != null) {
            defpackage.dcb dcb = this.V;
            if (this.ag != null) {
                T();
                U();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= this.subTaskList.getChildCount()) {
                        break;
                    }
                    b((SubTaskView) this.subTaskList.getChildAt(i2));
                    i = i2 + 1;
                }
                if (dcb != null) {
                    String str = dcb.b;
                    if (!this.U.equals(str)) {
                        this.W = defpackage.any.a().c().a(this.U, this.W, str, z);
                        this.U = str;
                        this.ag = defpackage.any.a().c().a(this.U, this.W);
                    }
                }
            }
            this.ag = null;
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.google.android.apps.tasks.R.layout.edit_task_fragment, null);
        this.X = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_title);
        this.ab = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_due_date_container);
        this.Y = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_due_date_empty);
        this.ac = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_details);
        this.Y = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_due_date_empty);
        this.Z = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_due_date_chip);
        this.ad = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_list);
        this.addSubTask = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_subtasks_add);
        this.ae = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_subtasks_container);
        this.subTaskList = inflate.findViewById(com.google.android.apps.tasks.R.id.edit_subtasks_list);
        this.X.setOnFocusChangeListener(new defpackage.asj(this));
        this.ac.setOnFocusChangeListener(new defpackage.ask(this));
        this.ab.setOnClickListener(new defpackage.asn(this));
        this.Z.setOnClickListener(new defpackage.aso(this));
        this.Z.c = new defpackage.asp(this);
        this.ad.setOnClickListener(new defpackage.asq(this));
        this.addSubTask.setOnClickListener(new defpackage.asr(this));
        if (bundle == null) {
            bundle = this.i;
        }
        if (bundle != null && android.text.TextUtils.isEmpty(this.W)) {
            this.U = bundle.getString("list id");
            this.W = bundle.getString("task id");
            this.af = bundle.getBoolean("start_in_edit_mode");
        }
        defpackage.sn.a(this.X, "taskTitleTransition");
        a(new defpackage.ass(this));
        return inflate;
    }

    public final void a(android.content.Context context) {
        super.a(context);
        defpackage.cky.a(getActivity(), defpackage.dck.a);
    }

    public final void s() {
        super.s();
        if (getActivity() != null) {
            defpackage.cos.a(getActivity()).b.a(getActivity().findViewById(16908290));
        }
    }

    public final void e() {
        super.e();
        defpackage.aju.a().b(this.W);
        if (this.af && this.ag != null && !defpackage.ajd.a(this.ag)) {
            b(this.X);
        }
        defpackage.alq.a().b(this.ai);
        defpackage.alq.a().a(this.ai);
    }

    public final void d(android.os.Bundle bundle) {
        super.d(bundle);
        bundle.putString("task id", this.W);
        bundle.putString("list id", this.U);
    }

    public final void onDateSet(android.widget.DatePicker datePicker, int i, int i2, int i3) {
        defpackage.dih dih;
        defpackage.dii g = ((defpackage.dii) defpackage.dmk.d.a(defpackage.bg.ao)).e(i).f(i2 + 1).g(i3);
        if (g.b) {
            dih = g.a;
        } else {
            defpackage.dih dih2 = g.a;
            defpackage.djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        this.aa = (defpackage.dmk) dih3;
        W();
        S();
    }

    public final void a(defpackage.dcb dcb) {
        defpackage.dcd dcd;
        this.V = dcb;
        android.widget.TextView textView = this.ad;
        if (dcb.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb.c;
        }
        textView.setText(dcd.a);
        this.ad.setContentDescription(V());
    }

    public final void f() {
        defpackage.bdk.a(this.X, false);
        defpackage.alq.a().b(this.ai);
        super.f();
    }

    /* access modifiers changed from: 0000 */
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
            r8 = this;
            r3 = -1
            r7 = 0
            r1 = 1
            r2 = 0
            boolean r0 = r8.n
            if (r0 == 0) goto L_0x0009
        L_0x0008:
            return
        L_0x0009:
            dby r4 = r8.ag
            r8.ag = r7
            r8.ah = r7
            java.lang.String r0 = r8.W
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r8.U
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = r8.U
            java.lang.String r5 = r8.W
            any r6 = defpackage.any.a()
            anc r6 = r6.c()
            dby r5 = r6.a(r0, r5)
            r8.ag = r5
            any r5 = defpackage.any.a()
            anc r5 = r5.c()
            dcb r5 = r5.c(r0)
            r8.ah = r5
            dby r5 = r8.ag
            if (r5 == 0) goto L_0x0045
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r8.ag = r7
            r8.ah = r7
        L_0x0049:
            dby r0 = r8.ag
            if (r0 != 0) goto L_0x0067
            android.content.Context r0 = r8.i()
            android.content.Context r0 = r0.getApplicationContext()
            r1 = 2131951827(0x7f1300d3, float:1.954008E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            lg r0 = r8.j()
            r0.onBackPressed()
            goto L_0x0008
        L_0x0067:
            if (r4 == 0) goto L_0x0081
            android.widget.EditText r0 = r8.X
            android.text.Editable r0 = r0.getText()
            java.lang.String r5 = r0.toString()
            dca r0 = r4.e
            if (r0 != 0) goto L_0x016a
            dca r0 = defpackage.dca.g
        L_0x0079:
            java.lang.String r0 = r0.b
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x016e
        L_0x0081:
            r0 = r1
        L_0x0082:
            if (r0 == 0) goto L_0x00a8
            dby r0 = r8.ag
            dca r5 = r0.e
            if (r5 != 0) goto L_0x0171
            dca r0 = defpackage.dca.g
        L_0x008c:
            java.lang.String r0 = r0.b
            android.widget.EditText r5 = r8.X
            r5.setText(r0)
            android.os.Bundle r0 = r8.i
            if (r0 == 0) goto L_0x022e
            android.os.Bundle r0 = r8.i
            java.lang.String r5 = "title offset"
            int r0 = r0.getInt(r5, r3)
        L_0x009f:
            if (r4 != 0) goto L_0x00a8
            if (r0 < 0) goto L_0x00a8
            android.widget.EditText r3 = r8.X
            r3.setSelection(r0)
        L_0x00a8:
            if (r4 == 0) goto L_0x00c2
            android.widget.EditText r0 = r8.ac
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = r0.toString()
            dca r0 = r4.e
            if (r0 != 0) goto L_0x0175
            dca r0 = defpackage.dca.g
        L_0x00ba:
            java.lang.String r0 = r0.c
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0179
        L_0x00c2:
            r0 = r1
        L_0x00c3:
            if (r0 == 0) goto L_0x00d4
            android.widget.EditText r3 = r8.ac
            dby r0 = r8.ag
            dca r4 = r0.e
            if (r4 != 0) goto L_0x017c
            dca r0 = defpackage.dca.g
        L_0x00cf:
            java.lang.String r0 = r0.c
            r3.setText(r0)
        L_0x00d4:
            dby r0 = r8.ag
            dca r3 = r0.e
            if (r3 != 0) goto L_0x0180
            dca r0 = defpackage.dca.g
        L_0x00dc:
            dmk r0 = r0.d
            if (r0 == 0) goto L_0x0184
            r0 = r1
        L_0x00e1:
            if (r0 == 0) goto L_0x018f
            dby r0 = r8.ag
            dca r3 = r0.e
            if (r3 != 0) goto L_0x0187
            dca r0 = defpackage.dca.g
        L_0x00eb:
            dmk r3 = r0.d
            if (r3 != 0) goto L_0x018b
            dmk r0 = defpackage.dmk.d
        L_0x00f1:
            r8.aa = r0
            r8.W()
        L_0x00f6:
            android.widget.TextView r3 = r8.ad
            dcb r0 = r8.ah
            dcd r4 = r0.c
            if (r4 != 0) goto L_0x0194
            dcd r0 = defpackage.dcd.c
        L_0x0100:
            java.lang.String r0 = r0.a
            r3.setText(r0)
            android.widget.TextView r3 = r8.ad
            dby r0 = r8.ag
            dca r4 = r0.e
            if (r4 != 0) goto L_0x0198
            dca r0 = defpackage.dca.g
        L_0x010f:
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x019c
            r0 = r1
        L_0x0114:
            r3.setEnabled(r0)
            android.widget.TextView r0 = r8.ad
            java.lang.String r3 = r8.V()
            r0.setContentDescription(r3)
            android.widget.TextView r0 = r8.ad
            asz r3 = new asz
            r3.<init>(r8)
            r0.setAccessibilityDelegate(r3)
            android.widget.LinearLayout r0 = r8.b
            r0.removeAllViews()
            any r0 = defpackage.any.a()
            anc r0 = r0.c()
            java.lang.String r3 = r8.U
            java.lang.String r4 = r8.W
            boolean r0 = r0.b(r3, r4)
            if (r0 == 0) goto L_0x019f
            android.view.View r0 = r8.ae
            r0.setVisibility(r2)
            any r0 = defpackage.any.a()
            anc r0 = r0.c()
            java.lang.String r3 = r8.U
            java.lang.String r4 = r8.W
            java.util.List r0 = r0.c(r3, r4)
            java.util.Iterator r3 = r0.iterator()
        L_0x015a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r3.next()
            dby r0 = (defpackage.dby) r0
            r8.a(r0)
            goto L_0x015a
        L_0x016a:
            dca r0 = r4.e
            goto L_0x0079
        L_0x016e:
            r0 = r2
            goto L_0x0082
        L_0x0171:
            dca r0 = r0.e
            goto L_0x008c
        L_0x0175:
            dca r0 = r4.e
            goto L_0x00ba
        L_0x0179:
            r0 = r2
            goto L_0x00c3
        L_0x017c:
            dca r0 = r0.e
            goto L_0x00cf
        L_0x0180:
            dca r0 = r0.e
            goto L_0x00dc
        L_0x0184:
            r0 = r2
            goto L_0x00e1
        L_0x0187:
            dca r0 = r0.e
            goto L_0x00eb
        L_0x018b:
            dmk r0 = r0.d
            goto L_0x00f1
        L_0x018f:
            r8.R()
            goto L_0x00f6
        L_0x0194:
            dcd r0 = r0.c
            goto L_0x0100
        L_0x0198:
            dca r0 = r0.e
            goto L_0x010f
        L_0x019c:
            r0 = r2
            goto L_0x0114
        L_0x019f:
            android.view.View r0 = r8.ae
            r3 = 8
            r0.setVisibility(r3)
        L_0x01a6:
            r8.N()
            dby r0 = r8.ag
            boolean r3 = defpackage.ajd.a(r0)
            android.widget.EditText r4 = r8.X
            if (r3 != 0) goto L_0x0214
            r0 = r1
        L_0x01b4:
            r4.setEnabled(r0)
            android.widget.EditText r4 = r8.ac
            if (r3 != 0) goto L_0x0216
            r0 = r1
        L_0x01bc:
            r4.setEnabled(r0)
            android.support.design.chip.Chip r4 = r8.Z
            if (r3 != 0) goto L_0x0218
            r0 = r1
        L_0x01c4:
            r4.setEnabled(r0)
            android.support.design.chip.Chip r4 = r8.Z
            if (r3 != 0) goto L_0x021a
            r0 = r1
        L_0x01cc:
            ep r5 = r4.b
            if (r5 == 0) goto L_0x01d5
            ep r4 = r4.b
            r4.b(r0)
        L_0x01d5:
            android.view.View r4 = r8.ab
            if (r3 != 0) goto L_0x021c
            r0 = r1
        L_0x01da:
            r4.setEnabled(r0)
            android.widget.TextView r0 = r8.ad
            if (r3 != 0) goto L_0x021e
        L_0x01e1:
            r0.setEnabled(r1)
            if (r3 == 0) goto L_0x0220
            android.widget.EditText r0 = r8.X
            android.widget.EditText r1 = r8.X
            int r1 = r1.getPaintFlags()
            r1 = r1 | 16
            r0.setPaintFlags(r1)
        L_0x01f3:
            dby r0 = r8.ag
            boolean r0 = defpackage.ajd.a(r0)
            if (r0 != 0) goto L_0x0008
            z r0 = r8.T
            w r0 = r0.a()
            w r1 = defpackage.w.STARTED
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0008
            boolean r0 = r8.af
            if (r0 == 0) goto L_0x0008
            android.widget.EditText r0 = r8.X
            r8.b(r0)
            goto L_0x0008
        L_0x0214:
            r0 = r2
            goto L_0x01b4
        L_0x0216:
            r0 = r2
            goto L_0x01bc
        L_0x0218:
            r0 = r2
            goto L_0x01c4
        L_0x021a:
            r0 = r2
            goto L_0x01cc
        L_0x021c:
            r0 = r2
            goto L_0x01da
        L_0x021e:
            r1 = r2
            goto L_0x01e1
        L_0x0220:
            android.widget.EditText r0 = r8.X
            android.widget.EditText r1 = r8.X
            int r1 = r1.getPaintFlags()
            r1 = r1 & -17
            r0.setPaintFlags(r1)
            goto L_0x01f3
        L_0x022e:
            r0 = r3
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asi.c():void");
    }

    /* access modifiers changed from: 0000 */
    public final void N() {
        int i;
        boolean z = this.subTaskList.getChildCount() > 0;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.addSubTask.getLayoutParams();
        android.content.res.Resources k = getResource();
        if (z) {
            i = 2131689670;
        } else {
            i = 2131689671;
        }
        int dimensionPixelOffset = k.getDimensionPixelOffset(i);
        if (android.os.Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(dimensionPixelOffset);
        } else {
            marginLayoutParams.leftMargin = dimensionPixelOffset;
        }
    }

    private final String V() {
        defpackage.dcd dcd;
        int size = defpackage.any.a().c().d().size();
        defpackage.dcb dcb = this.ah;
        if (dcb.c == null) {
            dcd = defpackage.dcd.c;
        } else {
            dcd = dcb.c;
        }
        return a(2131951633, dcd.a, java.lang.Integer.valueOf(size));
    }

    /* access modifiers changed from: 0000 */
    public final SubTaskView a(defpackage.dby dby) {
        int dimensionPixelOffset;
        defpackage.dca dca;
        SubTaskView taskView = new SubTaskView(this.subTaskList.getContext());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (this.subTaskList.getChildCount() == 0) {
            dimensionPixelOffset = getResource().getDimensionPixelOffset(com.google.android.apps.tasks.R.dimen.edit_task_subtask_top_spacing_first);
        } else {
            dimensionPixelOffset = getResource().getDimensionPixelOffset(com.google.android.apps.tasks.R.dimen.edit_task_subtask_top_spacing);
        }
        layoutParams.topMargin = dimensionPixelOffset;
        layoutParams.bottomMargin = getResource().getDimensionPixelOffset(com.google.android.apps.tasks.R.dimen.edit_task_subtask_bottom_spacing);
        taskView.setLayoutParams(layoutParams);
        taskView.a(dby);
        this.subTaskList.addView(taskView);
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        String str = dca.b;
        if (android.text.TextUtils.isEmpty(str.trim())) {
            str = a(2131951826);
        }
        String a2 = a(com.google.android.apps.tasks.R.string.a11y_subtask);
        taskView.setContentDescription(a2 + ", " + str);
        taskView.setAccessibilityDelegate(new defpackage.ata(this));
        taskView.c.setOnClickListener(new defpackage.ast(this, taskView));
        taskView.a.setOnClickListener(new defpackage.asu(this, taskView));
        taskView.e = new defpackage.asl(this, taskView);
        return taskView;
    }

    /* access modifiers changed from: 0000 */
    public final void a(SubTaskView atb) {
        int childCount = this.subTaskList.getChildCount();
        if (childCount > 1) {
            int indexOfChild = this.subTaskList.indexOfChild(atb);
            if (childCount > indexOfChild + 1) {
                ((SubTaskView) this.subTaskList.getChildAt(indexOfChild + 1)).a();
            } else {
                ((SubTaskView) this.subTaskList.getChildAt(indexOfChild - 1)).a();
            }
        }
        this.subTaskList.removeView(atb);
        N();
    }

    private final void W() {
        this.Z.a(a(com.google.android.apps.tasks.R.string.task_selected_due_date, ajd.b(this.aa).getTime()));
        this.Z.setVisibility(0);
        this.Y.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public final void Q() {
        defpackage.aqj.a(this.aa).a(this.t, "datePicker");
    }

    /* access modifiers changed from: 0000 */
    public final void R() {
        this.aa = null;
        this.Z.setVisibility(4);
        this.Y.setVisibility(0);
        this.Z.a("");
    }

    /* access modifiers changed from: 0000 */
    public final void S() {
        defpackage.dca dca;
        defpackage.dmk dmk;
        defpackage.dmk dmk2;
        defpackage.dca dca2;
        defpackage.dih dih;
        defpackage.dca dca3;
        defpackage.dih dih2;
        defpackage.dby dby = this.ag;
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        if (dca.d == null) {
            dmk = defpackage.dmk.d;
        } else {
            dmk = dca.d;
        }
        if (this.aa == null) {
            dmk2 = defpackage.dmk.d;
        } else {
            dmk2 = this.aa;
        }
        if (!dmk.equals(dmk2)) {
            if (this.aa == null) {
                defpackage.dby dby2 = this.ag;
                defpackage.dii dii = (defpackage.dii) dby2.a(defpackage.bg.ao);
                dii.a(dby2);
                defpackage.dii dii2 = dii;
                defpackage.dby dby3 = this.ag;
                if (dby3.e == null) {
                    dca3 = defpackage.dca.g;
                } else {
                    dca3 = dby3.e;
                }
                defpackage.dii dii3 = (defpackage.dii) dca3.a(defpackage.bg.ao);
                dii3.a(dca3);
                defpackage.dii g = dii2.g(dii3.g());
                if (g.b) {
                    dih2 = g.a;
                } else {
                    defpackage.dih dih3 = g.a;
                    defpackage.djz.a.a(dih3).c(dih3);
                    g.b = true;
                    dih2 = g.a;
                }
                defpackage.dih dih4 = dih2;
                if (!defpackage.dih.a(dih4, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                this.ag = (defpackage.dby) dih4;
            } else {
                defpackage.dby dby4 = this.ag;
                defpackage.dii dii4 = (defpackage.dii) dby4.a(defpackage.bg.ao);
                dii4.a(dby4);
                defpackage.dii dii5 = dii4;
                defpackage.dby dby5 = this.ag;
                if (dby5.e == null) {
                    dca2 = defpackage.dca.g;
                } else {
                    dca2 = dby5.e;
                }
                defpackage.dii dii6 = (defpackage.dii) dca2.a(defpackage.bg.ao);
                dii6.a(dca2);
                defpackage.dii g2 = dii5.g(dii6.a(dmk2));
                if (g2.b) {
                    dih = g2.a;
                } else {
                    defpackage.dih dih5 = g2.a;
                    defpackage.djz.a.a(dih5).c(dih5);
                    g2.b = true;
                    dih = g2.a;
                }
                defpackage.dih dih6 = dih;
                if (!defpackage.dih.a(dih6, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                this.ag = (defpackage.dby) dih6;
            }
            defpackage.any.a().c().a(this.U, this.W, this.aa);
            defpackage.aju.a().a(this.W);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void T() {
        this.ag = a(this.X.getText().toString(), this.ag);
    }

    /* access modifiers changed from: 0000 */
    public final void b(SubTaskView atb) {
        atb.a(a(atb.editText.getText().toString(), atb.d));
    }

    private final defpackage.dby a(String titleStr, defpackage.dby dby) {
        defpackage.dca dca;
        String trim;
        defpackage.dca dca2;
        defpackage.dih dih;
        if (dby == null) {
            return null;
        }
        if (dby.e == null) {
            dca = defpackage.dca.g;
        } else {
            dca = dby.e;
        }
        String str2 = dca.b;
        if (str2 == null) {
            trim = "";
        } else {
            trim = str2.trim();
        }
        String trim2 = titleStr.trim();
        if (trim.equals(trim2)) {
            return dby;
        }
        defpackage.dii dii = (defpackage.dii) dby.a(defpackage.bg.ao);
        dii.a(dby);
        defpackage.dii dii2 = dii;
        if (dby.e == null) {
            dca2 = defpackage.dca.g;
        } else {
            dca2 = dby.e;
        }
        defpackage.dii dii3 = (defpackage.dii) dca2.a(defpackage.bg.ao);
        dii3.a(dca2);
        defpackage.dii g = dii2.g(dii3.setTitle(trim2));
        if (g.b) {
            dih = g.a;
        } else {
            defpackage.dih dih2 = g.a;
            defpackage.djz.a.a(dih2).c(dih2);
            g.b = true;
            dih = g.a;
        }
        defpackage.dih dih3 = dih;
        if (!defpackage.dih.a(dih3, true)) {
            throw new defpackage.dkw();
        }
        defpackage.dby dby2 = (defpackage.dby) dih3;
        defpackage.any.a().c().a(this.U, dby.d, trim2);
        defpackage.aju.a().a(dby.d);
        return dby2;
    }

    /* access modifiers changed from: 0000 */
    public final void U() {
        defpackage.dca dca;
        String trim;
        defpackage.dca dca2;
        defpackage.dih dih;
        if (this.ag != null) {
            defpackage.dby dby = this.ag;
            if (dby.e == null) {
                dca = defpackage.dca.g;
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
                defpackage.dby dby2 = this.ag;
                defpackage.dii dii = (defpackage.dii) dby2.a(defpackage.bg.ao);
                dii.a(dby2);
                defpackage.dii dii2 = dii;
                defpackage.dby dby3 = this.ag;
                if (dby3.e == null) {
                    dca2 = defpackage.dca.g;
                } else {
                    dca2 = dby3.e;
                }
                defpackage.dii dii3 = (defpackage.dii) dca2.a(defpackage.bg.ao);
                dii3.a(dca2);
                defpackage.dii g = dii2.g(dii3.setDetail(trim2));
                if (g.b) {
                    dih = g.a;
                } else {
                    defpackage.dih dih2 = g.a;
                    defpackage.djz.a.a(dih2).c(dih2);
                    g.b = true;
                    dih = g.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, true)) {
                    throw new defpackage.dkw();
                }
                this.ag = (defpackage.dby) dih3;
                defpackage.any.a().c().b(this.U, this.W, trim2);
                defpackage.aju.a().a(this.W);
            }
        }
    }
}
