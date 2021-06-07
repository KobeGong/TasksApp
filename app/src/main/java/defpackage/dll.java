package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: dll  reason: default package */
/* compiled from: PG */
public final class dll extends IllegalArgumentException {
    dll(int i, int i2) {
        super(new StringBuilder(54).append("Unpaired surrogate at index ").append(i).append(" of ").append(i2).toString());
    }
}
