package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: lk reason: default package */
/* compiled from: PG */
public abstract class FragmentContainer {
    public abstract View onFindViewById(int i);

    public abstract boolean onHasView();

    public Fragment instantiate(Context context, String className, Bundle arguments) {
        return Fragment.instantiate(context, className, arguments);
    }
}
