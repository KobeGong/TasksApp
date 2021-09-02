package defpackage;

/* 'enum' access flag removed */
/* renamed from: cuj reason: default package */
/* compiled from: PG */
final class cuj extends defpackage.cug {
    cuj(java.lang.String str) {
        super(str, 2, false);
    }

    public final boolean a(java.lang.Object obj) {
        if (obj instanceof java.lang.Character) {
            return true;
        }
        if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short)) {
            return java.lang.Character.isValidCodePoint(((java.lang.Number) obj).intValue());
        }
        return false;
    }
}
