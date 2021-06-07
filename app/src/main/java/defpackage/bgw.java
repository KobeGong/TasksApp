package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: bgw  reason: default package */
/* compiled from: PG */
final class bgw implements Callable {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Boolean c;

    bgw(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.a.getBoolean(this.b, this.c.booleanValue()));
    }
}
