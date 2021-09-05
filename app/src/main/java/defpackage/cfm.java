package defpackage;

/* renamed from: cfm reason: default package */
/* compiled from: PG */
public class cfm extends defpackage.cff {
    private static final java.lang.String g = java.lang.String.valueOf(defpackage.cfm.class.getName()).concat(".superState");
    private static final java.lang.String h = java.lang.String.valueOf(defpackage.cfm.class.getName()).concat(".expanded");
    public final android.view.ViewGroup f;
    private final android.view.View i;
    private boolean j;
    private final defpackage.cdm k;

    public cfm(android.content.Context context) {
        this(context, 0);
    }

    private cfm(android.content.Context context, byte b) {
        this(context, 0);
    }

    private cfm(android.content.Context context, char c) {
        super(context, null);
        this.k = new defpackage.cfo(this);
        this.f = (android.view.ViewGroup) findViewById(2131755279);
        this.i = findViewById(2131755308);
        this.a.setOnClickListener(new defpackage.cfn(this));
    }

    /* access modifiers changed from: protected */
    public final android.view.View a() {
        return this.a;
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
        this.a.a((android.view.View.OnClickListener) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable(g, super.onSaveInstanceState());
        bundle.putBoolean(h, this.a.h);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.os.Parcelable parcelable2 = bundle.getParcelable(g);
            this.a.a(bundle.getBoolean(h));
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
        com.google.android.libraries.onegoogle.accountmenu.internal.AccountMenuBodyView accountMenuBodyView = this.b;
        if (!this.a.h || this.d.a() == 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        accountMenuBodyView.setVisibility(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        this.i.setVisibility((!this.a.h || this.d.b()) ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    public final void a(float f2) {
        int i2 = 0;
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.d) {
            defpackage.cky.a(f2 >= 0.0f && f2 <= 1.0f, (java.lang.Object) "ratio must be in the rabe [0, 1].");
            selectedAccountHeaderView.g.setAlpha(f2);
            android.widget.ImageView imageView = selectedAccountHeaderView.g;
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
    public final void a(boolean z) {
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        if (selectedAccountHeaderView.d && selectedAccountHeaderView.i != z) {
            selectedAccountHeaderView.i = z;
            selectedAccountHeaderView.g.setAlpha(1.0f);
            selectedAccountHeaderView.g.setVisibility(z ? 0 : 8);
            selectedAccountHeaderView.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.a.a(false);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void e() {
        com.google.android.libraries.onegoogle.accountmenu.internal.SelectedAccountHeaderView selectedAccountHeaderView = this.a;
        selectedAccountHeaderView.a(!selectedAccountHeaderView.h);
        this.c.scrollTo(0, 0);
        super.b();
        startAnimation(new defpackage.cfr(this, this.b, this.a.h));
    }
}
