package defpackage;

/* renamed from: yk reason: default package */
/* compiled from: PG */
final class yk implements android.view.MenuItem.OnMenuItemClickListener {
    private static final java.lang.Class[] a = {android.view.MenuItem.class};
    private java.lang.Object b;
    private java.lang.reflect.Method c;

    public yk(java.lang.Object obj, java.lang.String str) {
        this.b = obj;
        java.lang.Class cls = obj.getClass();
        try {
            this.c = cls.getMethod(str, a);
        } catch (java.lang.Exception e) {
            android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        try {
            if (this.c.getReturnType() == java.lang.Boolean.TYPE) {
                return ((java.lang.Boolean) this.c.invoke(this.b, new java.lang.Object[]{menuItem})).booleanValue();
            }
            this.c.invoke(this.b, new java.lang.Object[]{menuItem});
            return true;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
