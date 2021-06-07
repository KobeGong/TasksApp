package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: bax  reason: default package */
/* compiled from: PG */
public interface bax {
    LifecycleCallback a(String str, Class cls);

    void a(String str, LifecycleCallback lifecycleCallback);

    Activity g_();

    void startActivityForResult(Intent intent, int i);
}
