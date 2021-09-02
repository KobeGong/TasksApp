package defpackage;

/* renamed from: agk reason: default package */
/* compiled from: PG */
public final class agk {
    public java.lang.reflect.Method a;
    public java.lang.reflect.Method b;
    public java.lang.reflect.Method c;

    public agk() {
        try {
            this.a = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new java.lang.Class[0]);
            this.a.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
        }
        try {
            this.b = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new java.lang.Class[0]);
            this.b.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e2) {
        }
        try {
            this.c = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", new java.lang.Class[]{java.lang.Boolean.TYPE});
            this.c.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e3) {
        }
    }
}
