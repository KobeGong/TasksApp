package defpackage;

import com.google.android.apps.tasks.R;

/* renamed from: cfm reason: default package */
/* compiled from: PG */
public class cfm extends defpackage.cff {
    private static final java.lang.String g = cfm.class.getName().concat(".superState");
    private static final java.lang.String h = cfm.class.getName().concat(".expanded");
    public  android.view.ViewGroup f;
    private  android.view.View i;
    private boolean j;
    private  defpackage.cdm k;

    public cfm(android.content.Context context) {
        this(context, 0);
    }

    private cfm(android.content.Context context, byte b) {
        this(context, 0);
    }

    private cfm(android.content.Context context, char c) {
        super(context, null);
        this.k = new defpackage.cfo(this);
        this.f = findViewById(R.id.container);
        this.i = findViewById(R.id.header_expanded_bottom_divider);
        this.selectedAccountHeaderView.setOnClickListener(new defpackage.cfn(this));
    }

    /* access modifiers changed from: protected */
    public final android.view.View a() {
        return this.selectedAccountHeaderView;
    }

    /* access modifiers changed from: 0000 */
    public final void a(android.view.View view) {
        this.f.removeAllViews();
        this.f.addView(view);
    }

    public final void a(defpackage.cdj cdj) {
        super.a(cdj);
        if (ViewCompat.a.s(this)) {
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d != null) {
            f();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.d != null) {
            this.d.b(this.k);
            this.j = false;
        }
        this.selectedAccountHeaderView.a(null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(g, super.onSaveInstanceState());
        bundle.putBoolean(h, this.selectedAccountHeaderView.h);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.os.Parcelable parcelable2 = bundle.getParcelable(g);
            this.selectedAccountHeaderView.a(bundle.getBoolean(h));
            b();
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        int i2;
        super.b();
        d();
        if (!this.selectedAccountHeaderView.h || this.d.getSize() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.accountMenuBodyView.setVisibility(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.i.setVisibility((!this.selectedAccountHeaderView.h || this.d.b()) ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        int i2 = 0;
        if (this.selectedAccountHeaderView.expandable) {
            defpackage.cky.a(f2 >= 0.0f && f2 <= 1.0f, "ratio must be in the rabe [0, 1].");
            this.selectedAccountHeaderView.closeButton.setAlpha(f2);
            android.widget.ImageView imageView = this.selectedAccountHeaderView.closeButton;
            if (f2 == 0.0f) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            float f3 = 1.0f - f2;
            this.selectedAccountHeaderView.e.setAlpha(f3);
            this.selectedAccountHeaderView.f.setAlpha(f3);
            this.selectedAccountHeaderView.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (selectedAccountHeaderView.expandable && selectedAccountHeaderView.i != z) {
            selectedAccountHeaderView.i = z;
            selectedAccountHeaderView.closeButton.setAlpha(1.0f);
            selectedAccountHeaderView.closeButton.setVisibility(z ? 0 : 8);
            selectedAccountHeaderView.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.selectedAccountHeaderView.a(false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void e() {
        selectedAccountHeaderView.a(!selectedAccountHeaderView.h);
        this.nestedScrollView.scrollTo(0, 0);
        super.b();
        startAnimation(new defpackage.cfr(this, this.accountMenuBodyView, this.selectedAccountHeaderView.h));
    }
}
