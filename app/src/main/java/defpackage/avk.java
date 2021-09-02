package defpackage;

/* renamed from: avk reason: default package */
/* compiled from: PG */
public final class avk {
    private final java.util.TreeSet a = new java.util.TreeSet();
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.List c = new java.util.ArrayList();
    private int d = 12;
    private int e = 16;

    public final defpackage.avk a(java.lang.String str) {
        this.a.addAll(a(str, "allowedChars"));
        return this;
    }

    public final defpackage.avk b(java.lang.String str) {
        this.b.add(com.google.android.gms.auth.api.credentials.PasswordSpecification.a((java.util.Collection) a(str, "requiredChars")));
        this.c.add(java.lang.Integer.valueOf(1));
        return this;
    }

    public final defpackage.avk a() {
        this.d = 12;
        this.e = 16;
        return this;
    }

    public final com.google.android.gms.auth.api.credentials.PasswordSpecification b() {
        if (this.a.isEmpty()) {
            throw new defpackage.avl("no allowed characters specified");
        }
        int i = 0;
        for (java.lang.Integer intValue : this.c) {
            i = intValue.intValue() + i;
        }
        if (i > this.e) {
            throw new defpackage.avl("required character count cannot be greater than the max password size");
        }
        boolean[] zArr = new boolean[95];
        for (java.lang.String charArray : this.b) {
            char[] charArray2 = charArray.toCharArray();
            int length = charArray2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    char c2 = charArray2[i2];
                    if (zArr[c2 - ' ']) {
                        throw new defpackage.avl("character " + c2 + " occurs in more than one required character set");
                    }
                    zArr[c2 - ' '] = true;
                    i2++;
                }
            }
        }
        return new com.google.android.gms.auth.api.credentials.PasswordSpecification(com.google.android.gms.auth.api.credentials.PasswordSpecification.a((java.util.Collection) this.a), this.b, this.c, this.d, this.e);
    }

    private static java.util.TreeSet a(java.lang.String str, java.lang.String str2) {
        char[] charArray;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new defpackage.avl(java.lang.String.valueOf(str2).concat(" cannot be null or empty"));
        }
        java.util.TreeSet treeSet = new java.util.TreeSet();
        for (char c2 : str.toCharArray()) {
            if (com.google.android.gms.auth.api.credentials.PasswordSpecification.a((int) c2)) {
                throw new defpackage.avl(java.lang.String.valueOf(str2).concat(" must only contain ASCII printable characters"));
            }
            treeSet.add(java.lang.Character.valueOf(c2));
        }
        return treeSet;
    }
}
