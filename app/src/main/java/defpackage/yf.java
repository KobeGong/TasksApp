package defpackage;

/* renamed from: yf reason: default package */
/* compiled from: PG */
public final class yf extends android.content.ContextWrapper {
    public int a;
    private android.content.res.Resources.Theme b;
    private android.view.LayoutInflater c;
    private android.content.res.Resources d;

    public yf() {
        super(null);
    }

    public yf(android.content.Context context, int i) {
        super(context);
        this.a = i;
    }

    public final android.content.res.Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            a();
        }
    }

    public final android.content.res.Resources.Theme getTheme() {
        if (this.b != null) {
            return this.b;
        }
        if (this.a == 0) {
            this.a = 2132017573;
        }
        a();
        return this.b;
    }

    public final java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    private final void a() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }
}
