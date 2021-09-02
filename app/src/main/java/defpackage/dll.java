package defpackage;

/* renamed from: dll reason: default package */
/* compiled from: PG */
final class dll extends java.lang.IllegalArgumentException {
    dll(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
