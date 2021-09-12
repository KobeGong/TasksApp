package defpackage;

import android.os.UserHandle;
import android.support.v4.widget.NestedScrollView;
import android.widget.LinearLayout;

import com.google.android.apps.tasks.R;
import com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView;
import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;

import java.util.List;

/* renamed from: cff reason: default package */
/* compiled from: PG */
public abstract class cff extends android.widget.LinearLayout {
    public final SelectedAccountHeaderView selectedAccountHeaderView;
    public final AccountMenuBodyView accountMenuBodyView;
    public final NestedScrollView nestedScrollView;
    public defpackage.cdl d;
    public GoogleMaterialBottomDrawer materialBottomDrawer;
    private final android.view.View privacyPolicyView;
    private final android.view.View termOfServiceView;
    private defpackage.cei h;
    private final defpackage.cgi i = new defpackage.cfk(this);

    protected cff(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null, 0);
        setOrientation(LinearLayout.VERTICAL);
        android.view.LayoutInflater.from(context).inflate(R.layout.navigation_drawer_account_menu, this);
        this.selectedAccountHeaderView = findViewById(R.id.selected_account_header);
        this.accountMenuBodyView = findViewById(R.id.account_menu_body);
        this.nestedScrollView = findViewById(R.id.scroll_view);
        this.privacyPolicyView = findViewById(R.id.privacy_policy);
        this.termOfServiceView = findViewById(R.id.terms_of_service);
        float dimension = getResources().getDimension(R.dimen.app_menu_header_elevation);
        this.nestedScrollView.a = new defpackage.cfg(this, dimension);
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
        defpackage.cei cei = this.h;
        selectedAccountHeaderView.k = (defpackage.cdj) defpackage.cky.a(cdj);
        selectedAccountHeaderView.n = cdj.a();
        selectedAccountHeaderView.m = cdj.b();
        selectedAccountHeaderView.l = (defpackage.cei) defpackage.cky.a(cei);
        selectedAccountHeaderView.j = cer;
        selectedAccountHeaderView.o = new defpackage.cfb(selectedAccountHeaderView, selectedAccountHeaderView.m, cei);
        defpackage.cei cei2 = this.h;
        accountMenuBodyView.d = (defpackage.cdj) defpackage.cky.a(cdj);
        android.support.v7.widget.RecyclerView recyclerView = accountMenuBodyView.accountListView;
        defpackage.cky.a((java.lang.Object) recyclerView);
        recyclerView.getContext();
        recyclerView.a(new adw());
        android.content.Context context = recyclerView.getContext();
        android.content.Context context2 = recyclerView.getContext();
        defpackage.cdh c2 = cdj.c();
        java.util.ArrayList<ces> arrayList = new java.util.ArrayList<>();
        arrayList.add(new defpackage.ces(R.id.view_type_add_another_account, defpackage.ob.a(context2, R.drawable.quantum_ic_account_circle_grey600_24), context2.getString(R.string.og_add_another_account), defpackage.cdm.a(c2.d(), cdj)));
        arrayList.add(new defpackage.ces(R.id.view_type_manage_accountsview_type_manage_accounts, defpackage.ob.a(context2, R.drawable.quantum_ic_settings_grey600_24), context2.getString(R.string.og_manage_accounts), defpackage.cdm.a(c2.e(), cdj)));
        if (!defpackage.jd.a()) {
            ces = null;
        } else {
            android.content.pm.CrossProfileApps crossProfileApps = context2.getSystemService(android.content.pm.CrossProfileApps.class);
            List<UserHandle> targetUserProfiles = crossProfileApps.getTargetUserProfiles();
            if (targetUserProfiles.isEmpty()) {
                ces = null;
            } else {
                android.os.UserHandle userHandle = targetUserProfiles.get(0);
                ces = new defpackage.ces(R.id.view_type_switch_profile, crossProfileApps.getProfileSwitchingIconDrawable(userHandle), crossProfileApps.getProfileSwitchingLabel(userHandle), new defpackage.cet(context2, crossProfileApps, userHandle));
            }
        }
        if (ces != null) {
            arrayList.add(ces);
        }
        defpackage.ceo ceo = new defpackage.ceo(context, cei2, cdj, arrayList, cer);
        recyclerView.setAdapter(ceo);
        if (ViewCompat.a.s(recyclerView)) {
            defpackage.cdm.a(recyclerView, ceo);
        }
        recyclerView.addOnAttachStateChangeListener(new defpackage.cev(recyclerView, ceo));
        accountMenuBodyView.accountView.setOnClickListener(new defpackage.cex(cdj));
        defpackage.cdh c3 = cdj.c();
        this.privacyPolicyView.setOnClickListener(new defpackage.cfh(this, c3));
        this.termOfServiceView.setOnClickListener(new defpackage.cfi(this, c3));
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
        boolean z2 = selectedAccountHeaderView.n.getSize() > 0;
        java.lang.Object c2 = selectedAccountHeaderView.n.c();
        z = c2 != null;
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
            selectedAccountHeaderView.c.setText(R.string.og_choose_an_account);
            selectedAccountHeaderView.c.setOnClickListener(null);
            selectedAccountHeaderView.c.setClickable(false);
        } else {
            selectedAccountHeaderView.c.setText(R.string.og_sign_in);
            selectedAccountHeaderView.c.setOnClickListener(new defpackage.cfx(selectedAccountHeaderView));
        }
        selectedAccountHeaderView.b();
        selectedAccountHeaderView.a();
        android.content.Context context = selectedAccountHeaderView.getContext();
        if (z2 && z) {
            string = context.getString(R.string.og_signed_in_user_a11y, cdm.a(c2, selectedAccountHeaderView.m));
            if (selectedAccountHeaderView.expandable) {
                java.lang.String valueOf = java.lang.String.valueOf(string);
                if (selectedAccountHeaderView.h) {
                    i5 = 2131951777;
                } else {
                    i5 = 2131951778;
                }
                java.lang.String string2 = context.getString(i5);
                string = new java.lang.StringBuilder(valueOf.length() + 1 + java.lang.String.valueOf(string2).length()).append(valueOf).append(" ").append(string2).toString();
            }
        } else if (z2) {
            string = context.getString(R.string.og_choose_an_account);
        } else {
            string = context.getString(R.string.og_sign_in);
        }
        selectedAccountHeaderView.setContentDescription(string);
        AccountMenuBodyView accountMenuBodyView = this.accountMenuBodyView;
        boolean b2 = accountMenuBodyView.d.a().b();
        android.view.View view3 = accountMenuBodyView.accountView;
        if (b2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        android.view.View view4 = accountMenuBodyView.dividerView;
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
        if (this.materialBottomDrawer == null) {
            android.view.ViewParent parent = getParent();
            while (parent != null && !(parent instanceof GoogleMaterialBottomDrawer)) {
                parent = parent.getParent();
            }
            this.materialBottomDrawer = (GoogleMaterialBottomDrawer) parent;
            this.materialBottomDrawer.a(this.i);
            this.selectedAccountHeaderView.a(new cfj(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.h != null) {
            this.h.b();
        }
        this.materialBottomDrawer.b(this.i);
        this.materialBottomDrawer = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void c() {
    }
}
