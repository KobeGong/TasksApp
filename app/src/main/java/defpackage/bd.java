package defpackage;

@java.lang.Deprecated
/* renamed from: bd reason: default package */
/* compiled from: PG */
public final class bd {
    @java.lang.Deprecated
    public final int a;
    @java.lang.Deprecated
    private final java.util.Set b;
    @java.lang.Deprecated
    private final boolean c;

    private bd(int i, java.util.Set set, boolean z) {
        this.a = i;
        this.b = set;
        this.c = z;
    }

    static defpackage.bd a(java.lang.String str) {
        int i;
        java.lang.String[] split;
        java.lang.String str2;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (str.startsWith("integer")) {
            i = defpackage.bg.c;
        } else if (str.startsWith("decimal")) {
            i = defpackage.bg.d;
        } else {
            throw new java.lang.IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
        }
        boolean z = false;
        boolean z2 = true;
        for (java.lang.String str3 : defpackage.av.b.split(str.substring(7).trim())) {
            if (str3.equals("…") || str3.equals("...")) {
                z = true;
                z2 = false;
            } else if (z) {
                java.lang.String str4 = "Can only have … at the end of samples: ";
                java.lang.String valueOf = java.lang.String.valueOf(str3);
                throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str4.concat(valueOf) : new java.lang.String(str4));
            } else {
                java.lang.String[] split2 = defpackage.av.c.split(str3);
                switch (split2.length) {
                    case 1:
                        defpackage.bb bbVar = new defpackage.bb(split2[0]);
                        a(i, bbVar);
                        linkedHashSet.add(new defpackage.bc(bbVar, bbVar));
                        break;
                    case 2:
                        defpackage.bb bbVar2 = new defpackage.bb(split2[0]);
                        defpackage.bb bbVar3 = new defpackage.bb(split2[1]);
                        a(i, bbVar2);
                        a(i, bbVar3);
                        linkedHashSet.add(new defpackage.bc(bbVar2, bbVar3));
                        break;
                    default:
                        java.lang.String str5 = "Ill-formed number range: ";
                        java.lang.String valueOf2 = java.lang.String.valueOf(str3);
                        if (valueOf2.length() != 0) {
                            str2 = str5.concat(valueOf2);
                        } else {
                            str2 = new java.lang.String(str5);
                        }
                        throw new java.lang.IllegalArgumentException(str2);
                }
            }
        }
        return new defpackage.bd(i, java.util.Collections.unmodifiableSet(linkedHashSet), z2);
    }

    private static void a(int i, defpackage.bb bbVar) {
        boolean z;
        boolean z2 = true;
        if (i == defpackage.bg.c) {
            z = true;
        } else {
            z = false;
        }
        if (bbVar.b != 0) {
            z2 = false;
        }
        if (z != z2) {
            java.lang.String valueOf = java.lang.String.valueOf(bbVar);
            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 25).append("Ill-formed number range: ").append(valueOf).toString());
        }
    }

    @java.lang.Deprecated
    public final java.lang.String toString() {
        java.lang.StringBuilder append = new java.lang.StringBuilder("@").append(defpackage.bg.e[this.a - 1].toLowerCase(java.util.Locale.ENGLISH));
        boolean z = true;
        for (defpackage.bc bcVar : this.b) {
            if (z) {
                z = false;
            } else {
                append.append(",");
            }
            append.append(' ').append(bcVar);
        }
        if (!this.c) {
            append.append(", …");
        }
        return append.toString();
    }
}
