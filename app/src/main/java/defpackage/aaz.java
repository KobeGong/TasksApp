package defpackage;

/* renamed from: aaz reason: default package */
/* compiled from: PG */
public final class aaz implements defpackage.zu {
    public final void a(defpackage.ze zeVar, boolean z) {
    }

    public final boolean a(defpackage.ze zeVar) {
        return false;
    }

    static android.view.inputmethod.InputConnection a(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, android.view.View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            android.view.ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof android.view.View)) {
                    break;
                } else if (parent instanceof defpackage.ahs) {
                    editorInfo.hintText = ((defpackage.ahs) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void a(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (defpackage.ahg.b != null && defpackage.ahg.b.a == view) {
            defpackage.ahg.a((defpackage.ahg) null);
        }
        if (android.text.TextUtils.isEmpty(charSequence)) {
            if (defpackage.ahg.c != null && defpackage.ahg.c.a == view) {
                defpackage.ahg.c.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new defpackage.ahg(view, charSequence);
    }

    public static java.lang.String a(android.content.Context context, int i, java.lang.Object... objArr) {
        return defpackage.ar.a(java.util.Locale.getDefault(), context.getResources().getString(i), objArr);
    }
}
