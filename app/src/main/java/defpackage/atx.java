package defpackage;

/* renamed from: atx reason: default package */
/* compiled from: PG */
final class atx extends RecyclerViewHolder {
    private static android.graphics.drawable.Drawable D;
    public boolean A;
    public float B;
    public float C;
    private final android.view.View E;
    private final android.support.design.chip.Chip F;
    private final android.support.design.chip.Chip G;
    private final android.widget.TextView H;
    public final android.widget.FrameLayout p = ((android.widget.FrameLayout) this.itemView);
    public final android.view.View q;
    public final android.widget.TextView r;
    public final com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout s;
    public final com.google.android.apps.tasks.ui.components.FancyCheckboxView t;
    public final android.widget.TextView u;
    public defpackage.aug v;
    public java.lang.String w;
    public java.lang.String x;
    public defpackage.daq y;
    public float z;

    public atx(com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout taskItemFrameLayout, android.view.View view, android.widget.TextView textView) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(taskItemFrameLayout.getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        super(frameLayout);
        this.q = view;
        this.r = textView;
        this.s = taskItemFrameLayout;
        this.s.setAccessibilityDelegate(new defpackage.auf(view));
        this.E = taskItemFrameLayout.findViewById(2131755328);
        this.t = (com.google.android.apps.tasks.ui.components.FancyCheckboxView) taskItemFrameLayout.findViewById(2131755335);
        this.u = (android.widget.TextView) taskItemFrameLayout.findViewById(2131755330);
        this.F = (android.support.design.chip.Chip) taskItemFrameLayout.findViewById(2131755333);
        this.G = (android.support.design.chip.Chip) taskItemFrameLayout.findViewById(2131755331);
        this.H = (android.widget.TextView) taskItemFrameLayout.findViewById(2131755332);
        this.t.setOnClickListener(new defpackage.aty(this));
        this.G.setOnClickListener(new defpackage.atz(this));
        this.s.setOnClickListener(new defpackage.aua(this));
        this.s.setOnTouchListener(new defpackage.aub(this));
        this.s.a = new defpackage.auc(this);
        this.F.setOnClickListener(new defpackage.aud(this));
        if (D == null) {
            D = defpackage.jd.a(taskItemFrameLayout.getResources(), 2130837624, (android.content.res.Resources.Theme) null);
            if (android.os.Build.VERSION.SDK_INT < 21) {
                android.graphics.drawable.Drawable d = defpackage.jd.d(D);
                D = d;
                defpackage.jd.a(d, defpackage.jd.b(taskItemFrameLayout.getResources(), 2131624499));
            }
        }
    }

    public final void a(float f) {
        this.t.a(f);
    }

    /* access modifiers changed from: 0000 */
    public final void t() {
        this.s.clearAnimation();
        this.s.setTranslationX(0.0f);
    }

    /* access modifiers changed from: 0000 */
    public final void b(boolean z2) {
        this.A = z2;
        if (z2) {
            this.s.setPaddingRelative((int) this.s.getResources().getDimension(2131689886), 0, 0, 0);
            return;
        }
        this.s.setPadding(0, 0, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dby r11, int r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r10.v()
            android.view.View r0 = r10.a
            android.content.Context r2 = r0.getContext()
            android.view.View r0 = r10.a
            java.lang.String r1 = r11.d
            defpackage.sn.a(r0, r1)
            android.widget.FrameLayout r0 = r10.p
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r10.p
            com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r1 = r10.s
            r0.addView(r1)
            com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r3 = r10.s
            dca r0 = r11.e
            if (r0 != 0) goto L_0x0232
            dca r0 = defpackage.dca.g
        L_0x0024:
            java.lang.String r1 = r0.b
            java.lang.String r4 = r1.trim()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x003b
            android.content.res.Resources r1 = r2.getResources()
            r4 = 2131951826(0x7f1300d2, float:1.9540077E38)
            java.lang.String r1 = r1.getString(r4)
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            dmk r1 = r0.d
            if (r1 == 0) goto L_0x0236
            r1 = 1
        L_0x0045:
            if (r1 == 0) goto L_0x0087
            dmk r1 = r0.d
            if (r1 != 0) goto L_0x0239
            dmk r1 = defpackage.dmk.d
        L_0x004d:
            java.util.Calendar r5 = defpackage.ajd.b(r1)
            java.util.Calendar r6 = defpackage.bdk.a()
            dca r1 = r11.e
            if (r1 != 0) goto L_0x023d
            dca r1 = defpackage.dca.g
        L_0x005b:
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x0069
            r1 = 2131951624(0x7f130008, float:1.9539668E38)
            java.lang.String r1 = r2.getString(r1)
            r4.append(r1)
        L_0x0069:
            java.lang.String r1 = ", "
            java.lang.StringBuilder r1 = r4.append(r1)
            r7 = 2131951627(0x7f13000b, float:1.9539674E38)
            java.lang.String r7 = r2.getString(r7)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r7 = " "
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r5 = r10.a(r5, r6)
            r1.append(r5)
        L_0x0087:
            if (r12 <= 0) goto L_0x00a7
            java.lang.String r1 = ", "
            java.lang.StringBuilder r1 = r4.append(r1)
            android.content.res.Resources r5 = r2.getResources()
            r6 = 2131886086(0x7f120006, float:1.940674E38)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            r7[r8] = r9
            java.lang.String r5 = r5.getQuantityString(r6, r12, r7)
            r1.append(r5)
        L_0x00a7:
            dan r1 = r0.f
            if (r1 == 0) goto L_0x0241
            r1 = 1
        L_0x00ac:
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = ", "
            java.lang.StringBuilder r1 = r4.append(r1)
            r5 = 2131951632(0x7f130010, float:1.9539684E38)
            java.lang.String r5 = r2.getString(r5)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r5 = " "
            java.lang.StringBuilder r1 = r1.append(r5)
            dan r5 = r0.f
            if (r5 != 0) goto L_0x0244
            dan r0 = defpackage.dan.f
        L_0x00cb:
            java.lang.String r0 = r0.d
            r1.append(r0)
        L_0x00d0:
            java.lang.String r0 = r4.toString()
            r3.setContentDescription(r0)
            r10.t()
            android.widget.FrameLayout r0 = r10.p
            com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r1 = r10.s
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            r0.setBackground(r1)
            r10.b(r13)
            android.widget.TextView r1 = r10.u
            dca r0 = r11.e
            if (r0 != 0) goto L_0x0248
            dca r0 = defpackage.dca.g
        L_0x00f0:
            java.lang.String r0 = r0.b
            r1.setText(r0)
            boolean r1 = defpackage.ajd.a(r11)
            if (r1 == 0) goto L_0x024c
            android.widget.TextView r0 = r10.u
            android.widget.TextView r3 = r10.u
            int r3 = r3.getPaintFlags()
            r3 = r3 | 16
            r0.setPaintFlags(r3)
        L_0x0108:
            com.google.android.apps.tasks.ui.components.FancyCheckboxView r3 = r10.t
            if (r1 == 0) goto L_0x025b
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x010e:
            r3.a(r0)
            com.google.android.apps.tasks.ui.components.FancyCheckboxView r3 = r10.t
            if (r1 == 0) goto L_0x025e
            r0 = 2131951635(0x7f130013, float:1.953969E38)
        L_0x0118:
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            com.google.android.apps.tasks.ui.components.FancyCheckboxView r0 = r10.t
            float r0 = r0.a
            r10.z = r0
            if (r14 == 0) goto L_0x028a
            dca r0 = r11.e
            if (r0 != 0) goto L_0x0263
            dca r0 = defpackage.dca.g
        L_0x012d:
            dmk r0 = r0.d
            if (r0 == 0) goto L_0x0267
            r0 = 1
        L_0x0132:
            if (r0 == 0) goto L_0x028a
            if (r1 != 0) goto L_0x028a
            android.support.design.chip.Chip r0 = r10.F
            r1 = 0
            r0.setVisibility(r1)
            dca r0 = r11.e
            if (r0 != 0) goto L_0x026a
            dca r0 = defpackage.dca.g
        L_0x0142:
            dmk r1 = r0.d
            if (r1 != 0) goto L_0x026e
            dmk r0 = defpackage.dmk.d
        L_0x0148:
            android.support.design.chip.Chip r1 = r10.F
            java.util.Calendar r2 = defpackage.ajd.b(r0)
            java.util.Calendar r3 = defpackage.bdk.a()
            java.lang.String r0 = r10.a(r2, r3)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1.a(r0)
            boolean r0 = r2.before(r3)
            if (r0 == 0) goto L_0x0272
            android.graphics.drawable.Drawable r0 = D
        L_0x0165:
            ep r4 = r1.b
            if (r4 == 0) goto L_0x016e
            ep r4 = r1.b
            r4.d(r0)
        L_0x016e:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0282
            r0 = 2132017372(0x7f1400dc, float:1.967302E38)
            r1.a(r0)
        L_0x017a:
            r0 = 0
            r10.w = r0
            r0 = 0
            r10.x = r0
            dca r0 = r11.e
            if (r0 != 0) goto L_0x0293
            dca r0 = defpackage.dca.g
        L_0x0186:
            dan r0 = r0.f
            if (r0 == 0) goto L_0x0297
            r0 = 1
        L_0x018b:
            if (r0 == 0) goto L_0x01e9
            dca r0 = r11.e
            if (r0 != 0) goto L_0x029a
            dca r0 = defpackage.dca.g
        L_0x0193:
            dan r1 = r0.f
            if (r1 != 0) goto L_0x029e
            dan r0 = defpackage.dan.f
            r1 = r0
        L_0x019a:
            int r0 = r1.e
            daq r0 = defpackage.daq.a(r0)
            if (r0 != 0) goto L_0x01a4
            daq r0 = defpackage.daq.UNRECOGNIZED
        L_0x01a4:
            r10.y = r0
            daq r0 = r10.y
            daq r2 = defpackage.daq.GMAIL_THREAD
            if (r0 != r2) goto L_0x02a7
            int r0 = r1.a
            r2 = 5
            if (r0 != r2) goto L_0x02a3
            java.lang.Object r0 = r1.b
            dap r0 = (defpackage.dap) r0
        L_0x01b5:
            java.lang.String r0 = r0.a
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x01bf
            java.lang.String r0 = r1.d
        L_0x01bf:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x01d2
            android.support.design.chip.Chip r0 = r10.G
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131951822(0x7f1300ce, float:1.954007E38)
            java.lang.CharSequence r0 = r0.getText(r2)
        L_0x01d2:
            android.support.design.chip.Chip r2 = r10.G
            r2.a(r0)
            android.support.design.chip.Chip r0 = r10.G
            r2 = 0
            r0.setVisibility(r2)
            android.support.design.chip.Chip r0 = r10.G
            r2 = 2130837670(0x7f0200a6, float:1.72803E38)
            r0.b(r2)
            java.lang.String r0 = r1.c
            r10.x = r0
        L_0x01e9:
            java.lang.String r0 = r10.w
            if (r0 != 0) goto L_0x0306
            java.lang.String r0 = r10.x
            if (r0 != 0) goto L_0x0306
            android.support.design.chip.Chip r0 = r10.G
            r1 = 8
            r0.setVisibility(r1)
        L_0x01f8:
            dca r0 = r11.e
            if (r0 != 0) goto L_0x030e
            dca r0 = defpackage.dca.g
        L_0x01fe:
            java.lang.String r0 = r0.c
            android.widget.TextView r1 = r10.H
            r1.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0312
            android.widget.TextView r0 = r10.H
            r1 = 8
            r0.setVisibility(r1)
        L_0x0212:
            boolean r0 = r10.u()
            if (r0 == 0) goto L_0x031a
            r0 = 2131689892(0x7f0f01a4, float:1.9008812E38)
            r1 = r0
        L_0x021c:
            android.view.View r0 = r10.E
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r2 = r10.s
            android.content.res.Resources r2 = r2.getResources()
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            r0.topMargin = r1
            return
        L_0x0232:
            dca r0 = r11.e
            goto L_0x0024
        L_0x0236:
            r1 = 0
            goto L_0x0045
        L_0x0239:
            dmk r1 = r0.d
            goto L_0x004d
        L_0x023d:
            dca r1 = r11.e
            goto L_0x005b
        L_0x0241:
            r1 = 0
            goto L_0x00ac
        L_0x0244:
            dan r0 = r0.f
            goto L_0x00cb
        L_0x0248:
            dca r0 = r11.e
            goto L_0x00f0
        L_0x024c:
            android.widget.TextView r0 = r10.u
            android.widget.TextView r3 = r10.u
            int r3 = r3.getPaintFlags()
            r3 = r3 & -17
            r0.setPaintFlags(r3)
            goto L_0x0108
        L_0x025b:
            r0 = 0
            goto L_0x010e
        L_0x025e:
            r0 = 2131951634(0x7f130012, float:1.9539688E38)
            goto L_0x0118
        L_0x0263:
            dca r0 = r11.e
            goto L_0x012d
        L_0x0267:
            r0 = 0
            goto L_0x0132
        L_0x026a:
            dca r0 = r11.e
            goto L_0x0142
        L_0x026e:
            dmk r0 = r0.d
            goto L_0x0148
        L_0x0272:
            com.google.android.apps.tasks.ui.taskslist.TaskItemFrameLayout r0 = r10.s
            android.content.res.Resources r0 = r0.getResources()
            r4 = 2130837671(0x7f0200a7, float:1.7280303E38)
            r5 = 0
            android.graphics.drawable.Drawable r0 = defpackage.jd.a(r0, r4, r5)
            goto L_0x0165
        L_0x0282:
            r0 = 2132017371(0x7f1400db, float:1.9673019E38)
            r1.a(r0)
            goto L_0x017a
        L_0x028a:
            android.support.design.chip.Chip r0 = r10.F
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x017a
        L_0x0293:
            dca r0 = r11.e
            goto L_0x0186
        L_0x0297:
            r0 = 0
            goto L_0x018b
        L_0x029a:
            dca r0 = r11.e
            goto L_0x0193
        L_0x029e:
            dan r0 = r0.f
            r1 = r0
            goto L_0x019a
        L_0x02a3:
            dap r0 = defpackage.dap.b
            goto L_0x01b5
        L_0x02a7:
            int r0 = r1.a
            r2 = 4
            if (r0 != r2) goto L_0x02e0
            int r0 = r1.a
            r2 = 4
            if (r0 != r2) goto L_0x02dd
            java.lang.Object r0 = r1.b
            dao r0 = (defpackage.dao) r0
        L_0x02b5:
            java.lang.String r1 = r1.d
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x02ca
            android.support.design.chip.Chip r1 = r10.G
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131951823(0x7f1300cf, float:1.9540071E38)
            java.lang.CharSequence r1 = r1.getText(r2)
        L_0x02ca:
            android.support.design.chip.Chip r2 = r10.G
            r2.a(r1)
            android.support.design.chip.Chip r1 = r10.G
            r2 = 2130837679(0x7f0200af, float:1.7280319E38)
            r1.b(r2)
            java.lang.String r0 = r0.a
            r10.w = r0
            goto L_0x01e9
        L_0x02dd:
            dao r0 = defpackage.dao.c
            goto L_0x02b5
        L_0x02e0:
            android.support.design.chip.Chip r0 = r10.G
            ep r2 = r0.b
            if (r2 == 0) goto L_0x02f8
            ep r0 = r0.b
            android.content.Context r2 = r0.y
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131951823(0x7f1300cf, float:1.9540071E38)
            java.lang.String r2 = r2.getString(r3)
            r0.a(r2)
        L_0x02f8:
            android.support.design.chip.Chip r0 = r10.G
            r2 = 2130837679(0x7f0200af, float:1.7280319E38)
            r0.b(r2)
            java.lang.String r0 = r1.c
            r10.w = r0
            goto L_0x01e9
        L_0x0306:
            android.support.design.chip.Chip r0 = r10.G
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x01f8
        L_0x030e:
            dca r0 = r11.e
            goto L_0x01fe
        L_0x0312:
            android.widget.TextView r0 = r10.H
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x0212
        L_0x031a:
            r0 = 2131689891(0x7f0f01a3, float:1.900881E38)
            r1 = r0
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atx.a(dby, int, boolean, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    public final boolean u() {
        return (this.H.getVisibility() == 0 || this.F.getVisibility() == 0 || this.G.getVisibility() == 0) ? false : true;
    }

    public final void c(int i) {
        ViewCompat.b(this.itemView, this.itemView.getResources().getDimension(2131689872));
        if (i > 0) {
            if (this.r.getParent() != null) {
                ((android.view.ViewGroup) this.r.getParent()).removeView(this.r);
            }
            this.r.setText(this.r.getContext().getResources().getQuantityString(2131886086, i, new java.lang.Object[]{java.lang.Integer.valueOf(i)}));
            this.p.addView(this.r, new android.widget.FrameLayout.LayoutParams(-2, -2, 8388661));
            this.r.setVisibility(0);
            this.r.setAlpha(0.0f);
            this.r.animate().alpha(1.0f).start();
        }
    }

    private final java.lang.String a(java.util.Calendar calendar, java.util.Calendar calendar2) {
        long a = (long) defpackage.ajd.a(calendar, calendar2);
        if (a < 0) {
            long j = -a;
            if (j < 7) {
                int i = (int) j;
                return this.s.getResources().getQuantityString(2131886087, i, new java.lang.Object[]{java.lang.Integer.valueOf(i)});
            }
            int i2 = (int) (j / 7);
            return this.s.getResources().getQuantityString(2131886088, i2, new java.lang.Object[]{java.lang.Integer.valueOf(i2)});
        } else if (a == 0) {
            return this.s.getResources().getString(2131951819);
        } else {
            if (a == 1) {
                return this.s.getContext().getString(2131951820);
            }
            return this.s.getContext().getString(2131951818, new java.lang.Object[]{java.lang.Long.valueOf(calendar.getTimeInMillis())});
        }
    }

    public final void v() {
        this.itemView.setTranslationX(0.0f);
        this.t.a(this.z);
    }
}
