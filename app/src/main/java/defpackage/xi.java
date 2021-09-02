package defpackage;

/* renamed from: xi reason: default package */
/* compiled from: PG */
public final class xi implements android.view.View.OnClickListener {
    private final android.view.View a;
    private final java.lang.String b;
    private java.lang.reflect.Method c;
    private android.content.Context d;

    public xi(android.view.View view, java.lang.String str) {
        this.a = view;
        this.b = str;
    }

    public final void onClick(android.view.View view) {
        java.lang.String str;
        if (this.c == null) {
            android.content.Context context = this.a.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        java.lang.reflect.Method method = context.getClass().getMethod(this.b, new java.lang.Class[]{android.view.View.class});
                        if (method != null) {
                            this.c = method;
                            this.d = context;
                        }
                    }
                } catch (java.lang.NoSuchMethodException e) {
                }
                if (context instanceof android.content.ContextWrapper) {
                    context = ((android.content.ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new java.lang.IllegalStateException("Could not find method " + this.b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.a.getClass() + str);
        }
        try {
            this.c.invoke(this.d, new java.lang.Object[]{view});
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
