package defpackage;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: agk  reason: default package */
/* compiled from: PG */
public final class agk {
    public Method a;
    public Method b;
    public Method c;

    public agk() {
        try {
            this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.a.setAccessible(true);
        } catch (NoSuchMethodException e) {
        }
        try {
            this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.b.setAccessible(true);
        } catch (NoSuchMethodException e2) {
        }
        try {
            this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.c.setAccessible(true);
        } catch (NoSuchMethodException e3) {
        }
    }
}
