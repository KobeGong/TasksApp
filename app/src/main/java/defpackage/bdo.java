package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: bdo  reason: default package */
/* compiled from: PG */
public final class bdo {
    public final String a;
    public final ComponentName b;
    public final int c;
    private final String d;

    public bdo(String str, String str2, int i) {
        this.d = azb.b(str);
        this.a = azb.b(str2);
        this.b = null;
        this.c = i;
    }

    public bdo(ComponentName componentName) {
        this.d = null;
        this.a = null;
        this.b = (ComponentName) azb.b(componentName);
        this.c = 129;
    }

    public final String toString() {
        return this.d == null ? this.b.flattenToString() : this.d;
    }

    public final Intent a() {
        if (this.d != null) {
            return new Intent(this.d).setPackage(this.a);
        }
        return new Intent().setComponent(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, Integer.valueOf(this.c)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdo)) {
            return false;
        }
        bdo bdo = (bdo) obj;
        return azb.a(this.d, bdo.d) && azb.a(this.a, bdo.a) && azb.a(this.b, bdo.b) && this.c == bdo.c;
    }
}
