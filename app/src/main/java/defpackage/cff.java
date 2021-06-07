package defpackage;

import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.os.UserHandle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.google.android.apps.tasks.R;
import com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView;
import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;
import com.google.android.libraries.onegoogle.bottomdrawer.GoogleMaterialBottomDrawer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: cff  reason: default package */
/* compiled from: PG */
public abstract class cff extends LinearLayout {
    public final SelectedAccountHeaderView a;
    public final AccountMenuBodyView b;
    public final NestedScrollView c;
    public cdl d;
    public GoogleMaterialBottomDrawer e;
    private final View f;
    private final View g;
    private cei h;
    private final cgi i = new cfk(this);

    protected cff(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.navigation_drawer_account_menu, this);
        this.a = (SelectedAccountHeaderView) findViewById(R.id.selected_account_header);
        this.b = (AccountMenuBodyView) findViewById(R.id.account_menu_body);
        this.c = (NestedScrollView) findViewById(R.id.scroll_view);
        this.f = findViewById(R.id.privacy_policy);
        this.g = findViewById(R.id.terms_of_service);
        float dimension = getResources().getDimension(R.dimen.app_menu_header_elevation);
        this.c.a = new cfg(this, dimension);
    }

    /* access modifiers changed from: protected */
    public abstract View a();

    /* access modifiers changed from: protected */
    public abstract void a(float f2);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(cdj cdj) {
        ces ces;
        this.d = cdj.a();
        cfu cfu = new cfu(getContext(), cdj);
        if (this.h != null) {
            this.h.b();
        }
        this.h = new cei(getContext(), cdj.b(), cfu, Executors.newSingleThreadExecutor());
        this.h.a();
        cer cer = new cer(this);
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        cei cei = this.h;
        selectedAccountHeaderView.k = (cdj) cky.a(cdj);
        selectedAccountHeaderView.n = cdj.a();
        selectedAccountHeaderView.m = cdj.b();
        selectedAccountHeaderView.l = (cei) cky.a(cei);
        selectedAccountHeaderView.j = cer;
        selectedAccountHeaderView.o = new cfb(selectedAccountHeaderView, selectedAccountHeaderView.m, cei);
        AccountMenuBodyView accountMenuBodyView = this.b;
        cei cei2 = this.h;
        accountMenuBodyView.d = (cdj) cky.a(cdj);
        RecyclerView recyclerView = accountMenuBodyView.a;
        cky.a((Object) recyclerView);
        recyclerView.getContext();
        recyclerView.a(new adw());
        Context context = recyclerView.getContext();
        Context context2 = recyclerView.getContext();
        cdh c2 = cdj.c();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ces(R.id.view_type_add_another_account, ob.a(context2, (int) R.drawable.quantum_ic_account_circle_grey600_24), context2.getString(R.string.og_add_another_account), cdm.a(c2.d(), cdj)));
        arrayList.add(new ces(R.id.view_type_manage_accounts, ob.a(context2, (int) R.drawable.quantum_ic_settings_grey600_24), context2.getString(R.string.og_manage_accounts), cdm.a(c2.e(), cdj)));
        if (!jd.a()) {
            ces = null;
        } else {
            CrossProfileApps crossProfileApps = (CrossProfileApps) context2.getSystemService(CrossProfileApps.class);
            List<UserHandle> targetUserProfiles = crossProfileApps.getTargetUserProfiles();
            if (targetUserProfiles.isEmpty()) {
                ces = null;
            } else {
                UserHandle userHandle = targetUserProfiles.get(0);
                ces = new ces(R.id.view_type_switch_profile, crossProfileApps.getProfileSwitchingIconDrawable(userHandle), crossProfileApps.getProfileSwitchingLabel(userHandle), new cet(context2, crossProfileApps, userHandle));
            }
        }
        if (ces != null) {
            arrayList.add(ces);
        }
        ceo ceo = new ceo(context, cei2, cdj, arrayList, cer);
        recyclerView.a(ceo);
        if (sn.a.s(recyclerView)) {
            cdm.a(recyclerView, ceo);
        }
        recyclerView.addOnAttachStateChangeListener(new cev(recyclerView, ceo));
        accountMenuBodyView.c.setOnClickListener(new cex(cdj));
        cdh c3 = cdj.c();
        this.f.setOnClickListener(new cfh(this, c3));
        this.g.setOnClickListener(new cfi(this, c3));
        b();
    }

    /* access modifiers changed from: protected */
    public void b() {
        boolean z;
        int i2;
        int i3;
        String string;
        int i4;
        int i5;
        int i6 = 0;
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        boolean z2 = selectedAccountHeaderView.n.a() > 0;
        Object c2 = selectedAccountHeaderView.n.c();
        if (c2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z2) {
            selectedAccountHeaderView.h = false;
        }
        View view = selectedAccountHeaderView.a;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = selectedAccountHeaderView.b;
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
            selectedAccountHeaderView.c.setOnClickListener(new cfx(selectedAccountHeaderView));
        }
        selectedAccountHeaderView.b();
        selectedAccountHeaderView.a();
        Context context = selectedAccountHeaderView.getContext();
        if (z2 && z) {
            string = context.getString(R.string.og_signed_in_user_a11y, cdm.a(c2, selectedAccountHeaderView.m));
            if (selectedAccountHeaderView.d) {
                String valueOf = String.valueOf(string);
                if (selectedAccountHeaderView.h) {
                    i5 = R.string.og_collapse_account_menu_a11y;
                } else {
                    i5 = R.string.og_expand_account_menu_a11y;
                }
                String string2 = context.getString(i5);
                string = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string2).length()).append(valueOf).append(" ").append(string2).toString();
            }
        } else if (z2) {
            string = context.getString(R.string.og_choose_an_account);
        } else {
            string = context.getString(R.string.og_sign_in);
        }
        selectedAccountHeaderView.setContentDescription(string);
        AccountMenuBodyView accountMenuBodyView = this.b;
        boolean b2 = accountMenuBodyView.d.a().b();
        View view3 = accountMenuBodyView.c;
        if (b2) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view3.setVisibility(i4);
        View view4 = accountMenuBodyView.b;
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
            ViewParent parent = getParent();
            while (parent != null && !(parent instanceof GoogleMaterialBottomDrawer)) {
                parent = parent.getParent();
            }
            this.e = (GoogleMaterialBottomDrawer) parent;
            this.e.a(this.i);
            this.a.a(new cfj(this));
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
