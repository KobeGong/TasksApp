package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: bgz  reason: default package */
/* compiled from: PG */
final class bgz implements Callable {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;

    bgz(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.a.getString(this.b, this.c);
    }
}
