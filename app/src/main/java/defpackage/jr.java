package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jr  reason: default package */
/* compiled from: PG */
public final class jr {
    public final Map a = new HashMap();
    public View b;
    public final ArrayList c = new ArrayList();

    public final boolean equals(Object obj) {
        if (!(obj instanceof jr) || this.b != ((jr) obj).b || !this.a.equals(((jr) obj).a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
