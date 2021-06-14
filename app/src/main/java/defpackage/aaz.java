package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.Locale;

/* renamed from: aaz  reason: default package */
/* compiled from: PG */
public final class aaz implements zu {
    @Override // defpackage.zu
    public final void a(MenuBuilder zeVar, boolean z) {
    }

    @Override // defpackage.zu
    public final boolean a(MenuBuilder zeVar) {
        return false;
    }

    static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof ahs) {
                    editorInfo.hintText = ((ahs) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (ahg.b != null && ahg.b.a == view) {
            ahg.a((ahg) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (ahg.c != null && ahg.c.a == view) {
                ahg.c.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ahg(view, charSequence);
    }

    public static String a(Context context, int i, Object... objArr) {
        return ar.a(Locale.getDefault(), context.getResources().getString(i), objArr);
    }
}
