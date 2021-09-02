package defpackage;

/* renamed from: ael reason: default package */
/* compiled from: PG */
public final class ael extends defpackage.aec implements defpackage.aek {
    public static java.lang.reflect.Method a;
    public defpackage.aek b;

    public ael(android.content.Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.ade a(android.content.Context context, boolean z) {
        defpackage.aem aem = new defpackage.aem(context, z);
        aem.c = this;
        return aem;
    }

    public final void b(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        if (this.b != null) {
            this.b.b(zeVar, menuItem);
        }
    }

    public final void a(defpackage.ze zeVar, android.view.MenuItem menuItem) {
        if (this.b != null) {
            this.b.a(zeVar, menuItem);
        }
    }

    static {
        try {
            a = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", new java.lang.Class[]{java.lang.Boolean.TYPE});
        } catch (java.lang.NoSuchMethodException e) {
        }
    }
}
