package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cpe  reason: default package */
/* compiled from: PG */
public final class cpe implements Serializable {
    public static final String a = cpe.class.getName();
    public static final long serialVersionUID = 1;
    public final List b = new ArrayList();

    public static Intent a(Context context) {
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof Activity) && !(context2 instanceof ContextWrapper)) {
                return null;
            }
            if (context2 instanceof Activity) {
                return ((Activity) context2).getIntent();
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
    }

    public final void a(View view) {
        cpc a2;
        if (view instanceof cpf) {
            a2 = ((cpf) view).a();
        } else {
            a2 = cky.a(view);
        }
        if (a2 != null) {
            this.b.add(a2);
        }
    }

    public final String toString() {
        List list = this.b;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("->");
            }
            sb.append(((cpc) list.get(i)).a.a);
        }
        return sb.append(" (leaf->root)").toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cpe)) {
            return false;
        }
        return cky.a(((cpe) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
