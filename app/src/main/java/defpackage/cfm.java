package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.tasks.R;
import com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView;
import com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView;

/* renamed from: cfm  reason: default package */
/* compiled from: PG */
public class cfm extends cff {
    private static final String g = String.valueOf(cfm.class.getName()).concat(".superState");
    private static final String h = String.valueOf(cfm.class.getName()).concat(".expanded");
    public final ViewGroup f;
    private final View i;
    private boolean j;
    private final cdm k;

    public cfm(Context context) {
        this(context, (byte) 0);
    }

    private cfm(Context context, byte b) {
        this(context, (char) 0);
    }

    private cfm(Context context, char c) {
        super(context, null);
        this.k = new cfo(this);
        this.f = (ViewGroup) findViewById(R.id.container);
        this.i = findViewById(R.id.header_expanded_bottom_divider);
        this.a.setOnClickListener(new cfn(this));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public final View a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f.removeAllViews();
        this.f.addView(view);
    }

    @Override // defpackage.cff
    public final void a(cdj cdj) {
        super.a(cdj);
        if (sn.a.s(this)) {
            f();
        }
    }

    private final void f() {
        if (!this.j) {
            this.d.a(this.k);
            this.j = true;
            b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public void onDetachedFromWindow() {
        if (this.d != null) {
            this.d.b(this.k);
            this.j = false;
        }
        this.a.a((View.OnClickListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(g, super.onSaveInstanceState());
        bundle.putBoolean(h, this.a.h);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(g);
            this.a.a(bundle.getBoolean(h));
            b();
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public final void b() {
        int i2;
        super.b();
        d();
        AccountMenuBodyView accountMenuBodyView = this.b;
        if (!this.a.h || this.d.a() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        accountMenuBodyView.setVisibility(i2);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.i.setVisibility((!this.a.h || this.d.b()) ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public final void a(float f2) {
        int i2 = 0;
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.d) {
            cky.a(f2 >= 0.0f && f2 <= 1.0f, "ratio must be in the rabe [0, 1].");
            selectedAccountHeaderView.g.setAlpha(f2);
            ImageView imageView = selectedAccountHeaderView.g;
            if (f2 == 0.0f) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            float f3 = 1.0f - f2;
            selectedAccountHeaderView.e.setAlpha(f3);
            selectedAccountHeaderView.f.setAlpha(f3);
            selectedAccountHeaderView.b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public final void a(boolean z) {
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.d && selectedAccountHeaderView.i != z) {
            selectedAccountHeaderView.i = z;
            selectedAccountHeaderView.g.setAlpha(1.0f);
            selectedAccountHeaderView.g.setVisibility(z ? 0 : 8);
            selectedAccountHeaderView.b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.cff
    public final void c() {
        this.a.a(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        selectedAccountHeaderView.a(!selectedAccountHeaderView.h);
        this.c.scrollTo(0, 0);
        super.b();
        startAnimation(new cfr(this, this.b, this.a.h));
    }
}
