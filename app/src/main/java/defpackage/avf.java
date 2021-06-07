package defpackage;

import android.content.Intent;

/* renamed from: avf  reason: default package */
/* compiled from: PG */
public class avf extends ava {
    private final Intent a;

    public avf(String str, Intent intent) {
        super(str);
        this.a = intent;
    }

    public final Intent a() {
        if (this.a == null) {
            return null;
        }
        return new Intent(this.a);
    }
}
