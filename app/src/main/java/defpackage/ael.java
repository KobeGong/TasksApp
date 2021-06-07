package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: ael  reason: default package */
/* compiled from: PG */
public final class ael extends aec implements aek {
    public static Method a;
    public aek b;

    public ael(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.aec
    public final ade a(Context context, boolean z) {
        aem aem = new aem(context, z);
        aem.c = this;
        return aem;
    }

    @Override // defpackage.aek
    public final void b(ze zeVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.b(zeVar, menuItem);
        }
    }

    @Override // defpackage.aek
    public final void a(ze zeVar, MenuItem menuItem) {
        if (this.b != null) {
            this.b.a(zeVar, menuItem);
        }
    }

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
        }
    }
}
