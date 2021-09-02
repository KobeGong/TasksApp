package defpackage;

/* renamed from: cff reason: default package */
/* compiled from: PG */
public abstract class cff extends android.widget.LinearLayout {
    public final com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView a;
    public final com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView b;
    public final android.support.v4.widget.NestedScrollView c;
    public defpackage.cdl d;
    public com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer e;
    private final android.view.View f;
    private final android.view.View g;
    private defpackage.cei h;
    private final defpackage.cgi i = new defpackage.cfk(this);

    protected cff(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, 0);
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(2131034181, this);
        this.a = (com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView) findViewById(2131755232);
        this.b = (com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView) findViewById(2131755233);
        this.c = (android.support.v4.widget.NestedScrollView) findViewById(2131755231);
        this.f = findViewById(2131755238);
        this.g = findViewById(2131755239);
        float dimension = getResources().getDimension(2131689589);
        this.c.a = new defpackage.cfg(this, dimension);
    }

    /* access modifiers changed from: protected */
    public abstract android.view.View a();

    /* access modifiers changed from: protected */
    public abstract void a(float f2);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(defpackage.cdj cdj) {
        defpackage.ces ces;
        this.d = cdj.a();
        defpackage.cfu cfu = new defpackage.cfu(getContext(), cdj);
        if (this.h != null) {
            this.h.b();
        }
        this.h = new defpackage.cei(getContext(), cdj.b(), cfu, java.util.concurrent.Executors.newSingleThreadExecutor());
        this.h.a();
        defpackage.cer cer = new defpackage.cer(this);
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        defpackage.cei cei = this.h;
        selectedAccountHeaderView.k = (defpackage.cdj) defpackage.cky.a((java.lang.Object) cdj);
        selectedAccountHeaderView.n = cdj.a();
        selectedAccountHeaderView.m = cdj.b();
        selectedAccountHeaderView.l = (defpackage.cei) defpackage.cky.a((java.lang.Object) cei);
        selectedAccountHeaderView.j = cer;
        selectedAccountHeaderView.o = new defpackage.cfb(selectedAccountHeaderView, selectedAccountHeaderView.m, cei);
        com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView accountMenuBodyView = this.b;
        defpackage.cei cei2 = this.h;
        accountMenuBodyView.d = (defpackage.cdj) defpackage.cky.a((java.lang.Object) cdj);
        android.support.v7.widget.RecyclerView recyclerView = accountMenuBodyView.a;
        defpackage.cky.a((java.lang.Object) recyclerView);
        recyclerView.getContext();
        recyclerView.a((defpackage.afd) new defpackage.adw());
        android.content.Context context = recyclerView.getContext();
        android.content.Context context2 = recyclerView.getContext();
        defpackage.cdh c2 = cdj.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.ces(2131755051, defpackage.ob.a(context2, 2130837658), context2.getString(2131951774), defpackage.cdm.a(c2.d(), cdj)));
        arrayList.add(new defpackage.ces(2131755052, defpackage.ob.a(context2, 2130837685), context2.getString(2131951779), defpackage.cdm.a(c2.e(), cdj)));
        if (!defpackage.jd.a()) {
            ces = null;
        } else {
            android.content.pm.CrossProfileApps crossProfileApps = (android.content.pm.CrossProfileApps) context2.getSystemService(android.content.pm.CrossProfileApps.class);
            java.util.List targetUserProfiles = crossProfileApps.getTargetUserProfiles();
            if (targetUserProfiles.isEmpty()) {
                ces = null;
            } else {
                android.os.UserHandle userHandle = (android.os.UserHandle) targetUserProfiles.get(0);
                ces = new defpackage.ces(2131755053, crossProfileApps.getProfileSwitchingIconDrawable(userHandle), crossProfileApps.getProfileSwitchingLabel(userHandle), new defpackage.cet(context2, crossProfileApps, userHandle));
            }
        }
        if (ces != null) {
            arrayList.add(ces);
        }
        defpackage.ceo ceo = new defpackage.ceo(context, cei2, cdj, arrayList, cer);
        recyclerView.a((defpackage.aet) ceo);
        if (defpackage.sn.a.s(recyclerView)) {
            defpackage.cdm.a(recyclerView, ceo);
        }
        recyclerView.addOnAttachStateChangeListener(new defpackage.cev(recyclerView, ceo));
        accountMenuBodyView.c.setOnClickListener(new defpackage.cex(cdj));
        defpackage.cdh c3 = cdj.c();
        this.f.setOnClickListener(new defpackage.cfh(this, c3));
        this.g.setOnClickListener(new defpackage.cfi(this, c3));
        b();
    }

    /* access modifiers changed from: protected */
    public void b() {
        boolean z;
        int i2;
        int i3;
        java.lang.String string;
        int i4;
        int i5;
        int i6 = 0;
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        boolean z2 = selectedAccountHeaderView.n.a() > 0;
        java.lang.Object c2 = selectedAccountHeaderView.n.c();
        if (c2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z2) {
            selectedAccountHeaderView.h = false;
        }
        android.view.View view = selectedAccountHeaderView.a;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        android.view.View view2 = selectedAccountHeaderView.b;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view2.setVisibility(i3);
        if (z) {
            selectedAccountHeaderView.o.a(c2);
        } else if (z2) {
            selectedAccountHeaderView.c.setText(2131951775);
            selectedAccountHeaderView.c.setOnClickListener(null);
            selectedAccountHeaderView.c.setClickable(false);
        } else {
            selectedAccountHeaderView.c.setText(2131951782);
            selectedAccountHeaderView.c.setOnClickListener(new defpackage.cfx(selectedAccountHeaderView));
        }
        selectedAccountHeaderView.b();
        selectedAccountHeaderView.a();
        android.content.Context context = selectedAccountHeaderView.getContext();
        if (z2 && z) {
            string = context.getString(2131951783, new java.lang.Object[]{defpackage.cdm.a(c2, selectedAccountHeaderView.m)});
            if (selectedAccountHeaderView.d) {
                java.lang.String valueOf = java.lang.String.valueOf(string);
                if (selectedAccountHeaderView.h) {
                    i5 = 2131951777;
                } else {
                    i5 = 2131951778;
                }
                java.lang.String string2 = context.getString(i5);
                string = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1 + java.lang.String.valueOf(string2).length()).append(valueOf).append(" ").append(string2).toString();
            }
        } else if (z2) {
            string = context.getString(2131951775);
        } else {
            string = context.getString(2131951782);
        }
        selectedAccountHeaderView.setContentDescription(string);
        com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView accountMenuBodyView = this.b;
        boolean b2 = accountMenuBodyView.d.a().b();
        android.view.View view3 = accountMenuBodyView.c;
        if (b2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        android.view.View view4 = accountMenuBodyView.b;
        if (!b2) {
            i6 = 8;
        }
        view4.setVisibility(i6);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h != null) {
            this.h.a();
        }
        if (this.e == null) {
            android.view.ViewParent parent = getParent();
            while (parent != null && !(parent instanceof com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer)) {
                parent = parent.getParent();
            }
            this.e = (com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer) parent;
            this.e.a(this.i);
            this.a.a((android.view.View.OnClickListener) new defpackage.cfj(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.h != null) {
            this.h.b();
        }
        this.e.b(this.i);
        this.e = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void c() {
    }
}
