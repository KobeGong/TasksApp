package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: yf  reason: default package */
/* compiled from: PG */
public final class yf extends ContextWrapper {
    public int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Resources d;

    public yf() {
        super(null);
    }

    public yf(Context context, int i) {
        super(context);
        this.a = i;
    }

    public final Resources getResources() {
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

    public final Resources.Theme getTheme() {
        if (this.b != null) {
            return this.b;
        }
        if (this.a == 0) {
            this.a = 2132017573;
        }
        a();
        return this.b;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    private final void a() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
