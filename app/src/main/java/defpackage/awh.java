package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: awh  reason: default package */
public final /* synthetic */ class awh implements Comparator {
    public static final Comparator a = new awh();

    private awh() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).a.compareTo(((Scope) obj2).a);
    }
}
