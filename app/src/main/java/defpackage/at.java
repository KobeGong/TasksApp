package defpackage;

import java.text.Format;

/* access modifiers changed from: package-private */
/* renamed from: at  reason: default package */
/* compiled from: PG */
public final class at {
    public int a;
    public String b;
    public Number c;
    public double d;
    public int e;
    public Format f;
    public String g;
    public boolean h;

    at(int i, String str, Number number, double d2) {
        this.a = i;
        this.b = str;
        if (d2 == 0.0d) {
            this.c = number;
        } else {
            this.c = Double.valueOf(number.doubleValue() - d2);
        }
        this.d = d2;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
